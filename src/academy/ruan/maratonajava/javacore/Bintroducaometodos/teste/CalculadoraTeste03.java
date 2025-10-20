package academy.ruan.maratonajava.javacore.Bintroducaometodos.teste;

import academy.ruan.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTeste03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.divisaoDoisNumeros(5.0, 0);
        System.out.println(result);
        System.out.println(" ");

        calculadora.imprimeDoisNumeros(86, 5);
    }
}
