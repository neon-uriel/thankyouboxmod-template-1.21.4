package com.neonuriel.thankyouboxmod.entities;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import com.neonuriel.thankyouboxmod.ThankyouBoxMOD;


public class Entities {
    
    public static EntityType<BlueAppleEntity> BLUE_APPLE_MOB = EntityType.Builder.create(BlueAppleEntity::new, SpawnGroup.CREATURE)
        .dimensions(0.5f, 0.75f)
        .maxTrackingRange(2000)
        .build(RegistryKey.of(
            RegistryKeys.ENTITY_TYPE,
            Identifier.of(ThankyouBoxMOD.MOD_ID, "blue_apple_mob")
        ));

    public static void init() {
        Registry.register(
        Registries.ENTITY_TYPE,
        Identifier.of(ThankyouBoxMOD.MOD_ID, "blue_apple_mob"), BLUE_APPLE_MOB
                );
    }
}
