package academy.ruan.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salarios;
    private double media;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    //nao usa o set media pq o usuario nao pode escrever a media ela tem que ser somente lida

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public double getMedia() {
        return media;
    }

    public void imprimeInformacoes () {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.print("Salário: ");
        if (salarios != null) {
            for (int i = 0; i < salarios.length; i++) {
                System.out.print("R$" + this.salarios[i] + " | ");
            }
        }
        mediaSalarial();
    }

    public void mediaSalarial () {
        if (salarios == null) {
            return;
        }

        double media = 0;
        for (double auxiliar : salarios) {
            media += auxiliar;
        }
        media /= salarios.length;

        System.out.println("\nA media dos 3 salarios é igual a: " + media);
        System.out.println("------------");
    }
}
