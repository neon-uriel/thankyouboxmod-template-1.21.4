package com.neonuriel.thankyouboxmod.entities;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.world.World;

public class BlueAppleEntity extends PathAwareEntity{
    public BlueAppleEntity(EntityType<? extends PathAwareEntity> entityType, World world) {
        super(entityType, world);
    }    
}
