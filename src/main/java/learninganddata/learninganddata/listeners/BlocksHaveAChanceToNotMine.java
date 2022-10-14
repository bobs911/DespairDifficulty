package learninganddata.learninganddata.listeners;

import org.bukkit.ChatColor;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerHarvestBlockEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Random;
import java.util.random.RandomGenerator;

public class BlocksHaveAChanceToNotMine extends JavaPlugin implements Listener {
    public void BedExplodeOnEnter(PlayerHarvestBlockEvent e) {
        //Makes Blocks Occasionally Say No

        int maxcount = getConfig().getInt("BlockCount");
        int livecount = getConfig().getInt("LiveCount");


        if (livecount != 15) {

            getConfig().set("LiveCount", livecount + 1);

        } else {
            e.setCancelled(true);
            getServer().broadcastMessage(ChatColor.RED + "NO");
        }




    }
}