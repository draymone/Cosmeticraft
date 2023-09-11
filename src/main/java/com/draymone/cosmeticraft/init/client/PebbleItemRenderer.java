package com.draymone.cosmeticraft.init.client;

import com.draymone.cosmeticraft.init.custom.PebbleItem;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class PebbleItemRenderer extends GeoItemRenderer<PebbleItem> {

    public PebbleItemRenderer() {
        super(new PebbleItemModel());
    }

}
