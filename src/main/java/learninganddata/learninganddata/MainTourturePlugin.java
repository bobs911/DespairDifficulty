package learninganddata.learninganddata;

import learninganddata.learninganddata.listeners.*;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class MainTourturePlugin extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getConfig().options().copyDefaults();
        saveDefaultConfig();
        int counter = 1;
        System.out.println("The DESPAIR DIFFICULTY by Herculuke plugin has launched!");
        getServer().getPluginManager().registerEvents(new ExplosiveDuplication(), this);
        getServer().getPluginManager().registerEvents(new CreepersMultiply(), this);
        getServer().getPluginManager().registerEvents(new AllBedsExplode(), this);
        getServer().getPluginManager().registerEvents(new JoinMessage(), this);
        getServer().getPluginManager().registerEvents(new BlocksHaveAChanceToNotMine(), this);
    }


    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
