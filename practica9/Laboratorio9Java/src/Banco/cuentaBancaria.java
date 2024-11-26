package Banco;



public class cuentaBancaria {
    private String numeroCuenta;
    private double saldo;

    public cuentaBancaria(String numeroCuenta, Double saldoInicial){
        this.numeroCuenta=numeroCuenta;
        this.saldo=saldoInicial;
    }

    public void depositar(double cantidad) throws DepositoInvalidoException{
        if (cantidad<0){
            throw new DepositoInvalidoException("No se puede depositar una cantidad negativa");
        }
        saldo +=cantidad;
    }

    public void retirar(double cantidad) throws RetiroInvalidoException, FondosInsuficientesException{
        if (cantidad<0){
            throw new RetiroInvalidoException("No se puede retirar una cantidad negativa");
        }
        if (cantidad>saldo){
                throw new FondosInsuficientesException("Fondos insuficientes para retirar");
        }
        saldo -=cantidad;
    }

    public double getSaldo(){
        return saldo;
    }

    public String getNumeroCuenta(){
        return numeroCuenta;
    }
}
