import java.util.ArrayList; // Importar la clase ArrayList

// Clase base Empleado
class Empleado {
    private String nombre;
    private String id;
    private double salarioBase;

    public Empleado(String nombre, String id, double salarioBase) {
        this.nombre = nombre;
        this.id = id;
        this.salarioBase = salarioBase;
    }
    // Método abstracto para calcular el salario
    public double calcularSalario() {
        return salarioBase;
    }

    // Métodos Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
}

// Clase derivada EmpleadoTiempoCompleto
class EmpleadoTiempoCompleto extends Empleado {
    public EmpleadoTiempoCompleto(String nombre, String id, double salarioBase) {
        super(nombre, id, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() * 1.1; // 10% de bono
    }
}

// Clase derivada EmpleadoMedioTiempo
class EmpleadoMedioTiempo extends Empleado {
    public EmpleadoMedioTiempo(String nombre, String id, double salarioBase) {
        super(nombre, id, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() * 0.5; // 50% del salario base
    }
}

// Clase derivada EmpleadoPorHoras
class EmpleadoPorHoras extends Empleado {
    private int horasTrabajadas;
    private static final double TARIFA_POR_HORA = 15.0; // Tarifa fija por hora

    public EmpleadoPorHoras(String nombre, String id, double salarioBase) {
        super(nombre, id, salarioBase);
    }

    public void setHorasTrabajadas(int horas) {
        this.horasTrabajadas = horas;
    }

    @Override
    public double calcularSalario() {
        return horasTrabajadas * TARIFA_POR_HORA;
    }
}

// Clase principal con el método main
public class Main {
    public static void main(String[] args) {
        // Crear lista de empleados
        ArrayList<Empleado> empleados = new ArrayList<>();

        // Crear instancias de los diferentes tipos de empleados
        EmpleadoTiempoCompleto tiempoCompleto = new EmpleadoTiempoCompleto("Juan", "ID001", 3000);
        EmpleadoMedioTiempo medioTiempo = new EmpleadoMedioTiempo("Ana", "ID002", 3000);
        EmpleadoPorHoras porHoras = new EmpleadoPorHoras("Luis", "ID003", 3000);

        // Establecer horas trabajadas para el empleado por horas
        porHoras.setHorasTrabajadas(40); // Ejemplo: trabajó 40 horas

        // Agregar los empleados a la lista
        empleados.add(tiempoCompleto);
        empleados.add(medioTiempo);
        empleados.add(porHoras);

        // Calcular y mostrar los salarios para cada empleado en la lista
        for (Empleado empleado : empleados) {
            System.out.println("Salario de " + empleado.getNombre() + ": " + empleado.calcularSalario());
        }
    }
}
