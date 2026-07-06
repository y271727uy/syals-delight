package com.y271727uy.syals_delight.all;

import com.y271727uy.syals_delight.SYDMod;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tiers;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public final class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, SYDMod.MODID);

    public static final RegistryObject<Item> SYALS = ITEMS.register("syals", () -> new Item(food(6, 9.3F)));;
    public static final RegistryObject<Item> CHIPS_BAG = ITEMS.register("chips_bag", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SYALS_BAG = ITEMS.register("syals_bag", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BAG_O_CHIPS = ITEMS.register("bag_o_chips", () -> new Item(food(6, 9.3F)));
    public static final RegistryObject<Item> KETTLE_CHIPS = ITEMS.register("kettle_chips", () -> new Item(food(6, 9.3F)));
    public static final RegistryObject<Item> NAQUADAH_CHIPS = ITEMS.register("naquadah_chips", () -> new Item(food(189, 66.4F)));
    public static final RegistryObject<Item> REDUCED_FAT_CHIPS = ITEMS.register("reduced_fat_chips", () -> new Item(food(4,8.6F)));
    public static final RegistryObject<Item> VINEGAR_CHIPS = ITEMS.register("vinegar_chips", () -> new Item(food(6, 9.9F)));

    public static final RegistryObject<Item> BATCH_FRIED_POTATO_SLICE = ITEMS.register("batch_fried_potato_slice", () -> new Item(food(2, 2.0F)));
    public static final RegistryObject<Item> FRIED_NAQUADAH_POTATO_SLICE = ITEMS.register("fried_naquadah_potato_slice", () -> new Item(food(2, 2.0F)));
    public static final RegistryObject<Item> FRIED_POTATO_SLICE = ITEMS.register("fried_potato_slice", () -> new Item(food(2, 2.0F)));
    public static final RegistryObject<Item> GREASY_POTATO_SLICE = ITEMS.register("greasy_potato_slice", () -> new Item(food(2, 2.0F)));
    public static final RegistryObject<Item> HOT_POTATO_SLICE = ITEMS.register("hot_potato_slice", () -> new Item(food(2, 2.0F)));
    public static final RegistryObject<Item> LOW_FAT_POTATO_SLICE = ITEMS.register("low_fat_potato_slice", () -> new Item(food(2, 2.0F)));
    public static final RegistryObject<Item> POTATO_SLICE = ITEMS.register("potato_slice", () -> new Item(food(2, 2.0F)));

    public static final RegistryObject<Item> PEELED_POTATO = ITEMS.register("peeled_potato", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PEELER = ITEMS.register("peeler", () -> new SwordItem(Tiers.STONE, 3, -2.4F, new Item.Properties().durability(Tiers.STONE.getUses())));
    public static final RegistryObject<Item> ANIMAL_FAT = ITEMS.register("animal_fat", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> OIL_BOTTLE = ITEMS.register("oil_bottle", () -> new Item(oilBottle()));
    public static final RegistryObject<Item> ZOMBIE_OIL_BOTTLE = ITEMS.register("zombie_oil_bottle", () -> new Item(oilBottle()));
    public static final RegistryObject<Item> UNDERGROUND_OIL_BOTTLE = ITEMS.register("underground_oil_bottle", () -> new Item(oilBottle()));

    private ModItems() {
    }

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

    private static Item.Properties food(int nutrition, float saturation) {
        return new Item.Properties().food(new FoodProperties.Builder()
                .nutrition(nutrition)
                .saturationMod(saturation)
                .build());
    }

    private static Item.Properties oilBottle() {
        return new Item.Properties().craftRemainder(Items.GLASS_BOTTLE);
    }
}

