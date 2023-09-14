package com.draymone.cosmeticraft.events;

import com.draymone.cosmeticraft.Cosmeticraft;
import com.draymone.cosmeticraft.networking.ModMessages;
import com.draymone.cosmeticraft.networking.packet.HelmetAbilityC2SPacket;
import com.draymone.cosmeticraft.util.KeyBinding;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

public class ClientEvents {
    @Mod.EventBusSubscriber(modid = Cosmeticraft.MODID, value = Dist.CLIENT)
    public static class ClientForgeEvents {

        @SubscribeEvent
        public static void onKeyRegister(RegisterKeyMappingsEvent event) {
            event.register(KeyBinding.HAT_ABILITY_KEY);
        }

        @SubscribeEvent
        public static void onKeyInput(InputEvent.Key event) {

            if (KeyBinding.HAT_ABILITY_KEY.consumeClick()) {
                ModMessages.sendToServer(new HelmetAbilityC2SPacket());
            }
        }

    }

}
