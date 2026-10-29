package APE_Clase3.Ejercicio5;
public class Prestamo {
    private Usuario usuario;
    private Libro libro;

    // Constructor
    public Prestamo(Usuario usuario, Libro libro) {
        this.usuario = usuario;
        this.libro = libro;
    }

    // Intenta prestar el libro y muestra el mensaje correspondiente
    public void registrar() {
        System.out.println("Procesando préstamo del libro '" + libro.getTitulo() + "' para " + usuario.getNombre() + "...");
        
        if (libro.prestar()) {
            System.out.println("ÉXITO: El libro fue prestado correctamente a " + usuario.getNombre() + ".");
        } else {
            System.out.println("ERROR: El libro '" + libro.getTitulo() + "' no está disponible actualmente.");
        }
        System.out.println("---------------------------------");
    }

    // Getters y Setters
    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }
}