package com.y271727uy.syals_delight.all;

import com.y271727uy.syals_delight.SYDMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

public final class ModCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SYDMod.MODID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> SYALS_DELIGHT_TAB = TABS.register("syals_delight_tab", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.syals_delight_tab"))
            .icon(() -> new ItemStack(ModItems.SYALS.value()))
            .displayItems((parameters, output) -> {
                output.accept(ModItems.SYALS.value());
                output.accept(ModItems.KETTLE_CHIPS.value());
                output.accept(ModItems.NAQUADAH_CHIPS.value());
                output.accept(ModItems.REDUCED_FAT_CHIPS.value());
                output.accept(ModItems.VINEGAR_CHIPS.value());
                output.accept(ModItems.ASTERA_CHIPS.value());
                output.accept(ModItems.BROCCOLI_FLAVORED_SLIMMING_CHIPS.value());
                output.accept(ModItems.PESTO_FLAVORED_CHIPS.value());
                output.accept(ModItems.STEAK_CHIMICHURRI_CHIPS.value());
                output.accept(ModItems.DONKEY_BURGER_CHIPS.value());
                output.accept(ModItems.SMOKER_HAM_CHIPS.value());
                output.accept(ModItems.ONION_CHIPS.value());
                output.accept(ModItems.SPICY_CHIPS.value());
                output.accept(ModItems.TOMATO_CHIPS.value());
                output.accept(ModItems.BAG_O_CHIPS.value());
                output.accept(ModItems.BATCH_FRIED_POTATO_SLICE.value());
                output.accept(ModItems.FRIED_NAQUADAH_POTATO_SLICE.value());
                output.accept(ModItems.FRIED_POTATO_SLICE.value());
                output.accept(ModItems.GREASY_POTATO_SLICE.value());
                output.accept(ModItems.HOT_POTATO_SLICE.value());
                output.accept(ModItems.LOW_FAT_POTATO_SLICE.value());
                output.accept(ModItems.POTATO_SLICE.value());
                output.accept(ModItems.PEELED_POTATO.value());
                output.accept(ModItems.PEELER.value());
                output.accept(ModItems.ANIMAL_FAT.value());
                output.accept(ModItems.OIL_BOTTLE.value());
                output.accept(ModItems.ZOMBIE_OIL_BOTTLE.value());
                output.accept(ModItems.UNDERGROUND_OIL_BOTTLE.value());
                output.accept(ModItems.CHIPS_BAG.value());
                output.accept(ModItems.SYALS_BAG.value());
            })
            .build());

    private ModCreativeTabs() {
    }

    public static void register(IEventBus eventBus) {
        TABS.register(eventBus);
    }
}



