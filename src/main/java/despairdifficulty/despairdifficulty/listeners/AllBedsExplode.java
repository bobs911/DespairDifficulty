package despairdifficulty.despairdifficulty.listeners;

import com.sun.jdi.CharType;
import despairdifficulty.despairdifficulty.DespairDifficulty;
import net.md_5.bungee.api.ChatMessageType;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedEnterEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class AllBedsExplode implements Listener {
    public AllBedsExplode(DespairDifficulty plugin) {
        plugin.getServer().getPluginManager().registerEvents(this, plugin);
    }
    @EventHandler
    public void BedExplodeOnEnter(PlayerBedEnterEvent e) {
        //Beds Explode When You Enter Them in every dimension

        Player p = e.getPlayer();
        double explodex = p.getLocation().getX();
        double explodey = p.getLocation().getY();
        double explodez = p.getLocation().getZ();
        DespairDifficulty.log.info("AllBedsExplode");
        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "summon tnt " + explodex + " " + explodey + " " + explodez);
        Bukkit.getServer().broadcastMessage(ChatColor.RED + "NO");

    }
}
