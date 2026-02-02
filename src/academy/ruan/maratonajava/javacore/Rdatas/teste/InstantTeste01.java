package academy.ruan.maratonajava.javacore.Rdatas.teste;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;

public class InstantTeste01 {
    public static void main(String[] args) {
        Instant now = Instant.now();
        System.out.println(now); //z no final é o zulutime (horario neutro) - salvamos em formato UTC para nao ter problema (hora neutra)
        //trabalha com nano segundos
        System.out.println(LocalDateTime.now());

        System.out.println(now.getEpochSecond());
        System.out.println(now.getNano());
        System.out.println(Instant.ofEpochSecond(3));
        System.out.println(Instant.ofEpochSecond(3, 0));
        System.out.println(Instant.ofEpochSecond(3, 1_000_000));
        System.out.println(Instant.ofEpochSecond(3, -1_000_000));

//        Salvar datas no banco de dados
//        Evita problemas de fuso horário
//        Ideal para sistemas distribuídos
//        Trabalhar com APIs, microsserviços, eventos
//        Comunicação entre sistemas em países diferentes
//        Comparar tempo
    }
}
