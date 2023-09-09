package com.draymone.cosmeticraft.datagen;

import com.draymone.cosmeticraft.Cosmeticraft;
import com.draymone.cosmeticraft.init.ItemInit;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Cosmeticraft.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ItemInit.BEAUTY_JEWEL);

        simpleItem(ItemInit.CHAPI_CHAPO);
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Cosmeticraft.MODID,"item/" + item.getId().getPath()));
    }

    private ItemModelBuilder handheldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(Cosmeticraft.MODID,"item/" + item.getId().getPath()));
    }
}
