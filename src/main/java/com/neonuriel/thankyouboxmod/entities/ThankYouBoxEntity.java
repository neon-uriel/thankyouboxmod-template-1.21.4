package com.neonuriel.thankyouboxmod.entities;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;

public class ThankYouBoxEntity extends BlockEntity {
    public ThankYouBoxEntity(BlockPos pos, BlockState state) {
        super(Entities.THANK_YOU_BOX_ENTITY, pos, state);
    }
}

