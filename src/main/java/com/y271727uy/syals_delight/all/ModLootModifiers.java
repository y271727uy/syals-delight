package com.y271727uy.syals_delight.all;

import com.y271727uy.syals_delight.SYDMod;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.storage.loot.LootEntryItem;
import net.minecraft.world.storage.loot.LootPool;
import net.minecraft.world.storage.loot.LootTableList;
import net.minecraft.world.storage.loot.RandomValueRange;
import net.minecraft.world.storage.loot.conditions.LootCondition;
import net.minecraft.world.storage.loot.functions.LootFunction;
import net.minecraftforge.event.LootTableLoadEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = SYDMod.MODID)
public final class ModLootModifiers {
    private ModLootModifiers() {
    }

    @SubscribeEvent
    public static void addAnimalFat(LootTableLoadEvent event) {
        ResourceLocation name = event.getName();
        if (LootTableList.ENTITIES_COW.equals(name)
                || LootTableList.ENTITIES_PIG.equals(name)
                || LootTableList.ENTITIES_SHEEP.equals(name)
                || LootTableList.ENTITIES_CHICKEN.equals(name)
                || LootTableList.ENTITIES_RABBIT.equals(name)
                || LootTableList.ENTITIES_MUSHROOM_COW.equals(name)) {
            event.getTable().addPool(new LootPool(
                    new LootEntryItem[]{new LootEntryItem(ModItems.ANIMAL_FAT, 1, 0,
                            new LootFunction[0], new LootCondition[0], "syals_delight_animal_fat")},
                    new LootCondition[0], new RandomValueRange(1), new RandomValueRange(0),
                    "syals_delight_animal_fat"));
        }
    }
}
