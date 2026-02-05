package academy.ruan.maratonajava.exercicios.exFolhaPagamento.dominio;

public enum Cargo {
    ESTAGIARIO(1200, 0),
    JUNIOR(2500, 5),
    PLENO(4000, 10),
    SENIOR(6500, 15),
    GERENTE(9000, 20);

    private final double salarioBase;
    private final double percentualBonus;

    Cargo(double salarioBase, double percentualBonus) {
        this.salarioBase = salarioBase;
        this.percentualBonus = percentualBonus;
    }

    public double calcularSalarioComBonus() {
        return salarioBase + (salarioBase * (percentualBonus / 100));
    }

    public boolean podeTerHoraExtra() {
        return this != ESTAGIARIO && this != GERENTE;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public double getPercentualBonus() {
        return percentualBonus;
    }
}