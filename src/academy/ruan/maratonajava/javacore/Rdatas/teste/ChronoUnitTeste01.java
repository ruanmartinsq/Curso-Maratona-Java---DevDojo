package academy.ruan.maratonajava.javacore.Rdatas.teste;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTeste01 {
    public static void main(String[] args) {
        LocalDateTime aniversario = LocalDateTime.of(2006, Month.AUGUST, 29, 12, 12, 00);
        LocalDateTime now = LocalDateTime.now();

        System.out.println("DIAS: " + ChronoUnit.DAYS.between(aniversario, now));
        System.out.println("SEMANAS: " + ChronoUnit.WEEKS.between(aniversario, now));
        System.out.println("ANOS: " + ChronoUnit.YEARS.between(aniversario, now));
        System.out.println("HORAS: " + ChronoUnit.HOURS.between(aniversario, now));

        //DURATION = HORA
        //PERIOD = DATAS
        //INSTANT = NANOSEGUNDOS USADOS PELO COMPUTDOR
        //LOCAL DATE = DATAS PARA NOS HUMANOS
        //LOCAL DATE TIME = DATA E HORA
        //LOCAL TIME = HORA

    }
}
