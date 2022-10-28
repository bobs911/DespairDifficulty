package despairdifficulty.despairdifficulty.listeners;

import despairdifficulty.despairdifficulty.DespairDifficulty;
import despairdifficulty.despairdifficulty.api.Api;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerHarvestBlockEvent;

import java.io.IOException;

public class BlocksHaveAChanceToNotMine implements Listener {
    public BlocksHaveAChanceToNotMine(DespairDifficulty plugin) {
        plugin.getServer().getPluginManager().registerEvents(this, plugin);
    }
    @EventHandler
    public void BedExplodeOnEnter(PlayerHarvestBlockEvent e) throws IOException {
        //Makes Blocks Occasionally Say No (Defaulted to after 15 blocks are broken and can be changed in config)
        FileConfiguration configCfg = Api.getFileConfiguration("config");
        int maxcount = configCfg.getInt("BlockCount");
        int livecount = configCfg.getInt("LiveCount");

        DespairDifficulty.log.info("BlocksHaveAChanceToNotMine");
        if (livecount != 15) {
            configCfg.set("LiveCount", livecount + 1);
            configCfg.save(Api.getConfigFile("config"));
        } else {
            Bukkit.getServer().broadcastMessage(ChatColor.RED + "NO");
            e.setCancelled(true);
        }




    }
}