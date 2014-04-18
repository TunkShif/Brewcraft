package redgear.brewcraft.plugins.common;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraftforge.fluids.FluidContainerRegistry;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fluids.FluidStack;
import redgear.brewcraft.potions.FluidPotion;
import redgear.brewcraft.potions.MetaItemPotion;
import redgear.brewcraft.recipes.RecipeRegistry;
import redgear.brewcraft.utils.PotionRegistry;
import redgear.core.fluids.FluidUtil;
import redgear.core.mod.IPlugin;
import redgear.core.mod.ModUtils;
import redgear.core.util.SimpleItem;
import cpw.mods.fml.common.LoaderState.ModState;

public class PotionPlugin implements IPlugin {

	public static MetaItemPotion potions;
	public static SimpleItem emptyBottle = new SimpleItem(Items.glass_bottle, 0);
	public static PotionRegistry potionRegistry = new PotionRegistry();
	public static RecipeRegistry recipeRegistry = new RecipeRegistry();
	public static final String potionTexture = "potionWhite";

	public static FluidStack fluidAwkward;
	public static FluidStack fluidVision;
	public static FluidStack fluidVisionLong;
	public static FluidStack fluidVisionVeryLong;
	public static FluidStack fluidInvisible;
	public static FluidStack fluidInvisibleLong;
	public static FluidStack fluidInvisibleVeryLong;
	public static FluidStack fluidWeakness;
	public static FluidStack fluidWeaknessLong;
	public static FluidStack fluidWeaknessVeryLong;
	public static FluidStack fluidFireResist;
	public static FluidStack fluidFireResistLong;
	public static FluidStack fluidFireResistVeryLong;
	public static FluidStack fluidSlowness;
	public static FluidStack fluidSlownessLong;
	public static FluidStack fluidSlownessVeryLong;
	public static FluidStack fluidRegen;
	public static FluidStack fluidRegenII;
	public static FluidStack fluidRegenIII;
	public static FluidStack fluidRegenLong;
	public static FluidStack fluidRegenVeryLong;
	public static FluidStack fluidFast;
	public static FluidStack fluidFastII;
	public static FluidStack fluidFastIII;
	public static FluidStack fluidFastLong;
	public static FluidStack fluidFastVeryLong;
	public static FluidStack fluidStrength;
	public static FluidStack fluidStrengthII;
	public static FluidStack fluidStrengthIII;
	public static FluidStack fluidStrengthLong;
	public static FluidStack fluidStrengthVeryLong;
	public static FluidStack fluidPoison;
	public static FluidStack fluidPoisonII;
	public static FluidStack fluidPoisonIII;
	public static FluidStack fluidPoisonLong;
	public static FluidStack fluidPoisonVeryLong;
	public static FluidStack fluidHaste;
	public static FluidStack fluidHasteII;
	public static FluidStack fluidHasteIII;
	public static FluidStack fluidHasteLong;
	public static FluidStack fluidHasteVeryLong;
	public static FluidStack fluidFatigue;
	public static FluidStack fluidFatigueII;
	public static FluidStack fluidFatigueIII;
	public static FluidStack fluidFatigueLong;
	public static FluidStack fluidFatigueVeryLong;
	public static FluidStack fluidJump;
	public static FluidStack fluidJumpII;
	public static FluidStack fluidJumpIII;
	public static FluidStack fluidJumpLong;
	public static FluidStack fluidJumpVeryLong;
	public static FluidStack fluidResistance;
	public static FluidStack fluidResistanceII;
	public static FluidStack fluidResistanceIII;
	public static FluidStack fluidResistanceLong;
	public static FluidStack fluidResistanceVeryLong;
	public static FluidStack fluidHunger;
	public static FluidStack fluidHungerII;
	public static FluidStack fluidHungerIII;
	public static FluidStack fluidHungerLong;
	public static FluidStack fluidHungerVeryLong;
	public static FluidStack fluidHealthBoost;
	public static FluidStack fluidHealthBoostII;
	public static FluidStack fluidHealthBoostIII;
	public static FluidStack fluidHealthBoostLong;
	public static FluidStack fluidHealthBoostVeryLong;
	public static FluidStack fluidAbsorption;
	public static FluidStack fluidAbsorptionII;
	public static FluidStack fluidAbsorptionIII;
	public static FluidStack fluidAbsorptionLong;
	public static FluidStack fluidAbsorptionVeryLong;
	public static FluidStack fluidSaturation;
	public static FluidStack fluidSaturationII;
	public static FluidStack fluidSaturationIII;
	public static FluidStack fluidSaturationLong;
	public static FluidStack fluidSaturationVeryLong;
	public static FluidStack fluidWither;
	public static FluidStack fluidWitherII;
	public static FluidStack fluidWitherIII;
	public static FluidStack fluidWitherLong;
	public static FluidStack fluidWitherVeryLong;
	public static FluidStack fluidHarm;
	public static FluidStack fluidHarmII;
	public static FluidStack fluidHarmIII;
	public static FluidStack fluidHeal;
	public static FluidStack fluidHealII;
	public static FluidStack fluidHealIII;
	public static FluidStack fluidWaterBreathe;
	public static FluidStack fluidWaterBreatheLong;
	public static FluidStack fluidWaterBreatheVeryLong;
	public static FluidStack fluidNausea;
	public static FluidStack fluidNauseaLong;
	public static FluidStack fluidNauseaVeryLong;
	public static FluidStack fluidBlindness;
	public static FluidStack fluidBlindnessLong;
	public static FluidStack fluidBlindnessVeryLong;
	public static FluidStack fluidFireImmunity;
	public static FluidStack fluidFireImmunityII;
	
