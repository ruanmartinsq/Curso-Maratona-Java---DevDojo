package academy.ruan.maratonajava.javacore.Bintroducaometodos.dominio;

public class Pessoa {
    private String nome;
    private int idade;

    public void imprimePessoa () {
        System.out.println(this.idade + " | " + this.nome);
    }

    public void setNome (String nome) {
        this.nome = nome;
    }

    public String getNome () {
        return this.nome;
    }

    public void setIdade (int idade) {
        if (idade < 0) {
            System.out.println("A idade que você informou é menor que 0.");
            return;
        }
        this.idade = idade;
    }

    public int getIdade () {
        return this.idade;
    }
}
