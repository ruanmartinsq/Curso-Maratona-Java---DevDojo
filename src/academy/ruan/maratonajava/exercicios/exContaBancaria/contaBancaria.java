package academy.ruan.maratonajava.exercicios.exContaBancaria;

public class contaBancaria {
    protected String cliente;
    protected int num_conta;
    protected float saldo;

    //metodo sacar
    //metodo depositar


    public float depositar (float deposito) {
        System.out.println("Saldo antigo: " + this.saldo);
        saldo += deposito;
        System.out.println("Novo saldo: " + this.saldo);
        return this.saldo;
    }

    public float sacar (float saque) {
        if (this.saldo - saque >= 0) {
            this.saldo -= saque;
            System.out.println("Valor suficiente para saque, seu saldo final é: R$ " + this.saldo);
        } else {
            System.out.println("Não é possivel realizar o saque! Saldo irá ficar negativo.");
        }
        return this.saldo;
    }

    public contaBancaria(String cliente, int num_conta, float saldo) {
        this.cliente = cliente;
        this.num_conta = num_conta;
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "contaBancaria{" +
                "cliente='" + this.cliente + '\'' +
                ", num_conta=" + this.num_conta +
                ", saldo=" + this.saldo +
                '}';
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public int getNum_conta() {
        return num_conta;
    }

    public void setNum_conta(int num_conta) {
        this.num_conta = num_conta;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
}
