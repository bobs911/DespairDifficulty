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
    @EventHandler
    public void BedExplodeOnEnter(PlayerJoinEvent e) {
        //Sets the Join Message and Scares Everyone
        e.setJoinMessage(ChatColor.RED + "Welcome To The DESPAIR DIFFICULTY by Herculuke, your goal is to beat the game without dieing twice! You can die once, but after that you are on your last life! If you beat this difficulty join my discord and send proof at this link: https://discord.gg/PEmsFX7Rt8");
    }
}
