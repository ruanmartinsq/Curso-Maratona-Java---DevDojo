package academy.ruan.maratonajava.javacore.Sformatacao.teste;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTeste02 {
    public static void main(String[] args) {
        Locale localePt = new Locale("pt","PT");
        Locale localeJp = Locale.JAPAN;
        NumberFormat[] nfa = new NumberFormat[4];

        nfa[0] = NumberFormat.getCurrencyInstance(Locale.US);
        nfa[1] = NumberFormat.getCurrencyInstance(localePt);
        nfa[2] = NumberFormat.getCurrencyInstance(localeJp);
        nfa[3] = NumberFormat.getCurrencyInstance(Locale.ITALY);

        double valor = 1_000.2345;

        for (NumberFormat numberFormat : nfa) {
            System.out.print(numberFormat.getMaximumFractionDigits() + " - ");
            System.out.println(numberFormat.format(valor));
        }

        String valorString = "$1,000.23";

        try {
            System.out.println(nfa[0].parse(valorString));
        } catch (ParseException e) {
            e.printStackTrace();
        }



    }
}
