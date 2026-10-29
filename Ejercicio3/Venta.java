package APE_Clase3.Ejercicio3;
public class Venta {
    private int cantidad;

    // Constructor
    public Venta(int cantidad) {
        this.cantidad = cantidad;
    }

    // Aplica la venta recibiendo el objeto Producto como parámetro
    public void aplicar(Producto producto) {
        System.out.println("Procesando venta de " + cantidad + " unidad(es) de " + producto.getNombre() + "...");
        
        // Intenta reducir el stock en la clase Producto
        if (producto.reducirStock(cantidad)) {
            double total = cantidad * producto.getPrecio();
            System.out.println("Venta realizada con éxito.");
            System.out.println("Total a pagar: $" + total);
        } else {
            System.out.println("No se pudo completar la venta de " + producto.getNombre() + ".");
        }
        System.out.println("---------------------------------");
    }

    // Getter y Setter
    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}