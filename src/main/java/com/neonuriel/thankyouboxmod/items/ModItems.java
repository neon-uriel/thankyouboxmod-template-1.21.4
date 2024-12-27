package com.neonuriel.thankyouboxmod.items;

import com.neonuriel.thankyouboxmod.fluid.ModFluids;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.item.*;
import net.minecraft.item.equipment.EquipmentType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import java.util.function.Function;
import com.neonuriel.thankyouboxmod.ThankyouBoxMOD;
import com.neonuriel.thankyouboxmod.items.armor.ModArmorMaterials;

public class ModItems {
        private ModItems() {
        }

        public static final Item FUJI_ROCK = register("fuji_rock", Item::new,
                        new Item.Settings().food(new FoodComponent.Builder().nutrition(1).build()));

        public static final Item RRUM = register("rrum", Item::new,
                        new Item.Settings().food(new FoodComponent.Builder().build()));

        public static final Item HUMBURGER = register("hamburger", Item::new,
                        new Item.Settings().food(new FoodComponent.Builder().nutrition(4).build()));

        public static final Item AKAFUKU_HELMET = register(
                        "akafuku_helmet",
                        settings -> new ArmorItem(
                                        ModArmorMaterials.AKAFUKU, // カスタム防具素材
                                        EquipmentType.HELMET, // 防具の種類
                                        settings // アイテム設定
                        ),
                        new Item.Settings().maxDamage(EquipmentType.HELMET
                                        .getMaxDamage(ModArmorMaterials.AKAFUKU_DURABILITY_MULTIPLIER))); // 耐久値

        public static final Item AKAFUKU_CHESTPLATE = register(
                        "akafuku_chestplate",
                        settings -> new ArmorItem(
                                        ModArmorMaterials.AKAFUKU, // カスタム防具素材
                                        EquipmentType.CHESTPLATE, // 防具の種類
                                        settings // アイテム設定
                        ),
                        new Item.Settings().maxDamage(EquipmentType.CHESTPLATE
                                        .getMaxDamage(ModArmorMaterials.AKAFUKU_DURABILITY_MULTIPLIER))); // 耐久値

        public static final Item AKAFUKU_LEGGINGS = register(
                        "akafuku_leggings",
                        settings -> new ArmorItem(
                                        ModArmorMaterials.AKAFUKU, // カスタム防具素材
                                        EquipmentType.LEGGINGS, // 防具の種類
                                        settings // アイテム設定
                        ),
                        new Item.Settings().maxDamage(EquipmentType.LEGGINGS
                                        .getMaxDamage(ModArmorMaterials.AKAFUKU_DURABILITY_MULTIPLIER))); // 耐久値

        public static final Item AKAFUKU_BOOTS = register(
                        "akafuku_boots",
                        settings -> new ArmorItem(
                                        ModArmorMaterials.AKAFUKU, // カスタム防具素材
                                        EquipmentType.BOOTS, // 防具の種類
                                        settings // アイテム設定
                        ),
                        new Item.Settings().maxDamage(EquipmentType.BOOTS
                                        .getMaxDamage(ModArmorMaterials.AKAFUKU_DURABILITY_MULTIPLIER))); // 耐久値

        public static final Item OIL_FLUID_BUCKET = register("oil_fluid_bucket", settings -> new BucketItem(ModFluids.STILL_OIL_FLUID, settings),
                new Item.Settings().recipeRemainder(Items.BUCKET).maxCount(1));

        public static final RegistryKey<ItemGroup> CUSTOM_ITEM_GROUP_KEY = RegistryKey.of(
                        Registries.ITEM_GROUP.getKey(),
                        Identifier.of(ThankyouBoxMOD.MOD_ID, "item_group"));

        public static final ItemGroup CUSTOM_ITEM_GROUP = FabricItemGroup.builder()
                        .icon(() -> new ItemStack(ModItems.FUJI_ROCK))
                        .displayName(Text.translatable("itemGroup.ThankyouBoxMOD"))
                        .build();

        public static Item register(String path, Function<Item.Settings, Item> factory, Item.Settings settings) {
                final RegistryKey<Item> registryKey = RegistryKey.of(RegistryKeys.ITEM,
                                Identifier.of(ThankyouBoxMOD.MOD_ID, path));
                return Items.register(registryKey, factory, settings);
        }

        public static void initialize() {
                ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register((itemGroup) -> {
                        itemGroup.add(ModItems.FUJI_ROCK);
                        itemGroup.add(ModItems.RRUM);
                        itemGroup.add(ModItems.HUMBURGER);
                });
                ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register((itemGroup) -> {
                        itemGroup.add(ModItems.AKAFUKU_HELMET);
                        itemGroup.add(ModItems.AKAFUKU_CHESTPLATE);
                        itemGroup.add(ModItems.AKAFUKU_LEGGINGS);
                        itemGroup.add(ModItems.AKAFUKU_BOOTS);
                });
                Registry.register(Registries.ITEM_GROUP, CUSTOM_ITEM_GROUP_KEY, CUSTOM_ITEM_GROUP);
                ItemGroupEvents.modifyEntriesEvent(CUSTOM_ITEM_GROUP_KEY).register((itemGroup) -> {
                        itemGroup.add(ModItems.FUJI_ROCK);
                        itemGroup.add(ModItems.RRUM);
                        itemGroup.add(ModItems.HUMBURGER);
                        itemGroup.add(ModItems.AKAFUKU_HELMET);
                        itemGroup.add(ModItems.AKAFUKU_CHESTPLATE);
                        itemGroup.add(ModItems.AKAFUKU_LEGGINGS);
                        itemGroup.add(ModItems.AKAFUKU_BOOTS);
                        itemGroup.add(ModItems.OIL_FLUID_BUCKET);
                        itemGroup.add(ModFluids.STILL_OIL_FLUID.getBucketItem());
                        itemGroup.add(ModFluids.FLOWING_OIL_FLUID.getBucketItem());
                });

        }
}
