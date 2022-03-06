package plugin.Ozyris;

import org.bukkit.plugin.java.JavaPlugin;

public final class Plugin extends JavaPlugin {

    @Override
    public void onEnable() {

    getCommand("mp").setExecutor(new CommandeMp());
        
    }

    @Override
    public void onDisable() {

    }
}
