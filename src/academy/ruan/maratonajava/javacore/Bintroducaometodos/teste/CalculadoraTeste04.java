package academy.ruan.maratonajava.javacore.Bintroducaometodos.teste;

import academy.ruan.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTeste04 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int numero01 = 1;
        int numero02 = 2;
        calculadora.alteraDoisNumeros(numero01, numero02);

        System.out.println(" ");

        System.out.println("Dentro CalculadoraTeste04");
        System.out.println("numero01: " + numero01);
        System.out.println("numero02: " + numero02);
    }
}
