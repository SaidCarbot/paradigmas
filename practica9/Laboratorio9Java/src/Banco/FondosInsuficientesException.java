package Banco;

// Excepción personalizada para fondos insuficientes
public class FondosInsuficientesException extends Exception {
    public FondosInsuficientesException(String mensaje) {
        super(mensaje);
    }
}
