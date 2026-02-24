package academy.ruan.maratonajava.javacore.Vio.teste;

import java.io.*;

public class BufferedWriterTeste01 {
    public static void main(String[] args) {
        File file = new File("File.txt");
        try (FileWriter fw = new FileWriter(file);
             BufferedWriter bw = new BufferedWriter(fw)) { //guarda os dados dentro de um buffer, + rapido
            //encapsula a file writer, voce passa um parametro de filewriter

            bw.write("Teste escrevendo em um arquivo");
            bw.newLine(); //\n
            bw.write("ainda estou testando");
            bw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
