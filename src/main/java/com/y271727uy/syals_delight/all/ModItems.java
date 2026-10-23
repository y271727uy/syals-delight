package com.y271727uy.syals_delight.all;

import com.y271727uy.syals_delight.SYDMod;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tiers;

public final class ModItems {
	public static final Item SYALS = register("syals", new Item(food(6, 9.3F)));
	public static final Item CHIPS_BAG = register("chips_bag", new Item(new Item.Properties()));
	public static final Item SYALS_BAG = register("syals_bag", new Item(new Item.Properties()));

	public static final Item BAG_O_CHIPS = register("bag_o_chips", new Item(food(6, 9.3F)));
	public static final Item KETTLE_CHIPS = register("kettle_chips", new Item(food(6, 9.3F)));
	public static final Item NAQUADAH_CHIPS = register("naquadah_chips", new Item(food(189, 66.4F)));
	public static final Item REDUCED_FAT_CHIPS = register("reduced_fat_chips", new Item(food(4, 8.6F)));
	public static final Item VINEGAR_CHIPS = register("vinegar_chips", new Item(food(6, 9.9F)));
	public static final Item ASTERA_CHIPS = register("astera_chips", new Item(food(6, 9.3F)));
	public static final Item BROCCOLI_FLAVORED_SLIMMING_CHIPS = register("broccoli_flavored_slimming_chips", new Item(food(6, 9.3F)));
	public static final Item PESTO_FLAVORED_CHIPS = register("pesto_flavored_chips", new Item(food(6, 9.3F)));
	public static final Item STEAK_CHIMICHURRI_CHIPS = register("steak_chimichurri_chips", new Item(food(6, 9.3F)));
	public static final Item DONKEY_BURGER_CHIPS = register("donkey_burger_chips", new Item(food(6, 9.3F)));
	public static final Item SMOKER_HAM_CHIPS = register("smoker_ham_chips", new Item(food(6, 9.3F)));
	public static final Item ONION_CHIPS = register("onion_chips", new Item(food(6, 9.3F)));
	public static final Item SPICY_CHIPS = register("spicy_chips", new Item(food(6, 9.3F)));
	public static final Item TOMATO_CHIPS = register("tomato_chips", new Item(food(6, 9.3F)));

	public static final Item BATCH_FRIED_POTATO_SLICE = register("batch_fried_potato_slice", new Item(food(2, 2.0F)));
	public static final Item FRIED_NAQUADAH_POTATO_SLICE = register("fried_naquadah_potato_slice", new Item(food(2, 2.0F)));
	public static final Item FRIED_POTATO_SLICE = register("fried_potato_slice", new Item(food(2, 2.0F)));
	public static final Item GREASY_POTATO_SLICE = register("greasy_potato_slice", new Item(food(2, 2.0F)));
	public static final Item HOT_POTATO_SLICE = register("hot_potato_slice", new Item(food(2, 2.0F)));
	public static final Item LOW_FAT_POTATO_SLICE = register("low_fat_potato_slice", new Item(food(2, 2.0F)));
	public static final Item POTATO_SLICE = register("potato_slice", new Item(food(2, 2.0F)));

	public static final Item PEELED_POTATO = register("peeled_potato", new Item(new Item.Properties()));
	public static final Item PEELER = register("peeler", new SwordItem(Tiers.STONE, new Item.Properties().durability(Tiers.STONE.getUses())));
	public static final Item ANIMAL_FAT = register("animal_fat", new Item(new Item.Properties()));
	public static final Item OIL_BOTTLE = register("oil_bottle", new Item(oilBottle()));
	public static final Item ZOMBIE_OIL_BOTTLE = register("zombie_oil_bottle", new Item(oilBottle()));
	public static final Item UNDERGROUND_OIL_BOTTLE = register("underground_oil_bottle", new Item(oilBottle()));

	private ModItems() {
	}

	public static void register() {
	}

	private static Item register(String path, Item item) {
		return Registry.register(BuiltInRegistries.ITEM, SYDMod.id(path), item);
	}

	private static Item.Properties food(int nutrition, float saturation) {
		return new Item.Properties().food(new FoodProperties.Builder()
				.nutrition(nutrition)
				.saturationModifier(saturation)
				.build());
	}

	private static Item.Properties oilBottle() {
		return new Item.Properties().craftRemainder(Items.GLASS_BOTTLE);
	}
}
