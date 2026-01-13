package academy.ruan.maratonajava.javacore.Oexception.runtime.teste;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class RuntimeExceptionTeste04 {
    public static void main(String[] args) {
        try {
            throw new ArrayIndexOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException e) {
            System.out.println("Dentro ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException");
        } catch (RuntimeException e) {
            System.out.println("Dentro RuntimeException");
        }

        //exceções mais genericas tem que vir por ultimo, pq se nao, as de cima (ou de baixo no caso) nunca serao executadas

//        try {
//            talvezLanceException();
//        } catch (Exception e) {
//
//        }
        //ou faz isso que é mais generico

        try {
            talvezLanceException();
        } catch (SQLException | FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    private static void talvezLanceException () throws SQLException, FileNotFoundException {
    }
}



