import Banco.DepositoInvalidoException;
import Banco.FondosInsuficientesException;
import Banco.RetiroInvalidoException;
import Banco.cuentaBancaria;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws FondosInsuficientesException {
        Scanner scanner=new Scanner(System.in);

        // Crear una cuenta bancaria con un saldo inicial
        cuentaBancaria cuenta=new cuentaBancaria("123456789", 1000.0);

        boolean salir=false;

        while (!salir){
            System.out.println("\n--- Operaciones Bancarias ---");
            System.out.println("1. Depositar");
            System.out.println("2. Retirar");
            System.out.println("3. Ver saldo");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();

            try{
                switch (opcion){
                    case 1:
                        System.out.print("Ingrese la cantidad a depositar: ");
                        double cantidadDeposito = scanner.nextDouble();
                        cuenta.depositar(cantidadDeposito);
                        System.out.println("Depósito exitoso. Saldo actual: " + cuenta.getSaldo());
                        break;

                    case 2:
                        System.out.print("Ingrese la cantidad a retirar: ");
                        double cantidadRetiro = scanner.nextDouble();
                        cuenta.retirar(cantidadRetiro);
                        System.out.println("Retiro exitoso. Saldo actual: " + cuenta.getSaldo());
                        break;

                    case 3:
                        System.out.println("Saldo actual: " + cuenta.getSaldo());
                        break;

                    case 4:
                        salir=true;
                        System.out.println("Gracias por usar el sistema bancario.");
                        break;

                    default:
                        System.out.println("Opción inválida, intente de nuevo.");
                }
            } catch (DepositoInvalidoException e){
                System.out.println("Error: " + e.getMessage());
            } catch (RetiroInvalidoException e){
                System.out.println("Error: " + e.getMessage());
            } catch (FondosInsuficientesException e){
                System.out.println("Error: "+ e.getMessage());
            }
        }

        scanner.close();
    }
}
