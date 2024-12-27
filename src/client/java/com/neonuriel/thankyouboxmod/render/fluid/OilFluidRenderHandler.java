package com.neonuriel.thankyouboxmod.render.fluid;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandler;
import net.minecraft.client.texture.Sprite;
import net.minecraft.fluid.FluidState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockRenderView;
import org.jetbrains.annotations.Nullable;

@Environment(EnvType.CLIENT)
public class OilFluidRenderHandler implements FluidRenderHandler {
    public static final OilFluidRenderHandler INSTANCE = new OilFluidRenderHandler();
    private static final int DEFAULT_WATER_COLOR = 15656721;
    private final Sprite[] sprites = new Sprite[3];

    private OilFluidRenderHandler() {
    }

    public Sprite[] getFluidSprites(@Nullable BlockRenderView view, @Nullable BlockPos pos, FluidState state) {
        return this.sprites;
    }

    public int getFluidColor(@Nullable BlockRenderView view, @Nullable BlockPos pos, FluidState state) {
        return 15656721;
    }

    public void updateSprites(Sprite[] waterSprites, Sprite waterOverlay) {
        this.sprites[0] = waterSprites[0];
        this.sprites[1] = waterSprites[1];
        this.sprites[2] = waterOverlay;
    }
}
