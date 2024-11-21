public class Motocicleta extends Vehiculo{
    public Motocicleta(String marca, String modelo, int año) {
        super(marca, modelo, año);
    }

    @Override
    public void encender() {
        System.out.println("La motocicleta está encendida.");
    }

    @Override
    public void apagar() {
        System.out.println("La motocicleta está apagada.");
    }

    @Override
    public void describir() {
        System.out.println("Esta es una motocicleta de marca " + getMarca() + ", modelo " + getModelo() + ", del año " + getAño() + ".");
    }
}