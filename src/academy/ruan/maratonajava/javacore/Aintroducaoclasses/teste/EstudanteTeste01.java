package academy.ruan.maratonajava.javacore.Aintroducaoclasses.teste;

import academy.ruan.maratonajava.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTeste01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante2 = new Estudante();
        //outro objeto dentro da classe estudante

        estudante.nome = "Ruan";
        estudante.idade = 19;
        estudante.sexo = 'M';

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);

        System.out.println("--------------------");
        estudante2.nome = "Paulo";
        estudante2.idade = 45;
        estudante2.sexo = 'M';

        System.out.println(estudante2.nome);
        System.out.println(estudante2.idade);
        System.out.println(estudante2.sexo);

    }
}
