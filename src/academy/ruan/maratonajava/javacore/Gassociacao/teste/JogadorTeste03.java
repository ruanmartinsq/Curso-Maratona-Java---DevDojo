package academy.ruan.maratonajava.javacore.Gassociacao.teste;

import academy.ruan.maratonajava.javacore.Gassociacao.dominio.Jogador;
import academy.ruan.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTeste03 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Neymar Jr");
        Jogador jogador2 = new Jogador("Pelé");
        Time time = new Time("Santos");
        Jogador jogadores[] = {jogador, jogador2};

        jogador.setTime(time); //setando o time no jogador
        jogador2.setTime(time);
        time.setJogadores(jogadores); //setando jogadores no time

        System.out.println("--- Jogador ---");
        jogador.imprimeInfo();
        System.out.println("--- Time ---");
        time.imprimeInfo();

    }
}
