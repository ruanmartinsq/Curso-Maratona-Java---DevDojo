package academy.ruan.maratonajava.javacore.Gassociacao.teste;

import academy.ruan.maratonajava.javacore.Gassociacao.dominio.Jogador;
import academy.ruan.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTeste02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Leo");
        Time time = new Time("Flamengo");

        //associacao unidirecional n jogadores pode ter 1 time
        jogador1.setTime(time);
        jogador1.imprimeInfo();
    }
}
