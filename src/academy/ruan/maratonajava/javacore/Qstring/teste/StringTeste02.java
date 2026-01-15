package academy.ruan.maratonajava.javacore.Qstring.teste;

import java.util.Locale;

public class StringTeste02 {
    public static void main(String[] args) {
        String nome = "Fred";
        String nome2 = "                                                  Clara natalia                                     ";
        String numeros = "012345";

        System.out.println(nome.charAt(0));
        System.out.println(nome.length());
        System.out.println(nome.replace("r", "l"));
        System.out.println(nome.toLowerCase());
        System.out.println(nome.toUpperCase());
        System.out.println(numeros.substring(0, 2)); //o da frente vc sempre diminui 1 (vai imprimir 01)
        System.out.println(numeros.substring(0, numeros.length()));
        System.out.println(numeros.substring(0));
        System.out.println(nome2);
        System.out.println(nome2.trim());
    }
}
