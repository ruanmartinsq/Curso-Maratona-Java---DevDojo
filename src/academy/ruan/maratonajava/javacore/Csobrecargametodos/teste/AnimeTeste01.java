package academy.ruan.maratonajava.javacore.Csobrecargametodos.teste;

import academy.ruan.maratonajava.javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTeste01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        //anime.init("Tears Queen", "Dorama", 18);
        anime.init("Tears Queen", "Dorama", 18, "Terror");

        //o init ele faz a mesma coisa que as linhas de codigo abaixo fazem.
        //anime.setNome("Tears King");
        //anime.setTipo("Dorama");
        //anime.setEpisodios(18);

        anime.infoAnimes();
    }
}
