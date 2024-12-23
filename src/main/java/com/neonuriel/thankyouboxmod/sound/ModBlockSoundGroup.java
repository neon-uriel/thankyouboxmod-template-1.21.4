package com.neonuriel.thankyouboxmod.sound;

import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvent;

public class ModBlockSoundGroup {
    // private static SoundEvent toSound(RegistryKey<SoundEvent> key) {
    // return SoundEvent.of(key.getValue());
    // }

    public static BlockSoundGroup MIDORI_BLOCK = create(0.5f, 1.0f, ModSound.BLOCK_MIDORI_BLOCK_SOUND,
            ModSound.BLOCK_MIDORI_BLOCK_SOUND, ModSound.BLOCK_MIDORI_BLOCK_SOUND, ModSound.BLOCK_MIDORI_BLOCK_SOUND,
            ModSound.BLOCK_MIDORI_BLOCK_SOUND);
    public static BlockSoundGroup CHITSU_BLOCK = create(0.5f, 1.0f, ModSound.CHITSU_SOUND_CHITSU,
            ModSound.CHITSU_SOUND_CHITSU, ModSound.CHITSU_SOUND_IKU, ModSound.CHITSU_SOUND_MARA,
            ModSound.CHITSU_SOUND_OSHIRI);

    public static BlockSoundGroup create(float volume, float pitch, SoundEvent breakSound, SoundEvent stepSound,
            SoundEvent placeSound, SoundEvent hitSound, SoundEvent fallSound) {
        return new BlockSoundGroup(volume, pitch, breakSound, stepSound, placeSound, hitSound, fallSound);
    }
}
