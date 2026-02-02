package academy.ruan.maratonajava.javacore.Rdatas.teste;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalTimeTeste01 {
    public static void main(String[] args) {
        LocalTime time = LocalTime.of(22, 30, 54);
        LocalTime localTimeNow = LocalTime.now();

        System.out.println(time);
        System.out.println(localTimeNow);
        System.out.println("//////");
        System.out.println(localTimeNow.getHour());
        System.out.println(localTimeNow.getMinute());
        System.out.println(localTimeNow.getSecond());
        System.out.println(localTimeNow.get(ChronoField.HOUR_OF_DAY));
        System.out.println(localTimeNow.get(ChronoField.CLOCK_HOUR_OF_AMPM));

        System.out.println(LocalTime.MIN);
        System.out.println(LocalTime.MAX);
    }
}
