package academy.ruan.maratonajava.javacore.Lclassesabstratas.dominio;

public abstract class Funcionario extends Pessoa{
    protected String nome;
    protected double salario;

    //abstrato -> apenas um template, tem que ter um objeto que extende a classe funcionario


    @Override
    public void imprime() {
        System.out.println("Imprimindo...");
    }

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        calcularBonus();
    }

    public abstract void calcularBonus();
    //obrigad todas as classes filhas a terem o bonus
}
