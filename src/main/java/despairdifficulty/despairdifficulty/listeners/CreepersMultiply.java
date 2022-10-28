package despairdifficulty.despairdifficulty.listeners;

import despairdifficulty.despairdifficulty.DespairDifficulty;
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
import static org.bukkit.Bukkit.getWorld;

public class CreepersMultiply implements Listener {
    public CreepersMultiply(DespairDifficulty plugin) {
        plugin.getServer().getPluginManager().registerEvents(this, plugin);
    }

    @EventHandler
    public void ProjectilesLand(ExplosionPrimeEvent e){
        DespairDifficulty.log.info("CreepersMultiply");
        //When a creeper explodes it will summon 6 more creepers around it (this could likely be abused, but is funny for new players)
        EntityType creepertest = e.getEntity().getType();
        if (creepertest == EntityType.CREEPER) {
            Location htblkloc = e.getEntity().getLocation();
            int summonx = htblkloc.getBlockX() + 3;
            int summony = htblkloc.getBlockY() + 4;
            int summonz = htblkloc.getBlockZ() + 3;
            Location duplicateCreeperLocation = new Location(e.getEntity().getWorld(), summonx, summony,summonz);
            DespairDifficulty.log.info("BlocksHaveAChanceToNotMine");
            int amountOfCreepersToSpawn = 6;
            for (int i = 0; i < amountOfCreepersToSpawn; i++){
               e.getEntity().getWorld().spawnEntity(duplicateCreeperLocation, EntityType.CREEPER);
            }
            getServer().broadcastMessage(ChatColor.GOLD + "Creepers Are Gonna Be A Problem!");
        }

    }
}
