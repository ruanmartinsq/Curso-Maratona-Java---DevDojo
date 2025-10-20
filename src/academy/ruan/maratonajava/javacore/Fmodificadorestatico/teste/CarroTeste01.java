package academy.ruan.maratonajava.javacore.Fmodificadorestatico.teste;

import academy.ruan.maratonajava.javacore.Fmodificadorestatico.dominio.Carro;

public class CarroTeste01 {
    public static void main(String[] args) {
        Carro carro01 = new Carro("BMW", 280);
        Carro carro02 = new Carro("Mercedes", 275);
        Carro carro03 = new Carro("Audi", 290);

        Carro.setVelocidadeLimite(180);


        carro01.imprimeInfo();
        carro02.imprimeInfo();
        carro03.imprimeInfo();
    }
}
