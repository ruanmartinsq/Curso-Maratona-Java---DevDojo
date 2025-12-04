package academy.ruan.maratonajava.javacore.Minterfaces.teste;

import academy.ruan.maratonajava.javacore.Minterfaces.dominio.DataBaseLoader;
import academy.ruan.maratonajava.javacore.Minterfaces.dominio.DataLoader;
import academy.ruan.maratonajava.javacore.Minterfaces.dominio.FileLoader;

public class DataLoaderTeste01 {
    public static void main(String[] args) {
        DataBaseLoader dataBaseLoader = new DataBaseLoader();
        FileLoader fileLoader = new FileLoader();

        dataBaseLoader.load();
        dataBaseLoader.remove();

        System.out.println("-------");

        fileLoader.load();
        fileLoader.remove();

        System.out.println("-------");

        dataBaseLoader.checkPermission();
        fileLoader.checkPermission();

        System.out.println("-------");

        DataLoader.retrieveMaxDataSize();
        DataBaseLoader.retrieveMaxDataSize();
    }
}
