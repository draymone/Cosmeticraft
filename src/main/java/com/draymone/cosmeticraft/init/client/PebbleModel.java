package com.draymone.cosmeticraft.init.client;

import com.draymone.cosmeticraft.Cosmeticraft;
import com.draymone.cosmeticraft.init.entity.PebbleEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class PebbleModel extends GeoModel<PebbleEntity> {
    @Override
    public ResourceLocation getModelResource(PebbleEntity animatable) {
        return new ResourceLocation(Cosmeticraft.MODID, "geo/pebble.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(PebbleEntity animatable) {
        return new ResourceLocation(Cosmeticraft.MODID, "textures/block/pebble.png");
    }

    @Override
    public ResourceLocation getAnimationResource(PebbleEntity animatable) {
        return new ResourceLocation(Cosmeticraft.MODID, "animations/pebble.animation.json");
    }
}
