package com.draymone.cosmeticraft;

import com.draymone.cosmeticraft.init.BlockInit;
import com.draymone.cosmeticraft.init.CreativeTabInit;
import com.draymone.cosmeticraft.init.ItemInit;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.RegistryObject;

@Mod(Cosmeticraft.MODID)
public class Cosmeticraft {

    public static final String MODID = "cosmeticraft";

    public Cosmeticraft() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        ItemInit.ITEMS.register(bus);
        BlockInit.BLOCKS.register(bus);
        CreativeTabInit.TABS.register(bus);
    }

}
