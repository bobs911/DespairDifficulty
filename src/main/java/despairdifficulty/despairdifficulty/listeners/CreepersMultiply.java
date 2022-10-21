package despairdifficulty.despairdifficulty.listeners;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
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
        //When a creeper explodes it will summon 6 more creepers around it (this could likely be abused, but is funny for new players)
        EntityType creepertest = e.getEntity().getType();
        if (creepertest == EntityType.CREEPER) {
            Location htblkloc = e.getEntity().getLocation();
            int summonx = htblkloc.getBlockX();
            int summony = htblkloc.getBlockY();
            int summonz = htblkloc.getBlockZ();
            getServer().dispatchCommand(Bukkit.getConsoleSender(), "summon creeper " + (summonx + 3) + " " + (summony + 4) + " " + summonz);
            getServer().dispatchCommand(Bukkit.getConsoleSender(), "summon creeper " + (summonx + 3) + " " + (summony + 4) + " " + (summonz + 3));
            getServer().dispatchCommand(Bukkit.getConsoleSender(), "summon creeper " + (summonx + 3) + " " + summony + " " + summonz);
            getServer().dispatchCommand(Bukkit.getConsoleSender(), "summon creeper " + (summonx + 3) + " " + (summony + 4) + " " + summonz);
            getServer().dispatchCommand(Bukkit.getConsoleSender(), "summon creeper " + (summonx + 3) + " " + (summony + 4) + " " + (summonz + 3));
            getServer().dispatchCommand(Bukkit.getConsoleSender(), "summon creeper " + (summonx + 3) + " " + summony + " " + summonz);
            getServer().broadcastMessage(ChatColor.GOLD + "Creepers Are Gonna Be A Problem!");
        }

    }
}
