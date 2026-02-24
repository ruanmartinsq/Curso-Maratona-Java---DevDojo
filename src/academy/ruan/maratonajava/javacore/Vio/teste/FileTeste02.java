package academy.ruan.maratonajava.javacore.Vio.teste;

import java.io.File;
import java.io.IOException;

public class FileTeste02 {
    public static void main(String[] args) throws IOException {
        File fileDiretorio = new File("pasta");
        boolean isDiretorioCreated = fileDiretorio.mkdir(); //cria um diretorio (mkdir)
        System.out.println("Pasta criada? "  + isDiretorioCreated);

        File fileArquivoDiretorio = new File(fileDiretorio, "arquivo.txt");
        boolean isFileCreated = fileArquivoDiretorio.createNewFile();
        System.out.println("Arquivo criado? " + isFileCreated);

        File fileRenamed = new File(fileDiretorio, "arquivo_renomeado"); //tenho que passar o fileDiretorio pq se nao ele vai ser criado fora
        boolean isRenamed = fileArquivoDiretorio.renameTo(fileRenamed);
        System.out.println("Arquivo renomeado? " + isRenamed);

        File diretorioRenamed = new File("pasta_renomeada");
        boolean isDiretorioRenamed = fileDiretorio.renameTo(diretorioRenamed);
        System.out.println("Pasta renomeada? " + isDiretorioRenamed);

        //caso algo ja tenha sido criado (pasta ou arquivo) ele nao vai criar dnv, por isso da false
    }
}
