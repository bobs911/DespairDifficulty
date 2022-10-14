package learninganddata.learninganddata.listeners;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ProjectileHitEvent;

import java.util.Locale;

import static org.bukkit.Bukkit.getServer;

public class ExplosiveDuplication implements Listener {


    @EventHandler
    public void ProjectilesLand(ProjectileHitEvent e){
        Location htblkloc = e.getHitBlock().getLocation();
        int explodex = htblkloc.getBlockX();
        int explodey = htblkloc.getBlockY();
        int explodez = htblkloc.getBlockZ();
        getServer().dispatchCommand(Bukkit.getConsoleSender(), "summon " + e.getEntity().getName().toLowerCase(Locale.ROOT) + " " + explodex + " " + explodey + " " + explodez);
        getServer().dispatchCommand(Bukkit.getConsoleSender(), "summon " + e.getEntity().getName().toLowerCase(Locale.ROOT) + " " + explodex + " " + explodey + " " + explodez);
        getServer().dispatchCommand(Bukkit.getConsoleSender(), "summon " + e.getEntity().getName().toLowerCase(Locale.ROOT) + " " + explodex + " " + explodey + " " + explodez);
        getServer().dispatchCommand(Bukkit.getConsoleSender(), "summon tnt " + explodex + " " + explodey + " " + explodez);
        getServer().dispatchCommand(Bukkit.getConsoleSender(), "summon tnt " + explodex + " " + explodey + " " + explodez);
    }
}
