package academy.ruan.maratonajava.exercicios.exContaBancaria;

public class contaEspecial extends contaBancaria {
    private float limite;

    @Override
    public float sacar(float saque) {
        if (this.saldo - saque >= limite) {
            this.saldo -= saque;
            System.out.println("Valor suficiente para saque, seu saldo final é: R$ ");
        } else {
            System.out.println("Limite insuficiente para realizar o saque!");
        }
        return this.saldo;
    }

    public contaEspecial(String cliente, int num_conta, float saldo, float limite) {
        super(cliente, num_conta, saldo);
        this.limite = limite;
    }
}
