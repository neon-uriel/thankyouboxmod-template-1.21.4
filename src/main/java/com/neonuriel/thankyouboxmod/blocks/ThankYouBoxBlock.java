package com.neonuriel.thankyouboxmod.blocks;

import org.jetbrains.annotations.Nullable;

import com.neonuriel.thankyouboxmod.entities.Entities;

import net.minecraft.block.Block;
import net.minecraft.block.BlockEntityProvider;
import net.minecraft.block.BlockRenderType;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;

public class ThankYouBoxBlock extends Block implements BlockEntityProvider  {
    public ThankYouBoxBlock(Settings settings) {
        super(settings);
    }

    @Nullable
    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return Entities.THANK_YOU_BOX_ENTITY.instantiate(pos, state);
    }

    @Override
    protected BlockRenderType getRenderType(BlockState state) {
        return BlockRenderType.INVISIBLE;
    }

}
