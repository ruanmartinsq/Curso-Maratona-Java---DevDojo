package academy.ruan.maratonajava.javacore.Uregex.teste;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTeste05 {
    public static void main(String[] args) {
        // \d = Todos os dígitos
        // \D = Todos que NÃO forem dígitos
        // \s = Todos os espaços em branco \t \n \f \r (caracter que representam espaços em branco)
        // \S = Todos os caracteres excluindo os brancos
        // \w = a-ZA-Z, todos os dígitos, _, 0-9
        // \W = Tudo que nao for incluso no \w
        // [] = Range de caracteres
        // ? = Zero ou uma
        // * = Zero ou mais
        // + = uma ou mais
        // {n,m} = de n ate m
        // () = caractere de agrupamento
        // | = o(v/c)o -> ovo | oco
        // $ = fim da linha
        // . = 1.3 acha 123, 133, 1@3, 1a3 (caracter coringa)

        String regex = "([A-Za-z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";
        // ( ) - “capture um caractere que esteja dentro dessa classe - transforma isso em um grupo
        // [ ] - “aceite um caractere que seja letra, número, ponto, underline ou hífen” - define o conjunto permitido

        String texto = "ruan@hotmail.com, 123cintia@gmail.com, #@!zoro@mail.br, teste@gmail.com.br, lukaku@mail";
        System.out.println("EMAIL VÁLIDO: ");
        System.out.println("zoro@mail.br".matches(regex));
        System.out.println(Arrays.toString(texto.split(",")));
        System.out.println(texto.split(",")[1].trim());

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        System.out.println("texto:  " + texto);
        System.out.println("indice: 0123456789");
        System.out.println("regex " + regex);
        System.out.println("Posições encontradas");
        while (matcher.find()) {
            System.out.print("| " + matcher.start() + " --> " + matcher.group() + " | " + "\n");

        }
    }
}
