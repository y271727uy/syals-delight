package com.y271727uy.syals_delight.all;

import net.fabricmc.fabric.api.loot.v3.LootTableEvents;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;

import java.util.Set;

public final class ModLootModifiers {
	private static final Set<ResourceLocation> ANIMAL_FAT_TABLES = Set.of(
			ResourceLocation.fromNamespaceAndPath("minecraft", "entities/cow"),
			ResourceLocation.fromNamespaceAndPath("minecraft", "entities/pig"),
			ResourceLocation.fromNamespaceAndPath("minecraft", "entities/sheep"),
			ResourceLocation.fromNamespaceAndPath("minecraft", "entities/chicken"),
			ResourceLocation.fromNamespaceAndPath("minecraft", "entities/rabbit"),
			ResourceLocation.fromNamespaceAndPath("minecraft", "entities/goat"),
			ResourceLocation.fromNamespaceAndPath("minecraft", "entities/mooshroom")
	);

	private ModLootModifiers() {
	}

	public static void register() {
		LootTableEvents.MODIFY.register((key, tableBuilder, source, registries) -> {
			if (!ANIMAL_FAT_TABLES.contains(key.location())) {
				return;
			}

			tableBuilder.withPool(LootPool.lootPool()
					.setRolls(ConstantValue.exactly(1.0F))
					.add(LootItem.lootTableItem(ModItems.ANIMAL_FAT)));
		});
	}
}
