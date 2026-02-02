package academy.ruan.maratonajava.javacore.Tresourcebundle.teste;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTeste01 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        ResourceBundle bundle = ResourceBundle.getBundle("messages", new Locale("pt", "BR"));
        boolean pladadaw = bundle.containsKey("pladadaw");
        System.out.println(pladadaw); //a chave nao existe no properties

        System.out.println(bundle.getString("oi"));
        System.out.println(bundle.getString("bom.dia"));

        ResourceBundle bundle2 = ResourceBundle.getBundle("messages", new Locale("en", "US"));

        System.out.println(bundle2.getString("oi"));
        System.out.println(bundle2.getString("bom.dia"));

        //Locale ("fr", "CA");
        //primeiro o java procura por um arquivo ex: messages_fr_CA.properties;
        //caso nao ache, ele procura um somente da lingua ex: messages_fr.properties;
        //caso nao ache tb, ele procura um arquivo na lingua original do pc (no caso meu, é pt_BR) ex: messages_pt_BR.properties
        //não achou? ele procura assim ex: messages_pt.properties
        //se nao achar dnv, ele procura o arquivo com nome base ex: messages.properties
        //isso é fallback (ele nao ta traduzindo, so pegando o valor e chaves)

        System.out.println(bundle.getString("hi"));
    }
}
