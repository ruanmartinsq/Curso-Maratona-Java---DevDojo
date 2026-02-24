package academy.ruan.maratonajava.javacore.Vio.teste;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTeste01 {
    public static void main(String[] args) {
        File file = new File("File.txt");
        try (FileReader fr = new FileReader(file)) {
//            System.out.println(fr.read());
//            char[] in = new char[30];
//            fr.read(in);
//            for (char c : in) {
//                System.out.println(c);
//            } //cria um array de char que armazena os caracteres do arquivo

            int i = 0;
            while ((i = fr.read()) != -1) { //quando o arquivo acaba, ele retorna -1
                System.out.print((char)i); //cast
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
