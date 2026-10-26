package com.y271727uy.syals_delight.all;

import com.y271727uy.syals_delight.SYDMod;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemSword;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = SYDMod.MODID)
public final class ModItems {
    public static final ItemFood SYALS = food("syals", 6, 9.3F);
    public static final Item CHIPS_BAG = item(new Item(), "chips_bag");
    public static final Item SYALS_BAG = item(new Item(), "syals_bag");

    public static final ItemFood BAG_O_CHIPS = food("bag_o_chips", 6, 9.3F);
    public static final ItemFood KETTLE_CHIPS = food("kettle_chips", 6, 9.3F);
    public static final ItemFood NAQUADAH_CHIPS = food("naquadah_chips", 189, 66.4F);
    public static final ItemFood REDUCED_FAT_CHIPS = food("reduced_fat_chips", 4, 8.6F);
    public static final ItemFood VINEGAR_CHIPS = food("vinegar_chips", 6, 9.9F);
    public static final ItemFood DONKEY_BURGER_CHIPS = food("donkey_burger_chips", 6, 9.3F);
    public static final ItemFood SMOKER_HAM_CHIPS = food("smoker_ham_chips", 6, 9.3F);
    public static final ItemFood ONION_CHIPS = food("onion_chips", 6, 9.3F);
    public static final ItemFood SPICY_CHIPS = food("spicy_chips", 6, 9.3F);
    public static final ItemFood TOMATO_CHIPS = food("tomato_chips", 6, 9.3F);
    public static final ItemFood ASTERA_CHIPS = food("astera_chips", 6, 9.3F);
    public static final ItemFood BROCCOLI_FLAVORED_SLIMMING_CHIPS = food("broccoli_flavored_slimming_chips", 6, 9.3F);
    public static final ItemFood PESTO_FLAVORED_CHIPS = food("pesto_flavored_chips", 6, 9.3F);
    public static final ItemFood STEAK_CHIMICHURRI_CHIPS = food("steak_chimichurri_chips", 6, 9.3F);

    public static final ItemFood BATCH_FRIED_POTATO_SLICE = food("batch_fried_potato_slice", 2, 2.0F);
    public static final ItemFood FRIED_NAQUADAH_POTATO_SLICE = food("fried_naquadah_potato_slice", 2, 2.0F);
    public static final ItemFood FRIED_POTATO_SLICE = food("fried_potato_slice", 2, 2.0F);
    public static final ItemFood GREASY_POTATO_SLICE = food("greasy_potato_slice", 2, 2.0F);
    public static final ItemFood HOT_POTATO_SLICE = food("hot_potato_slice", 2, 2.0F);
    public static final ItemFood LOW_FAT_POTATO_SLICE = food("low_fat_potato_slice", 2, 2.0F);
    public static final ItemFood POTATO_SLICE = food("potato_slice", 2, 2.0F);

    public static final Item PEELED_POTATO = item(new Item(), "peeled_potato");
    public static final ItemSword PEELER = item(new ItemSword(Item.ToolMaterial.STONE), "peeler");
    public static final Item ANIMAL_FAT = item(new Item(), "animal_fat");
    public static final Item OIL_BOTTLE = oilBottle("oil_bottle");
    public static final Item ZOMBIE_OIL_BOTTLE = oilBottle("zombie_oil_bottle");
    public static final Item UNDERGROUND_OIL_BOTTLE = oilBottle("underground_oil_bottle");

    private ModItems() {
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(
                SYALS, CHIPS_BAG, SYALS_BAG,
                BAG_O_CHIPS, KETTLE_CHIPS, NAQUADAH_CHIPS, REDUCED_FAT_CHIPS, VINEGAR_CHIPS,
                DONKEY_BURGER_CHIPS, SMOKER_HAM_CHIPS, ONION_CHIPS, SPICY_CHIPS, TOMATO_CHIPS,
                ASTERA_CHIPS, BROCCOLI_FLAVORED_SLIMMING_CHIPS, PESTO_FLAVORED_CHIPS, STEAK_CHIMICHURRI_CHIPS,
                BATCH_FRIED_POTATO_SLICE, FRIED_NAQUADAH_POTATO_SLICE, FRIED_POTATO_SLICE,
                GREASY_POTATO_SLICE, HOT_POTATO_SLICE, LOW_FAT_POTATO_SLICE, POTATO_SLICE,
                PEELED_POTATO, PEELER, ANIMAL_FAT, OIL_BOTTLE, ZOMBIE_OIL_BOTTLE, UNDERGROUND_OIL_BOTTLE
        );
    }

    private static ItemFood food(String name, int hunger, float saturation) {
        return item(new ItemFood(hunger, saturation, false), name);
    }

    private static Item oilBottle(String name) {
        return item(new Item().setContainerItem(Items.GLASS_BOTTLE), name);
    }

    private static <T extends Item> T item(T item, String name) {
        item.setRegistryName(SYDMod.MODID, name);
        item.setTranslationKey(SYDMod.MODID + "." + name);
        item.setCreativeTab(ModCreativeTabs.SYALS_DELIGHT_TAB);
        return item;
    }
}
