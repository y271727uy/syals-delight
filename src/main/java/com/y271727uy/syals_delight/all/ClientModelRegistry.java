package com.y271727uy.syals_delight.all;

import com.y271727uy.syals_delight.SYDMod;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

@Mod.EventBusSubscriber(value = Side.CLIENT, modid = SYDMod.MODID)
public final class ClientModelRegistry {
    private ClientModelRegistry() {
    }

    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event) {
        registerModel(ModItems.SYALS);
        registerModel(ModItems.CHIPS_BAG);
        registerModel(ModItems.SYALS_BAG);
        registerModel(ModItems.BAG_O_CHIPS);
        registerModel(ModItems.KETTLE_CHIPS);
        registerModel(ModItems.NAQUADAH_CHIPS);
        registerModel(ModItems.REDUCED_FAT_CHIPS);
        registerModel(ModItems.VINEGAR_CHIPS);
        registerModel(ModItems.DONKEY_BURGER_CHIPS);
        registerModel(ModItems.SMOKER_HAM_CHIPS);
        registerModel(ModItems.ONION_CHIPS);
        registerModel(ModItems.SPICY_CHIPS);
        registerModel(ModItems.TOMATO_CHIPS);
        registerModel(ModItems.ASTERA_CHIPS);
        registerModel(ModItems.BROCCOLI_FLAVORED_SLIMMING_CHIPS);
        registerModel(ModItems.PESTO_FLAVORED_CHIPS);
        registerModel(ModItems.STEAK_CHIMICHURRI_CHIPS);
        registerModel(ModItems.BATCH_FRIED_POTATO_SLICE);
        registerModel(ModItems.FRIED_NAQUADAH_POTATO_SLICE);
        registerModel(ModItems.FRIED_POTATO_SLICE);
        registerModel(ModItems.GREASY_POTATO_SLICE);
        registerModel(ModItems.HOT_POTATO_SLICE);
        registerModel(ModItems.LOW_FAT_POTATO_SLICE);
        registerModel(ModItems.POTATO_SLICE);
        registerModel(ModItems.PEELED_POTATO);
        registerModel(ModItems.PEELER);
        registerModel(ModItems.ANIMAL_FAT);
        registerModel(ModItems.OIL_BOTTLE);
        registerModel(ModItems.ZOMBIE_OIL_BOTTLE);
        registerModel(ModItems.UNDERGROUND_OIL_BOTTLE);
    }

    private static void registerModel(Item item) {
        ModelLoader.setCustomModelResourceLocation(item, 0,
                new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }
}
