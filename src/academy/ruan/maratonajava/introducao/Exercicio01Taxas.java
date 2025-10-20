package academy.ruan.maratonajava.introducao;
public class Exercicio01Taxas {
    public static void main(String[] args) {
        double salarioAnual = 70000;
        double imposto1 = 9.70/100;
        double imposto2 = 37.35/100;
        double imposto3 = 49.50/100;

        if (salarioAnual <= 34712) {
            salarioAnual *= imposto1;
        } else if (salarioAnual >= 34713 && salarioAnual <= 68507) {
            salarioAnual *= imposto2;
        } else {
            salarioAnual *= imposto3;
        }

        System.out.println(salarioAnual);

    }
}
