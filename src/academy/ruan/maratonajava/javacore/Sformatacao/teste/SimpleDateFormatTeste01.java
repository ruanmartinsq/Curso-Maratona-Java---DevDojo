package academy.ruan.maratonajava.javacore.Sformatacao.teste;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class SimpleDateFormatTeste01 {
    public static void main(String[] args) {
        String pattern = "dd.MMMM.yyyy G 'at' HH.mm.ss z"; //tudo que vc quer que seja "ignorado" utilize aspas simples (%%)
        SimpleDateFormat sdf = new SimpleDateFormat(pattern); //(##)
        System.out.println(sdf.format(new Date()));

        try {
            System.out.println(sdf.parse("16.janeiro.2026 d.C. at 11.14.21 BRT")); //o texto daqui de dentro tem que ser exatamente igual a saida desse (%%)
            //(de cima ele pega a string -> date (ao contrário da linha (##)
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
