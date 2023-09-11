package com.draymone.cosmeticraft.init.client;

import com.draymone.cosmeticraft.init.entity.PebbleEntity;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import software.bernie.geckolib.renderer.GeoBlockRenderer;

public class PebbleRenderer extends GeoBlockRenderer<PebbleEntity> {

    public PebbleRenderer(BlockEntityRendererProvider.Context context) {
        super(new PebbleModel());
    }

}
