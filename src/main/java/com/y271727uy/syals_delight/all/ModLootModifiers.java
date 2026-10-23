package com.y271727uy.syals_delight.all;

<<<<<<< Updated upstream
import com.google.common.base.Suppliers;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.y271727uy.syals_delight.SYDMod;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.common.loot.IGlobalLootModifier;
import net.neoforged.neoforge.common.loot.LootModifier;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.NeoForgeRegistries;
=======
import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
>>>>>>> Stashed changes

import java.util.function.Supplier;

public final class ModLootModifiers {
<<<<<<< Updated upstream
    public static final DeferredRegister<MapCodec<? extends IGlobalLootModifier>> LOOT_MODIFIERS = DeferredRegister.create(NeoForgeRegistries.Keys.GLOBAL_LOOT_MODIFIER_SERIALIZERS, SYDMod.MODID);
=======
	private static final Set<ResourceLocation> ANIMAL_FAT_TABLES = Set.of(
			new ResourceLocation("minecraft", "entities/cow"),
			new ResourceLocation("minecraft", "entities/pig"),
			new ResourceLocation("minecraft", "entities/sheep"),
			new ResourceLocation("minecraft", "entities/chicken"),
			new ResourceLocation("minecraft", "entities/rabbit"),
			new ResourceLocation("minecraft", "entities/goat"),
			new ResourceLocation("minecraft", "entities/mooshroom")
	);
>>>>>>> Stashed changes

    public static final DeferredHolder<MapCodec<? extends IGlobalLootModifier>, MapCodec<AddItemModifier>> ADD_ITEM = LOOT_MODIFIERS.register("add_item", () -> AddItemModifier.CODEC.get());

<<<<<<< Updated upstream
    private ModLootModifiers() {
    }
=======
	public static void register() {
		LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
			if (!ANIMAL_FAT_TABLES.contains(id)) {
				return;
			}
>>>>>>> Stashed changes

    public static void register(IEventBus eventBus) {
        LOOT_MODIFIERS.register(eventBus);
    }

    public static final class AddItemModifier extends LootModifier {
        private static final Supplier<MapCodec<AddItemModifier>> CODEC = Suppliers.memoize(() -> RecordCodecBuilder.mapCodec(instance -> codecStart(instance)
                .and(BuiltInRegistries.ITEM.byNameCodec().fieldOf("item").forGetter(modifier -> modifier.item))
                .apply(instance, AddItemModifier::new)));

        private final Item item;

        private AddItemModifier(LootItemCondition[] conditions, Item item) {
            super(conditions);
            this.item = item;
        }

        @Override
        protected ObjectArrayList<ItemStack> doApply(ObjectArrayList<ItemStack> generatedLoot, LootContext context) {
            generatedLoot.add(new ItemStack(item));
            return generatedLoot;
        }

        @Override
        public MapCodec<? extends IGlobalLootModifier> codec() {
            return CODEC.get();
        }
    }
}


