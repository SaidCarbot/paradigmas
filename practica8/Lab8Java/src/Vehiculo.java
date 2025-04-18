public abstract class Vehiculo {
    private String marca;
    private String modelo;
    private int año;

    public Vehiculo(String marca, String modelo, int año) {
        this.marca=marca;
        this.modelo=modelo;
        this.año=año;
    }

    public abstract void encender();
    public abstract void apagar();
    public abstract void describir();

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAño() {
        return año;
    }
}