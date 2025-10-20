package academy.ruan.maratonajava.javacore.Bintroducaometodos.dominio;

public class Calculadora {
    public void somaDoisNumeros() {
        // O void fala que nao retorna nada, ele possui saída, mas nao retorno.
        System.out.println(10 + 10);
    }

    public void subtraiDoisNumeros() {
        System.out.println(21 - 7);
    }

    public void multiplicaDoisNumeros(int numero01, int numero02) {
        System.out.println(numero01 * numero02);
    }

    public double divisaoDoisNumeros(double numero01, double numero02) {
        if (numero02 == 0) {
            return 0;
        }
        return numero01/numero02;
    }

    public void imprimeDoisNumeros(double numero01, double numero02) {
        if (numero02 == 0) {
            System.out.println("Nao existe divisão por 0. ");
            //o return lembra um "break"
            return;
        }
        System.out.println(numero01/numero02);
    }

    public void alteraDoisNumeros(int numero01, int numero02) {
        numero01 = 99;
        numero02 = 33;
        System.out.println("Dentro do alteraDoisNumeros");
        System.out.println("numero 01: " + numero01);
        System.out.println("numero 02: " + numero02);
    }

    public void somaArray (int[] numeros) {
        int soma = 0;
        for (int auxiliar : numeros) {
            soma += auxiliar;
        }
        System.out.println("A soma é igual a: "+soma);
    }

    public void somaVarArgs (int... numeros) {
        int soma = 0;
        for (int auxiliar : numeros) {
            soma += auxiliar;
        }
        System.out.println("A soma é igual a: "+soma);
    }
}
