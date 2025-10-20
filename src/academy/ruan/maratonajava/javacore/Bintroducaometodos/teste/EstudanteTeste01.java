package academy.ruan.maratonajava.javacore.Bintroducaometodos.teste;

import academy.ruan.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import academy.ruan.maratonajava.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTeste01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante01.nome = "Ruan";
        estudante01.idade = 19;
        estudante01.sexo = 'M';

        impressora.imprime(estudante01);

        estudante02.nome = "Paulo";
        estudante02.idade = 22;
        estudante02.sexo = 'M';

        impressora.imprime(estudante02);
    }
}
