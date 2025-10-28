package academy.ruan.maratonajava.javacore.Gassociacao.dominio;

public class Jogador {
    private String nome;
    private Time time;

    public void imprimeInfo() {
        System.out.println(this.nome);
        if (time != null) {
            //usamos o get nome pq agora é um objeto se usar o this. via falar o endereço de memoria
            System.out.println(time.getNome());
        } else {
            System.out.println("Sem time!!");
        }
    }

    public Jogador(Time time) {
        this.time = time;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public Jogador(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
