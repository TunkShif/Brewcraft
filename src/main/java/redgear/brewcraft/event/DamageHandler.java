package redgear.brewcraft.event;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.DamageSource;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import redgear.brewcraft.plugins.core.EffectPlugin;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class DamageHandler {

	private static DamageHandler instance;

	private DamageHandler() {

	}

	public static DamageHandler register() {
		if (instance == null) {
			instance = new DamageHandler();
			MinecraftForge.EVENT_BUS.register(instance);

		}
		return instance;
	}

	@SubscribeEvent
	public void cancelFireDamage(final LivingHurtEvent event) {
		if (event.entity instanceof EntityLivingBase) {
			final EntityLivingBase living = (EntityLivingBase) event.entity;

			if (living.getActivePotionEffect(EffectPlugin.fireproof) != null) {
				if (event.source.equals(DamageSource.lava) || event.source.equals(DamageSource.inFire)
						|| event.source.equals(DamageSource.onFire)) {
					if (living.getActivePotionEffect(EffectPlugin.fireproof).getAmplifier() == 0) {
						event.ammount = 0;
						return;
					}
					if (living.getActivePotionEffect(EffectPlugin.fireproof).getAmplifier() >= 1) {
						int strength = living.getActivePotionEffect(EffectPlugin.fireproof).getAmplifier();
						living.heal(strength + 1 + 4F);
						return;
					}
				}
			}
		}
	}

}
