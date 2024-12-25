package com.neonuriel.thankyouboxmod.entities;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;

public class FlyerEntity extends BlockEntity {
    public FlyerEntity(BlockPos pos, BlockState state) {
        super(Entities.FLYER_ENTITY, pos, state);
    }
}
