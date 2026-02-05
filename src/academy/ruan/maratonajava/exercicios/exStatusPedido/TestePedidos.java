package academy.ruan.maratonajava.exercicios.exStatusPedido;

import java.util.Scanner;

public class TestePedidos {
    public static void main(String[] args) {
        System.out.println("SEJA BEM VINDO A AMAZONIA, produtos de A-Z");
        Scanner scanner = new Scanner(System.in);
        String escolha;

        System.out.println("Informe o número do seu pedido, o seu nome e o valor total: ");
        int numPed = scanner.nextInt();
        scanner.nextLine();
        String nome = scanner.nextLine();
        double valorTot = scanner.nextDouble();
        Pedido pedido = new Pedido(numPed, nome, valorTot, StatusPedido.AGUARDANDO_PAGAMENTO);

        System.out.println(pedido);

        pedido.aguardandoPagamento();

        System.out.println("Deseja cancelar seu pedido? (s/n)");
        escolha = scanner.next();
        if (escolha.equalsIgnoreCase("s")) {
            pedido.cancelarPedio();
            return;
        }

        pedido.avancarPedido();

        System.out.println("Deseja cancelar seu pedido? (s/n)");
        escolha = scanner.next();
        if (escolha.equalsIgnoreCase("s")) {
            pedido.cancelarPedio();
            return;
        }

        pedido.avancarPedido();

        System.out.println("Deseja cancelar seu pedido? (s/n)");
        escolha = scanner.next();
        if (escolha.equalsIgnoreCase("s")) {
            pedido.cancelarPedio();
        }

        pedido.avancarPedido();

        pedido.avancarPedido();
    }



}
