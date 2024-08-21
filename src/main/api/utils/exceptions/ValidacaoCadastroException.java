package main.api.utils.exceptions;

public class ValidacaoCadastroException extends Exception {

    public ValidacaoCadastroException() {
        super();
    }

    public ValidacaoCadastroException(String message) {
        super(message);
    }

    public ValidacaoCadastroException(String message, Throwable cause) {
        super(message, cause);
    }
}
