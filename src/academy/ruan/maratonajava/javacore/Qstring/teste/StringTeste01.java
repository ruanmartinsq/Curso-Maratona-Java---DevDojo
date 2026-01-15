package academy.ruan.maratonajava.javacore.Qstring.teste;

public class StringTeste01 {
    public static void main(String[] args) {
        String nome = "Ruan"; //String constant pool (se duas Strings têm o mesmo conteúdo, o Java reaproveita o mesmo objeto)
        String nome2 = "Ruan";
        //String sao imutaveis
        //nome.concat(" Martins"); //nao existe uma variavel de referencia para ela (dessa forma so foi criado no pool de String (Ruan, Martins e Ruan Martins)
        //nome += " Martins"
        nome = nome.concat(" Martins");

        System.out.println(nome);
        System.out.println(nome == nome2);

        String nome3 = new String("Ruan"); //1 variavel de referencia; 2 objeto do tipo string; 3 uma string no pool de string
        System.out.println(nome2 == nome3);
        System.out.println(nome2 == nome3.intern()); //aqui esta comparando com o valor dentro do pool de strings, por isso o valor é true

        //== NÃO compara texto, compara referência (endereço de memória).
        //equals() - compara texto
        //nome2 = pool; nome3 = heap
    }
}
