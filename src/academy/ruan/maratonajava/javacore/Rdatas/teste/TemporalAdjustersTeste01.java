package academy.ruan.maratonajava.javacore.Rdatas.teste;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjustersTeste01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate now2 = LocalDate.now();

        now = now.withDayOfMonth(23);
        now = now.with(ChronoField.MONTH_OF_YEAR, 8);
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        //now2 = LocalDate.now().with(TemporalAdjusters.next(DayOfWeek.WEDNESDAY)); prox quarta
        //now2 = LocalDate.now().with(TemporalAdjusters.previous(DayOfWeek.WEDNESDAY)); ultima quart
        //now2 = LocalDate.now().with(TemporalAdjusters.firstDayOfMonth());
        //now2 = LocalDate.now().with(TemporalAdjusters.lastDayOfMonth());
        now2 = LocalDate.now().with(TemporalAdjusters.firstDayOfNextYear());
        System.out.println(now2);
        System.out.println(now2.getDayOfWeek());
    }
}
