package com.repsi0.morecosmeticarmors;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class MoreCosmeticArmors implements ModInitializer {
	public static final ArmorMaterial familiarMaterial = new FamiliarArmorMaterial();
	public static final ArmorMaterial glassesMaterial = new GlassesArmorMaterial();
	public static final ArmorMaterial sunglassesMaterial = new SunglassesArmorMaterial();
	
	public static final Item FAMILIAR_HAT = new ArmorItem(familiarMaterial, EquipmentSlot.HEAD, new FabricItemSettings().group(ItemGroup.COMBAT));
	public static final Item FAMILIAR_SHIRT = new ArmorItem(familiarMaterial, EquipmentSlot.CHEST, new FabricItemSettings().group(ItemGroup.COMBAT));
	public static final Item FAMILIAR_PANTS = new ArmorItem(familiarMaterial, EquipmentSlot.LEGS, new FabricItemSettings().group(ItemGroup.COMBAT));
	public static final Item FAMILIAR_SHOES = new ArmorItem(familiarMaterial, EquipmentSlot.FEET, new FabricItemSettings().group(ItemGroup.COMBAT));
	public static final Item GLASSES = new ArmorItem(glassesMaterial, EquipmentSlot.HEAD, new FabricItemSettings().group(ItemGroup.COMBAT));
	public static final Item SUNGLASSES = new ArmorItem(sunglassesMaterial, EquipmentSlot.HEAD, new FabricItemSettings().group(ItemGroup.COMBAT));
	@Override
	public void onInitialize() {
		Registry.register(Registry.ITEM, new Identifier("morecosmeticarmors", "familiar_hat"), FAMILIAR_HAT);
		Registry.register(Registry.ITEM, new Identifier("morecosmeticarmors", "familiar_shirt"), FAMILIAR_SHIRT);
		Registry.register(Registry.ITEM, new Identifier("morecosmeticarmors", "familiar_pants"), FAMILIAR_PANTS);
		Registry.register(Registry.ITEM, new Identifier("morecosmeticarmors", "familiar_shoes"), FAMILIAR_SHOES);
		Registry.register(Registry.ITEM, new Identifier("morecosmeticarmors", "glasses"), GLASSES);
		Registry.register(Registry.ITEM, new Identifier("morecosmeticarmors", "sunglasses"), SUNGLASSES);
		
	}
}
