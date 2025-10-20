package academy.ruan.maratonajava.introducao;

public class Exercicio02Break {
    public static void main(String[] args) {
        double valorCarro = 30000;
        double valorParcela = 1000;

        for (int i = 1; i < valorCarro; i++) {
            if (valorCarro / i < valorParcela) {
                break;
            }
            System.out.println("O carro pode ser parcelado em: " + i +" vezes");
            System.out.println("Cada parcela ficará em: "+ valorCarro/i);
        }
    }
}
