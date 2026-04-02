package com.y271727uy.syals_delight;

import com.y271727uy.syals_delight.all.ModItems;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.common.Mod;

@Mod(SYDMod.MODID)
public class SYDMod {
    public static final String MODID = "syals_delight";

    public SYDMod() {
        System.out.println("SYDMod initialized");
        ModItems.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
