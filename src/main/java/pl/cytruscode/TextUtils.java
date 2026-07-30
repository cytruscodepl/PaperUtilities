package pl.cytruscode;

import net.md_5.bungee.api.ChatColor;
public class TextUtils {
    public static String colorize(String msg){
        return ChatColor.of(msg).toString();
    }
}
