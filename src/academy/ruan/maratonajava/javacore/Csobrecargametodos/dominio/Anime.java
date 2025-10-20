package academy.ruan.maratonajava.javacore.Csobrecargametodos.dominio;

public class Anime {
    private String tipo;
    private int episodios;
    private String nome;
    private String genero;

    public Anime() {

    }


    public void infoAnimes() {
        System.out.println("------///------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Tipo: "+ this.tipo);
        System.out.println("Episodios: "+ this.episodios);
        System.out.println("Genero: "+ this.genero);
    }

    public void init (String nome, String tipo, int episodios) {
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
    }

    public void init (String nome, String tipo, int episodios, String genero) {
        this.init(nome, tipo, episodios);
        this.genero = genero;
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
