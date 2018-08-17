package me.dahpr0gam3r.IdissyCore;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class IdissyCore extends JavaPlugin {
    public static void sendStart(Plugin plugin) {
        PluginDescriptionFile pdfFile = plugin.getDescription();
        Bukkit.getConsoleSender().sendMessage("");
        Bukkit.getConsoleSender().sendMessage((Object) ChatColor.GRAY + "=========> " + (Object)ChatColor.LIGHT_PURPLE + pdfFile.getName() + (Object)ChatColor.GRAY + " <=========");
        Bukkit.getConsoleSender().sendMessage((Object)ChatColor.LIGHT_PURPLE + pdfFile.getName());
        Bukkit.getConsoleSender().sendMessage((Object)ChatColor.YELLOW + "Made By " + (Object)ChatColor.RED + pdfFile.getAuthors().get(0));
        Bukkit.getConsoleSender().sendMessage((Object)ChatColor.YELLOW + "Version " + (Object)ChatColor.RED + pdfFile.getVersion());
        Bukkit.getConsoleSender().sendMessage("");
    }

    @Override
    public void onEnable() {
        sendStart(this);
    }
}
