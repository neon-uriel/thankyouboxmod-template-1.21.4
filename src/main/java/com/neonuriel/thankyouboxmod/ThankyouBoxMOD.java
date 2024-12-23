package com.neonuriel.thankyouboxmod;

import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.neonuriel.thankyouboxmod.items.ModItems;
import com.neonuriel.thankyouboxmod.items.armor.ModArmorMaterials;
import com.neonuriel.thankyouboxmod.sound.ModSound;
import com.neonuriel.thankyouboxmod.worldgen.biome.ModBiome;
import com.neonuriel.thankyouboxmod.blocks.ModBlocks;
import com.neonuriel.thankyouboxmod.entities.Entities;

public class ThankyouBoxMOD implements ModInitializer {
	public static final String MOD_ID = "thankyouboxmod";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Hello Fabric world!");
		ModArmorMaterials.initialize();
		ModItems.initialize();
		ModBlocks.initialize();
		ModSound.initialize();
		Entities.init();
		ModBiome.initialize();
	}

	public static Identifier id(String path) {
		return Identifier.of(MOD_ID, path);
	}
}
