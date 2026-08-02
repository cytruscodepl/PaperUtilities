package pl.cytruscode.player;

import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import java.util.List;

public class ChatUtils {
    public static void announce(Component annoucement){
        for (Player p : Bukkit.getOnlinePlayers()){
            p.sendMessage(annoucement);
        }
    }
}
