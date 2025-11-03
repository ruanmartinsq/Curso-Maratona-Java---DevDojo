package academy.ruan.maratonajava.javacore.Hheranca.teste;

import academy.ruan.maratonajava.javacore.Hheranca.dominio.Funcionario;

public class HerancaTeste02 {
    //0 - bloco de inicializacao estático da super classe é executado quando o JVM carregar a classe filha.
    //1 - bloco de inicializacao estático da subclasse é executado quando o JVM carregar a classe filha
    //2 - alocado espaço de memoria pro objeto da superclasse
    //3 - Cada atributo de superclasse é criado e inicializado com valores default ou a que for passada
    //4- Bloco de inicializacao da superclasse é executado na ordem em que aparece
    //5 - Construtor executado da superclasse é executado

    //6 - alocado espaço de memoria pro objeto da subclasse
    //7 - Cada atributo de subclasse é criado e inicializado com valores default ou a que for passada
    //8- Bloco de inicializacao da subclasse é executado na ordem em que aparece
    //9 - Construtor executado da subclasse é executado
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Ruan");
    }
}
