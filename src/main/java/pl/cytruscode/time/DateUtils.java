package pl.cytruscode.time;


import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class DateUtils {
    public static Long currentEpoch(){return System.currentTimeMillis();}
    public static LocalDateTime now(){
        return LocalDateTime.now();
    }
    public static boolean isAfter(LocalDateTime baseDateTime, LocalDateTime checkedDateTime){
        return checkedDateTime.isAfter(baseDateTime);
    }
    public static String parseDateTime(LocalDateTime dateTime) {
        LocalDateTime nowTime = LocalDateTime.now();

        long totalSeconds = ChronoUnit.SECONDS.between(nowTime, dateTime);
        int days    = (int) (totalSeconds / 86400);
        int hours   = (int) (totalSeconds % 86400 / 3600);
        int minutes = (int) (totalSeconds % 3600 / 60);
        int seconds = (int) (totalSeconds % 60);

        StringBuilder response = new StringBuilder();

        if (days > 0) response.append(days).append(" ").append(decline(days, "dzień", "dni", "dni")).append(" ");
        if (hours > 0) response.append(hours).append(" godz ");
        if (minutes > 0) response.append(minutes).append(" min ");
        if (seconds > 0) response.append(seconds).append(" sek");

        return response.length() == 0 ? "0 sek" : response.toString().trim();
    }

    private static String decline(int n, String f1, String f2, String f5) {
        int abs = Math.abs(n);
        if (abs == 1) return f1;
        if (abs % 100 >= 11 && abs % 100 <= 19) return f5;
        int mod = abs % 10;
        if (mod >= 2 && mod <= 4) return f2;
        return f5;
    }



}
