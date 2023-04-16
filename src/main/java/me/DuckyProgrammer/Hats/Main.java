package me.DuckyProgrammer.Hats;

import org.bstats.bukkit.Metrics;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        int pluginId = 18223; // <-- Replace with the id of your plugin!
        Metrics metrics = new Metrics(this, pluginId);
    }
}
