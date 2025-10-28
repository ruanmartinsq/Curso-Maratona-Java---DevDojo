package academy.ruan.maratonajava.javacore.Gassociacao.teste;

import java.util.Scanner;

public class LeituraDoTecladoTeste02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("O grande software de previsao do futuro \n");
        System.out.println("Digite sua pergunta e eu responderei SIM ou NÃO! \n");
        String ask = sc.nextLine();

        if (ask.charAt(0) == ' ') {
            System.out.println("SIM");
        } else {
            System.out.println("NAO");
        }
    }
}
