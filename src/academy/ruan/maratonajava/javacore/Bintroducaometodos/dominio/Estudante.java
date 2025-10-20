package academy.ruan.maratonajava.javacore.Bintroducaometodos.dominio;

public class Estudante {
    public String nome;
    public int idade;
    public char sexo;

    public void imprime () {
        //nao precisa de passar paramentro Estudante estudante pq ja esta dentro da classe e tem acesso aos objetos.
        System.out.println(" Nome: " + this.nome + "| Idade: " + this.idade + "| Sexo: " + this.sexo);
    }
}
