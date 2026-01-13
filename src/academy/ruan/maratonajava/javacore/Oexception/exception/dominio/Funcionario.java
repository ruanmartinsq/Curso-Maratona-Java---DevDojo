package academy.ruan.maratonajava.javacore.Oexception.exception.dominio;

public class Funcionario extends Pessoa{
    public void salvar() throws LoginInvalidoExcpetion, ArithmeticException{
        //voce pode lancar ou nao as excecoes. As do tipo runtime vc pode (ArithmeticException)
        //vc nao pode colocar do tipo mais genericas
        
        System.out.println("Salvando funcionario");
    }
}
