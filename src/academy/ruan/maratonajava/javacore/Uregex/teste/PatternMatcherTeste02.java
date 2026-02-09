package academy.ruan.maratonajava.javacore.Uregex.teste;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTeste02 {
    public static void main(String[] args) {
        // \d = Todos os dígitos
        // \D = Todos que NÃO forem dígitos
        // \s = Todos os espaços em branco \t \n \f \r (caracter que representam espaços em branco)
        // \S = Todos os caracteres excluindo os brancos
        // \w = a-ZA-Z, todos os dígitos, _, 0-9
        // \W = Tudo que nao for incluso no \w

        String regex = "\\W";
        String texto = "@hnhh2hjkdakk34 23_";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        System.out.println("texto:  " + texto);
        System.out.println("indice: 0123456789");
        System.out.println("regex " + regex);
        System.out.println("Posições encontradas");
        while (matcher.find()) {
            System.out.print("| " +matcher.start() + " --> " +matcher.group() + " | " + "\n");
            
        }

    }
}
