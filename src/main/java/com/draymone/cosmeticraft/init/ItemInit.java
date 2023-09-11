package com.draymone.cosmeticraft.init;

import com.draymone.cosmeticraft.Cosmeticraft;
import com.draymone.cosmeticraft.init.custom.ChapiChapoItem;
import com.draymone.cosmeticraft.init.custom.PebbleItem;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Cosmeticraft.MODID);

    public static final RegistryObject<Item> BEAUTY_JEWEL = ITEMS.register("beauty_jewel",
            () -> new Item(new Item.Properties()
                    .stacksTo(1)
                    .rarity(Rarity.UNCOMMON)
            ));

    public static final RegistryObject<BlockItem> BEAUTY_BLOCK_ITEM = ITEMS.register("beauty_block",
            () -> new BlockItem(BlockInit.BEAUTY_BLOCK.get(), new Item.Properties()
                    .rarity(Rarity.UNCOMMON)
            ));

    public static final RegistryObject<Item> CHAPI_CHAPO = ITEMS.register("chapi_chapo",
            () -> new ChapiChapoItem(
                    ModArmorMaterials.CHAPI_CHAPO,
                    ArmorItem.Type.HELMET,
                    new Item.Properties()
                            .rarity(Rarity.UNCOMMON)
            ));

    public static final RegistryObject<Item> PEBBLE_ITEM = ITEMS.register("pebble",
            () -> new PebbleItem(BlockInit.PEBBLE.get(), new Item.Properties()));

}
