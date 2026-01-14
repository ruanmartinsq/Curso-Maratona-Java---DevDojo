package academy.ruan.maratonajava.javacore.Pwrapper.teste;

public class WrapperTeste01 {
    public static void main(String[] args) {
        byte byteP = 1;
        short shortP = 1;
        int intP = 1;
        long longP = 10L;
        float floatP = 10F;
        double doubleP = 10D;
        char charP = 'W';
        boolean booleanP = false;
        //o de cima sao tipos primitivos

        Byte byteW = 1;
        Short shortW = 1;
        Integer intW = 1; //autoboxing ou boxing
        Long longW = 10L;
        Float floatW = 10F;
        Double doubleW = 10D;
        Character charW = 'W';
        Boolean booleanW = false;
        //o de baixo sao wrapper (objetos), agora estamos mexendo com objetos, segue a regra de polimorfismo
        //nos tipos primitivos um long pode ter um valor inteiro, ja nos wrapper, não, pois ele é um objeto
        //passa os valores por parametros e por referencia, não mais por valor

        int teste = Integer.parseInt("2");

        int i = intW; //unboxing
        int j = intW.intValue(); //unboxing (aqui so faz um cast)

        System.out.println("i = " + i);
        System.out.println("j = " + j);

        Integer intW2 = Integer.parseInt("1"); //basicamente passa o valor 1 (que é uma string) para um valor inteiro
        //lembrando que estamos trabalhando com objetos, por isso a importancia de usar o parseint
        boolean verdadeiro = Boolean.parseBoolean("true");
        System.out.println("BOOLEAN: " + verdadeiro);

        System.out.println("///////////");

        System.out.println(Character.isDigit('A'));
        System.out.println(Character.isDigit('2'));
        System.out.println(Character.isLetter('A'));
        System.out.println(Character.isLetter('2'));
        System.out.println(Character.isLetter(charW));
        System.out.println(Character.isLetter(charP));
        System.out.println(Character.isLetterOrDigit('!'));
        System.out.println(Character.isLowerCase(charW));
        System.out.println("///////////");
        System.out.println(Character.toLowerCase('L'));
        System.out.println(Character.toUpperCase('l'));

        //nunca devemos comparar wrappers com ==, sempre use .equals
    }
}
