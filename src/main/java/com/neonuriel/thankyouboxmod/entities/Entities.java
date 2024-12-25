package com.neonuriel.thankyouboxmod.entities;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.entity.EntityAttachmentType;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import com.neonuriel.thankyouboxmod.ThankyouBoxMOD;
import com.neonuriel.thankyouboxmod.blocks.ModBlocks;

public class Entities {
        public static BlockEntityType<ThankYouBoxEntity> THANK_YOU_BOX_ENTITY;
        public static EntityType<BlueAppleEntity> BLUE_APPLE_MOB = EntityType.Builder
                        .create(BlueAppleEntity::new, SpawnGroup.CREATURE)
                        .dimensions(0.5f, 0.75f)
                        .maxTrackingRange(2000)
                        .build(RegistryKey.of(
                                        RegistryKeys.ENTITY_TYPE,
                                        Identifier.of(ThankyouBoxMOD.MOD_ID, "blue_apple_mob")));
        public static EntityType<InfpEntity> INFP_MOB = EntityType.Builder
                        .create(InfpEntity::new, SpawnGroup.CREATURE)
                        .dimensions(1f, 2.5f)
                        .build(RegistryKey.of(
                                        RegistryKeys.ENTITY_TYPE,
                                        Identifier.of(ThankyouBoxMOD.MOD_ID, "infp_mob")));

        public static BlockEntityType<FlyerEntity> FLYER_ENTITY = FabricBlockEntityTypeBuilder.create(FlyerEntity::new, ModBlocks.FLYER_BLOCK).build();
        public static void init() {
                Registry.register(
                                Registries.ENTITY_TYPE,
                                Identifier.of(ThankyouBoxMOD.MOD_ID, "blue_apple_mob"), BLUE_APPLE_MOB);
                FabricDefaultAttributeRegistry.register(BLUE_APPLE_MOB, BlueAppleEntity.createMobAttributes());
                Registry.register(
                                Registries.ENTITY_TYPE,
                                Identifier.of(ThankyouBoxMOD.MOD_ID, "infp_mob"), INFP_MOB);
                FabricDefaultAttributeRegistry.register(INFP_MOB, InfpEntity.createInfpAttributes());
                THANK_YOU_BOX_ENTITY = Registry.register(
                                Registries.BLOCK_ENTITY_TYPE,
                                Identifier.of(ThankyouBoxMOD.MOD_ID, "thank_you_box_entity"),
                                FabricBlockEntityTypeBuilder.create(ThankYouBoxEntity::new, ModBlocks.THANK_YOU_BOX)
                                                .build());
                Registry.register(
                    Registries.BLOCK_ENTITY_TYPE,
                    Identifier.of(ThankyouBoxMOD.MOD_ID, "flyer_entity"), FLYER_ENTITY
                            );
        }
}
