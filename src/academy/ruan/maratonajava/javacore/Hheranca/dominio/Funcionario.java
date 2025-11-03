package academy.ruan.maratonajava.javacore.Hheranca.dominio;

public class Funcionario extends Pessoa {
    //funcionario vai ter todos os atributos e metodos que pessoa tem pq usou o extends
    //nao pode estender mais de uma classe
    private double salario;

    static {
        System.out.println("Dentro do bloco de inicializacao estatico de funcionario");
    }

    {
        System.out.println("Dentro do bloco de inicializacao de funcionario 1");
    }

    {
        System.out.println("Dentro do bloco de inicializacao de funcionario 2");
    }

    public Funcionario (String nome) {
        super(nome);
        System.out.println("Dentro do construtor de funcionario");
        //o super chama o construtor da classe pessoa, fazendo ele passar um prametro
    }

    @Override
    public void imprimeInformacoes() {
        super.imprimeInformacoes();
        System.out.println("Salário: " + this.salario);
    }

    public void relatorioPagamento () {
        System.out.println("Eu " + this.nome + ", recebi o salário de: " + this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}
