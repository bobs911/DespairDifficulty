package despairdifficulty.despairdifficulty.listeners;

import despairdifficulty.despairdifficulty.DespairDifficulty;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedEnterEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class JoinMessage implements Listener {
    public JoinMessage(DespairDifficulty plugin) {
        plugin.getServer().getPluginManager().registerEvents(this, plugin);
    }

}
