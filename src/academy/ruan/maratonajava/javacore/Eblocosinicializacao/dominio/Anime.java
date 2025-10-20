package academy.ruan.maratonajava.javacore.Eblocosinicializacao.dominio;

public class Anime {
    private String nome;
    private int[] episodios = {1,2,3,4,5,6,7,8,9,10,11};

    //1 - Alocado espaço em memoria pro objeto
    //2 - Cada atributo de classe é criado e inicializado com valores default ou a que for passada
    //3 - Bloco de inicializacao é executado
    //4 - Construtor executado

    {
        //aqui tem um bloco de inicialização pq ele executa toda vez no começo
        //executado antes do construtor
        System.out.println("Dentro do bloco de inicialização. ");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
        for(int episodio : this.episodios) {
            System.out.print(episodio + " ");
        }
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
