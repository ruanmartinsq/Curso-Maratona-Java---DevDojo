package academy.ruan.maratonajava.javacore.Oexception.error.teste;

public class StackOverflowTeste01 {
    public static void main(String[] args) {
        recursividade();
    }

    public static void recursividade() {
        recursividade();
    }

    //estourou a memoria de stack
    //erro acontece na JVM que provavel vc nao recupera o tempo de execução
}
