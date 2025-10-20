package academy.ruan.maratonajava.javacore.Bintroducaometodos.teste;

import academy.ruan.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;

public class EstudanteTeste02 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.nome = "Ruan";
        estudante01.idade = 19;
        estudante01.sexo = 'M';

        estudante02.nome = "Paulo";
        estudante02.idade = 22;
        estudante02.sexo = 'M';

        estudante01.imprime();
        estudante02.imprime();
    }
}
