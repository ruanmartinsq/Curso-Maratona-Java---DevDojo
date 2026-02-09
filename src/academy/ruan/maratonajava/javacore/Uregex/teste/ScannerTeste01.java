package academy.ruan.maratonajava.javacore.Uregex.teste;

public class ScannerTeste01 {
    public static void main(String[] args) {
        String texto = "Ruan, Pedro, Paulo, true, 200";
        String[] nomes = texto.split(",");

        for (String n : nomes) {
            System.out.print(n.trim() + " | ");
        }

    }
}
