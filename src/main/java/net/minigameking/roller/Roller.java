package net.minigameking.roller;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class Roller extends JavaPlugin {

    @Override
    public void onEnable() {
        this.getCommand("roll").setExecutor(new Commands());
        Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', "[&3Roller&r] &aRoller has been enabled successfully"));
        Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', "[&3Roller&r] &aVersion 1.0, Made by MeindoMC"));
    }
    @Override
    public void onDisable(){
        Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', "[&3Roller&r] &aRoller has been disabled successfully"));
    }
}
