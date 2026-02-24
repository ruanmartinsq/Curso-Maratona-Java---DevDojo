package academy.ruan.maratonajava.javacore.Vio.teste;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileTeste01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try {
            boolean isCreated = file.createNewFile();
            System.out.println(isCreated+ " | criado com sucesso. ");
            System.out.println("Path: " + file.getPath());
            System.out.println("Absolute path: " + file.getAbsolutePath());
            System.out.println("Is directory: " + file.isDirectory());
            System.out.println("Is file: " + file.isFile());
            System.out.println("Is hidden: " + file.isHidden());
            System.out.println("Ultima modificação: " + new Date(file.lastModified()));


            if (file.exists()) {
                boolean isDeleted = file.delete();
                System.out.println(isDeleted + " | deletado com sucesso. ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
