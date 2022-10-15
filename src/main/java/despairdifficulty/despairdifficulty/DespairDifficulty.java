package despairdifficulty.despairdifficulty;

import despairdifficulty.despairdifficulty.listeners.*;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class DespairDifficulty extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getConfig().options().copyDefaults();
        saveDefaultConfig();
        int counter = 1;
        System.out.println("The DESPAIR DIFFICULTY by Herculuke plugin has launched!");
        getServer().getPluginManager().registerEvents(new ExplosiveDuplication(), this);
        System.out.println("Explosive Duping is On");
        getServer().getPluginManager().registerEvents(new CreepersMultiply(), this);
        System.out.println("Creepers Multiply");
        getServer().getPluginManager().registerEvents(new AllBedsExplode(), this);
        System.out.println("All Beds Explode");
        getServer().getPluginManager().registerEvents(new JoinMessage(), this);
        System.out.println("Join Message Set");
        getServer().getPluginManager().registerEvents(new BlocksHaveAChanceToNotMine(), this);
        System.out.println("Blocks Not Mining Is On");
    }


    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
