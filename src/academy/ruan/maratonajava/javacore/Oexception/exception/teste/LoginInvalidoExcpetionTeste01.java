package academy.ruan.maratonajava.javacore.Oexception.exception.teste;

import academy.ruan.maratonajava.javacore.Oexception.exception.dominio.LoginInvalidoExcpetion;

import java.util.Scanner;

public class LoginInvalidoExcpetionTeste01 {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoExcpetion e) {
            e.printStackTrace();
        }
    }

    private static void logar () throws LoginInvalidoExcpetion {
        Scanner scanner = new Scanner(System.in);

        String usernameDB = "Fab";
        String senhaDB = "VALEDOSMACHADOS";

        System.out.println("Username");
        String usernameDigitado = scanner.nextLine();
        System.out.println("Senha");
        String senhaDigitada = scanner.nextLine();

        if (!usernameDB.equals(usernameDigitado) || !senhaDB.equals(senhaDigitada)) {
            throw new LoginInvalidoExcpetion("Usuário ou senha inválidos");
        }

        System.out.println("Usuário logado com sucesso");
    }
}
