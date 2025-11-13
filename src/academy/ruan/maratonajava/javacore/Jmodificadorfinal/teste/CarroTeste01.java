package academy.ruan.maratonajava.javacore.Jmodificadorfinal.teste;

import academy.ruan.maratonajava.javacore.Jmodificadorfinal.dominio.Carro;
import academy.ruan.maratonajava.javacore.Jmodificadorfinal.dominio.Comprador;
import academy.ruan.maratonajava.javacore.Jmodificadorfinal.dominio.Ferrari;

public class CarroTeste01 {
    public static void main(String[] args) {
        Carro carro = new Carro("Panamera do EDUKOF");
        Ferrari ferrari = new Ferrari("Ferrari");

        //Carro.VELOCIDADE_LIMITE = 180;
        //NAO FUNCIONA

        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("Eduardo Fernando");

        System.out.println(carro.COMPRADOR);

        System.out.println("///---///");
        carro.imprimeInformacao();

    }
}
