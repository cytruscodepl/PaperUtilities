package pl.cytruscode.plugin;

import lombok.SneakyThrows;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;

public class VersionUtil {
    private final String versionUrl;
    private final JavaPlugin plugin;

    public VersionUtil(String versionUrl, JavaPlugin plugin) {
        this.versionUrl = versionUrl;
        this.plugin = plugin;
    }
    @SneakyThrows
    private String request(){
        URL url = URI.create(versionUrl).toURL();
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");
        BufferedReader rd = new BufferedReader(new InputStreamReader(
                con.getInputStream()));
        StringBuffer sb = new StringBuffer();
        String line;
        while ((line = rd.readLine()) != null) {
            sb.append(line);
        }
        rd.close();
        String result = sb.toString();
        return result;
    }

    public boolean isLatest(){
        String result = request();
        return result == plugin.getDescription().getVersion();
    }
    public String getLatest(){
        return request();
    }
}
