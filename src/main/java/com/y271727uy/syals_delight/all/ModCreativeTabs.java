package com.y271727uy.syals_delight.all;

import com.y271727uy.syals_delight.SYDMod;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public final class ModCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SYDMod.MODID);

    public static final RegistryObject<CreativeModeTab> SYALS_DELIGHT_TAB = TABS.register("syals_delight_tab", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.syals_delight_tab"))
            .icon(() -> new ItemStack(ModItems.SYALS.get()))
            .displayItems((parameters, output) -> {
                output.accept(ModItems.SYALS.get());
                output.accept(ModItems.KETTLE_CHIPS.get());
                output.accept(ModItems.NAQUADAH_CHIPS.get());
                output.accept(ModItems.REDUCED_FAT_CHIPS.get());
                output.accept(ModItems.VINEGAR_CHIPS.get());
                output.accept(ModItems.DONKEY_BURGER_CHIPS.get());
                output.accept(ModItems.SMOKER_HAM_CHIPS.get());
                output.accept(ModItems.ONION_CHIPS.get());
                output.accept(ModItems.SPICY_CHIPS.get());
                output.accept(ModItems.TOMATO_CHIPS.get());
                output.accept(ModItems.ASTERA_CHIPS.get());
                output.accept(ModItems.BROCCOLI_FLAVORED_SLIMMING_CHIPS.get());
                output.accept(ModItems.PESTO_FLAVORED_CHIPS.get());
                output.accept(ModItems.STEAK_CHIMICHURRI_CHIPS.get());
                output.accept(ModItems.BAG_O_CHIPS.get());
                output.accept(ModItems.BATCH_FRIED_POTATO_SLICE.get());
                output.accept(ModItems.FRIED_NAQUADAH_POTATO_SLICE.get());
                output.accept(ModItems.FRIED_POTATO_SLICE.get());
                output.accept(ModItems.GREASY_POTATO_SLICE.get());
                output.accept(ModItems.HOT_POTATO_SLICE.get());
                output.accept(ModItems.LOW_FAT_POTATO_SLICE.get());
                output.accept(ModItems.POTATO_SLICE.get());
                output.accept(ModItems.PEELED_POTATO.get());
                output.accept(ModItems.PEELER.get());
                output.accept(ModItems.ANIMAL_FAT.get());
                output.accept(ModItems.OIL_BOTTLE.get());
                output.accept(ModItems.ZOMBIE_OIL_BOTTLE.get());
                output.accept(ModItems.UNDERGROUND_OIL_BOTTLE.get());
                output.accept(ModItems.CHIPS_BAG.get());
                output.accept(ModItems.SYALS_BAG.get());
            })
            .build());

    private ModCreativeTabs() {
    }

    public static void register(IEventBus eventBus) {
        TABS.register(eventBus);
    }
}



