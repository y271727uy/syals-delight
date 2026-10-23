package com.y271727uy.syals_delight;

import com.y271727uy.syals_delight.all.ModCreativeTabs;
import com.y271727uy.syals_delight.all.ModItems;
import com.y271727uy.syals_delight.all.ModLootModifiers;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(SYDMod.MODID)
public class SYDMod {
    public static final String MODID = "syals_delight";

<<<<<<< Updated upstream
    public SYDMod(IEventBus eventBus) {
        ModItems.register(eventBus);
        ModCreativeTabs.register(eventBus);
        ModLootModifiers.register(eventBus);
    }
=======
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
>>>>>>> Stashed changes
}
