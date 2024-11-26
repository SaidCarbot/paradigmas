package Banco;

// Excepción personalizada para depósitos inválidos
public class DepositoInvalidoException extends Exception {
    public DepositoInvalidoException(String mensaje) {
        super(mensaje);
    }
}