	public static FluidStack fluidHolyWater;
	public static FluidStack fluidHolyWaterII;
	public static FluidStack fluidHolyWaterIII;
	public static FluidStack fluidHolyWaterLong;
	public static FluidStack fluidHolyWaterVeryLong;
	public static FluidStack fluidAntidote;
	public static FluidStack fluidAntidoteII;
	public static FluidStack fluidAntidoteIII;
	public static FluidStack fluidAntidoteLong;
	public static FluidStack fluidAntidoteVeryLong;
	public static FluidStack fluidFlight;
	public static FluidStack fluidFlightLong;
	public static FluidStack fluidFlightVeryLong;
	public static FluidStack fluidCryo;
	public static FluidStack fluidCryoLong;
	public static FluidStack fluidCryoVeryLong;
	public static FluidStack fluidBoom;
	public static FluidStack fluidBoomII;
	public static FluidStack fluidBoomIII;
	public static FluidStack fluidBoomLong;
	public static FluidStack fluidBoomVeryLong;

	@Override
	public String getName() {
		return "PotionPlugin";
	}

	@Override
	public boolean shouldRun(ModUtils mod, ModState state) {
		return true;
	}

	@Override
	public boolean isRequired() {
		return true;
	}

	@Override
	public void preInit(ModUtils mod) {
		potions = new MetaItemPotion("RedGear.Brewcraft.Potions"); // Items MUST be created in pre init! NO exceptions!
	}

