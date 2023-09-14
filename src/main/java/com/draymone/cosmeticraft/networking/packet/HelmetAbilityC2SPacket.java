package com.draymone.cosmeticraft.networking.packet;

import com.draymone.cosmeticraft.Cosmeticraft;
import com.draymone.cosmeticraft.init.custom.ChapiChapoItem;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraftforge.network.NetworkEvent;

import java.util.function.Supplier;

public class HelmetAbilityC2SPacket {

    public HelmetAbilityC2SPacket() {

    }

    public HelmetAbilityC2SPacket(FriendlyByteBuf buf) {

    }

    public void toBytes(FriendlyByteBuf buf) {

    }

    public boolean handle(Supplier<NetworkEvent.Context> supplier) {
        NetworkEvent.Context context = supplier.get();
        context.enqueueWork(() -> {
            ServerPlayer player = context.getSender();
            ServerLevel level = player.serverLevel();

            if (player.getItemBySlot(EquipmentSlot.HEAD).getItem() instanceof ChapiChapoItem item) { //Check if player has a Chapi Chapo
                if (item.cooldown <= 0) {
                    item.cooldown = 1200;

                    player.addEffect(new MobEffectInstance(MobEffects.INVISIBILITY, 600, 0, false, false)); //Invisibility effect

                    EntityType.RABBIT.spawn(level, //Spawn rabbit
                            null,
                            player ,
                            player.blockPosition(),
                            MobSpawnType.COMMAND,
                            true,
                            false);
                }
            }
        });
        return true;
    }

}
