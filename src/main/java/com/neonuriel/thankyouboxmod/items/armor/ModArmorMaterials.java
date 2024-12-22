package com.neonuriel.thankyouboxmod.items.armor;

import java.util.Map;
import com.neonuriel.thankyouboxmod.ThankyouBoxMOD;
import net.minecraft.item.equipment.ArmorMaterial;
import net.minecraft.item.equipment.EquipmentAsset;
import net.minecraft.item.equipment.EquipmentAssetKeys;
import net.minecraft.item.equipment.EquipmentType;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;

public class ModArmorMaterials {
    public static final int AKAFUKU_DURABILITY_MULTIPLIER = 15;
    public static final ArmorMaterial AKAFUKU = new ArmorMaterial(
            AKAFUKU_DURABILITY_MULTIPLIER,
            Map.of(
                    EquipmentType.HELMET, 3,
                    EquipmentType.CHESTPLATE, 8,
                    EquipmentType.LEGGINGS, 6,
                    EquipmentType.BOOTS, 3),
            4,
            SoundEvents.ITEM_ARMOR_EQUIP_IRON,
            4.0f,
            2.0f,
            TagKey.of(RegistryKeys.ITEM, Identifier.of(ThankyouBoxMOD.MOD_ID, "fuji_rock")),
            register("akafuku"));

    public static RegistryKey<EquipmentAsset> register(String name) {
        return RegistryKey.of(EquipmentAssetKeys.REGISTRY_KEY,
                Identifier.of(ThankyouBoxMOD.MOD_ID, name));
    }

    public static void initialize() {
    }
}
