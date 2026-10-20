package ejercicio2;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Producto p1 = new Producto("Laptop", 850.00, 10);
        Producto p2 = new Producto("Mouse", 15.50, 20);
        Producto p3 = new Producto("Teclado", 32.00, 6);
        Producto p4 = new Producto("Monitor", 210.00, 7);

        Producto[] productos = {p1, p2, p3, p4};

        System.out.println("=== INVENTARIO INICIAL ===");
        for (Producto p : productos) {
            System.out.println(p.nombre + " : " + String.format(Locale.US, "%.2f", p.precio));
        }

        // Simulacion de ventas: 3 unidades de dos productos
        p3.vender(3);
        p4.vender(3);
        System.out.println();
        System.out.println("Venta realizada: 3 unidades de Teclado y 3 unidades de Monitor");

        System.out.println();
        System.out.println("=== INVENTARIO DESPUES DE LAS VENTAS ===");
        double total = 0;
        for (Producto p : productos) {
            String linea = p.nombre + " : " + String.format(Locale.US, "%.2f", p.precio)
                    + " (stock: " + p.stock + ")";
            if (p.stock < 5) {
                linea += " Reponer";
            }
            System.out.println(linea);
            total += p.precio * p.stock;
        }

        System.out.println("Valor total del inventario: " + String.format(Locale.US, "%.2f", total));
    }
}