	@Override
	public void Init(ModUtils mod) {
		fluidAwkward = createVanillaPotion("Awkward", 16, 0);
		System.out.println("Created at least one potion successfully.");
		fluidVision = createVanillaPotion("Vision", 8198, 16390);
		fluidVisionLong = createVanillaPotion("VisionLong", 8262, 16454);
		fluidInvisible = createVanillaPotion("Invisible", 8206, 16398);
		fluidInvisibleLong = createVanillaPotion("InvisibleLong", 8270, 16462);
		fluidRegen = createVanillaPotion("Regen", 8193, 16385);
		fluidRegenII = createVanillaPotion("RegenII", 8289, 16481);
		fluidRegenLong = createVanillaPotion("RegenLong", 8257, 16449);
		fluidFast = createVanillaPotion("Fast", 8194, 16386);
		fluidFastLong = createVanillaPotion("FastLong", 8290, 164500);
		fluidFastII = createVanillaPotion("FastII", 8258, 16418);
		fluidWeakness = createVanillaPotion("Weakness", 8200, 16392);
		fluidWeaknessLong = createVanillaPotion("WeaknessLong", 8264, 16456);
		fluidStrength = createVanillaPotion("Strength", 8201, 16393);
		fluidStrengthLong = createVanillaPotion("StrengthLong", 8265, 16457);
		fluidStrengthII = createVanillaPotion("StrengthII", 8297, 16425);
		fluidFireResist = createVanillaPotion("FireResist", 8195, 16387);
		fluidFireResistLong = createVanillaPotion("FireResistLong", 8259, 16451);
		fluidSlowness = createVanillaPotion("Slowness", 8202, 16394);
		fluidSlownessLong = createVanillaPotion("SlownessLong", 8266, 16458);
		fluidPoison = createVanillaPotion("Poison", 8196, 16388);
		fluidPoisonII = createVanillaPotion("PoisonII", 8260, 16420);
		fluidPoisonLong = createVanillaPotion("PoisonLong", 8228, 16452);
		fluidHarm = createVanillaPotion("Harm", 8204, 16396);
		fluidHarmII = createVanillaPotion("HarmII", 8236, 16428);
		fluidHeal = createVanillaPotion("Heal", 8196, 16389);
		fluidHealII = createVanillaPotion("HealII", 8229, 16421);
		fluidWaterBreathe = createVanillaPotion("WaterBreathe", 8205, 16397);
		fluidWaterBreatheLong = createVanillaPotion("WaterBreatheLong", 8269, 16461);

		fluidHaste = potionRegistry.addPotion("Haste", Potion.digSpeed, 90, 0, true);
		fluidHasteII = potionRegistry.addPotion("HasteII", Potion.digSpeed, 45, 1, true);
		fluidHasteIII = potionRegistry.addPotion("HasteIII", Potion.digSpeed, 25, 2, true);
		fluidHasteLong = potionRegistry.addPotion("HasteLong", Potion.digSpeed, 180, 0, true);
		fluidHasteVeryLong = potionRegistry.addPotion("HasteVeryLong", Potion.digSpeed, 360, 0, true);
		fluidFatigue = potionRegistry.addPotion("Fatigue", Potion.digSlowdown, 90, 0, true);
		fluidFatigueII = potionRegistry.addPotion("FatigueII", Potion.digSlowdown, 45, 1, true);
		fluidFatigueIII = potionRegistry.addPotion("FatigueIII", Potion.digSlowdown, 25, 2, true);
		fluidFatigueLong = potionRegistry.addPotion("FatigueLong", Potion.digSlowdown, 180, 0, true);
		fluidFatigueVeryLong = potionRegistry.addPotion("FatigueVeryLong", Potion.digSlowdown, 360, 0, true);
		fluidJump = potionRegistry.addPotion("Jump", Potion.jump, 60, 0, true);
		fluidJumpII = potionRegistry.addPotion("JumpII", Potion.jump, 30, 1, true);
		fluidJumpIII = potionRegistry.addPotion("JumpIII", Potion.jump, 15, 2, true);
		fluidJumpLong = potionRegistry.addPotion("JumpLong", Potion.jump, 120, 0, true);
		fluidJumpVeryLong = potionRegistry.addPotion("JumpVeryLong", Potion.jump, 240, 0, true);
		fluidNausea = potionRegistry.addPotion("Nausea", Potion.confusion, 30, 0);
		fluidNauseaLong = potionRegistry.addPotion("NauseaLong", Potion.confusion, 60, 0);
		fluidNauseaVeryLong = potionRegistry.addPotion("NauseaVeryLong", Potion.confusion, 120, 0);
		fluidResistance = potionRegistry.addPotion("Resistance", Potion.resistance, 90, 0, true);
		fluidResistanceII = potionRegistry.addPotion("ResistanceII", Potion.resistance, 45, 1, true);
		fluidResistanceIII = potionRegistry.addPotion("ResistanceIII", Potion.resistance, 20, 2, true);
		fluidResistanceLong = potionRegistry.addPotion("ResistanceLong", Potion.resistance, 180, 0, true);
		fluidResistanceVeryLong = potionRegistry.addPotion("ResistanceVeryLong", Potion.resistance, 360, 0, true);
		fluidBlindness = potionRegistry.addPotion("Blindness", Potion.blindness, 30, 0);
		fluidBlindnessLong = potionRegistry.addPotion("BlindnessLong", Potion.blindness, 60, 0);
		fluidBlindnessVeryLong = potionRegistry.addPotion("BlindnessVeryLong", Potion.blindness, 120, 0);
		fluidHunger = potionRegistry.addPotion("Hunger", Potion.hunger, 60, 0);
		fluidHungerII = potionRegistry.addPotion("HungerII", Potion.hunger, 30, 1);
		fluidHungerIII = potionRegistry.addPotion("HungerIII", Potion.hunger, 15, 2);
		fluidHungerLong = potionRegistry.addPotion("HungerLong", Potion.hunger, 120, 0);
		fluidHungerVeryLong = potionRegistry.addPotion("HungerVeryLong", Potion.hunger, 240, 0);
		fluidHealthBoost = potionRegistry.addPotion("HealthBoost", Potion.field_76434_w, 120, 0, true);
		fluidHealthBoostII = potionRegistry.addPotion("HealthBoostII", Potion.field_76434_w, 60, 1, true);
		fluidHealthBoostIII = potionRegistry.addPotion("HealthBoostIII", Potion.field_76434_w, 30, 2, true);
		fluidHealthBoostLong = potionRegistry.addPotion("HealthBoostLong", Potion.field_76434_w, 240, 0, true);
		fluidHealthBoostVeryLong = potionRegistry.addPotion("HealthBoostVeryLong", Potion.field_76434_w, 480, 0, true);
		fluidAbsorption = potionRegistry.addPotion("Absorption", Potion.field_76444_x, 60, 0);
		fluidAbsorptionII = potionRegistry.addPotion("AbsorptionII", Potion.field_76444_x, 30, 1);
		fluidAbsorptionIII = potionRegistry.addPotion("AbsorptionIII", Potion.field_76444_x, 15, 2);
		fluidAbsorptionLong = potionRegistry.addPotion("AbsorptionLong", Potion.field_76444_x, 120, 0);
		fluidAbsorptionVeryLong = potionRegistry.addPotion("AbsorptionVeryLong", Potion.field_76444_x, 240, 0);
		fluidSaturation = potionRegistry.addPotion("Saturation", Potion.field_76443_y, 10, 0);
		fluidSaturationII = potionRegistry.addPotion("SaturationII", Potion.field_76443_y, 5, 1);
		fluidSaturationIII = potionRegistry.addPotion("SaturationIII", Potion.field_76443_y, 3, 2);
		fluidSaturationLong = potionRegistry.addPotion("SaturationLong", Potion.field_76443_y, 20, 0);
		fluidSaturationVeryLong = potionRegistry.addPotion("SaturationVeryLong", Potion.field_76443_y, 40, 0);
		fluidWither = potionRegistry.addPotion("Wither", Potion.wither, 20, 0);
		fluidWitherII = potionRegistry.addPotion("WitherII", Potion.wither, 10, 1);
		fluidWitherIII = potionRegistry.addPotion("WitherIII", Potion.wither, 5, 2);
		fluidWitherLong = potionRegistry.addPotion("WitherLong", Potion.wither, 40, 0);
		fluidWitherVeryLong = potionRegistry.addPotion("WitherVeryLong", Potion.wither, 80, 0);

		fluidHolyWater = potionRegistry.addPotion("HolyWater", EffectPlugin.angel, 10, 0, true);
		fluidHolyWaterII = potionRegistry.addPotion("HolyWaterII", EffectPlugin.angel, 5, 1, true);
		fluidHolyWaterLong = potionRegistry.addPotion("HolyWaterLong", EffectPlugin.angel, 10, 0, true);
		fluidHolyWaterVeryLong = potionRegistry.addPotion("HolyWaterVeryLong", EffectPlugin.angel, 20, 0, true);
		fluidHolyWaterIII = potionRegistry.addPotion("HolyWaterIII", EffectPlugin.angel, 3, 2, true);
		fluidFlight = potionRegistry.addPotion("Flight", EffectPlugin.flight, 15, 0);
		fluidFlightLong = potionRegistry.addPotion("FlightLong", EffectPlugin.flight, 30, 0);
		fluidFlightVeryLong = potionRegistry.addPotion("FlightVeryLong", EffectPlugin.flight, 60, 0);
		fluidAntidote = potionRegistry.addPotion("Antidote", EffectPlugin.immunity, 60, 0, true);
		fluidAntidoteII = potionRegistry.addPotion("AntidoteII", EffectPlugin.immunity, 45, 1, true);
		fluidAntidoteIII = potionRegistry.addPotion("AntidoteIII", EffectPlugin.immunity, 30, 2, true);
		fluidAntidoteLong = potionRegistry.addPotion("AntidoteLong", EffectPlugin.immunity, 120, 0, true);
		fluidAntidoteVeryLong = potionRegistry.addPotion("AntidoteVeryLong", EffectPlugin.immunity, 240, 0, true);
		fluidBoom = potionRegistry.addPotion("Boom", EffectPlugin.creeper, 8, 0, true);
		fluidBoomII = potionRegistry.addPotion("BoomII", EffectPlugin.creeper, 4, 1, true);
		fluidBoomIII = potionRegistry.addPotion("BoomIII", EffectPlugin.creeper, 4, 2, true);
		fluidBoomLong = potionRegistry.addPotion("BoomLong", EffectPlugin.creeper, 16, 0, true);
		fluidBoomVeryLong = potionRegistry.addPotion("BoomVeryLong", EffectPlugin.creeper, 32, 0, true);
		fluidCryo = potionRegistry.addPotion("Cryo", EffectPlugin.frozen, 8, 0, true);
		fluidCryoLong = potionRegistry.addPotion("CryoLong", EffectPlugin.frozen, 16, 0, true);
		fluidCryoVeryLong = potionRegistry.addPotion("CryoVeryLong", EffectPlugin.frozen, 30, 0, true);

		fluidRegenIII = potionRegistry.addPotion("RegenIII", Potion.regeneration, 8, 2);
		fluidRegenVeryLong = potionRegistry.addPotion("RegenVeryLong", Potion.regeneration, 180, 0);
		fluidFastIII = potionRegistry.addPotion("FastIII", Potion.moveSpeed, 8, 2, true);
		fluidFastVeryLong = potionRegistry.addPotion("FastVeryLong", Potion.moveSpeed, 960, 0);
		fluidStrengthIII = potionRegistry.addPotion("StrengthIII", Potion.damageBoost, 40, 2, true);
		fluidStrengthVeryLong = potionRegistry.addPotion("StrengthVeryLong", Potion.damageBoost, 960, 0);
		fluidFireImmunity = potionRegistry.addPotion("FireImmunity", EffectPlugin.fireproof, 35, 0, true);
		fluidFireImmunityII = potionRegistry.addPotion("FireImmunityII", EffectPlugin.fireproof, 15, 1, true);
		fluidFireResistVeryLong = potionRegistry.addPotion("FireResistVeryLong", Potion.fireResistance, 960, 0);
		fluidPoisonIII = potionRegistry.addPotion("PoisonIII", Potion.poison, 8, 2);
		fluidPoisonVeryLong = potionRegistry.addPotion("PoisonVeryLong", Potion.poison, 240, 0);
		fluidHarmIII = potionRegistry.addPotion( "HarmIII", Potion.harm, 1, 2);
		fluidHealIII = potionRegistry.addPotion("HealIII", Potion.heal, 1, 2);
		fluidVisionVeryLong = potionRegistry.addPotion("VisionVeryLong", Potion.nightVision, 960, 0);
		fluidWeaknessVeryLong = potionRegistry.addPotion("WeaknessVeryLong", Potion.weakness, 480, 0, true);
		fluidSlownessVeryLong = potionRegistry.addPotion("SlownessVeryLong", Potion.moveSlowdown, 480, 0, true);
		fluidWaterBreatheVeryLong = potionRegistry.addPotion("WaterBreatheVeryLong", Potion.waterBreathing, 960, 0);
		
		fluidRegenIII = potionRegistry.addPotion("RegenIII", Potion.regeneration, 8, 2);
		fluidRegenVeryLong = potionRegistry.addPotion("RegenVeryLong", Potion.regeneration, 180, 0);
		fluidFastIII = potionRegistry.addPotion("FastIII", Potion.moveSpeed, 8, 2, true);
		fluidFastVeryLong = potionRegistry.addPotion("FastVeryLong", Potion.moveSpeed, 960, 0);
		fluidStrengthIII = potionRegistry.addPotion("StrengthIII", Potion.damageBoost, 40, 2, true);
		fluidStrengthVeryLong = potionRegistry.addPotion("StrengthVeryLong", Potion.damageBoost, 960, 0);
		fluidFireImmunity = potionRegistry.addPotion("FireImmunity", EffectPlugin.fireproof, 35, 0, true);
		fluidFireImmunityII = potionRegistry.addPotion("FireImmunityII", EffectPlugin.fireproof, 15, 1, true);
		fluidFireResistVeryLong = potionRegistry.addPotion("FireResistVeryLong", Potion.fireResistance, 960, 0);
		fluidPoisonIII = potionRegistry.addPotion("PoisonIII", Potion.poison, 8, 2);
		fluidPoisonVeryLong = potionRegistry.addPotion("PoisonVeryLong", Potion.poison, 240, 0);
		fluidHarmIII = potionRegistry.addPotion("HarmIII", Potion.harm, 1, 2);
		fluidHealIII = potionRegistry.addPotion("HealIII", Potion.heal, 1, 2);
		fluidVisionVeryLong = potionRegistry.addPotion("VisionVeryLong", Potion.nightVision, 960, 0);
		fluidWeaknessVeryLong = potionRegistry.addPotion("WeaknessVeryLong", Potion.weakness, 480, 0, true);
		fluidSlownessVeryLong = potionRegistry.addPotion("SlownessVeryLong", Potion.moveSlowdown, 480, 0, true);
		fluidWaterBreatheVeryLong = potionRegistry.addPotion("WaterBreatheVeryLong", Potion.waterBreathing, 960, 0);
	}

