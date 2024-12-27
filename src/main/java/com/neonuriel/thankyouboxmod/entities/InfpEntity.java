package com.neonuriel.thankyouboxmod.entities;

import com.neonuriel.thankyouboxmod.entities.ai.InfpAttackGoal;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.brain.MemoryModuleType;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.attribute.EntityAttributeInstance;
import net.minecraft.entity.passive.SheepEntity;
import net.minecraft.util.Unit;
import org.jetbrains.annotations.Nullable;

import com.google.common.collect.ImmutableList;
import com.neonuriel.thankyouboxmod.items.ModItems;

import net.minecraft.entity.ai.brain.Activity;
import net.minecraft.util.Util;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.data.DataTracker;
import net.minecraft.entity.data.TrackedData;
import net.minecraft.entity.data.TrackedDataHandlerRegistry;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.mob.Monster;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.passive.FrogEntity;
import net.minecraft.entity.passive.PassiveEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.recipe.Ingredient;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.LocalDifficulty;
import net.minecraft.world.ServerWorldAccess;
import net.minecraft.world.World;

public class InfpEntity extends AnimalEntity {
    public final AnimationState idlingAnimationState = new AnimationState();
    public final AnimationState attackingAnimationState = new AnimationState();
    public final AnimationState walkingAnimationState = new AnimationState();
    private static final TrackedData<Integer> DATA_ID_TYPE_VARIANT = DataTracker.registerData(InfpEntity.class,
            TrackedDataHandlerRegistry.INTEGER);
    public int attackAnimationTimeout = 0;
    private int idleAnimationTimeout = 0;

    public InfpEntity(EntityType<? extends InfpEntity> entityType, World world) {
        super(entityType, world);
    }

    @Override
    protected void initGoals() {
        this.goalSelector.add(0, new SwimGoal(this));

        this.goalSelector.add(1, new InfpAttackGoal(this, 1D, true));

        this.goalSelector.add(1, new AnimalMateGoal(this, 1.15D));
        this.goalSelector.add(2, new TemptGoal(this, 1.25D, Ingredient.ofItems(ModItems.RRUM), false));

        this.goalSelector.add(3, new FollowParentGoal(this, 1.15D));

        this.goalSelector.add(4, new WanderAroundFarGoal(this, 1D));
        this.goalSelector.add(5, new LookAtEntityGoal(this, PlayerEntity.class, 4f));
        this.goalSelector.add(6, new LookAroundGoal(this));

        this.targetSelector.add(1, new RevengeGoal(this));
    }

    public static DefaultAttributeContainer.Builder createInfpAttributes() {
        return AnimalEntity.createAnimalAttributes()
                .add(EntityAttributes.MAX_HEALTH, 18)
                .add(EntityAttributes.MOVEMENT_SPEED, 0.35)
                .add(EntityAttributes.ATTACK_DAMAGE, 1)
                .add(EntityAttributes.FOLLOW_RANGE, 20);
    }

    private void setupAnimationStates() {
        if (this.idleAnimationTimeout <= 0) {
            this.idlingAnimationState.start(this.age);
            this.idleAnimationTimeout = 40;
        } else {
            --this.idleAnimationTimeout;
        }

        if (this.isAttacking() && attackAnimationTimeout <= 0) {
            attackAnimationTimeout = 40;
            attackingAnimationState.start(this.age);
        } else {
            --this.attackAnimationTimeout;
        }

        if (!this.isAttacking()) {
            attackingAnimationState.stop();
        }
    }

    protected void onGrowUp() {
        if (this.isBaby()) {
            this.getAttributeInstance(EntityAttributes.ATTACK_DAMAGE).setBaseValue((double) 1.0F);
        } else {
            this.getAttributeInstance(EntityAttributes.ATTACK_DAMAGE).setBaseValue((double) 2.0F);
        }

    }

    @Override
    public void tick() {
        super.tick();
        if (this.getWorld().isClient()) {
            this.setupAnimationStates();
        }
    }

    @Override
    public boolean isBreedingItem(ItemStack stack) {
        return stack.isOf(ModItems.RRUM);
    }

    @Nullable
    public InfpEntity createChild(ServerWorld world, PassiveEntity entity) {
        InfpEntity baby = Entities.INFP_MOB.create(world, SpawnReason.BREEDING);
        return baby;
    }

//    public boolean isBaby() {
//        return false;
//    }


    public void breed(ServerWorld world, AnimalEntity other) {
        PassiveEntity passiveEntity = this.createChild(world, other);
        if (passiveEntity != null) {
            passiveEntity.setBaby(true);
            passiveEntity.refreshPositionAndAngles(this.getX(), this.getY(), this.getZ(), 0.0F, 0.0F);
            this.breed(world, other, passiveEntity);
            world.spawnEntityAndPassengers(passiveEntity);
        }
    }

    @Override
    protected void initDataTracker(DataTracker.Builder builder) {
        super.initDataTracker(builder);
        builder.add(DATA_ID_TYPE_VARIANT, 0);
    }

    public InfpVariant getVariant() {
        return InfpVariant.byId(this.getTypeVariant() & 255);
    }

    private int getTypeVariant() {
        return this.dataTracker.get(DATA_ID_TYPE_VARIANT);
    }

    private void setVariant(InfpVariant variant) {
        this.dataTracker.set(DATA_ID_TYPE_VARIANT, variant.getId() & 255);
    }


    @Override
    public void writeCustomDataToNbt(NbtCompound nbt) {
        super.writeCustomDataToNbt(nbt);
        nbt.putInt("Variant", this.getTypeVariant());
    }

    @Override
    public void readCustomDataFromNbt(NbtCompound nbt) {
        super.readCustomDataFromNbt(nbt);
        this.dataTracker.set(DATA_ID_TYPE_VARIANT, nbt.getInt("Variant"));
    }

    @Override
    public EntityData initialize(ServerWorldAccess world, LocalDifficulty difficulty, SpawnReason spawnReason,
            @Nullable EntityData entityData) {
        this.onGrowUp();

        return super.initialize(world, difficulty, spawnReason, entityData);
    }

}
