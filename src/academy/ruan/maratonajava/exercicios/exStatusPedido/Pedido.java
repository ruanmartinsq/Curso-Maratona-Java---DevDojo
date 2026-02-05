package academy.ruan.maratonajava.exercicios.exStatusPedido;

public class Pedido {
    public int numPedido;
    public String nomeCliente;
    public double valorTotal;
    public StatusPedido statusPedido;

    public Pedido(int numPedido, String nomeCliente, double valorTotal, StatusPedido statusPedido) {
        this.numPedido = numPedido;
        this.nomeCliente = nomeCliente;
        this.valorTotal = valorTotal;
        this.statusPedido = statusPedido;
    }

    public void aguardandoPagamento () {
        System.out.println("Pedido criado");
        System.out.println("Estamos " + statusPedido.getDescricao() + "! Assim que possível, podemos avançar para proxima etapa.");
    }

    public void avancarPedido () {
        if (statusPedido == StatusPedido.AGUARDANDO_PAGAMENTO) {
            System.out.println("O pagamento foi realizado com sucesso! :)");
            statusPedido = StatusPedido.PAGO;
        } else if (statusPedido == StatusPedido.PAGO) {
            System.out.println("O seu produto foi enviado! :)");
            statusPedido = StatusPedido.ENVIADO;
        } else if (statusPedido == StatusPedido.ENVIADO) {
            System.out.println("O seu produto foi entegue! :)");
            statusPedido = StatusPedido.ENTREGUE;
        } else if (statusPedido == StatusPedido.ENTREGUE) {
            System.out.println("Produto ja entregue. ");
            return;
        }

    }

    public void cancelarPedio () {
        if (statusPedido == StatusPedido.ENVIADO || statusPedido == StatusPedido.ENTREGUE) {
            System.out.println("Agora nao é possível cancelar.");
        } else {
            System.out.println("Produto cancelado com sucesso, seu dinheiro será estornado em 7 dias!");
            statusPedido = StatusPedido.CANCELADO;
        }
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "numPedido=" + numPedido +
                ", nomeCliente='" + nomeCliente + '\'' +
                ", valorTotal=" + valorTotal +
                ", statusPedido=" + statusPedido +
                '}';
    }
}
