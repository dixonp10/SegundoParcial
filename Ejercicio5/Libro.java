package APE_Clase3.Ejercicio5;
public class Libro {
    private String titulo;
    private boolean disponible;

    // Constructor
    public Libro(String titulo) {
        this.titulo = titulo;
        this.disponible = true; // Por defecto el libro inicia disponible
    }

    // Intenta prestar el libro si está disponible
    public boolean prestar() {
        if (disponible) {
            disponible = false;
            return true;
        }
        return false;
    }

    // Marca el libro nuevamente como disponible
    public void devolver() {
        disponible = true;
    }

    // Getters y Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}