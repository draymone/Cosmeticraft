package com.draymone.cosmeticraft.init.client;

import com.draymone.cosmeticraft.Cosmeticraft;
import com.draymone.cosmeticraft.init.custom.ChapiChapoItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class ChapiChapoModel extends GeoModel<ChapiChapoItem> {
    @Override
    public ResourceLocation getModelResource(ChapiChapoItem animatable) {
        return new ResourceLocation(Cosmeticraft.MODID, "geo/chapi_chapo.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(ChapiChapoItem animatable) {
        return new ResourceLocation(Cosmeticraft.MODID, "textures/armor/chapi_chapo.png");
    }

    @Override
    public ResourceLocation getAnimationResource(ChapiChapoItem animatable) {
        return new ResourceLocation(Cosmeticraft.MODID, "animations/chapi_chapo.animation.json");
    }
}
