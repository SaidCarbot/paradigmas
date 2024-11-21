public class Camion extends Vehiculo {
    public Camion(String marca, String modelo, int año) {
        super(marca, modelo, año);
    }

    @Override
    public void encender() {
        System.out.println("El camión está encendido.");
    }

    @Override
    public void apagar() {
        System.out.println("El camión está apagado.");
    }

    @Override
    public void describir() {
        System.out.println("Este es un camión de marca " + getMarca() + ", modelo " + getModelo() + ", del año " + getAño() + ".");
    }
}