package APE_Clase3.Ejercicio5;
public class Main {
    public static void main(String[] args) {
        // Crear 2 usuarios
        Usuario usuario1 = new Usuario("Ana Gómez", "1801234567");
        Usuario usuario2 = new Usuario("Luis Torres", "1809876543");

        // Crear 1 libro
        Libro libro1 = new Libro("Cien años de soledad");

        // Primer intento de préstamo (debe ser exitoso)
        Prestamo prestamo1 = new Prestamo(usuario1, libro1);
        prestamo1.registrar();

        // Segundo intento de préstamo sobre el mismo libro (debe fallar)
        Prestamo prestamo2 = new Prestamo(usuario2, libro1);
        prestamo2.registrar();
    }
}
