package com.neonuriel.thankyouboxmod.worldgen.biome;

import com.neonuriel.thankyouboxmod.ThankyouBoxMOD;

import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.biome.Biome;

public class ModBiome {
    public static final RegistryKey<Biome> UUUM_BIOME = register("uuum_biome");

    private static RegistryKey<Biome> register(String id) {
        return RegistryKey.of(RegistryKeys.BIOME, Identifier.of(ThankyouBoxMOD.MOD_ID, id));
    }

    public static void initialize() {
    }
}
