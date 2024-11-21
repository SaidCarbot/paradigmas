public class Auto extends Vehiculo {
    public Auto(String marca, String modelo, int año){
        super(marca, modelo, año);
    }

    @Override
    public void encender() {
        System.out.println("El auto está encendido.");
    }

    @Override
    public void apagar() {
        System.out.println("El auto está apagado.");
    }

    @Override
    public void describir() {
        System.out.println("Este es un auto de marca " + getMarca() + ", modelo " + getModelo() + ", del año " + getAño() + ".");
    }
}