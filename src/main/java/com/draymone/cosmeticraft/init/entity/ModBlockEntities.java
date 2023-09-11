package com.draymone.cosmeticraft.init.entity;

import com.draymone.cosmeticraft.Cosmeticraft;
import com.draymone.cosmeticraft.init.BlockInit;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, Cosmeticraft.MODID);

    public static final RegistryObject<BlockEntityType<PebbleEntity>> PEBBLE_ENTITY = BLOCK_ENTITIES.register("pebble_entity", () ->
        BlockEntityType.Builder.of(PebbleEntity::new,
                BlockInit.PEBBLE.get()).build(null));

    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}
