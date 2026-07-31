package pl.cytruscode.time;


import java.time.LocalDateTime;

public class DateUtils {
    public static Long currentEpoch(){return System.currentTimeMillis();}
    public static LocalDateTime now(){
        return LocalDateTime.now();
    }

}
