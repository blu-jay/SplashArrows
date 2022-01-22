package xyz.blujay.splasharrows.utilities;

import org.bukkit.entity.AreaEffectCloud;
import org.bukkit.potion.PotionData;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.potion.PotionType;

public class PotionConverter {
    public static void ConvertPotionData(PotionData basePotion, AreaEffectCloud potionEffect) {

        //This is absolutely brain-dead but there is no way of getting the effect duration from a PotionData object...
        PotionEffect newEffect;

        //take regular potion, divide by 4 for lingering, divide again by 2 for arrow.
        if(basePotion.getType() == PotionType.FIRE_RESISTANCE){
            if(basePotion.isExtended()){
                newEffect = new PotionEffect(PotionType.FIRE_RESISTANCE.getEffectType(), 1200, 0);
            }
            else{
                newEffect = new PotionEffect(PotionType.FIRE_RESISTANCE.getEffectType(), 450, 0);
            }
            potionEffect.addCustomEffect(newEffect, false);
        }
        else if(basePotion.getType() == PotionType.INSTANT_DAMAGE){
            if(basePotion.isUpgraded()){
                newEffect = new PotionEffect(PotionType.INSTANT_DAMAGE.getEffectType(), 10, 2);
            }
            else {
                newEffect = new PotionEffect(PotionType.INSTANT_DAMAGE.getEffectType(), 10, 1);
            }
            potionEffect.setDuration(20);
            potionEffect.addCustomEffect(newEffect, false);
        }
        else if(basePotion.getType() == PotionType.INSTANT_HEAL){
            if(basePotion.isUpgraded()){
                newEffect = new PotionEffect(PotionType.INSTANT_HEAL.getEffectType(), 10, 2);
            }
            else {
                newEffect = new PotionEffect(PotionType.INSTANT_HEAL.getEffectType(), 10, 1);
            }
            potionEffect.setDuration(20);
            potionEffect.addCustomEffect(newEffect, false);
        }
        else if(basePotion.getType() == PotionType.INVISIBILITY){
            if(basePotion.isExtended()){
                newEffect = new PotionEffect(PotionType.INVISIBILITY.getEffectType(), 1200, 0);
            }
            else{
                newEffect = new PotionEffect(PotionType.INVISIBILITY.getEffectType(), 450, 0);
            }
            potionEffect.addCustomEffect(newEffect, false);
        }
        else if(basePotion.getType() == PotionType.JUMP){
            if(basePotion.isExtended()){
                newEffect = new PotionEffect(PotionType.JUMP.getEffectType(), 1200, 0);
            }
            else if(basePotion.isUpgraded()){
                newEffect = new PotionEffect(PotionType.JUMP.getEffectType(), 225, 1);
            }
            else{
                newEffect = new PotionEffect(PotionType.JUMP.getEffectType(), 450, 0);
            }
            potionEffect.addCustomEffect(newEffect, false);
        }
        else if(basePotion.getType() == PotionType.LUCK){
            newEffect = new PotionEffect(PotionType.LUCK.getEffectType(), 740, 0);
            potionEffect.addCustomEffect(newEffect, false);
        }
        else if(basePotion.getType() == PotionType.NIGHT_VISION){
            if(basePotion.isExtended()){
                newEffect = new PotionEffect(PotionType.NIGHT_VISION.getEffectType(), 1200, 0);
            }
            else{
                newEffect = new PotionEffect(PotionType.NIGHT_VISION.getEffectType(), 450, 0);
            }
            potionEffect.addCustomEffect(newEffect, false);
        }
        else if(basePotion.getType() == PotionType.POISON){
            if(basePotion.isExtended()){
                newEffect = new PotionEffect(PotionType.POISON.getEffectType(), 225, 0);
            }
            else if(basePotion.isUpgraded()){
                newEffect = new PotionEffect(PotionType.POISON.getEffectType(), 56, 1);
            }
            else{
                newEffect = new PotionEffect(PotionType.POISON.getEffectType(), 113, 0);
            }
            potionEffect.addCustomEffect(newEffect, false);
        }
        else if(basePotion.getType() == PotionType.REGEN){
            if(basePotion.isExtended()){
                newEffect = new PotionEffect(PotionType.REGEN.getEffectType(), 225, 0);
            }
            else if(basePotion.isUpgraded()){
                newEffect = new PotionEffect(PotionType.REGEN.getEffectType(), 55, 1);
            }
            else{
                newEffect = new PotionEffect(PotionType.REGEN.getEffectType(), 113, 0);
            }
            potionEffect.addCustomEffect(newEffect, false);
        }
        else if(basePotion.getType() == PotionType.SLOW_FALLING){
            if(basePotion.isExtended()){
                newEffect = new PotionEffect(PotionType.SLOW_FALLING.getEffectType(), 600, 0);
            }
            else{
                newEffect = new PotionEffect(PotionType.SLOW_FALLING.getEffectType(), 225, 0);
            }
            potionEffect.addCustomEffect(newEffect, false);
        }
        else if(basePotion.getType() == PotionType.SLOWNESS){
            if(basePotion.isExtended()){
                newEffect = new PotionEffect(PotionType.SLOWNESS.getEffectType(), 600, 0);
            }
            else if(basePotion.isUpgraded()){
                newEffect = new PotionEffect(PotionType.SLOWNESS.getEffectType(), 50, 3);
            }
            else{
                newEffect = new PotionEffect(PotionType.SLOWNESS.getEffectType(), 225, 0);
            }
            potionEffect.addCustomEffect(newEffect, false);
        }
        else if(basePotion.getType() == PotionType.SPEED){
            if(basePotion.isExtended()){
                newEffect = new PotionEffect(PotionType.SPEED.getEffectType(), 1200, 0);
            }
            else if(basePotion.isUpgraded()){
                newEffect = new PotionEffect(PotionType.SPEED.getEffectType(), 225, 1);
            }
            else{
                newEffect = new PotionEffect(PotionType.SPEED.getEffectType(), 450, 0);
            }
            potionEffect.addCustomEffect(newEffect, false);
        }
        else if(basePotion.getType() == PotionType.STRENGTH){
            if(basePotion.isExtended()){
                newEffect = new PotionEffect(PotionType.STRENGTH.getEffectType(), 1200, 0);
            }
            else if(basePotion.isUpgraded()){
                newEffect = new PotionEffect(PotionType.STRENGTH.getEffectType(), 225, 1);
            }
            else{
                newEffect = new PotionEffect(PotionType.STRENGTH.getEffectType(), 450, 0);
            }
            potionEffect.addCustomEffect(newEffect, false);
        }
        else if(basePotion.getType() == PotionType.TURTLE_MASTER){
            PotionEffect newEffect2;
            if(basePotion.isExtended()){
                newEffect = new PotionEffect(PotionType.SLOWNESS.getEffectType(), 100, 3);
                newEffect2 = new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 100, 2);
            }
            else if(basePotion.isUpgraded()){
                newEffect = new PotionEffect(PotionType.SLOWNESS.getEffectType(), 50, 5);
                newEffect2 = new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 50, 3);
            }
            else{
                newEffect = new PotionEffect(PotionType.SLOWNESS.getEffectType(), 50, 3);
                newEffect2 = new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 50, 2);
            }
            potionEffect.addCustomEffect(newEffect, false);
            potionEffect.addCustomEffect(newEffect2, false);
        }
        else if(basePotion.getType() == PotionType.WATER_BREATHING){
            if(basePotion.isExtended()){
                newEffect = new PotionEffect(PotionType.WATER_BREATHING.getEffectType(), 1200, 0);
            }
            else{
                newEffect = new PotionEffect(PotionType.WATER_BREATHING.getEffectType(), 450, 0);
            }
            potionEffect.addCustomEffect(newEffect, false);
        }
        else if(basePotion.getType() == PotionType.WEAKNESS){
            if(basePotion.isExtended()){
                newEffect = new PotionEffect(PotionType.WEAKNESS.getEffectType(), 600, 0);
            }
            else{
                newEffect = new PotionEffect(PotionType.WEAKNESS.getEffectType(), 225, 0);
            }
            potionEffect.addCustomEffect(newEffect, false);
        }
        else { //else just use the base potion and call it close enough (here for when they add new potions I guess...)
            potionEffect.setBasePotionData(basePotion);
        }

    }
}
