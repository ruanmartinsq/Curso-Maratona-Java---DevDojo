package academy.ruan.maratonajava.javacore.Gassociacao.teste;

import java.util.Scanner;

public class LeituraDoTecladoTeste01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe seu nome abaixo: \n");
        String nome = scanner.nextLine();

        System.out.println("Informe sua idade abaixo: \n");
        int idade = scanner.nextInt();

        System.out.println("Digite M - para masculino e F - para feminino: \n");
        char sexo = scanner.next().charAt(0);



        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Sexo: " + sexo);


    }
}
