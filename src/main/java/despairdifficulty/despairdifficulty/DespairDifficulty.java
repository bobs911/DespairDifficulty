package despairdifficulty.despairdifficulty;

import despairdifficulty.despairdifficulty.listeners.*;
import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public final class DespairDifficulty extends JavaPlugin implements Listener {

    public static Logger log = Bukkit.getServer().getLogger();
    @Override
    public void onEnable() {
        //Plugin Launch Message sends and Event Listeners Are Registered
        System.out.println("The DESPAIR DIFFICULTY by Herculuke plugin has launched!");
        getConfig().options().copyDefaults();
        saveDefaultConfig();
        int counter = 1;
        getServer().getPluginManager().registerEvents(new ExplosiveDuplication(), this);
        log.info("Explosive Duping is On");
        getServer().getPluginManager().registerEvents(new CreepersMultiply(), this);
        log.info("Creepers Multiply");
        getServer().getPluginManager().registerEvents(new AllBedsExplode(), this);
        log.info("All Beds Explode");
        getServer().getPluginManager().registerEvents(new JoinMessage(), this);
        log.info("Join Message Set");
        getServer().getPluginManager().registerEvents(new BlocksHaveAChanceToNotMine(), this);
        log.info("Blocks Not Mining Is On");
    }


    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
