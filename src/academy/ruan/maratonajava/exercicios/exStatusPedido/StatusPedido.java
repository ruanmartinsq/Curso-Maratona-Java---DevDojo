package academy.ruan.maratonajava.exercicios.exStatusPedido;

public enum StatusPedido {
    AGUARDANDO_PAGAMENTO(1, "Aguardando pagamento"),
    PAGO(2, "Pago"),
    ENVIADO(3, "Enviado"),
    ENTREGUE(4, "Entegue"),
    CANCELADO(5, "Cancelado");

    private int codigo;
    private String descricao;

    StatusPedido(int codigo, String descricao) {
        this.descricao = descricao;
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
