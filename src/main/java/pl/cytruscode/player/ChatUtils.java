package pl.cytruscode.player;

import net.kyori.adventure.audience.Audience;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.title.Title;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import java.time.Duration;
import java.util.List;

public class ChatUtils {
    public static void announce(Component annoucement){
        for (Player p : Bukkit.getOnlinePlayers()){
            p.sendMessage(annoucement);
        }
    }
    public static void sendTitle(Player p, Component title, Component subtitle, int fadeIn, int stay, int fadeOut){
        Title.Times times = Title.Times.times(Duration.ofSeconds(fadeIn), Duration.ofSeconds(stay), Duration.ofSeconds(fadeOut));
        Title titleObject = Title.title(title, subtitle, times);

        p.showTitle(titleObject);
    }
}
