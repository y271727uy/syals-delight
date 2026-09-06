package com.y271727uy.syals_delight;

import com.y271727uy.syals_delight.all.ModCreativeTabs;
import com.y271727uy.syals_delight.all.ModItems;
import com.y271727uy.syals_delight.all.ModLootModifiers;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(SYDMod.MODID)
public class SYDMod {
    public static final String MODID = "syals_delight";

    public SYDMod(IEventBus eventBus) {
        ModItems.register(eventBus);
        ModCreativeTabs.register(eventBus);
        ModLootModifiers.register(eventBus);
    }
}
