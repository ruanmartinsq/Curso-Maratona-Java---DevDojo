package academy.ruan.maratonajava.exercicios.exContaBancaria;

import java.util.Scanner;

public class conta {
    public static void main(String[] args) {
        int opcao = 0;
        Scanner sc = new Scanner(System.in);
        contaBancaria conta01 = new contaBancaria("Ruan", 101, 2100.50f);
        contaBancaria conta02 = new contaBancaria("Paulo", 102, 3100.00f);
        contaPoupanca poupanca01 = new contaPoupanca("Maria", 103, 5000.0f,2);

        conta01.sacar(100.50f);
        conta02.sacar(3200.00f);

        System.out.println("////");

        conta01.depositar(100.50f);

        System.out.println("////");

        poupanca01.calcularNovoSaldo();

        System.out.println("////");

        System.out.println(conta01.toString());
    }
}
