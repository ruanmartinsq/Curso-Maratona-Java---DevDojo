package academy.ruan.maratonajava.exercicios.exAnimais;

public class Mamifero extends Animal {
    protected String alimento;

    public Mamifero(String nome, String cor, String ambiente, String alimento, int comprimento, float velocidade, int patas) {
        super(nome, cor, ambiente, comprimento, velocidade, patas);
        this.alimento = alimento;
    }

    public void alteraAlimento (String alimento) {
        this.alimento = alimento;
    }

    @Override
    public void imprimeInformacoes() {
        super.imprimeInformacoes();
        System.out.println("Alimento: " + this.alimento);
    }
}
