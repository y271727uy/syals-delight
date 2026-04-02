package com.y271727uy.syals_delight;

import com.y271727uy.syals_delight.all.ModCreativeTabs;
import com.y271727uy.syals_delight.all.ModItems;
import com.y271727uy.syals_delight.all.ModLootModifiers;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(SYDMod.MODID)
public class SYDMod {
    public static final String MODID = "syals_delight";

    public SYDMod() {
        var eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        ModItems.register(eventBus);
        ModCreativeTabs.register(eventBus);
        ModLootModifiers.register(eventBus);
    }
}
