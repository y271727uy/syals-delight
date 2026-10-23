package com.y271727uy.syals_delight.all;

import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;

import java.util.Set;

public final class ModLootModifiers {
	private static final Set<ResourceLocation> ANIMAL_FAT_TABLES = Set.of(
			new ResourceLocation("minecraft", "entities/cow"),
			new ResourceLocation("minecraft", "entities/pig"),
			new ResourceLocation("minecraft", "entities/sheep"),
			new ResourceLocation("minecraft", "entities/chicken"),
			new ResourceLocation("minecraft", "entities/rabbit"),
			new ResourceLocation("minecraft", "entities/goat"),
			new ResourceLocation("minecraft", "entities/mooshroom")
	);

	private ModLootModifiers() {
	}

	public static void register() {
		LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
			if (!ANIMAL_FAT_TABLES.contains(id)) {
				return;
			}

			tableBuilder.withPool(LootPool.lootPool()
					.setRolls(ConstantValue.exactly(1.0F))
					.add(LootItem.lootTableItem(ModItems.ANIMAL_FAT)));
		});
	}
}
