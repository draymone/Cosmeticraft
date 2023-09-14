package com.draymone.cosmeticraft.init;

import com.draymone.cosmeticraft.Cosmeticraft;
import com.draymone.cosmeticraft.init.custom.Pebble;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockInit {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Cosmeticraft.MODID);

    public static final RegistryObject<Block> BEAUTY_BLOCK = BLOCKS.register("beauty_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_PURPLE)
                    .strength(5f, 11f)
                    .lightLevel(state -> 5)
            ));

    public static final RegistryObject<Block> PEBBLE = BLOCKS.register("pebble",
            () -> new Pebble(BlockBehaviour.Properties.of()
                    .noOcclusion()
                    .strength(0.5f, 0)
                    .noCollission()
            ));



}
