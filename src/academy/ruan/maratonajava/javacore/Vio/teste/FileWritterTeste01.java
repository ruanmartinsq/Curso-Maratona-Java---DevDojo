package academy.ruan.maratonajava.javacore.Vio.teste;

//File
//FileWritter
//FileReader
//BufferedWriter
//BufferedReader

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWritterTeste01 {
    public static void main(String[] args) {
        File file = new File("File.txt");
        try (FileWriter fw = new FileWriter(file)) { //se eu deixar um true ali, ele so vai acrescentando coisa no arquivo (file, true)
            fw.write("Teste escrevendo em um arquivo\n ainda estou testando");
            //sempre toma cuidado na hora de fechar um arquivo, pois ele pode nao ter acabado de escrever tudo
            //buffer é tipo um tunel por onde os dados passam

            //tem chance de fechar arquivo e ainda ter dados no buffer (no tunel) e aí os dados seriam perdidos
            //o flush força eles a ir para seu destino

            fw.flush(); //cospe tudo que tem dentro do buffer
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
