package academy.ruan.maratonajava.javacore.Sformatacao.teste;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTeste01 {
    public static void main(String[] args) {
        //pt-BR
        Locale localeItaly = new Locale("it", "IT");
        Locale localeCH = new Locale("it", "CH"); //suiça
        Locale localeIndia = new Locale("hi", "IN");
        Locale localeJapao = new Locale("ja", "JP");
        Locale localeHolanda = new Locale("nl", "NL");

        Calendar calendar = Calendar.getInstance();
        DateFormat dfIt = DateFormat.getDateInstance(DateFormat.FULL, localeItaly);
        DateFormat dfCh = DateFormat.getDateInstance(DateFormat.FULL, localeCH);
        DateFormat dfIn = DateFormat.getDateInstance(DateFormat.FULL, localeIndia);
        DateFormat dfJp = DateFormat.getDateInstance(DateFormat.FULL, localeJapao);
        DateFormat dfNl = DateFormat.getDateInstance(DateFormat.FULL, localeHolanda);

        System.out.println("ITÁLIA: " + dfIt.format(calendar.getTime()));
        System.out.println("SUIÇA: " + dfCh.format(calendar.getTime()));
        System.out.println("INDIA: " + dfIn.format(calendar.getTime()));
        System.out.println("JAPAO: " + dfJp.format(calendar.getTime()));
        System.out.println("HOLANDA: " + dfNl.format(calendar.getTime()));

        System.out.println(localeItaly.getDisplayCountry(localeHolanda));
        System.out.println(localeCH.getDisplayCountry(localeHolanda));
        System.out.println(localeHolanda.getDisplayLanguage(localeItaly));

    }
}
