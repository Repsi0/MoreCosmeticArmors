package com.repsi0.morecosmeticarmors;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class FamiliarArmorMaterial implements ArmorMaterial {
	private static final int[] BASE_DURABILITY = new int[] {9999, 9999, 9999, 9999};
	private static final int[] PROTECTION_VALUES = new int[] {0,0,0,0}; 
	
	@Override
	public int getDurability(EquipmentSlot slot) {
		return BASE_DURABILITY[slot.getEntitySlotId()];
	}

	@Override
	public int getEnchantability() {
		return 0;
	}

	@Override
	public SoundEvent getEquipSound() {
		return SoundEvents.ITEM_ARMOR_EQUIP_LEATHER;
	}

	@Override
	public float getKnockbackResistance() {
		return 0;
	}

	@Override
	public String getName() {
		return "familiar_armor";
	}

	@Override
	public int getProtectionAmount(EquipmentSlot slot) {
		return PROTECTION_VALUES[slot.getEntitySlotId()];
	}

	@Override
	public Ingredient getRepairIngredient() {
		return Ingredient.ofItems(Items.LEATHER);
	}

	@Override
	public float getToughness() {
		return 0;
	}
	
}
