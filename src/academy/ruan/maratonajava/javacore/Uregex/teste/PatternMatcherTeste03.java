package academy.ruan.maratonajava.javacore.Uregex.teste;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTeste03 {
    public static void main(String[] args) {
        // \d = Todos os dígitos
        // \D = Todos que NÃO forem dígitos
        // \s = Todos os espaços em branco \t \n \f \r (caracter que representam espaços em branco)
        // \S = Todos os caracteres excluindo os brancos
        // \w = a-ZA-Z, todos os dígitos, _, 0-9
        // \W = Tudo que nao for incluso no \w
        // [] = Range de caracteres

        String regex = "[a-cA-C]"; //procure ou por a, por b ou c. "a-c" -> a até c
        String texto = "cafeBABE";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        System.out.println("texto:  " + texto);
        System.out.println("indice: 0123456789");
        System.out.println("regex " + regex);
        System.out.println("Posições encontradas");
        while (matcher.find()) {
            System.out.print("| " +matcher.start() + " --> " +matcher.group() + " | " + "\n");
            
        }

        System.out.println(" ");
        int numeroHex = 0x59F86A; //0x ou 0X para hexadecimal
        System.out.println(numeroHex);
        System.out.println(" ");

        String regex2 = "0[xX][0-9a-fA-F]";
        String texto2 = "12 0x 0X 0xFFABC 0x109 0x1";
        Pattern pattern2 = Pattern.compile(regex2);
        Matcher matcher2 = pattern2.matcher(texto2);

        System.out.println("texto:  " + texto2);
        System.out.println("indice: 0123456789");
        System.out.println("regex " + regex);
        System.out.println("Posições encontradas");
        while (matcher2.find()) {
            System.out.print("| " +matcher2.start() + " --> " +matcher2.group() + " | " + "\n");

        }
    }
}
