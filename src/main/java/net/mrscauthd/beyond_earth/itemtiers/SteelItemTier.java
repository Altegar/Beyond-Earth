package net.mrscauthd.beyond_earth.itemtiers;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.mrscauthd.beyond_earth.ModInit;

public class SteelItemTier {
    public static Tier ITEM_TIER = new Tier() {
        @Override
        public int getUses() {
            return 1661;
        }

        @Override
        public float getSpeed() {
            return 7f;
        }

        @Override
        public float getAttackDamageBonus() {
            return 2f;
        }

        @Override
        public int getLevel() {
            return 3;
        }

        @Override
        public int getEnchantmentValue() {
            return 14;
        }

        @Override
        public Ingredient getRepairIngredient() {
            return Ingredient.of(new ItemStack(ModInit.STEEL_INGOT.get(),1));
        }
    };
}
