package com.y271727uy.syals_delight;

import com.y271727uy.syals_delight.all.ModCreativeTabs;
import com.y271727uy.syals_delight.all.ModItems;
import com.y271727uy.syals_delight.all.ModLootModifiers;
import net.fabricmc.api.ModInitializer;
import net.minecraft.resources.ResourceLocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SYDMod implements ModInitializer {
	public static final String MODID = "syals_delight";
	public static final Logger LOGGER = LoggerFactory.getLogger(MODID);

	@Override
	public void onInitialize() {
		ModItems.register();
		ModCreativeTabs.register();
		ModLootModifiers.register();
		LOGGER.info("Syal's delight initialized");
	}

	public static ResourceLocation id(String path) {
		return new ResourceLocation(MODID, path);
	}
}
