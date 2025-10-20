package academy.ruan.maratonajava.javacore.Dconstrutores.dominio;

public class Anime {
    private String tipo;
    private int episodios;
    private String nome;
    private String genero;
    private String estudio;

    public Anime(String nome, String tipo, int episodios, String genero) {
        //o this chama o construtor padrao sem parametros, ele vai estar com %
        //o this sempre tem que estar na primeira linha
        this();
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
        this.genero = genero;
    }

    public Anime(String nome, String tipo, int episodios, String genero, String estudio) {
        //o this sempre tem que estar na primeira linha
        this(nome, tipo, episodios, genero);
        this.estudio = estudio;
    }

    public Anime() {
        //%% esse daq
        System.out.println("Dentro do construtor sem argumentos. ");
    }

    public void infoAnimes() {
        System.out.println("------///------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Tipo: "+ this.tipo);
        System.out.println("Episodios: "+ this.episodios);
        System.out.println("Genero: "+ this.genero);
        System.out.println("Estudio: " + this.estudio);
    }

    //pq nao colocar o genero dentro do init?
    //pq daria erro de copilação, imagina trabalharmos em uma empresa grande com vários metodos e ter que arrumar um por um
    //ent devemos criar outro metodo
    //SOBRECARGA DE METODOS - vc tem um metodo com um mesmo nome, porem o tipo ou quant de parametros diferentes

    public String getGenero() {
        return this.genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setNome (String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getEpisodios() {
        return this.episodios;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }
}
