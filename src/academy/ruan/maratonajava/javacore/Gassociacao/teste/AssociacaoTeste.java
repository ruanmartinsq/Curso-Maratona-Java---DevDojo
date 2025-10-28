package academy.ruan.maratonajava.javacore.Gassociacao.teste;

import academy.ruan.maratonajava.javacore.Gassociacao.dominio.Aluno;
import academy.ruan.maratonajava.javacore.Gassociacao.dominio.Local;
import academy.ruan.maratonajava.javacore.Gassociacao.dominio.Professor;
import academy.ruan.maratonajava.javacore.Gassociacao.dominio.Seminario;

public class AssociacaoTeste {
    public static void main(String[] args) {
        Local local = new Local("Aveninda limoeiro");
        Aluno aluno = new Aluno(19, "Ruan");
        Professor professor = new Professor("Renato", "Computação quântica");
        Aluno[] alunosParaSeminario = {aluno};
        Seminario seminario = new Seminario("Computação quantica em larga escala", alunosParaSeminario, local);

        Seminario[] seminariosDisponiveis = {seminario};

        professor.setSeminarios(seminariosDisponiveis);
        professor.imprimeInformacoes();
    }
}
