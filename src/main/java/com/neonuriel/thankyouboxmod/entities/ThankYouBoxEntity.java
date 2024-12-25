package com.neonuriel.thankyouboxmod.entities;

import org.jetbrains.annotations.Nullable;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.component.ComponentMap;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.text.Text;
import net.minecraft.text.Text.Serialization;
import net.minecraft.util.Nameable;
import net.minecraft.util.math.BlockPos;

public class ThankYouBoxEntity extends BlockEntity implements Nameable {
    @Nullable
    private Text customName;

    public ThankYouBoxEntity(BlockPos pos, BlockState state) {
        super(Entities.THANK_YOU_BOX_ENTITY, pos, state);
    }

    protected void writeNbt(NbtCompound nbt, RegistryWrapper.WrapperLookup registries) {
        super.writeNbt(nbt, registries);
        if (this.hasCustomName()) {
            nbt.putString("CustomName", Serialization.toJsonString(this.customName, registries));
        }

    }

    protected void readNbt(NbtCompound nbt, RegistryWrapper.WrapperLookup registries) {
        super.readNbt(nbt, registries);
        if (nbt.contains("CustomName", 8)) {
            this.customName = tryParseCustomName(nbt.getString("CustomName"), registries);
        }

    }

    public Text getName() {
        return (Text) (this.customName != null ? this.customName : Text.translatable("container.enchant"));
    }

    public void setCustomName(@Nullable Text customName) {
        this.customName = customName;
    }

    @Nullable
    public Text getCustomName() {
        return this.customName;
    }

    protected void readComponents(BlockEntity.ComponentsAccess components) {
        super.readComponents(components);
        this.customName = (Text) components.get(DataComponentTypes.CUSTOM_NAME);
    }

    protected void addComponents(ComponentMap.Builder builder) {
        super.addComponents(builder);
        builder.add(DataComponentTypes.CUSTOM_NAME, this.customName);
    }

    public void removeFromCopiedStackNbt(NbtCompound nbt) {
        nbt.remove("CustomName");
    }
}
