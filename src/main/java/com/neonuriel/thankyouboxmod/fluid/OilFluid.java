package com.neonuriel.thankyouboxmod.fluid;

import com.neonuriel.thankyouboxmod.blocks.ModBlocks;
import com.neonuriel.thankyouboxmod.items.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.FluidBlock;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.fluid.*;
import net.minecraft.item.Item;
import net.minecraft.registry.tag.FluidTags;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.Property;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.BlockView;
import net.minecraft.world.GameRules;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldView;

import java.util.Optional;

public abstract class OilFluid extends FlowableFluid {
    public OilFluid() {
    }

    public Fluid getFlowing() {
        return ModFluids.FLOWING_OIL_FLUID;
    }

    public Fluid getStill() {
        return ModFluids.STILL_OIL_FLUID;
    }

    public Item getBucketItem() {
        return ModItems.OIL_FLUID_BUCKET;
    }

    protected boolean isInfinite(ServerWorld world) {
        return false;
    }

    protected void beforeBreakingBlock(WorldAccess world, BlockPos pos, BlockState state) {
        final BlockEntity blockEntity = state.hasBlockEntity() ? world.getBlockEntity(pos) : null;
        Block.dropStacks(state, world, pos, blockEntity);
    }

    public int getMaxFlowDistance(WorldView world) {
        return 4;
    }

    public int getLevelDecreasePerBlock(WorldView world) {
        return 1;
    }


    public boolean matchesType(Fluid fluid) {
        return fluid == ModFluids.STILL_OIL_FLUID || fluid == ModFluids.FLOWING_OIL_FLUID;
    }


    public boolean canBeReplacedWith(FluidState state, BlockView world, BlockPos pos, Fluid fluid, Direction direction) {
        return direction == Direction.DOWN && !fluid.isIn(ModFluids.OIL);
    }

    public int getTickRate(WorldView world) {
        return 5;
    }

    protected float getBlastResistance() {
        return 100.0F;
    }

    public Optional<SoundEvent> getBucketFillSound() {
        return Optional.of(SoundEvents.ITEM_BUCKET_FILL);
    }

    public BlockState toBlockState(FluidState state) {
        return (BlockState) ModBlocks.OIL_FLUID_BLOCK.getDefaultState().with(FluidBlock.LEVEL, getBlockStateLevel(state));
    }


    public static class Still extends OilFluid {
        public Still() {
        }

        public int getLevel(FluidState state) {
            return 8;
        }

        public boolean isStill(FluidState state) {
            return true;
        }
    }

    public static class Flowing extends OilFluid {
        public Flowing() {
        }

        protected void appendProperties(StateManager.Builder<Fluid, FluidState> builder) {
            super.appendProperties(builder);
            builder.add(new Property[]{LEVEL});
        }

        @Override
        public int getLevel(FluidState state) {
            return (Integer) state.get(LEVEL);
        }

        @Override
        public boolean isStill(FluidState state) {
            return false;
        }
    }

}
