package academy.ruan.maratonajava.javacore.Rdatas.teste;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimeTeste01 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        //LocalDate date = LocalDate.of(2022, Month.AUGUST, 6);
        LocalDate date = LocalDate.parse("2022-01-19");
        //LocalTime time = LocalTime.of(9, 45, 21);
        LocalTime time = LocalTime.parse("09:45:00");

        System.out.println(localDateTime);
        System.out.println(date);
        System.out.println(time);
        //basicamente é uma junção da LocalTime e LocalDate
        System.out.println(localDateTime.getHour());
        System.out.println(localDateTime.getMonth());
        LocalDateTime ldt1 = date.atTime(time);
        LocalDateTime ldt2 = time.atDate(date);
        System.out.println(ldt1);
        System.out.println(ldt2);

    }
}
