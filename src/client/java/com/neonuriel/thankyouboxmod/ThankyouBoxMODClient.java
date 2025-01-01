package com.neonuriel.thankyouboxmod;

import com.neonuriel.thankyouboxmod.blocks.ModBlocks;
import com.neonuriel.thankyouboxmod.fluid.ModFluids;
import com.neonuriel.thankyouboxmod.render.entity.EntityModels;
import com.neonuriel.thankyouboxmod.render.entity.EntityRenderers;

import com.neonuriel.thankyouboxmod.render.fluid.OilFluidRenderHandler;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandlerRegistry;
import net.fabricmc.fabric.api.client.render.fluid.v1.SimpleFluidRenderHandler;
import net.minecraft.client.render.RenderLayer;

public class ThankyouBoxMODClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), ModBlocks.THANK_YOU_BOX, ModBlocks.FLYER_BLOCK);
		EntityModels.init();
		EntityRenderers.init();
		FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_OIL_FLUID, new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL, SimpleFluidRenderHandler.WATER_FLOWING, SimpleFluidRenderHandler.WATER_OVERLAY, 15656721));
		FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.FLOWING_OIL_FLUID, new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL, SimpleFluidRenderHandler.WATER_FLOWING, SimpleFluidRenderHandler.WATER_OVERLAY, 15656721));

	}
}
