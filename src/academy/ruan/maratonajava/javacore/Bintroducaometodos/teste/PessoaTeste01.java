package academy.ruan.maratonajava.javacore.Bintroducaometodos.teste;

import academy.ruan.maratonajava.javacore.Bintroducaometodos.dominio.Pessoa;

public class PessoaTeste01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        //pessoa.idade = 19;
        //pessoa.nome = "Ruan";
        pessoa.setNome("Ruan");
        pessoa.setIdade(19);
        //baixo acoplamento bom | auto acoplamento ruim
        //baixo coesao ruim | auta coesao bom
        //pessoa.imprimePessoa();

        System.out.println("My name is " + pessoa.getNome());
        System.out.println("Im " + pessoa.getIdade() + "yo");
    }
}
