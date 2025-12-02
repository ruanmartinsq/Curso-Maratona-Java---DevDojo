package academy.ruan.maratonajava.javacore.Lclassesabstratas.teste;


import academy.ruan.maratonajava.javacore.Lclassesabstratas.dominio.Desenvolvedor;
import academy.ruan.maratonajava.javacore.Lclassesabstratas.dominio.Gerente;

public class FuncionarioTeste01 {
    public static void main(String[] args) {
        //Funcionario funcionario01 = new Funcionario("Alex", 2000.0);
        //em teoria nao era pra existir um funcionario, era pra ele ser apenas uma cplasse pra ser sobrescrita
        Gerente gerente = new Gerente("Pablo", 6000.50);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Ruan", 4500.43);

        //abstract em classe nao pode ser instanciado assim como funcionario01
        //em metodo nao pode ter corpo
        System.out.println(gerente);
        System.out.println(desenvolvedor);
        gerente.imprime();
        desenvolvedor.imprime();
    }
}
