package com.draymone.cosmeticraft.init.client;

import com.draymone.cosmeticraft.Cosmeticraft;
import com.draymone.cosmeticraft.init.custom.PebbleItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class PebbleItemModel extends GeoModel<PebbleItem> {
    @Override
    public ResourceLocation getModelResource(PebbleItem animatable) {
        return new ResourceLocation(Cosmeticraft.MODID, "geo/pebble.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(PebbleItem animatable) {
        return new ResourceLocation(Cosmeticraft.MODID, "textures/block/pebble.png");
    }

    @Override
    public ResourceLocation getAnimationResource(PebbleItem animatable) {
        return new ResourceLocation(Cosmeticraft.MODID, "animations/pebble.animation.json");
    }

}
