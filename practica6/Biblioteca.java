import java.util.ArrayList;
public class Biblioteca {
    private ArrayList<Libro> libros;

    public Biblioteca() {
        libros = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        if (buscarLibroPorISBN(libro.getIsbn()) == null) {
            libros.add(libro);
            System.out.println("Libro '" + libro.getTitulo() + "' agregado a la biblioteca.");
        } else {
            System.out.println("El libro ya existe en la biblioteca.");
        }
    }

    public Libro buscarLibroPorISBN(String isbn) {
        for (Libro libro : libros) {
            if (libro.getIsbn().equals(isbn)) {
                return libro;
            }
        }
        return null;
    }

    public void prestarLibro(String isbn) {
        Libro libro = buscarLibroPorISBN(isbn);
        if (libro != null) {
            libro.prestar();
        } else {
            System.out.println("Libro no encontrado.");
        }
    }

    public void devolverLibro(String isbn) {
        Libro libro = buscarLibroPorISBN(isbn);
        if (libro != null) {
            libro.devolver();
        } else {
            System.out.println("Libro no encontrado.");
        }
    }

    public void mostrarLibros() {
        System.out.println("\nLibros en la biblioteca:");
        for (Libro libro : libros) {
            System.out.println("Título: " + libro.getTitulo() + ", Autor: " + libro.getAutor() + ", ISBN: " + libro.getIsbn() + ", Estado: " + libro.getEstado());
        }
    }
}
