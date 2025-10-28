package academy.ruan.maratonajava.javacore.Gassociacao.teste;

import academy.ruan.maratonajava.javacore.Gassociacao.dominio.Escola;
import academy.ruan.maratonajava.javacore.Gassociacao.dominio.Professor;

public class EscolaTeste01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Felippe Faeda");
        Professor professor2 = new Professor("Edson Batista");
        Professor []professores = {professor1, professor2};
        Escola escola = new Escola("IFMG - Instituto Federal de Minas Gerais", professores);

        escola.imprimeInfo();
    }
}
