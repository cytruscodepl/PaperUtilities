package pl.cytruscode.time;

import java.time.Duration;
import java.time.LocalDateTime;

public class TimeUtils {
    public static Duration measureTimeDifference(LocalDateTime startTime, LocalDateTime stopTime){
        return Duration.between(startTime, stopTime);
    }
    public static long remaining(Long targetEpoch){
        return targetEpoch - System.currentTimeMillis();
    }
    public static LocalDateTime addDuration(LocalDateTime baseTime, Duration duration){
        return baseTime.plus(duration);
    }

}
