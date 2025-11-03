package academy.ruan.maratonajava.javacore.Hheranca.dominio;

public class Pessoa {
    protected String nome;
    protected String cpf;
    protected Endereco endereco;

    //o protected todas as subclasses de pessoa vao ter acesso aos atributos como se fosse publicos

    static {
        System.out.println("Dentro do bloco de inicializacao estatico de pessoa");
    }

    {
        System.out.println("Dentro do bloco de inicializacao de pessoa 1");
    }

    {
        System.out.println("Dentro do bloco de inicializacao de pessoa 2");
    }

    public Pessoa(String nome) {
        System.out.println("Dentro do construtor de pessoa");
        this.nome = nome;
    }

    public Pessoa (String nome, String cpf) {
        this(nome);
        this.cpf = cpf;
    }

    public void imprimeInformacoes() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Cpf: " + this.cpf);
        System.out.println("Endereço: cep - " + this.endereco.getCep() + " | rua - " + this.endereco.getRua());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
