package com.neonuriel.thankyouboxmod.blocks;

import java.util.function.Function;

import com.neonuriel.thankyouboxmod.ThankyouBoxMOD;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import com.neonuriel.thankyouboxmod.items.ModItems;

public class ModBlocks {
        private ModBlocks() {
        }

        public static final Block CUSTOM_BLOCK = register("custom_block", Block::new,
                        Block.Settings.create().strength(1.0f));

        private static Block register(String path, Function<AbstractBlock.Settings, Block> factory,
                        AbstractBlock.Settings settings) {
                final Identifier identifier = Identifier.of(ThankyouBoxMOD.MOD_ID, path);
                final RegistryKey<Block> registryKey = RegistryKey.of(RegistryKeys.BLOCK, identifier);

                final Block block = Blocks.register(registryKey, factory, settings);
                Items.register(block);
                return block;
        }

        public static void initialize() {
                ItemGroupEvents.modifyEntriesEvent(ModItems.CUSTOM_ITEM_GROUP_KEY).register((itemGroup) -> {
                        itemGroup.add(ModBlocks.CUSTOM_BLOCK.asItem());
                });
        }
}
