package academy.ruan.maratonajava.javacore.Kenum.teste;

import academy.ruan.maratonajava.javacore.Kenum.dominio.Cliente;
import academy.ruan.maratonajava.javacore.Kenum.dominio.TipoCliente;
import academy.ruan.maratonajava.javacore.Kenum.dominio.TipoPagamento;

import java.sql.SQLOutput;

public class ClienteTeste01 {
    public static void main(String[] args) {
        Cliente cliente01 = new Cliente("Ruan", TipoCliente.PESSOA_FISICA, TipoPagamento.CREDITO);
        Cliente cliente02 = new Cliente("Clara", TipoCliente.PESSOA_JURIDICA, TipoPagamento.DEBITO);
        Cliente cliente03 = new Cliente("Monica", TipoCliente.PESSOA_JURIDICA, TipoPagamento.DEBITO);

        //Cliente cliente03 = new Cliente("Paulo", "pessoa Juridica");
        //Cliente cliente04 = new Cliente("Cintia", "pEssoa fisica");

        System.out.println(cliente01);
        System.out.println(cliente02);
        System.out.println(cliente03);
        //System.out.println(cliente04);

        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
        TipoCliente tipoCliente = TipoCliente.valueOf("PESSOA_FISICA");
        System.out.println(tipoCliente.getNomeRelatorio());

        TipoCliente tipoCliente2 = TipoCliente.tipoClientePorNomeRelatorio("Pessoa Física");
        System.out.println(tipoCliente2);

    }
}
