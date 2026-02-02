package academy.ruan.maratonajava.javacore.Sformatacao.teste;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;


public class DateTimeFormatterTeste01 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        String s1 = date.format(DateTimeFormatter.BASIC_ISO_DATE); //objeto para string
        String s2 = date.format(DateTimeFormatter.ISO_DATE);
        String s3 = date.format(DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        System.out.println(" ");

        LocalDate parse1 = LocalDate.parse("20260130", DateTimeFormatter.BASIC_ISO_DATE); //string para objeto
        LocalDate parse2 = LocalDate.parse("2026-01-30", DateTimeFormatter.ISO_DATE);
        LocalDate parse3 = LocalDate.parse("2026-01-30", DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(parse1);
        System.out.println(parse2);
        System.out.println(parse3);

        System.out.println(" ");

        LocalDateTime now = LocalDateTime.now();
        String s4 = now.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(s4);
        LocalDateTime parse4 = LocalDateTime.parse("2026-01-30T14:49:50.3661159", DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(parse4);

        System.out.println(" ");

        DateTimeFormatter formatterBrasil = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formatBR = LocalDate.now().format(formatterBrasil);
        System.out.println(formatBR);
        LocalDate parseBR = LocalDate.parse("30/01/2026", formatterBrasil);
        System.out.println(parseBR);

        DateTimeFormatter formatterGR = DateTimeFormatter.ofPattern("dd.MMMM.yyyy", Locale.GERMAN);
        String formatGR = LocalDate.now().format(formatterGR);
        System.out.println(formatGR);
        LocalDate parseGR = LocalDate.parse("30.Januar.2026", formatterGR);
        System.out.println(parseGR);

    }
}
