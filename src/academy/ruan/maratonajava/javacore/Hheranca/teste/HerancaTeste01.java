package academy.ruan.maratonajava.javacore.Hheranca.teste;

import academy.ruan.maratonajava.javacore.Hheranca.dominio.Endereco;
import academy.ruan.maratonajava.javacore.Hheranca.dominio.Funcionario;
import academy.ruan.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class HerancaTeste01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setCep("4333-000");
        endereco.setRua("Rua dos limoes");

        Pessoa pessoa = new Pessoa("Ruan");
        pessoa.setCpf("12344");
        pessoa.setEndereco(endereco);
        pessoa.imprimeInformacoes();

        Funcionario funcionario = new Funcionario("Cintia");
        funcionario.setCpf("2323adad");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(7000);

        System.out.println("");

        funcionario.imprimeInformacoes();
        funcionario.relatorioPagamento();
    }
}
