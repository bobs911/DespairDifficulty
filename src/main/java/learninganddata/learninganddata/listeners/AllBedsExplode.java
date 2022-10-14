package learninganddata.learninganddata.listeners;

import com.sun.jdi.CharType;
import net.md_5.bungee.api.ChatMessageType;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedEnterEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class AllBedsExplode extends JavaPlugin implements Listener {
    public void BedExplodeOnEnter(PlayerBedEnterEvent e) {
        //Beds Explode When You Enter Them

        Player p = e.getPlayer();
        double explodex = p.getLocation().getX();
        double explodey = p.getLocation().getY();
        double explodez = p.getLocation().getZ();

        getServer().dispatchCommand(Bukkit.getConsoleSender(), "summon tnt " + explodex + " " + explodey + " " + explodez);
        getServer().broadcastMessage(ChatColor.RED + "NO");

    }
}
