package academy.ruan.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        // int, short, double, float, char, byte, long, boolean
        int idade = 10;
        int idade2 = (int) 100000000000000l;
        long numeroGrande = 1000000000;
        double salarioDouble = 2500;
        float salarioFloat = 2500.0f;
        byte idadeByte = 10;
        short idadeShort = 10;
        boolean verdadeiro = true;
        char caractere = 'R';
        String nome = "Ruan";

        System.out.println("A idade é: " + idade);
        System.out.println("Olá, meu nome é: "+ nome);
    }
}
