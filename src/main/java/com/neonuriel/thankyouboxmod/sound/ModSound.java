package com.neonuriel.thankyouboxmod.sound;

import com.neonuriel.thankyouboxmod.ThankyouBoxMOD;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSound {
    private ModSound() {
    }

    public static final SoundEvent BLOCK_MIDORI_BLOCK_SOUND = registerSound("block.midori_block.sound");
    public static final SoundEvent CHITSU_SOUND_CHITSU = registerSound("block.chitsu_block.chitsu");
    public static final SoundEvent CHITSU_SOUND_ANAU = registerSound("block.chitsu_block.anau");
    public static final SoundEvent CHITSU_SOUND_IKU = registerSound("block.chitsu_block.iku");
    public static final SoundEvent CHITSU_SOUND_MARA = registerSound("block.chitsu_block.mara");
    public static final SoundEvent CHITSU_SOUND_OSHIRI = registerSound("block.chitsu_block.oshiri");
    public static final SoundEvent IMA = registerSound("ima");

    public static SoundEvent registerSound(String id) {
        Identifier identifer = Identifier.of(ThankyouBoxMOD.MOD_ID, id);
        return Registry.register(Registries.SOUND_EVENT, identifer, SoundEvent.of(identifer));
    }

    public static void initialize() {
        ThankyouBoxMOD.LOGGER.info("Registering " + ThankyouBoxMOD.MOD_ID + " Sounds");
    }
}
