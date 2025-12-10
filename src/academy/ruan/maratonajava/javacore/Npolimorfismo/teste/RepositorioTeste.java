package academy.ruan.maratonajava.javacore.Npolimorfismo.teste;

import academy.ruan.maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;
import academy.ruan.maratonajava.javacore.Npolimorfismo.servico.RepositorioArquivo;
import academy.ruan.maratonajava.javacore.Npolimorfismo.servico.RepositorioBancoDeDados;
import academy.ruan.maratonajava.javacore.Npolimorfismo.servico.RepositorioMemoria;

import java.util.LinkedList;
import java.util.List;

public class RepositorioTeste {
    public static void main(String[] args) {
        //RepositorioBancoDeDados repositorioBancoDeDados = new RepositorioBancoDeDados();
        //pra mudar e ficar mais facil na orientada a interfaces é so colocar a mais genérica e troca so dps do new
        //Repositorio repositorio = new RepositorioArquivo();
        Repositorio repositorio = new RepositorioMemoria();
        repositorio.salvar();

        List <String> list = new LinkedList<>();
        list.add("Oi");
        list.add("Pessoal");
        list.add("Teste");
    }
}
