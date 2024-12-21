package com.neonuriel.thankyouboxmod;

import com.neonuriel.thankyouboxmod.render.entity.EntityRenderers;

import net.fabricmc.api.ClientModInitializer;

public class ThankyouBoxMODClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		// This entrypoint is suitable for setting up client-specific logic, such as rendering.
		EntityRenderers.init();
	}
}
