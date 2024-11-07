public class SimulacionBiblioteca {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Libro libro1 = new Libro("El Quijote", "Miguel de Cervantes", "12345");
        Libro libro2 = new Libro("1984", "George Orwell", "67890");
        Libro libro3 = new Libro("Cien Años de Soledad", "Gabriel García Márquez", "54321");

        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
        biblioteca.agregarLibro(libro3);

        biblioteca.mostrarLibros();

        biblioteca.prestarLibro("67890");
        biblioteca.mostrarLibros();

        biblioteca.prestarLibro("67890");

        biblioteca.devolverLibro("67890");
        biblioteca.mostrarLibros();

        biblioteca.devolverLibro("54321");
    }
}
