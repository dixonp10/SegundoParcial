package APE_Clase3.Ejercicio3;
public class Main {
    public static void main(String[] args) {
        // Crear un producto con stock inicial de 10
        Producto prod1 = new Producto("Teclado Mecánico", 45.50, 10);
        prod1.mostrarProducto();

        // Realizar una venta válida (5 unidades)
        Venta venta1 = new Venta(5);
        venta1.aplicar(prod1);

        // Mostrar estado del producto tras la venta
        prod1.mostrarProducto();

        // Intentar realizar una venta superior al stock restante (intentar comprar 8 de 5 disponibles)
        Venta venta2 = new Venta(8);
        venta2.aplicar(prod1);

        // Mostrar estado final del producto
        prod1.mostrarProducto();
    }
}