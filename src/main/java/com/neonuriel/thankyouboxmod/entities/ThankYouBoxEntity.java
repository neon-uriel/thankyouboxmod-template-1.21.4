package com.neonuriel.thankyouboxmod.entities;


import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ThankYouBoxEntity extends PathAwareEntity{
    public ThankYouBoxEntity(EntityType<? extends PathAwareEntity> entityType, World world) {
        super(entityType, world);
    }    
}

