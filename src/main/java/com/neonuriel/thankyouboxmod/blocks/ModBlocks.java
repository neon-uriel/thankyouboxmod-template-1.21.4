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
import com.neonuriel.thankyouboxmod.sound.ModBlockSoundGroup;

public class ModBlocks {
        private ModBlocks() {
        }

        public static final Block MIDORI_BLOCK = register("midori_block", settings -> new MidoriBlock(settings),
                        MidoriBlock.Settings.create().strength(1.0f).sounds(ModBlockSoundGroup.MIDORI_BLOCK)
                                        .luminance(MidoriBlock::getLuminance));

        public static final Block CHITSU_BLOCK = register("chitsu_block", Block::new,
                        Block.Settings.create().strength(1.0f).sounds(ModBlockSoundGroup.CHITSU_BLOCK));
        public static final Block THANK_YOU_BOX = register("thank_you_box", ThankYouBoxBlock::new,
                        Block.Settings.create().strength(1.0f));
        public static final Block FLYER_BLOCK = register("flyer_block", FlyerBlock::new,
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
                        itemGroup.add(ModBlocks.MIDORI_BLOCK.asItem());
                        itemGroup.add(ModBlocks.CHITSU_BLOCK.asItem());
                        itemGroup.add(ModBlocks.THANK_YOU_BOX.asItem());
                });
        }
}
