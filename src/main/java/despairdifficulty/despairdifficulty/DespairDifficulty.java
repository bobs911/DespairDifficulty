package despairdifficulty.despairdifficulty;

import despairdifficulty.despairdifficulty.listeners.*;
import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public final class DespairDifficulty extends JavaPlugin implements Listener {

    public static Logger log;
    private PluginManager pm = getServer().getPluginManager();

    @Override
    public void onEnable() {
        log = getLogger();
        pm.registerEvents(this, this);
        //Plugin Launch Message sends and Event Listeners Are Registered
        log.info("The DESPAIR DIFFICULTY by Herculuke plugin has launched!");
        getConfig().options().copyDefaults();
        saveDefaultConfig();

        new ExplosiveDuplication(this);
        log.info("Explosive Duping is On");

        new CreepersMultiply(this);
        log.info("Creepers Multiply");

        new AllBedsExplode(this);
        log.info("All Beds Explode");

        new JoinMessage(this);
        log.info("Join Message Set");

        new BlocksHaveAChanceToNotMine(this);
        log.info("Blocks Not Mining Is On");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        log.info("The DESPAIR DIFFICULTY by Herculuke plugin has been disabled.");
    }
}
