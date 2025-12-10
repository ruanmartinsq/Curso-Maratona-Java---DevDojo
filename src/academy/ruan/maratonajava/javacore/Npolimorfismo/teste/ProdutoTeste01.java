package academy.ruan.maratonajava.javacore.Npolimorfismo.teste;

import academy.ruan.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.ruan.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import academy.ruan.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import academy.ruan.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTeste01 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 55600g", 3000.0);
        Tomate tomate = new Tomate("Vermelho", 0.2);
        CalculadoraImposto.calcularImposto(produto);
        System.out.println(" ");
        CalculadoraImposto.calcularImposto(tomate);
    }
}
