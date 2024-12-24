package com.neonuriel.thankyouboxmod.blocks;

import org.jetbrains.annotations.Nullable;

import com.mojang.serialization.MapCodec;
import com.neonuriel.thankyouboxmod.entities.ThankYouBoxEntity;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.BlockWithEntity;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;

public class ThankYouBoxBlock extends BlockWithEntity {

    public static final MapCodec<ThankYouBoxBlock> CODEC = createCodec(ThankYouBoxBlock::new);

    public MapCodec<ThankYouBoxBlock> getCodec() {
        return CODEC;
    }

    public ThankYouBoxBlock(AbstractBlock.Settings settings) {
        super(settings);
    }

    @Nullable
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new ThankYouBoxEntity(pos, state);
    }
}
