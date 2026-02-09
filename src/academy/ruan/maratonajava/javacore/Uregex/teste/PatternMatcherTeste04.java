package academy.ruan.maratonajava.javacore.Uregex.teste;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTeste04 {
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

        String regex2 = "0[xX]([0-9a-fA-F])+(\\s|$)"; //espaço em branco ou fim da linha
        //O operador + significa uma ou mais ocorrências
        //depois do 0x precisa vir pelo menos UM caractere hexadecimal válido e pode vir vários

        String texto2 = "12 0x 0X 0xFFABC 0x10G 0x1";
        Pattern pattern2 = Pattern.compile(regex2);
        Matcher matcher2 = pattern2.matcher(texto2);

        System.out.println("texto:  " + texto2);
        System.out.println("indice: 0123456789");
        System.out.println("regex " + regex2);
        System.out.println("Posições encontradas");
        while (matcher2.find()) {
            System.out.print("| " +matcher2.start() + " --> " +matcher2.group() + " | " + "\n");

        }
    }
}
