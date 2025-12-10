package academy.ruan.maratonajava.javacore.Npolimorfismo.servico;

import academy.ruan.maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;

public class RepositorioArquivo implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em um arquivo...");
    }
}
