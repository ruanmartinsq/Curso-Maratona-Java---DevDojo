package academy.ruan.maratonajava.exercicios.exFolhaPagamento.dominio;

public class Funcionario {
    private int id;
    private String nome;
    private Cargo cargo;
    private Departamento departamento;
    private int horasExtras;

    public Funcionario(int id, String nome, Cargo cargo, Departamento departamento) {
        this.id = id;
        this.nome = nome;
        this.cargo = cargo;
        this.departamento = departamento;
    }

    public Funcionario(int id, String nome, Cargo cargo, Departamento departamento, int horasExtras) {
        this(id, nome, cargo, departamento);
        this.horasExtras = horasExtras;
    }

    public double calcularSalarioTotal() {
        return cargo.calcularSalarioComBonus() + (horasExtras * 50);
    }

    public void adicionarHorasExtras(int horas) {
        if (!cargo.podeTerHoraExtra()) {
            throw new IllegalArgumentException("Este cargo não pode receber horas extras!");
        }

        this.horasExtras += horas;
    }

    public int getId() {
        return id;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public String getNome() {
        return nome;
    }

    public int getHorasExtras() {
        return horasExtras;
    }

    @Override
    public String toString() {
        return nome + " - " + cargo + " - " + departamento +
                " - Salário Total: R$ " + calcularSalarioTotal();
    }
}