	@Override
	public void postInit(ModUtils mod) {
		recipeRegistry.addRecipe(new FluidStack(FluidRegistry.WATER, 100), fluidAwkward, Items.nether_wart);
		recipeRegistry.addRecipe(fluidAwkward, fluidFireResist, Items.magma_cream);
		recipeRegistry.addRecipe(fluidAwkward, fluidFast, Items.sugar);
		recipeRegistry.addRecipe(fluidAwkward, fluidHeal, Items.speckled_melon);
		recipeRegistry.addRecipe(fluidAwkward, fluidPoison, Items.spider_eye);
		recipeRegistry.addRecipe(fluidAwkward, fluidRegen, Items.ghast_tear);
		recipeRegistry.addRecipe(fluidAwkward, fluidStrength, Items.blaze_powder);
		recipeRegistry.addRecipe(fluidAwkward, fluidWeakness, Items.fermented_spider_eye);
		recipeRegistry.addRecipe(fluidAwkward, fluidVision, Items.golden_carrot);
		recipeRegistry.addRecipe(fluidAwkward, fluidWaterBreathe, new ItemStack(Items.fish, 1, 3));
		recipeRegistry.addRecipe(fluidFireResist, fluidFireResistLong, Items.redstone);
		recipeRegistry.addRecipe(fluidFireResistLong, fluidFireResistVeryLong, IngredientPlugin.pureTear);
		recipeRegistry.addRecipe(fluidHeal, fluidHealII, Items.glowstone_dust);
		recipeRegistry.addRecipe(fluidHealII, fluidHealIII, IngredientPlugin.obsidianTear);
		recipeRegistry.addRecipe(fluidRegen, fluidRegenLong, Items.redstone);
		recipeRegistry.addRecipe(fluidRegenLong, fluidRegenVeryLong, IngredientPlugin.pureTear);
		recipeRegistry.addRecipe(fluidRegen, fluidRegenII, Items.glowstone_dust);
		recipeRegistry.addRecipe(fluidRegenII, fluidRegenIII, IngredientPlugin.obsidianTear);
		recipeRegistry.addRecipe(fluidStrength, fluidStrengthII, Items.glowstone_dust);
		recipeRegistry.addRecipe(fluidStrengthII, fluidStrengthIII, IngredientPlugin.obsidianTear);
		recipeRegistry.addRecipe(fluidStrength, fluidStrengthLong, Items.redstone);
		recipeRegistry.addRecipe(fluidStrengthLong, fluidStrengthVeryLong, IngredientPlugin.pureTear);
		recipeRegistry.addRecipe(fluidFast, fluidFastLong, Items.redstone);
		recipeRegistry.addRecipe(fluidFastLong, fluidFastVeryLong, IngredientPlugin.pureTear);
		recipeRegistry.addRecipe(fluidFast, fluidFastII, Items.glowstone_dust);
		recipeRegistry.addRecipe(fluidFastII, fluidFastIII, IngredientPlugin.obsidianTear);
		recipeRegistry.addRecipe(fluidVision, fluidVisionLong, Items.redstone);
		recipeRegistry.addRecipe(fluidVisionLong, fluidVisionVeryLong, IngredientPlugin.pureTear);
		recipeRegistry.addRecipe(fluidVision, fluidInvisible, Items.fermented_spider_eye);
		recipeRegistry.addRecipe(fluidVisionLong, fluidInvisibleLong, Items.fermented_spider_eye);
		recipeRegistry.addRecipe(fluidVisionVeryLong, fluidInvisibleVeryLong, Items.fermented_spider_eye);
		recipeRegistry.addRecipe(fluidInvisible, fluidInvisibleLong, Items.redstone);
		recipeRegistry.addRecipe(fluidInvisibleLong, fluidInvisibleVeryLong, IngredientPlugin.pureTear);
		recipeRegistry.addRecipe(fluidWaterBreathe, fluidWaterBreatheLong, Items.redstone);
		recipeRegistry.addRecipe(fluidWaterBreatheLong, fluidWaterBreatheVeryLong, IngredientPlugin.pureTear);
		recipeRegistry.addRecipe(fluidHeal, fluidHarm, Items.fermented_spider_eye);
		recipeRegistry.addRecipe(fluidHealII, fluidHarmII, Items.fermented_spider_eye);
		recipeRegistry.addRecipe(fluidHealIII, fluidHarmIII, Items.fermented_spider_eye);
		recipeRegistry.addRecipe(fluidPoison, fluidHarm, Items.fermented_spider_eye);
		recipeRegistry.addRecipe(fluidPoisonII, fluidHarmII, Items.fermented_spider_eye);
		recipeRegistry.addRecipe(fluidPoisonIII, fluidHarmIII, Items.fermented_spider_eye);
		recipeRegistry.addRecipe(fluidHarm, fluidHarmII, Items.glowstone_dust);
		recipeRegistry.addRecipe(fluidPoison, fluidPoisonLong, Items.redstone);
		recipeRegistry.addRecipe(fluidPoison, fluidPoisonII, Items.glowstone_dust);
		recipeRegistry.addRecipe(fluidVisionLong, fluidInvisibleLong, Items.fermented_spider_eye);
		recipeRegistry.addRecipe(fluidFireResist, fluidSlowness, Items.fermented_spider_eye);
		recipeRegistry.addRecipe(fluidFireResistLong, fluidSlownessLong, Items.fermented_spider_eye);
		recipeRegistry.addRecipe(fluidFast, fluidSlowness, Items.fermented_spider_eye);
		recipeRegistry.addRecipe(fluidFastLong, fluidSlownessLong, Items.fermented_spider_eye);
		recipeRegistry.addRecipe(fluidFastVeryLong, fluidSlownessVeryLong, Items.fermented_spider_eye);
		recipeRegistry.addRecipe(fluidSlowness, fluidSlownessLong, Items.redstone);
		recipeRegistry.addRecipe(fluidStrength, fluidWeakness, Items.fermented_spider_eye);
		recipeRegistry.addRecipe(fluidStrengthLong, fluidWeaknessLong, Items.fermented_spider_eye);
		recipeRegistry.addRecipe(fluidStrengthVeryLong, fluidWeaknessVeryLong, Items.fermented_spider_eye);
		recipeRegistry.addRecipe(fluidRegen, fluidWeakness, Items.fermented_spider_eye);
		recipeRegistry.addRecipe(fluidRegenLong, fluidWeaknessLong, Items.fermented_spider_eye);
		recipeRegistry.addRecipe(fluidRegenVeryLong, fluidWeaknessVeryLong, Items.fermented_spider_eye);
		recipeRegistry.addRecipe(fluidHealII, fluidHeal, Items.redstone);
		recipeRegistry.addRecipe(fluidHarmII, fluidHeal, Items.redstone);
		recipeRegistry.addRecipe(fluidFireResistLong, fluidFireResist, Items.glowstone_dust);
		recipeRegistry.addRecipe(fluidSlownessLong, fluidSlowness, Items.glowstone_dust);
		recipeRegistry.addRecipe(fluidWeaknessLong, fluidWeakness, Items.glowstone_dust);
		recipeRegistry.addRecipe(fluidWaterBreatheLong, fluidWaterBreathe, Items.glowstone_dust);
		
		recipeRegistry.addRecipe(fluidRegen, fluidHolyWater, IngredientPlugin.holyDust);
		recipeRegistry.addRecipe(fluidRegenII, fluidHolyWaterII, IngredientPlugin.holyDust);
		recipeRegistry.addRecipe(fluidRegenIII, fluidHolyWaterIII, IngredientPlugin.holyDust);
		recipeRegistry.addRecipe(fluidRegenLong, fluidHolyWaterLong, IngredientPlugin.holyDust);
		recipeRegistry.addRecipe(fluidRegenVeryLong, fluidHolyWaterVeryLong, IngredientPlugin.holyDust);
		recipeRegistry.addRecipe(fluidHolyWater, fluidHarm, Items.fermented_spider_eye);
		recipeRegistry.addRecipe(fluidHolyWaterII, fluidHarmII, Items.fermented_spider_eye);
		recipeRegistry.addRecipe(fluidHolyWaterIII, fluidHarmIII, Items.fermented_spider_eye);
		recipeRegistry.addRecipe(fluidHolyWater, fluidHolyWaterII, Items.glowstone_dust);
		recipeRegistry.addRecipe(fluidHolyWater, fluidHolyWaterLong, Items.redstone);
		recipeRegistry.addRecipe(fluidHolyWaterII, fluidHolyWaterIII, IngredientPlugin.obsidianTear);
		recipeRegistry.addRecipe(fluidHolyWaterLong, fluidHolyWaterVeryLong, IngredientPlugin.pureTear);
		recipeRegistry.addRecipe(fluidAwkward, fluidFlight, IngredientPlugin.goldenFeather);
		recipeRegistry.addRecipe(fluidAntidote, fluidAntidoteII, Items.glowstone_dust);
		recipeRegistry.addRecipe(fluidAntidote, fluidAntidoteLong, Items.redstone);
		recipeRegistry.addRecipe(fluidAntidoteII, fluidAntidoteIII, IngredientPlugin.obsidianTear);
		recipeRegistry.addRecipe(fluidAntidoteLong, fluidAntidoteVeryLong, IngredientPlugin.pureTear);
		recipeRegistry.addRecipe(fluidWither, fluidBoom, Items.gunpowder);
		recipeRegistry.addRecipe(fluidWitherII, fluidBoomII, Items.gunpowder);
		recipeRegistry.addRecipe(fluidWitherIII, fluidBoomIII, Items.gunpowder);
		recipeRegistry.addRecipe(fluidWitherLong, fluidBoomLong, Items.gunpowder);
		recipeRegistry.addRecipe(fluidWitherVeryLong, fluidBoomVeryLong, Items.gunpowder);
		recipeRegistry.addRecipe(fluidBoom, fluidBoomII, Items.glowstone_dust);
		recipeRegistry.addRecipe(fluidBoom, fluidBoomLong, Items.redstone);
		recipeRegistry.addRecipe(fluidBoomII, fluidBoomIII, IngredientPlugin.obsidianTear);
		recipeRegistry.addRecipe(fluidBoomLong, fluidBoomVeryLong, IngredientPlugin.pureTear);
		recipeRegistry.addRecipe(fluidSlowness, fluidCryo, Items.snowball);
		recipeRegistry.addRecipe(fluidSlownessLong, fluidCryoLong, Items.snowball);
		recipeRegistry.addRecipe(fluidSlownessVeryLong, fluidCryoVeryLong, Items.snowball);
		recipeRegistry.addRecipe(fluidSlowness, fluidSlownessLong, Items.redstone);
		recipeRegistry.addRecipe(fluidSlownessLong, fluidSlownessVeryLong, IngredientPlugin.pureTear);
		
		recipeRegistry.addRecipe(fluidAwkward, fluidNausea, Items.poisonous_potato);
		recipeRegistry.addRecipe(fluidNausea, fluidNauseaLong, Items.redstone);
		recipeRegistry.addRecipe(fluidNauseaLong, fluidNausea, Items.glowstone_dust);
		recipeRegistry.addRecipe(fluidNauseaLong, fluidNauseaVeryLong, IngredientPlugin.pureTear);
		recipeRegistry.addRecipe(fluidAwkward, fluidBlindness, new ItemStack(Items.dye, 1, 0));
		recipeRegistry.addRecipe(fluidBlindness, fluidBlindnessLong, Items.redstone);
		recipeRegistry.addRecipe(fluidBlindnessLong, fluidBlindnessVeryLong, IngredientPlugin.pureTear);
		recipeRegistry.addRecipe(fluidBlindness, fluidVision, Items.fermented_spider_eye);
		recipeRegistry.addRecipe(fluidBlindnessLong, fluidVisionLong, Items.fermented_spider_eye);
		recipeRegistry.addRecipe(fluidBlindnessVeryLong, fluidVisionVeryLong, Items.fermented_spider_eye);
		recipeRegistry.addRecipe(fluidAwkward, fluidHunger, Items.rotten_flesh);
		recipeRegistry.addRecipe(fluidHunger, fluidHungerII, Items.glowstone_dust);
		recipeRegistry.addRecipe(fluidHunger, fluidHungerLong, Items.rotten_flesh);
		recipeRegistry.addRecipe(fluidHungerII, fluidHungerIII, IngredientPlugin.obsidianTear);
		recipeRegistry.addRecipe(fluidHungerLong, fluidHungerVeryLong, IngredientPlugin.pureTear);
		recipeRegistry.addRecipe(fluidHunger, fluidSaturation, Items.fermented_spider_eye);
		recipeRegistry.addRecipe(fluidHungerII, fluidSaturationII, Items.fermented_spider_eye);
		recipeRegistry.addRecipe(fluidHungerIII, fluidSaturationIII, Items.fermented_spider_eye);
		recipeRegistry.addRecipe(fluidHungerLong, fluidSaturationLong, Items.fermented_spider_eye);
		recipeRegistry.addRecipe(fluidHungerVeryLong, fluidSaturationVeryLong, Items.fermented_spider_eye);
		recipeRegistry.addRecipe(fluidAwkward, fluidSaturation, Items.cake);
		recipeRegistry.addRecipe(fluidHunger, fluidSaturation, Items.fermented_spider_eye);
		recipeRegistry.addRecipe(fluidSaturation, fluidHunger, Items.fermented_spider_eye);
		recipeRegistry.addRecipe(fluidHungerII, fluidSaturationII, Items.fermented_spider_eye);
		recipeRegistry.addRecipe(fluidSaturationII, fluidHungerII, Items.fermented_spider_eye);
		recipeRegistry.addRecipe(fluidHungerIII, fluidSaturationIII, Items.fermented_spider_eye);
		recipeRegistry.addRecipe(fluidSaturationIII, fluidHungerIII, Items.fermented_spider_eye);
		recipeRegistry.addRecipe(fluidHungerLong, fluidSaturationLong, Items.fermented_spider_eye);
		recipeRegistry.addRecipe(fluidSaturationLong, fluidHungerLong, Items.fermented_spider_eye);
		recipeRegistry.addRecipe(fluidHungerVeryLong, fluidSaturationVeryLong, Items.fermented_spider_eye);
		recipeRegistry.addRecipe(fluidSaturationVeryLong, fluidHungerVeryLong, Items.fermented_spider_eye);
		recipeRegistry.addRecipe(fluidSaturation, fluidSaturationII, Items.glowstone_dust);
		recipeRegistry.addRecipe(fluidSaturationII, fluidSaturationIII, IngredientPlugin.obsidianTear);
		recipeRegistry.addRecipe(fluidSaturation, fluidSaturationLong, Items.redstone);
		recipeRegistry.addRecipe(fluidSaturationLong, fluidSaturationVeryLong, Items.glowstone_dust);
		recipeRegistry.addRecipe(fluidAwkward, fluidHaste, IngredientPlugin.spiderFang);
		recipeRegistry.addRecipe(fluidFatigue, fluidHaste, Items.fermented_spider_eye);
		recipeRegistry.addRecipe(fluidHaste, fluidFatigue, Items.fermented_spider_eye);
		recipeRegistry.addRecipe(fluidFatigueII, fluidHasteII, Items.fermented_spider_eye);
		recipeRegistry.addRecipe(fluidHasteII, fluidFatigueII, Items.fermented_spider_eye);
		recipeRegistry.addRecipe(fluidFatigueIII, fluidHasteIII, Items.fermented_spider_eye);
		recipeRegistry.addRecipe(fluidHasteIII, fluidFatigueIII, Items.fermented_spider_eye);
		recipeRegistry.addRecipe(fluidFatigueLong, fluidHasteLong, Items.fermented_spider_eye);
		recipeRegistry.addRecipe(fluidHasteLong, fluidFatigueLong, Items.fermented_spider_eye);
		recipeRegistry.addRecipe(fluidFatigueVeryLong, fluidHasteVeryLong, Items.fermented_spider_eye);
		recipeRegistry.addRecipe(fluidHasteVeryLong, fluidFatigueVeryLong, Items.fermented_spider_eye);
		recipeRegistry.addRecipe(fluidHaste, fluidHasteII, Items.glowstone_dust);
		recipeRegistry.addRecipe(fluidHasteII, fluidHaste, Items.redstone);
		recipeRegistry.addRecipe(fluidHasteLong, fluidHaste, Items.glowstone_dust);
		recipeRegistry.addRecipe(fluidHasteII, fluidHasteIII, IngredientPlugin.obsidianTear);
		recipeRegistry.addRecipe(fluidHaste, fluidHasteLong, Items.redstone);
		recipeRegistry.addRecipe(fluidHasteLong, fluidHasteVeryLong, IngredientPlugin.pureTear);
		recipeRegistry.addRecipe(fluidFatigue, fluidHaste, Items.fermented_spider_eye);
		recipeRegistry.addRecipe(fluidAwkward, fluidFatigue, IngredientPlugin.tiredSpores);
		recipeRegistry.addRecipe(fluidFatigue, fluidFatigueII, Items.glowstone_dust);
		recipeRegistry.addRecipe(fluidFatigueII, fluidFatigue, Items.redstone);
		recipeRegistry.addRecipe(fluidFatigueII, fluidFatigueIII, IngredientPlugin.obsidianTear);
		recipeRegistry.addRecipe(fluidFatigue, fluidFatigueLong, Items.redstone);
		recipeRegistry.addRecipe(fluidFatigueLong, fluidFatigue, Items.glowstone_dust);
		recipeRegistry.addRecipe(fluidFatigueLong, fluidFatigueVeryLong, IngredientPlugin.pureTear);
		recipeRegistry.addRecipe(fluidAwkward, fluidHealthBoost, IngredientPlugin.heartGold);
		recipeRegistry.addRecipe(fluidHealthBoost, fluidHealthBoostII, Items.glowstone_dust);
		recipeRegistry.addRecipe(fluidHealthBoostII, fluidHealthBoost, Items.redstone);
		recipeRegistry.addRecipe(fluidHealthBoostII, fluidHealthBoostIII, IngredientPlugin.obsidianTear);
		recipeRegistry.addRecipe(fluidHealthBoost, fluidHealthBoostLong, Items.redstone);
		recipeRegistry.addRecipe(fluidHealthBoostLong, fluidHealthBoost, Items.glowstone_dust);
		recipeRegistry.addRecipe(fluidHealthBoostLong, fluidHealthBoostVeryLong, IngredientPlugin.pureTear);
		recipeRegistry.addRecipe(fluidAwkward, fluidAntidote, IngredientPlugin.remedySalve);
		recipeRegistry.addRecipe(fluidAntidote, fluidAntidoteII, Items.glowstone_dust);
		recipeRegistry.addRecipe(fluidAntidoteII, fluidAntidote, Items.redstone);
		recipeRegistry.addRecipe(fluidAntidoteII, fluidAntidoteIII, IngredientPlugin.obsidianTear);
		recipeRegistry.addRecipe(fluidAntidote, fluidAntidoteLong, Items.redstone);
		recipeRegistry.addRecipe(fluidAntidoteLong, fluidAntidote, Items.glowstone_dust);
		recipeRegistry.addRecipe(fluidAntidoteLong, fluidAntidoteVeryLong, IngredientPlugin.pureTear);
		recipeRegistry.addRecipe(fluidAntidote, fluidWither, Items.fermented_spider_eye);
		recipeRegistry.addRecipe(fluidWither, fluidAntidote, Items.fermented_spider_eye);
		recipeRegistry.addRecipe(fluidAntidoteII, fluidWitherII, Items.fermented_spider_eye);
		recipeRegistry.addRecipe(fluidWitherII, fluidAntidoteII, Items.fermented_spider_eye);
		recipeRegistry.addRecipe(fluidAntidoteIII, fluidWitherIII, Items.fermented_spider_eye);
		recipeRegistry.addRecipe(fluidWitherIII, fluidAntidoteIII, Items.fermented_spider_eye);
		recipeRegistry.addRecipe(fluidAntidoteLong, fluidWitherLong, Items.fermented_spider_eye);
		recipeRegistry.addRecipe(fluidWitherLong, fluidAntidoteLong, Items.fermented_spider_eye);
		recipeRegistry.addRecipe(fluidAntidoteVeryLong, fluidWitherVeryLong, Items.fermented_spider_eye);
		recipeRegistry.addRecipe(fluidWitherVeryLong, fluidAntidoteVeryLong, Items.fermented_spider_eye);
		recipeRegistry.addRecipe(fluidAwkward, fluidJump, Items.carrot);
		recipeRegistry.addRecipe(fluidJump, fluidJumpII, Items.glowstone_dust);
		recipeRegistry.addRecipe(fluidJumpII, fluidJump, Items.redstone);
		recipeRegistry.addRecipe(fluidJumpII, fluidJumpIII, IngredientPlugin.obsidianTear);
		recipeRegistry.addRecipe(fluidJump, fluidJumpLong, Items.redstone);
		recipeRegistry.addRecipe(fluidJumpLong, fluidJump, Items.glowstone_dust);
		recipeRegistry.addRecipe(fluidJumpLong, fluidJumpVeryLong, IngredientPlugin.pureTear);
		recipeRegistry.addRecipe(new FluidStack(FluidRegistry.LAVA, 100), fluidWither, IngredientPlugin.charredBone);
		recipeRegistry.addRecipe(fluidWither, fluidWitherII, Items.glowstone_dust);
		recipeRegistry.addRecipe(fluidWitherII, fluidWitherIII, IngredientPlugin.obsidianTear);
		recipeRegistry.addRecipe(fluidWither, fluidWitherLong, Items.redstone);
		recipeRegistry.addRecipe(fluidWitherLong, fluidWitherVeryLong, IngredientPlugin.pureTear);
		recipeRegistry.addRecipe(fluidWitherII, fluidWither, Items.redstone);
		recipeRegistry.addRecipe(fluidWitherLong, fluidWither, Items.glowstone_dust);
		recipeRegistry.addRecipe(fluidAwkward, fluidAbsorption, IngredientPlugin.heartSmall);
		recipeRegistry.addRecipe(fluidAbsorption, fluidAbsorptionII, Items.glowstone_dust);
		recipeRegistry.addRecipe(fluidAbsorptionII, fluidAbsorption, Items.redstone);
		recipeRegistry.addRecipe(fluidAbsorptionII, fluidAbsorptionIII, IngredientPlugin.obsidianTear);
		recipeRegistry.addRecipe(fluidAbsorption, fluidAbsorptionLong, Items.redstone);
		recipeRegistry.addRecipe(fluidAbsorptionLong, fluidAbsorption, Items.glowstone_dust);
	}

	private FluidStack createVanillaPotion(String name, int metaBottle, int metaSplash) {
		FluidStack potion = new FluidStack(FluidUtil.createFluid(new FluidPotion("potion" + name, new SimpleItem(
				Items.potionitem, metaBottle)), potionTexture), 100);
		FluidContainerRegistry.registerFluidContainer(potion, new ItemStack(Items.potionitem, 1, metaBottle),
				emptyBottle.getStack());
		if (metaSplash != 0)
			FluidContainerRegistry.registerFluidContainer(potion, new ItemStack(Items.potionitem, 1, metaSplash),
					IngredientPlugin.splashBottle.getStack());
		return potion;
	}
}