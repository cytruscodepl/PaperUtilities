package pl.cytruscode.world;

import org.bukkit.World;

public class WeatherUtils {
    public static void weatherClear(World world){
        world.setStorm(false);
        world.setThundering(false);
    }
    public static void weatherRain(World world){
        world.setStorm(true);
        world.setThundering(false);
    }
    public static void weatherThunder(World world){
        world.setStorm(true);
        world.setThundering(true);
    }
}
