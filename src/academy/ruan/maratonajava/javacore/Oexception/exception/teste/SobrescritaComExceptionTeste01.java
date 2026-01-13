package academy.ruan.maratonajava.javacore.Oexception.exception.teste;

import academy.ruan.maratonajava.javacore.Oexception.exception.dominio.Funcionario;
import academy.ruan.maratonajava.javacore.Oexception.exception.dominio.LoginInvalidoExcpetion;
import academy.ruan.maratonajava.javacore.Oexception.exception.dominio.Pessoa;

public class SobrescritaComExceptionTeste01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        try {
            funcionario.salvar();
        } catch (LoginInvalidoExcpetion e) {
            e.printStackTrace();
        }
    }
}
