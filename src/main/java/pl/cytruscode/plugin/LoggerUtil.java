package pl.cytruscode.plugin;


import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Level;
import java.util.logging.LogRecord;

public class LoggerUtil {
    private final JavaPlugin plugin;

    public LoggerUtil(JavaPlugin plugin) {
        this.plugin = plugin;
    }

    public void sendInfoLog(String msg){plugin.getLogger().log(new LogRecord(Level.OFF, ChatColor.GREEN + "[INFO] " + ChatColor.WHITE + msg));}
    public void sendWarnLog(String msg){plugin.getLogger().log(new LogRecord(Level.OFF, ChatColor.YELLOW + "[WARN] " + ChatColor.WHITE + msg));}
    public void sendErrorLog(String msg){plugin.getLogger().log(new LogRecord(Level.OFF, ChatColor.RED+ "[ERROR] " + ChatColor.WHITE + msg));}
}
