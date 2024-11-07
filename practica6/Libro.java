public class Libro {

    private String titulo;
    private String autor;
    private String isbn;
    private String estado;

    public Libro(String titulo, String autor, String isbn) {
        this.titulo= titulo;
        this.autor= autor;
        this.isbn= isbn;
        this.estado= "disponible";
    }

    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public String getIsbn() { return isbn; }
    public String getEstado() { return estado; }

    public void prestar() {
        if (estado.equals("disponible")) {
            estado= "prestado";
            System.out.println("El libro '" + titulo + "' ha sido prestado.");
        } else {
            System.out.println("El libro '" + titulo + "' ya está prestado.");
        }
    }

    public void devolver() {
        if (estado.equals("prestado")) {
            estado = "disponible";
            System.out.println("El libro '" + titulo + "' ha sido devuelto.");
        } else {
            System.out.println("El libro '" + titulo + "' no está prestado.");
        }
    }
}
