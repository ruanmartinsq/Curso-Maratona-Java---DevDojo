package academy.ruan.maratonajava.javacore.Eblocosinicializacao.teste;

import academy.ruan.maratonajava.javacore.Eblocosinicializacao.dominio.Anime;

public class AnimeTeste01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Alan");

        for(int episodio : anime.getEpisodios()) {
            System.out.print(episodio + " ");
        }
    }
}
