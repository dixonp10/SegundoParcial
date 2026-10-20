package ejercicio5;

public class Main {
    public static void main(String[] args) {
        Libro l1 = new Libro("Cien anos de soledad", "Gabriel Garcia Marquez");
        Libro l2 = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes");
        Libro l3 = new Libro("Huasipungo", "Jorge Icaza");
        Libro l4 = new Libro("El principito", "Antoine de Saint-Exupery");

        Socio s1 = new Socio("Juan Perez");
        Socio s2 = new Socio("Laura Mena");

        Libro[] libros = {l1, l2, l3, l4};
        Socio[] socios = {s1, s2};

        // El primer socio presta 2 libros y el segundo presta 1
        s1.prestar(l1);
        s1.prestar(l2);
        s2.prestar(l3);

        System.out.println("=== LIBROS ===");
        int disponibles = 0;
        for (Libro l : libros) {
            if (l.disponible) {
                System.out.println(l.titulo + " : Disponible");
                disponibles++;
            } else {
                System.out.println(l.titulo + " : Prestado");
            }
        }

        System.out.println();
        System.out.println("=== SOCIOS ===");
        for (Socio s : socios) {
            System.out.println(s.nombre + " : " + s.librosPrestados);
        }

        System.out.println();
        System.out.println("Libros disponibles: " + disponibles);
    }
}
