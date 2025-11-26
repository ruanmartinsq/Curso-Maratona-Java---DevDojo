package academy.ruan.maratonajava.javacore.Kenum.dominio;

import java.security.PrivilegedAction;

public class Cliente {
    private String nome;
    private String tipo;
    private TipoCliente tipoCliente;
    private TipoPagamento tipoPagamento;



    public Cliente(String nome, TipoCliente tipoCliente) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
    }

    public Cliente(String nome, TipoCliente tipoCliente, TipoPagamento tipoPagamento) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
        this.tipoPagamento = tipoPagamento;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", tipoCliente=" + tipoCliente +
                ", tipoClienteInt=" + tipoCliente.VALOR +
                ", tipoPagamento=" + tipoPagamento +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    //isso de baixo, é feio!
//    public Cliente(String nome, String tipo) {
//        if (!tipo.equals(PESSOA_FISICA) && !tipo.equals(PESSOA_JURIDICA)) {
//            return;
//        }
//        this.nome = nome;
//        this.tipo = tipo;
//    }

}
