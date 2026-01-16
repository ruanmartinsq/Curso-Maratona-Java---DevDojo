package academy.ruan.maratonajava.javacore.Rdatas.teste;

import java.util.Calendar;
import java.util.Date;

public class CalendarTeste01 {
    //tentaram "melhorar/corrigir" a classe date
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        //é uma classe abstrata

        if (calendar.getFirstDayOfWeek() == Calendar.SUNDAY) {
            System.out.println("Domingão é o primeiro dia da semana!!!!");
        }

        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println(calendar.get(Calendar.DAY_OF_YEAR) + "/365");
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH));

        calendar.add(Calendar.DAY_OF_MONTH, 0  );
        calendar.roll(Calendar.HOUR, 24); //c.roll aumenta as horas sem aumentar o dia
        //calendar.add(Calendar.YEAR, 51);
        Date date = calendar.getTime();
        System.out.println(date);
    }
}
