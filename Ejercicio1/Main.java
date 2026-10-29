package APE_Clase3.Ejercicio1;
public class Main {
    public static void main(String[] args) {
        // Crear objetos de tipo Autor
        Autor autor1 = new Autor("Gabriel García Márquez", "Colombiana");
        Autor autor2 = new Autor("Mario Vargas Llosa", "Peruana");

        // Crear 2 objetos de tipo Libro pasando el Autor correspondiente
        Libro libro1 = new Libro("Cien años de soledad", 1967, autor1);
        Libro libro2 = new Libro("La ciudad y los perros", 1963, autor2);

        // Mostrar la información de cada libro
        libro1.mostrarInformacion();
        libro2.mostrarInformacion();
    }
}
