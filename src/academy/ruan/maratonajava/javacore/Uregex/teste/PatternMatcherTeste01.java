package academy.ruan.maratonajava.javacore.Uregex.teste;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTeste01 {
    public static void main(String[] args) {
        //usa simbolos e encontra padroes no texto
        //utilizado para validações. ex: email valido (sintaticamente correto)
        String regex = "ab";
        String texto = "abaaba";
        String texto2 = "abababa"; //nesse caso ele buscaria "aba", encontraria no 0 e 4. mas pq nao no 2? pq o mathcer/pattern ignora o que ja foi passado
        //ele ja encontrou o aba no 0, 1 e 2, aí ele verifica o 3. por isso o "aba" do 2 não aparece

        Pattern pattern = Pattern.compile(regex); //aqui eu copilo um "padrao"
        Matcher matcher = pattern.matcher(texto); //aqui eu "caso"

        System.out.println("texto:  " + texto);
        System.out.println("indice: 0123456789");
        System.out.println("regex " + regex);
        System.out.println("Posições encontradas");
        while (matcher.find()) {
            System.out.print(matcher.start() + " | ");

        }

    }
}
