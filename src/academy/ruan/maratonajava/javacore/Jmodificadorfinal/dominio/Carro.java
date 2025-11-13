package academy.ruan.maratonajava.javacore.Jmodificadorfinal.dominio;

public class Carro {
    public static final double VELOCIDADE_LIMITE = 250;
    //voce quer que a velocidadeLimite nao mude de valor
    //usa under score e upper case
    //static quer dizer que VELOCIDADE_LIMITE pertence a CLASSE carro e nao ao objeto
    private String nome;
    public final Comprador COMPRADOR = new Comprador();

    //POSSO USAR O CONSTRUTOR PASSANDO A VELOCIDADELIMITE TAMBEM, POREM SEM O STATIC
    //static {
        //VELOCIDADE_LIMITE = 210;
    //}

    public void imprimeInformacao() {
        System.out.println("Nome comprador: " + this.COMPRADOR.getNome());
        System.out.println("Velocidade limite: " + VELOCIDADE_LIMITE);
        System.out.println("Nome do carro: " + this.nome);
    }

    public Carro(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
