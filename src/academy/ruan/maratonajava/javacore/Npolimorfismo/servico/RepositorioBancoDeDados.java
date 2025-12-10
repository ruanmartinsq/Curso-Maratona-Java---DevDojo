package academy.ruan.maratonajava.javacore.Npolimorfismo.servico;

import academy.ruan.maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;

public class RepositorioBancoDeDados implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando no banco de dados...");
    }
}
