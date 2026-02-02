package academy.ruan.maratonajava.javacore.Sformatacao.teste;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTeste01 {
    public static void main(String[] args) {
        Locale localeBr = new Locale("pt","BR");
        Locale localeJp = Locale.JAPAN;
        NumberFormat[] nfa = new NumberFormat[4];

        nfa[0] = NumberFormat.getInstance();
        nfa[1] = NumberFormat.getInstance(localeBr);
        nfa[2] = NumberFormat.getInstance(localeJp);
        nfa[3] = NumberFormat.getInstance(Locale.ITALIAN);

        double valor = 10_000_000.2345;

        for (NumberFormat numberFormat : nfa) {
            numberFormat.setMaximumFractionDigits(2);
            System.out.println(numberFormat.format(valor));
        }

        String valorString = "1000.2345";

        try {
            System.out.println(nfa[0].parse(valorString));
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
