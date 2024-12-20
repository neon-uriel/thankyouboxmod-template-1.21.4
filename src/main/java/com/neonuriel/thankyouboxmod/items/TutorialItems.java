package com.neonuriel.thankyouboxmod.items;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import java.util.function.Function;


public class TutorialItems {
  private TutorialItems() {
  }
 
  public static final Item CUSTOM_ITEM = register("custom_item", Item::new, new Item.Settings().food(new FoodComponent.Builder().build()));
 
  public static Item register(String path, Function<Item.Settings, Item> factory, Item.Settings settings) {
    final RegistryKey<Item> registryKey = RegistryKey.of(RegistryKeys.ITEM, Identifier.of("tutorial", path));
    return Items.register(registryKey, factory, settings);
  }
 
  public static void initialize() {
  }
}