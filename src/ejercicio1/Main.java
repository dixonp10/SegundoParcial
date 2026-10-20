package ejercicio1;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Estudiante e1 = new Estudiante("Ana", 9.0, 8.5, 9.5);
        Estudiante e2 = new Estudiante("Luis", 7.0, 6.5, 7.5);
        Estudiante e3 = new Estudiante("Maria", 5.0, 6.0, 6.5);
        Estudiante e4 = new Estudiante("Pedro", 4.0, 3.5, 5.0);
        Estudiante e5 = new Estudiante("Sofia", 8.0, 7.5, 9.0);

        Estudiante[] estudiantes = {e1, e2, e3, e4, e5};
        int aprobados = 0;

        System.out.println("=== NOTAS DEL CURSO ===");
        for (Estudiante e : estudiantes) {
            e.calcularPromedio();
            System.out.println(e.nombre + " : "
                    + String.format(Locale.US, "%.2f", e.promedio)
                    + " " + e.estado());
            if (e.promedio >= 7) {
                aprobados++;
            }
        }

        System.out.println("Estudiantes aprobados: " + aprobados);
    }
}

