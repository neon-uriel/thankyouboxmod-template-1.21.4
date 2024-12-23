package com.neonuriel.thankyouboxmod.sound;

import net.minecraft.registry.RegistryKey;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvent;

public class ModBlockSoundGroup {
    private static SoundEvent toSound(RegistryKey<SoundEvent> key) {
        return SoundEvent.of(key.getValue());
    }

    public static BlockSoundGroup MIDORI_BLOCK = create(1.0f, 2.0f, ModSound.MIDORI_SOUND, ModSound.MIDORI_SOUND,
            ModSound.MIDORI_SOUND, ModSound.MIDORI_SOUND, ModSound.MIDORI_SOUND);

    public static BlockSoundGroup create(float volume, float pitch, RegistryKey<SoundEvent> breakSound,
            RegistryKey<SoundEvent> stepSound, RegistryKey<SoundEvent> placeSound, RegistryKey<SoundEvent> hitSound,
            RegistryKey<SoundEvent> fallSound) {
        return new BlockSoundGroup(volume, pitch, toSound(breakSound), toSound(stepSound), toSound(placeSound),
                toSound(hitSound), toSound(fallSound));
    }
}
