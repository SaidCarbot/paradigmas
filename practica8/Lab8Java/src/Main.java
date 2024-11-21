import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Vehiculo> vehiculos = new ArrayList<>();

        vehiculos.add(new Auto("Toyota", "Corolla", 2020));
        vehiculos.add(new Motocicleta("Yamaha", "R1", 2019));
        vehiculos.add(new Camion("Volvo", "FH16", 2022));

        for (Vehiculo vehiculo : vehiculos) {
            vehiculo.encender();
            vehiculo.describir();
            vehiculo.apagar();
            System.out.println();
        }
    }
}