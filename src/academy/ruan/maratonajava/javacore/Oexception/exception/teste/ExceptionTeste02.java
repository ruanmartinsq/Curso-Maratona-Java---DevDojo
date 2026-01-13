package academy.ruan.maratonajava.javacore.Oexception.exception.teste;

import java.io.File;
import java.io.IOException;

public class ExceptionTeste02 {
    public static void main(String[] args) throws IOException {
        criarNovoArquivo();
//        try {
//            criarNovoArquivo();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

    }

    //é interessante usar o throws na frente quando o metodo for public, pq vc nao sabe quem ira chama-lo
    //e private, pode manter o try catch normalmente
    private static void criarNovoArquivo() throws IOException {
        File file = new File("arquivo\\teste.txt");
        try {
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo criado: " + isCriado);

        } catch (IOException e) {
            e.printStackTrace();
            throw e;
            //throw new RuntimeException("Problema na hora de criar o arquivo.");
        }
    }
}
