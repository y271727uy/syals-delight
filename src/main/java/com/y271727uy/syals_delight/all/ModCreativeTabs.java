package com.y271727uy.syals_delight.all;

import com.y271727uy.syals_delight.SYDMod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public final class ModCreativeTabs {
	public static final CreativeModeTab SYALS_DELIGHT_TAB = Registry.register(
			BuiltInRegistries.CREATIVE_MODE_TAB,
			SYDMod.id("syals_delight_tab"),
			FabricItemGroup.builder()
					.title(Component.translatable("itemGroup.syals_delight_tab"))
					.icon(() -> new ItemStack(ModItems.SYALS))
					.displayItems((parameters, output) -> {
						output.accept(ModItems.SYALS);
						output.accept(ModItems.KETTLE_CHIPS);
						output.accept(ModItems.NAQUADAH_CHIPS);
						output.accept(ModItems.REDUCED_FAT_CHIPS);
						output.accept(ModItems.VINEGAR_CHIPS);
						output.accept(ModItems.ASTERA_CHIPS);
						output.accept(ModItems.BROCCOLI_FLAVORED_SLIMMING_CHIPS);
						output.accept(ModItems.PESTO_FLAVORED_CHIPS);
						output.accept(ModItems.STEAK_CHIMICHURRI_CHIPS);
						output.accept(ModItems.DONKEY_BURGER_CHIPS);
						output.accept(ModItems.SMOKER_HAM_CHIPS);
						output.accept(ModItems.ONION_CHIPS);
						output.accept(ModItems.SPICY_CHIPS);
						output.accept(ModItems.TOMATO_CHIPS);
						output.accept(ModItems.BAG_O_CHIPS);
						output.accept(ModItems.BATCH_FRIED_POTATO_SLICE);
						output.accept(ModItems.FRIED_NAQUADAH_POTATO_SLICE);
						output.accept(ModItems.FRIED_POTATO_SLICE);
						output.accept(ModItems.GREASY_POTATO_SLICE);
						output.accept(ModItems.HOT_POTATO_SLICE);
						output.accept(ModItems.LOW_FAT_POTATO_SLICE);
						output.accept(ModItems.POTATO_SLICE);
						output.accept(ModItems.PEELED_POTATO);
						output.accept(ModItems.PEELER);
						output.accept(ModItems.ANIMAL_FAT);
						output.accept(ModItems.OIL_BOTTLE);
						output.accept(ModItems.ZOMBIE_OIL_BOTTLE);
						output.accept(ModItems.UNDERGROUND_OIL_BOTTLE);
						output.accept(ModItems.CHIPS_BAG);
						output.accept(ModItems.SYALS_BAG);
					})
					.build()
	);

	private ModCreativeTabs() {
	}

	public static void register() {
	}
}
