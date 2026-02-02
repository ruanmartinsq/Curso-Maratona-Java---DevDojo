package academy.ruan.maratonajava.javacore.Rdatas.teste;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.util.Calendar;
import java.util.Date;

public class LocalDateTeste01 {
    public static void main(String[] args) {
        System.out.println(new Date());
        System.out.println(Calendar.getInstance());

        System.out.println(Month.JANUARY.getValue());

        LocalDate date = LocalDate.of(2022, Month.AUGUST, 29);
        LocalDate dateNow = LocalDate.now();

        System.out.println(date.getYear());
        System.out.println(date.getMonth());
        System.out.println(date.getDayOfMonth());
        System.out.println(date.getDayOfWeek());
        System.out.println(date.lengthOfMonth());
        System.out.println(date.isLeapYear()); //ano bissexto
        System.out.println(date.get(ChronoField.DAY_OF_MONTH));

        System.out.println(date.MAX);
        System.out.println(date.MIN);

        System.out.println(date);
        dateNow.plusYears(8); //imutavel
        //precisaria add o dateNow =
        System.out.println(dateNow);
    }
}
