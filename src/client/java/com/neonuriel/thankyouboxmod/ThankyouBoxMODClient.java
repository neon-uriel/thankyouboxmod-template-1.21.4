package com.neonuriel.thankyouboxmod;

import com.neonuriel.thankyouboxmod.blocks.ModBlocks;
import com.neonuriel.thankyouboxmod.render.entity.EntityModels;
import com.neonuriel.thankyouboxmod.render.entity.EntityRenderers;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class ThankyouBoxMODClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), ModBlocks.THANK_YOU_BOX_BLOCK, ModBlocks.FLYER_BLOCK);
		EntityModels.init();
		EntityRenderers.init();
	}
}
