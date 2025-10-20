package academy.ruan.maratonajava.javacore.Bintroducaometodos.teste;

import academy.ruan.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTeste05 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int []vetNumeros = {1, 2, 3, 4, 5};
        calculadora.somaArray(vetNumeros);

        calculadora.somaVarArgs(1, 2, 3, 4, 5);
    }
}
