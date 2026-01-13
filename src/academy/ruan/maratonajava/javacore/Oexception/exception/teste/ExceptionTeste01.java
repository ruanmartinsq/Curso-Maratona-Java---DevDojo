package academy.ruan.maratonajava.javacore.Oexception.exception.teste;

import java.io.File;
import java.io.IOException;

public class ExceptionTeste01 {
    public static void main(String[] args) {
        criarNovoArquivo();
    }


    private static void criarNovoArquivo() {
        File file = new File("arquivo\\teste.txt");
        try {
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo criado!!! " + isCriado);

        } catch (IOException e) {
            e.printStackTrace();
            //A stack trace te mostra tudo oq aconteceu ate chegar no erro
        }
    }

//    public static void criar() throws IOException {
//        file.createNewFile();
//    }

    //ele obriga quem chamar esse metodo a tratar o erro
}
