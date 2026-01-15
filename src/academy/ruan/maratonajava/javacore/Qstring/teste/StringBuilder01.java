package academy.ruan.maratonajava.javacore.Qstring.teste;

public class StringBuilder01 {
    public static void main(String[] args) {
        String nome = "Ruan Martins";
        nome.concat("Dev Back-end");
        nome.substring(0, 3);
        System.out.println(nome);

        StringBuilder sb = new StringBuilder("Ruan Martins");
        sb.append(" - Dev Back-end").append(" - 14/01/2026");
        sb.substring(0, 3); //nao imprime pois retorna uma string e queremos um stringbuilder
        System.out.println(sb);
        sb.reverse();
        sb.delete(0,3);
        System.out.println(sb);
        sb.reverse();
        sb.insert(2, 3);
        System.out.println(sb);

        //na maioria das vezes a stringbuilder trabalha com a memoria dentro do objeto
    }
}
