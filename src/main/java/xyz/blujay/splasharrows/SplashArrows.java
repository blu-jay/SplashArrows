package xyz.blujay.splasharrows;

import org.bukkit.plugin.java.JavaPlugin;
import xyz.blujay.splasharrows.commands.SplashArrowsCommand;

public final class SplashArrows extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getCommand("SplashArrows").setExecutor(new SplashArrowsCommand());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
