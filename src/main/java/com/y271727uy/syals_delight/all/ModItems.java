package com.y271727uy.syals_delight.all;

import com.y271727uy.syals_delight.SYDMod;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tiers;
import net.minecraft.core.registries.Registries;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

public final class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(Registries.ITEM, SYDMod.MODID);

    public static final DeferredHolder<Item, Item> SYALS = ITEMS.register("syals", () -> new Item(food(6, 9.3F)));
    public static final DeferredHolder<Item, Item> CHIPS_BAG = ITEMS.register("chips_bag", () -> new Item(new Item.Properties()));
    public static final DeferredHolder<Item, Item> SYALS_BAG = ITEMS.register("syals_bag", () -> new Item(new Item.Properties()));

    public static final DeferredHolder<Item, Item> BAG_O_CHIPS = ITEMS.register("bag_o_chips", () -> new Item(food(6, 9.3F)));
    public static final DeferredHolder<Item, Item> KETTLE_CHIPS = ITEMS.register("kettle_chips", () -> new Item(food(6, 9.3F)));
    public static final DeferredHolder<Item, Item> NAQUADAH_CHIPS = ITEMS.register("naquadah_chips", () -> new Item(food(189, 66.4F)));
    public static final DeferredHolder<Item, Item> REDUCED_FAT_CHIPS = ITEMS.register("reduced_fat_chips", () -> new Item(food(4,8.6F)));
    public static final DeferredHolder<Item, Item> VINEGAR_CHIPS = ITEMS.register("vinegar_chips", () -> new Item(food(6, 9.9F)));
    public static final DeferredHolder<Item, Item> ASTERA_CHIPS = ITEMS.register("astera_chips", () -> new Item(food(6, 9.3F)));
    public static final DeferredHolder<Item, Item> BROCCOLI_FLAVORED_SLIMMING_CHIPS = ITEMS.register("broccoli_flavored_slimming_chips", () -> new Item(food(6, 9.3F)));
    public static final DeferredHolder<Item, Item> PESTO_FLAVORED_CHIPS = ITEMS.register("pesto_flavored_chips", () -> new Item(food(6, 9.3F)));
    public static final DeferredHolder<Item, Item> STEAK_CHIMICHURRI_CHIPS = ITEMS.register("steak_chimichurri_chips", () -> new Item(food(6, 9.3F)));
    public static final DeferredHolder<Item, Item> DONKEY_BURGER_CHIPS = ITEMS.register("donkey_burger_chips", () -> new Item(food(6, 9.3F)));
    public static final DeferredHolder<Item, Item> SMOKER_HAM_CHIPS = ITEMS.register("smoker_ham_chips", () -> new Item(food(6, 9.3F)));
    public static final DeferredHolder<Item, Item> ONION_CHIPS = ITEMS.register("onion_chips", () -> new Item(food(6, 9.3F)));
    public static final DeferredHolder<Item, Item> SPICY_CHIPS = ITEMS.register("spicy_chips", () -> new Item(food(6, 9.3F)));
    public static final DeferredHolder<Item, Item> TOMATO_CHIPS = ITEMS.register("tomato_chips", () -> new Item(food(6, 9.3F)));

    public static final DeferredHolder<Item, Item> BATCH_FRIED_POTATO_SLICE = ITEMS.register("batch_fried_potato_slice", () -> new Item(food(2, 2.0F)));
    public static final DeferredHolder<Item, Item> FRIED_NAQUADAH_POTATO_SLICE = ITEMS.register("fried_naquadah_potato_slice", () -> new Item(food(2, 2.0F)));
    public static final DeferredHolder<Item, Item> FRIED_POTATO_SLICE = ITEMS.register("fried_potato_slice", () -> new Item(food(2, 2.0F)));
    public static final DeferredHolder<Item, Item> GREASY_POTATO_SLICE = ITEMS.register("greasy_potato_slice", () -> new Item(food(2, 2.0F)));
    public static final DeferredHolder<Item, Item> HOT_POTATO_SLICE = ITEMS.register("hot_potato_slice", () -> new Item(food(2, 2.0F)));
    public static final DeferredHolder<Item, Item> LOW_FAT_POTATO_SLICE = ITEMS.register("low_fat_potato_slice", () -> new Item(food(2, 2.0F)));
    public static final DeferredHolder<Item, Item> POTATO_SLICE = ITEMS.register("potato_slice", () -> new Item(food(2, 2.0F)));

    public static final DeferredHolder<Item, Item> PEELED_POTATO = ITEMS.register("peeled_potato", () -> new Item(new Item.Properties()));
    public static final DeferredHolder<Item, Item> PEELER = ITEMS.register("peeler", () -> new SwordItem(Tiers.STONE, new Item.Properties().durability(Tiers.STONE.getUses())));
    public static final DeferredHolder<Item, Item> ANIMAL_FAT = ITEMS.register("animal_fat", () -> new Item(new Item.Properties()));
    public static final DeferredHolder<Item, Item> OIL_BOTTLE = ITEMS.register("oil_bottle", () -> new Item(oilBottle()));
    public static final DeferredHolder<Item, Item> ZOMBIE_OIL_BOTTLE = ITEMS.register("zombie_oil_bottle", () -> new Item(oilBottle()));
    public static final DeferredHolder<Item, Item> UNDERGROUND_OIL_BOTTLE = ITEMS.register("underground_oil_bottle", () -> new Item(oilBottle()));

    private ModItems() {
    }

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
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

