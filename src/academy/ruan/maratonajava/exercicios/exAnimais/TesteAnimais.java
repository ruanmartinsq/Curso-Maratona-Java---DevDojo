package academy.ruan.maratonajava.exercicios.exAnimais;

public class TesteAnimais {
    public static void main(String[] args) {
        System.out.println("ZOO:");
        Animal camelo = new Animal("Camelo", "Amarelo","Terra", 150,  2, 4);
        camelo.imprimeInformacoes();

        Peixe tubarao = new Peixe("Tubarão", "Cinzento", "Mar", "Barbatanas e Cauda",300, 1.5f);
        tubarao.imprimeInformacoes();

        Mamifero urso = new Mamifero("Urso-do-canada", "Vermelho", "Terra", "Mel", 180, 0.5f, 4);
        urso.imprimeInformacoes();
    }
}
