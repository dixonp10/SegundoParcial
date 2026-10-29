package APE_Clase3.Ejercicio1;
public class Libro {
    private String titulo;
    private int anio;
    private Autor autor; // Atributo de tipo Autor (Objeto como atributo)

    // Constructor
    public Libro(String titulo, int anio, Autor autor) {
        this.titulo = titulo;
        this.anio = anio;
        this.autor = autor;
    }

    // Método para imprimir la información del libro y el autor
    public void mostrarInformacion() {
        System.out.println("Título: " + titulo);
        System.out.println("Año de publicación: " + anio);
        System.out.println("Autor: " + autor.getNombre());
        System.out.println("---------------------------------");
    }

    // Getters y Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }
}