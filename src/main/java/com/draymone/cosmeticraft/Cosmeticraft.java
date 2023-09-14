package com.draymone.cosmeticraft;

import com.draymone.cosmeticraft.init.BlockInit;
import com.draymone.cosmeticraft.init.CreativeTabInit;
import com.draymone.cosmeticraft.init.ItemInit;
import com.draymone.cosmeticraft.init.client.PebbleRenderer;
import com.draymone.cosmeticraft.init.entity.ModBlockEntities;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderers;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import software.bernie.geckolib.GeckoLib;

@Mod(Cosmeticraft.MODID)
public class Cosmeticraft {

    public static final String MODID = "cosmeticraft";

    public Cosmeticraft() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        ItemInit.ITEMS.register(bus);
        BlockInit.BLOCKS.register(bus);
        CreativeTabInit.TABS.register(bus);
        ModBlockEntities.register(bus);

        GeckoLib.initialize();
    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            BlockEntityRenderers.register(ModBlockEntities.PEBBLE_ENTITY.get(), PebbleRenderer::new);
        }
    }

}
