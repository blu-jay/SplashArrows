package xyz.blujay.splasharrows;

import net.kyori.adventure.platform.bukkit.BukkitAudiences;
import org.bukkit.plugin.java.JavaPlugin;
import org.checkerframework.checker.nullness.qual.NonNull;
import xyz.blujay.splasharrows.commands.SplashArrowsCommand;
import xyz.blujay.splasharrows.events.ArrowHitEvent;

public final class SplashArrows extends JavaPlugin {

    private static SplashArrows plugin;

    private BukkitAudiences adventure;

    public @NonNull
    BukkitAudiences adventure() {
        if(this.adventure == null) {
            throw new IllegalStateException("Tried to access Adventure when the plugin was disabled!");
        }
        return this.adventure;
    }

    @Override
    public void onEnable() {
        plugin = this;

        this.adventure = BukkitAudiences.create(this);

        getCommand("SplashArrows").setExecutor(new SplashArrowsCommand());
        this.getLogger().info("SplashArrows has started!");
        getServer().getPluginManager().registerEvents(new ArrowHitEvent(), this);

    }

    @Override
    public void onDisable() {
        if(this.adventure != null) {
            this.adventure.close();
            this.adventure = null;
        }
    }

    public static SplashArrows getPlugin() {
        return plugin;
    }
}
