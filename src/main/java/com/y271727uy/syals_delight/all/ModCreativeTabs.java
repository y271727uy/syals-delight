package com.y271727uy.syals_delight.all;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;

public final class ModCreativeTabs {
    public static final CreativeTabs SYALS_DELIGHT_TAB = new CreativeTabs("syals_delight_tab") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModItems.SYALS);
        }

        @Override
        public void displayAllRelevantItems(NonNullList<ItemStack> items) {
            items.add(new ItemStack(ModItems.SYALS));
            items.add(new ItemStack(ModItems.KETTLE_CHIPS));
            items.add(new ItemStack(ModItems.NAQUADAH_CHIPS));
            items.add(new ItemStack(ModItems.REDUCED_FAT_CHIPS));
            items.add(new ItemStack(ModItems.VINEGAR_CHIPS));
            items.add(new ItemStack(ModItems.BAG_O_CHIPS));
            items.add(new ItemStack(ModItems.BATCH_FRIED_POTATO_SLICE));
            items.add(new ItemStack(ModItems.FRIED_NAQUADAH_POTATO_SLICE));
            items.add(new ItemStack(ModItems.FRIED_POTATO_SLICE));
            items.add(new ItemStack(ModItems.GREASY_POTATO_SLICE));
            items.add(new ItemStack(ModItems.HOT_POTATO_SLICE));
            items.add(new ItemStack(ModItems.LOW_FAT_POTATO_SLICE));
            items.add(new ItemStack(ModItems.POTATO_SLICE));
            items.add(new ItemStack(ModItems.PEELED_POTATO));
            items.add(new ItemStack(ModItems.PEELER));
            items.add(new ItemStack(ModItems.ANIMAL_FAT));
            items.add(new ItemStack(ModItems.OIL_BOTTLE));
            items.add(new ItemStack(ModItems.ZOMBIE_OIL_BOTTLE));
            items.add(new ItemStack(ModItems.UNDERGROUND_OIL_BOTTLE));
            items.add(new ItemStack(ModItems.CHIPS_BAG));
            items.add(new ItemStack(ModItems.SYALS_BAG));
        }
    };

    private ModCreativeTabs() {
    }
}
