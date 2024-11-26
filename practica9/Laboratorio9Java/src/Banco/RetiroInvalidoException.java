package Banco;

// Excepción personalizada para retiros inválidos
public class RetiroInvalidoException extends Exception {
  public RetiroInvalidoException(String mensaje) {
    super(mensaje);
  }
}