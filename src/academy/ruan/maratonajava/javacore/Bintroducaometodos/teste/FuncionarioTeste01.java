package academy.ruan.maratonajava.javacore.Bintroducaometodos.teste;

import academy.ruan.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTeste01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.setNome("Douglas");
        funcionario.setIdade(34);
        funcionario.setSalarios(new double[]{3440.90,3440.90, 3440.90});

        funcionario.imprimeInformacoes();

    }
}
