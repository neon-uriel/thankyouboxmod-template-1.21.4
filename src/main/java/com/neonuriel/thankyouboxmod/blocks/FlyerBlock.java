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

public class FlyerBlock extends Block implements BlockEntityProvider  {
    private static final VoxelShape SHAPE = VoxelShapes.union(
        VoxelShapes.cuboid(0.875, 0, 0.125, 1, 1, 1.875),
		VoxelShapes.cuboid(0, 0, 0.125, 0.125, 1, 1.875),
		VoxelShapes.cuboid(0.125, 0, 0, 0.25, 1, 0.75),
		VoxelShapes.cuboid(0.125, 0, 1.875, 0.25, 1.375, 2.625),
		VoxelShapes.cuboid(0.9375, 0.0625, 0.125, 1.0625, 0.8125, 1.875),
		VoxelShapes.cuboid(0.9375, 0.5625, 0.125, 1.0625, 1.3125, 1.875),
		VoxelShapes.cuboid(0.125, 0.875, -0.25, 0.875, 1, 0),
		VoxelShapes.cuboid(0.125, 0.625, 0.4375, 0.875, 1.125, 1.8125),
		VoxelShapes.cuboid(0.4375, 1.0625, -0.5, 0.5625, 1.1875, 0.4375)
    ).simplify();

    public FlyerBlock(Settings settings) {
        super(settings);
    }

    @Nullable
    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return Entities.FLYER_ENTITY.instantiate(pos, state);
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
