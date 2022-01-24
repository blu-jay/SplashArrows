package xyz.blujay.splasharrows.events;

import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ProjectileHitEvent;
import org.bukkit.potion.PotionData;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionType;
import xyz.blujay.splasharrows.SplashArrows;
import xyz.blujay.splasharrows.utilities.PotionConverter;

public class ArrowHitEvent implements Listener {

    @EventHandler
    public void onArrowHit(ProjectileHitEvent e){
        if(e.getEntity() instanceof Arrow arrow){

            if(arrow.getShooter() instanceof Player p){
                if(!p.hasPermission("splasharrows.use")){
                    return;
                }
            }
            if ((e.getHitBlock() != null) && (arrow.getBasePotionData().getType() != PotionType.UNCRAFTABLE || arrow.hasCustomEffects())) {
                arrow.setPickupStatus(AbstractArrow.PickupStatus.CREATIVE_ONLY);

                AreaEffectCloud potionEffect = (AreaEffectCloud) arrow.getWorld().spawnEntity(arrow.getLocation(), EntityType.AREA_EFFECT_CLOUD);
                potionEffect.setSource(arrow.getShooter());
                potionEffect.setColor(arrow.getColor());
                potionEffect.setDuration(75);

                if(arrow.hasCustomEffects()){
                    for (var effect: arrow.getCustomEffects()) {
                        //Create new effect with half the duration and add to effect cloud.
                        var newEffect = new PotionEffect(effect.getType(), (effect.getDuration() / 4 / 2), effect.getAmplifier(), effect.isAmbient(), effect.hasParticles(), effect.hasIcon());
                        potionEffect.addCustomEffect(newEffect, false);

                        arrow.removeCustomEffect(effect.getType());
                    } ;
                }
                PotionConverter.ConvertPotionData(arrow.getBasePotionData(), potionEffect);
                arrow.setBasePotionData(new PotionData(PotionType.UNCRAFTABLE));
            }
        }
    }
}
