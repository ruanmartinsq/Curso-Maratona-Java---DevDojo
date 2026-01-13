package academy.ruan.maratonajava.javacore.Oexception.exception.dominio;

import java.io.FileNotFoundException;

public class Pessoa {
    public void salvar() throws LoginInvalidoExcpetion, FileNotFoundException {
        System.out.println("Salvando pessoa");
    }
}
