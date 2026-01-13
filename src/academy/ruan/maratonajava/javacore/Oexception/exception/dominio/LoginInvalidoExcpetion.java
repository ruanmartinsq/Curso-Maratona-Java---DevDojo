package academy.ruan.maratonajava.javacore.Oexception.exception.dominio;

public class LoginInvalidoExcpetion extends Exception {

    public LoginInvalidoExcpetion() {
        super("Login Inválido");
    }

    public LoginInvalidoExcpetion(String message) {
        super(message);
    }
}
