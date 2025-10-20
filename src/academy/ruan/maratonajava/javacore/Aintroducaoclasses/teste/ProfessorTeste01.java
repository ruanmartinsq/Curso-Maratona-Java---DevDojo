package academy.ruan.maratonajava.javacore.Aintroducaoclasses.teste;

import academy.ruan.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTeste01 {
    public static void main(String[] args) {
        Professor professor = new Professor();

        professor.idade = 54;
        professor.sexo = 'M';
        professor.nome = "Cláudio";

        System.out.print(professor.nome + ", " + professor.idade +  ", " + professor.sexo+ ".");
    }
}
