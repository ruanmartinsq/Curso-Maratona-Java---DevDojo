package academy.ruan.maratonajava.javacore.Npolimorfismo.servico;

import academy.ruan.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.ruan.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import academy.ruan.maratonajava.javacore.Npolimorfismo.dominio.Tomate;

public class CalculadoraImposto {
    public static void calcularImposto(Produto produto) {
        System.out.println("Relatorio de imposto: ");
        double imposto = produto.calcularImposto();
        System.out.println("Computador " + produto.getNome());
        System.out.println("Valor " + produto.getValor());
        System.out.println("Imposto a ser pago " + imposto);

        if(produto instanceof Tomate) {
            Tomate tomate = (Tomate) produto;
            //abaixo tem a forma simplificada de uma linha
            //System.out.println( ((Tomate) produto).getDataValidade());
            System.out.println(tomate.getDataValidade());
        }

    }
}
