package academy.ruan.maratonajava.javacore.Npolimorfismo.teste;

import academy.ruan.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.ruan.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import academy.ruan.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import academy.ruan.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;


public class ProdutoTeste03 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 9540", 6000.5);

        Tomate tomate = new Tomate("Rosado", 20);
        tomate.setDataValidade("12/02/2023");

        CalculadoraImposto.calcularImposto(tomate);
        System.out.println(" ");
        CalculadoraImposto.calcularImposto(produto);
    }
}
