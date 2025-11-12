package academy.ruan.maratonajava.exercicios.exAnimais;

public class Peixe extends Animal {
    protected String caracteristica;


    public Peixe(String nome, String cor, String ambiente, String caracteristica, int comprimento, float velocidade) {
        super(nome, cor, ambiente, comprimento, velocidade, 0);
        this.caracteristica = caracteristica;
    }

    public void alteraCaracteristicas (String caracteristica) {
        this.caracteristica = caracteristica;
    }

    protected String getCaracteristica () {
        System.out.println("Caracaterísticas: " + this.caracteristica);
        return this.caracteristica;
    }


    @Override
    public void imprimeInformacoes() {
        super.imprimeInformacoes();
        System.out.println("Caracaterísticas: " + this.caracteristica);

    }
}
