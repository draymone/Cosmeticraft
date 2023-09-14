package com.draymone.cosmeticraft.util;

import com.mojang.blaze3d.platform.InputConstants;
import net.minecraft.client.KeyMapping;
import net.minecraftforge.client.settings.KeyConflictContext;
import org.lwjgl.glfw.GLFW;

public class KeyBinding {

    public static final String KEY_CATEGORY_COSMETICRAFT = "key.category.cosmeticraft.abilities";
    public static final String KEY_HELMET_ABILITY = "key.cosmeticraft.helmet_ability";

    public static final KeyMapping HAT_ABILITY_KEY = new KeyMapping(KEY_HELMET_ABILITY, KeyConflictContext.IN_GAME, InputConstants.Type.KEYSYM, GLFW.GLFW_KEY_V, KEY_CATEGORY_COSMETICRAFT);

}
