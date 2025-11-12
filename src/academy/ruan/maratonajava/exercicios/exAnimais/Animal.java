package academy.ruan.maratonajava.exercicios.exAnimais;

public class Animal {
    protected String nome;
    protected String cor;
    protected String ambiente;
    protected int comprimento;
    protected float velocidade;
    protected int patas;

    public Animal(String nome, String cor, String ambiente, int comprimento, float velocidade, int patas) {
        this.nome = nome;
        this.cor = cor;
        this.ambiente = ambiente;
        this.comprimento = comprimento;
        this.velocidade = velocidade;
        this.patas = patas;
    }

    public void imprimeInformacoes () {
        System.out.println("============================================");
        System.out.println("Animal: " + this.nome);
        System.out.println("Comprimeto: " + this.comprimento + "cm");
        System.out.println("Patas: " + this.patas);

        if (cor != null) {
            System.out.println("Cor: " + this.cor);
        }

        if (ambiente != null) {
            System.out.println("Ambiente: " + this.ambiente);
        }

        System.out.println("Velocidade: " + this.velocidade + "km/h");
    }

    public void alteraNome (String nome) {
        this.nome = nome;
    }

    public void alteraCor (String cor) {
        this.cor = cor;
    }

    public void alteraComprimento (int Comprimento) {
        this.comprimento = comprimento;
    }

    public void alteraPatas (int patas) {
        this.patas = patas;
    }

    public void alteraVelocidade (float velocidade) {
        this.velocidade = velocidade;
    }

    public void alteraAmbiente (String ambiente) {
        this.ambiente = ambiente;
    }



}
