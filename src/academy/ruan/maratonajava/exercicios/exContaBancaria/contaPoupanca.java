package academy.ruan.maratonajava.exercicios.exContaBancaria;

public class contaPoupanca extends  contaBancaria {
    private int dia_de_rendimento;

    public float calcularNovoSaldo() {
        this.saldo += this.saldo * (this.dia_de_rendimento / 100f);
        System.out.println("Novo saldo: R$" + this.saldo);
        return this.saldo;
    }

    public contaPoupanca(String cliente, int num_conta, float saldo, int dia_de_rendimento) {
        super(cliente, num_conta, saldo);
        this.dia_de_rendimento = dia_de_rendimento;
    }


}
