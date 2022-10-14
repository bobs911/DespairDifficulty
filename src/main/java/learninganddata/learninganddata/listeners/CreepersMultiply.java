package learninganddata.learninganddata.listeners;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ExplosionPrimeEvent;
import org.bukkit.event.entity.ProjectileHitEvent;

import javax.swing.text.html.parser.Entity;
import java.util.Locale;

import static org.bukkit.Bukkit.getServer;

public class CreepersMultiply implements Listener {


    @EventHandler
    public void ProjectilesLand(ExplosionPrimeEvent e){
        EntityType creepertest = e.getEntity().getType();
        if (creepertest == EntityType.CREEPER) {
            Location htblkloc = e.getEntity().getLocation();
            int summonx = htblkloc.getBlockX();
            int summony = htblkloc.getBlockY();
            int summonz = htblkloc.getBlockZ();
            getServer().dispatchCommand(Bukkit.getConsoleSender(), "summon creeper" + summonx + " " + summony + " " + summonz);
            getServer().dispatchCommand(Bukkit.getConsoleSender(), "summon creeper" + summonx + " " + summony + " " + summonz);
            getServer().dispatchCommand(Bukkit.getConsoleSender(), "summon creeper" + summonx + " " + summony + " " + summonz);
        }

    }
}
