package academy.ruan.maratonajava.javacore.Oexception.runtime.teste;

public class RuntimeExceptionTeste01 {
    public static void main(String[] args) {
        int []nums = {1,2};
        System.out.println(nums[2]);

//        Unchecked Exceptions (Runtime Exceptions)
//        Acontecem em tempo de execução
//        → O compilador NÃO obriga você a tratar
//        → Herdam de RuntimeException
//        São erros normalmente causados por bugs no código, erro do programador.


        //        Checked Exceptions
//        O compilador obriga você a tratar
//        → Elas acontecem por coisas externas ao seu programa
//         → Herdam de Exception (mas NÃO de RuntimeException)
//        O compilador obriga a usar try/catch ou declarar com throws.
//
//Representam problemas que podem acontecer, mas não são bugs.

    }
}
