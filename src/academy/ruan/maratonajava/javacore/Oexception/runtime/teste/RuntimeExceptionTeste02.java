package academy.ruan.maratonajava.javacore.Oexception.runtime.teste;

public class RuntimeExceptionTeste02 {
    public static void main(String[] args) {
        divisao(1,0);
        System.out.println("Código Finalizado");
    }

    private static int divisao (int a, int b) {
        //nao é comum declaração de trhows aqui quando é runtime (dps do int b)
        /**
         *
         * @param a
         * @param b nao pode ser 0
         * @return
         * @throws IllegalArgumentException caso b seja 0
         *
         */
        if (b == 0) {
            throw new IllegalArgumentException("Argumento ilegal, b nao pode ser 0");
        }

        //so executa a linha de baixo se o if for falso
        return a/b;
    }
}
