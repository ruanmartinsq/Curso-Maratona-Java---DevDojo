package academy.ruan.maratonajava.javacore.Aintroducaoclasses.teste;

import academy.ruan.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTeste01 {
    public static void main(String[] args) {
        Carro carro01 = new Carro();
        Carro carro02 = new Carro();

        carro01.nome = "Fox";
        carro01.modelo = "PVV981";
        carro01.ano = 2015;

        carro02.nome = "Corsa";
        carro02.modelo = "CAA342";
        carro02.ano = 2012;

        System.out.println("Carro 01: " + carro01.nome + " " + carro01.modelo + " " + carro01.ano);
        System.out.println("Carro 02: " + carro02.nome + " " + carro02.modelo + " " + carro02.ano);

    }
}
