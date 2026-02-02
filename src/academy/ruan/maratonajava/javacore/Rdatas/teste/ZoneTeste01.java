package academy.ruan.maratonajava.javacore.Rdatas.teste;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.time.*;
import java.time.chrono.JapaneseDate;
import java.util.Map;

public class ZoneTeste01 {
    public static void main(String[] args) {
        Map<String, String> shortIds = ZoneId.SHORT_IDS;
        System.out.println(shortIds);
        System.out.println(ZoneId.systemDefault());
        ZoneId tokyoZone = ZoneId.of("Asia/Tokyo");
        ZoneId brasilZone = ZoneId.of("America/Sao_Paulo");
        System.out.println(tokyoZone);
        LocalDateTime now = LocalDateTime.now();

        //ZonedDateTime zonedDateTime = now.atZone(tokyoZone); (so passaria "zonedDateTime" no sout)

        System.out.println("Horario em TOKYO:" + now.atZone(tokyoZone));
        System.out.println("Horario no BRASIL:" + now);

        Instant nowInstant = Instant.now();

        System.out.println("");
        System.out.println(nowInstant); //zulu time (sem fuso)
        System.out.println("");

        ZonedDateTime zonedDateTime2 = nowInstant.atZone(tokyoZone);
        System.out.println(zonedDateTime2);
        System.out.println(nowInstant.atZone(brasilZone));

        System.out.println("");

        System.out.println(ZoneOffset.MIN); //utilizada para caso eu quero um hoario que nao tenha o fuso no java, ex: Manaus
        System.out.println(ZoneOffset.MAX);
        ZoneOffset offsetManaus = ZoneOffset.of("-04:00");
        OffsetDateTime offsetDateTime1 = now.atOffset(offsetManaus);
        System.out.println(offsetDateTime1); //"-04:00" -> offset; "[America/Sao_Paulo]" -> Zona

        OffsetDateTime offsetDateTime2 = OffsetDateTime.of(now, offsetManaus);
        System.out.println(offsetDateTime2);

        OffsetDateTime offsetDateTime3 = nowInstant.atOffset(offsetManaus);
        System.out.println(offsetDateTime3);

        System.out.println("");

        JapaneseDate japaneseDate = JapaneseDate.from(LocalDate.now());
        System.out.println(japaneseDate);
        LocalDate meijiEraLocalDate = LocalDate.of(1900, 2, 1);
        JapaneseDate meijiEra = JapaneseDate.from(meijiEraLocalDate);
        System.out.println(meijiEra);

    }
}
