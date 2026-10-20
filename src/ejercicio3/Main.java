package ejercicio3;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Mascota m1 = new Mascota("Firulais", "Perro", 5, 25.5);
        Mascota m2 = new Mascota("Misu", "Gato", 3, 4.2);
        Mascota m3 = new Mascota("Rocky", "Perro", 7, 32.0);

        Mascota[] mascotas = {m1, m2, m3};

        System.out.println("=== VETERINARIA ===");
        for (Mascota m : mascotas) {
            String linea = m.nombre + " : " + m.especie + " : "
                    + String.format(Locale.US, "%.1f", m.peso) + " kg";
            if (m.peso > 20) {
                linea += " Revisar peso";
            }
            System.out.println(linea);
        }

        System.out.println();
        System.out.println("=== REFERENCIAS ===");
        Mascota m4 = m1;
        m4.edad = m4.edad + 1;   // m4.edad += 1
        System.out.println("Edad de m1: " + m1.edad);

        /*
         * Explicacion: en Java las variables de objetos guardan una REFERENCIA
         * (la direccion en memoria del objeto), no una copia del objeto.
         * Al escribir "Mascota m4 = m1;" no se crea una mascota nueva: m4 y m1
         * apuntan al MISMO objeto. Por eso, al sumar 1 a m4.edad, el cambio se
         * ve tambien en m1.edad (paso de 5 a 6).
         */
    }
}
