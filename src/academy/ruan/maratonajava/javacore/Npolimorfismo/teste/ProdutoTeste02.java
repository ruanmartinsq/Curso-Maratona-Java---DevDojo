package academy.ruan.maratonajava.javacore.Npolimorfismo.teste;

import academy.ruan.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.ruan.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import academy.ruan.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import academy.ruan.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;


public class ProdutoTeste02 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 9540", 6000.5);
        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
        System.out.println(produto.calcularImposto());
        System.out.println(" ");

        Produto produto02 = new Tomate("Rosado", 0.85);
        System.out.println(produto02.getNome());
        System.out.println(produto02.getValor());
        System.out.println(produto02.calcularImposto());
        //nao posso acessar o get validade pq ele nao ta na classe produto
        System.out.println(" ");
    }
}
