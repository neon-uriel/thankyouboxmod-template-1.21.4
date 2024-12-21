package com.neonuriel.thankyouboxmod.items;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import java.util.function.Function;
import com.neonuriel.thankyouboxmod.ThankyouBoxMOD;

public class ModItems {
    private ModItems() {
    }

    public static final Item FUJI_ROCK = register("fuji_rock", Item::new,
            new Item.Settings().food(new FoodComponent.Builder().nutrition(1).build()));

    public static final Item RRUM = register("rrum", Item::new,
            new Item.Settings().food(new FoodComponent.Builder().build()));

    public static final Item HUMBURGER = register("hamburger", Item::new,
            new Item.Settings().food(new FoodComponent.Builder().nutrition(4).build()));

    public static final RegistryKey<ItemGroup> CUSTOM_ITEM_GROUP_KEY = RegistryKey.of(Registries.ITEM_GROUP.getKey(),
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
        Registry.register(Registries.ITEM_GROUP, CUSTOM_ITEM_GROUP_KEY, CUSTOM_ITEM_GROUP);
        ItemGroupEvents.modifyEntriesEvent(CUSTOM_ITEM_GROUP_KEY).register((itemGroup) -> {
            itemGroup.add(ModItems.FUJI_ROCK);
            itemGroup.add(ModItems.RRUM);
            itemGroup.add(ModItems.HUMBURGER);
        });

    }
}
