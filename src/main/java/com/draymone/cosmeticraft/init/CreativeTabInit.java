package com.draymone.cosmeticraft.init;

import com.draymone.cosmeticraft.Cosmeticraft;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class CreativeTabInit {

    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Cosmeticraft.MODID);

    public static final RegistryObject<CreativeModeTab> COSMETICRAFT_OTHERS = TABS.register("cosmeticraft_others",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.cosmeticraft_others"))
                    .icon(ItemInit.BEAUTY_JEWEL.get()::getDefaultInstance)
                    .displayItems((displayParameters, output) -> {
                        output.accept(ItemInit.BEAUTY_JEWEL.get());
                    })
                    .build()
    );

    public static final RegistryObject<CreativeModeTab> COSMETICRAFT_BLOCKS = TABS.register("cosmeticraft_blocks",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.cosmeticraft_blocks"))
                    .icon(ItemInit.BEAUTY_BLOCK_ITEM.get()::getDefaultInstance)
                    .displayItems((displayParameters, output) -> {
                        output.accept(ItemInit.BEAUTY_BLOCK_ITEM.get());
                    })
                    .build()
    );

    public static final RegistryObject<CreativeModeTab> COSMETICRAFT_ITEMS = TABS.register("cosmeticraft_items",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.cosmeticraft_items"))
                    .icon(ItemInit.CHAPI_CHAPO.get()::getDefaultInstance)
                    .displayItems((displayParameters, output) -> {
                        output.accept(ItemInit.CHAPI_CHAPO.get());
                    })
                    .build()
    );
}
