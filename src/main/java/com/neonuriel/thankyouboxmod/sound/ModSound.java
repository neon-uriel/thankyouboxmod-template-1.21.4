package com.neonuriel.thankyouboxmod.sound;

import com.neonuriel.thankyouboxmod.ThankyouBoxMOD;

import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSound {
    public static RegistryKey<SoundEvent> MIDORI_SOUND = register("midori_sound");

    private static RegistryKey<SoundEvent> register(String id) {
        return RegistryKey.of(RegistryKeys.SOUND_EVENT, Identifier.of(ThankyouBoxMOD.MOD_ID, id));
    }

    public static void initialize() {
    }
}
