package com.neonuriel.thankyouboxmod.blocks;

import org.jetbrains.annotations.Nullable;

import com.neonuriel.thankyouboxmod.entities.Entities;

import net.minecraft.block.Block;
import net.minecraft.block.BlockEntityProvider;
import net.minecraft.block.BlockRenderType;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;

public class ThankYouBoxBlock extends Block implements BlockEntityProvider  {
    private static final VoxelShape SHAPE = VoxelShapes.union(
        VoxelShapes.cuboid(0.0625, 0, 0.75, 0.125, 0.0625, 0.8125),
		VoxelShapes.cuboid(0.875, 0, 0.75, 0.9375, 0.0625, 0.8125),
		VoxelShapes.cuboid(0.875, 0, 0.1875, 0.9375, 0.0625, 0.25),
		VoxelShapes.cuboid(0.0625, 0, 0.1875, 0.125, 0.0625, 0.25),
		VoxelShapes.cuboid(0.0625, 0.0625, 0.1875, 0.9375, 0.5625, 0.8125),
		VoxelShapes.cuboid(0.0625, 0.5625, 0.6875, 0.9375, 0.625, 0.8125),
		VoxelShapes.cuboid(0.125, 0.5710185434277331, 0.9397047612756302, 0.875, 0.8835185434277331, 0.9397047612756302),
		VoxelShapes.cuboid(0.0625, 0.875, 0.1875, 0.9375, 0.9375, 0.75),
		VoxelShapes.cuboid(0.0625, 0.5625, 0.1875, 0.125, 0.875, 0.6875),
		VoxelShapes.cuboid(0.875, 0.5625, 0.1875, 0.9375, 0.875, 0.6875),
		VoxelShapes.cuboid(0.125, 0.5625, 0.1875, 0.875, 0.875, 0.25),
		VoxelShapes.cuboid(0.0625, 0.5625, 0.875, 0.125, 0.875, 1),
		VoxelShapes.cuboid(0.875, 0.5625, 0.875, 0.9375, 0.875, 1),
		VoxelShapes.cuboid(0.4375, 0.5625, 0.875, 0.5625, 0.875, 1),
		VoxelShapes.cuboid(0.125, 0.9375, 0.4375, 0.375, 1.125, 0.6875)
    ).simplify();

    public ThankYouBoxBlock(Settings settings) {
        super(settings);
    }

    @Nullable
    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return Entities.THANK_YOU_BOX_ENTITY.instantiate(pos, state);
    }

    @Override
    protected VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }

    @Override
    protected BlockRenderType getRenderType(BlockState state) {
        return BlockRenderType.INVISIBLE;
    }

}
