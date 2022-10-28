package despairdifficulty.despairdifficulty.api;

import despairdifficulty.despairdifficulty.DespairDifficulty;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;

import static org.bukkit.plugin.java.JavaPlugin.getPlugin;

public class Api {
    public static DespairDifficulty getMainPlugin() {
        return getPlugin(DespairDifficulty.class);
    }

    public static File getConfigFile(String fileName) {
        return new File(getMainPlugin().getDataFolder(), fileName + ".yml");
    }

    public static FileConfiguration getFileConfiguration(String fileName){
        return YamlConfiguration.loadConfiguration(getConfigFile(fileName));
    }

    public static FileConfiguration loadConfig(String fileName) {
        return YamlConfiguration.loadConfiguration(getConfigFile(fileName));
    }
}
