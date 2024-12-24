package com.neonuriel.thankyouboxmod.entities;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.DefaultAttributeRegistry;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import com.neonuriel.thankyouboxmod.ThankyouBoxMOD;
import com.neonuriel.thankyouboxmod.blocks.ModBlocks;


public class Entities {
    
    public static EntityType<BlueAppleEntity> BLUE_APPLE_MOB = EntityType.Builder.create(BlueAppleEntity::new, SpawnGroup.CREATURE)
        .dimensions(0.5f, 0.75f)
        .maxTrackingRange(2000)
        .build(RegistryKey.of(
            RegistryKeys.ENTITY_TYPE,
            Identifier.of(ThankyouBoxMOD.MOD_ID, "blue_apple_mob")
        ));
    
    public static EntityType<ThankYouBoxEntity> THANK_YOU_BOX_ENTITY = EntityType.Builder.create(ThankYouBoxEntity::new, SpawnGroup.CREATURE)
        .dimensions(0.5f, 0.75f)
        .maxTrackingRange(2000)
        .build(RegistryKey.of(
            RegistryKeys.ENTITY_TYPE,
            Identifier.of(ThankyouBoxMOD.MOD_ID, "thank_you_box_entity")
        ));

    public static void init() {
        Registry.register(
        Registries.ENTITY_TYPE,
        Identifier.of(ThankyouBoxMOD.MOD_ID, "blue_apple_mob"), BLUE_APPLE_MOB
                );
        FabricDefaultAttributeRegistry.register(THANK_YOU_BOX_ENTITY, ThankYouBoxEntity.createMobAttributes());
        Registry.register(
        Registries.ENTITY_TYPE,
        Identifier.of(ThankyouBoxMOD.MOD_ID, "thank_you_box_entity"), THANK_YOU_BOX_ENTITY
                );
    }
}
