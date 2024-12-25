package com.neonuriel.thankyouboxmod.blocks;

import net.minecraft.world.BlockView;

import com.neonuriel.thankyouboxmod.ThankyouBoxMOD;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvent;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Identifier;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;

public class MidoriBlock extends Block {
    public static final BooleanProperty ACTIVATED = BooleanProperty.of("activated");

    public MidoriBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(ACTIVATED);
    }

    @Override
    protected ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, BlockHitResult hit) {
        boolean activated = state.get(ACTIVATED);
        if (activated) {
            world.setBlockState(pos, state.with(ACTIVATED, false));
            return ActionResult.PASS;
        } else {
            world.setBlockState(pos, state.with(ACTIVATED, true));
            world.playSound(player, pos,
                    SoundEvent.of(Identifier.of(ThankyouBoxMOD.MOD_ID, "block.midori_block.sound")),
                    SoundCategory.BLOCKS, 1.0f, 1.0f);
        }
        return ActionResult.SUCCESS;
    }

    @Override
    protected boolean emitsRedstonePower(BlockState state) {
        boolean activated = state.get(MidoriBlock.ACTIVATED);
        if (activated) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int getWeakRedstonePower(BlockState state, BlockView world, BlockPos pos, Direction direction) {
        boolean activated = state.get(MidoriBlock.ACTIVATED);
        if (activated) {
            return 15;
        } else {
            return 0;
        }
    }

    public static int getLuminance(BlockState state) {
        boolean activated = state.get(MidoriBlock.ACTIVATED);

        return activated ? 15 : 0;
    }
}
