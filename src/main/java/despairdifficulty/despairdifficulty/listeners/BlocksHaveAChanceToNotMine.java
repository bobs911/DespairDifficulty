package despairdifficulty.despairdifficulty.listeners;

import despairdifficulty.despairdifficulty.DespairDifficulty;
import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerHarvestBlockEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class BlocksHaveAChanceToNotMine implements Listener {
    public BlocksHaveAChanceToNotMine(DespairDifficulty plugin) {
        plugin.getServer().getPluginManager().registerEvents(this, plugin);
    }
    @EventHandler
    public void BedExplodeOnEnter(PlayerHarvestBlockEvent e) {
        //Makes Blocks Occasionally Say No (Defaulted to after 15 blocks are broken and can be changed in config)





    }
}