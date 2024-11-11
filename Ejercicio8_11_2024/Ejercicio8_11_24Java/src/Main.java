// Clase base
class Animal {
    protected int edad;
    private String color; // Atributo privado

    public Animal(int e) {
        edad = e;
    }

    public void hacerSonido() {
        System.out.println("El animal hace un sonido");
    }

    // Método comer
    public void comer() {
        System.out.println("El animal está comiendo");
    }

    // Métodos setColor y getColor
    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}

// Clase derivada Perro
class Perro extends Animal {
    public Perro(int e) {
        super(e);
    }

    public void setEdad(int e) {
        edad = e;
    }

    @Override
    public void hacerSonido() {
        System.out.println("El perro ladra");
    }

    @Override
    public void comer() {
        System.out.println("El perro está comiendo croquetas");
    }
}

// Clase derivada Gato
class Gato extends Animal {
    public Gato(int e) {
        super(e);
    }

    @Override
    public void hacerSonido() {
        System.out.println("El gato maúlla");
    }

    @Override
    public void comer() {
        System.out.println("El gato está comiendo pescado");
    }
}

// Clase derivada Pajaro
class Pajaro extends Animal {
    public Pajaro(int e) {
        super(e);
    }

    @Override
    public void hacerSonido() {
        System.out.println("El pájaro canta");
    }

    @Override
    public void comer() {
        System.out.println("El pájaro está comiendo semillas");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal miAnimal = new Animal(5);
        miAnimal.hacerSonido();
        miAnimal.comer();

        Perro miPerro = new Perro(7);
        miPerro.hacerSonido();
        miPerro.comer();

        Gato miGato = new Gato(3);
        miGato.hacerSonido();
        miGato.comer();

        Pajaro miPajaro = new Pajaro(2);
        miPajaro.hacerSonido();
        miPajaro.comer();

        // Usando setColor y getColor
        miPerro.setColor("Marrón");
        System.out.println("El color del perro es: " + miPerro.getColor());
    }
}

//Por Said Carbot Cruz Trejo
