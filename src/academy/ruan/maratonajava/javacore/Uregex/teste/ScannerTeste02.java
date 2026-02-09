package academy.ruan.maratonajava.javacore.Uregex.teste;

import java.util.Scanner;

public class ScannerTeste02 {
    public static void main(String[] args) {
        String texto = "Ruan,Pedro,Paulo,true,200";
        Scanner sc = new Scanner(texto);
        sc.useDelimiter(",");

        while (sc.hasNext()) {

            if (sc.hasNextInt()) {
                int a = sc.nextInt();
                System.out.println("Int: " + a);
            } else if (sc.hasNextBoolean()) {
                boolean b = sc.nextBoolean();
                System.out.println("Boolean: " + b);
            } else {
                System.out.println("Nome: " + sc.next());
            }
        }
    }
}
