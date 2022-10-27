package despairdifficulty.despairdifficulty.listeners;

import despairdifficulty.despairdifficulty.DespairDifficulty;
import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerHarvestBlockEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Random;
import java.util.random.RandomGenerator;

public class BlocksHaveAChanceToNotMine extends JavaPlugin implements Listener {
    public BlocksHaveAChanceToNotMine(DespairDifficulty plugin) {
        plugin.getServer().getPluginManager().registerEvents(this, plugin);
    }
    @EventHandler
    public void BedExplodeOnEnter(PlayerHarvestBlockEvent e) {
        //Makes Blocks Occasionally Say No (Defaulted to after 15 blocks are broken and can be changed in config)

        int maxcount = getConfig().getInt("BlockCount");
        int livecount = getConfig().getInt("LiveCount");

        DespairDifficulty.log.info("BlocksHaveAChanceToNotMine");
        if (livecount != 15) {
            getConfig().set("LiveCount", livecount + 1);
        } else {
            getServer().broadcastMessage(ChatColor.RED + "NO");
            e.setCancelled(true);
        }




    }
}