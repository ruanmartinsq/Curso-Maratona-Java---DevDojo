package academy.ruan.maratonajava.javacore.Oexception.exception.teste;

import academy.ruan.maratonajava.javacore.Oexception.exception.dominio.Leitor1;
import academy.ruan.maratonajava.javacore.Oexception.exception.dominio.Leitor2;

import java.io.*;

public class TryWithResourcesTest01 {
    public static void main(String[] args) {
        lerArquivo();
    }

    public static void lerArquivo() {
        try (Leitor1 leitor1 = new Leitor1();
             Leitor2 leitor2 = new Leitor2()){

        } catch (IOException e) {
            e.printStackTrace();
        }


    }


    public static void lerArquivo2() {
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("test.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    //caso tenha um arquivo criado/lido ele tem que fechar, por isso o if
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
