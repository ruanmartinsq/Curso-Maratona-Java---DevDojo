package academy.ruan.maratonajava.javacore.Oexception.runtime.teste;

public class RuntimeExceptionTeste03 {
    public static void main(String[] args) {
        abreConexao2();
    }

    private static String abreConexao() {
        try {
            System.out.println("Abrindo o arquivo. ");
            System.out.println("Escrevendo dados no arquivo. ");
            return "conexao aberta";

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //sempre sera executado SEMPRE
            System.out.println("Fechando recurso liberado pelo SO. ");
        }

        return null;
    }

    private static void abreConexao2() {
        try {
            System.out.println("Abrindo o arquivo. ");
            System.out.println("Escrevendo dados no arquivo. ");
            throw new RuntimeException();
            //ele fala que é pro main tratar
        } finally {
            //sempre sera executado SEMPRE
            System.out.println("Fechando recurso liberado pelo SO. ");
        }
    }

}
