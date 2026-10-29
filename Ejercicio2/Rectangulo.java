package APE_Clase3.Ejercicio2;
public class Rectangulo {
    private double base;
    private double altura;

    // Constructor
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    // Calcula y retorna el área (base * altura)
    public double calcularArea() {
        return base * altura;
    }

    // Calcula y retorna el perímetro (2 * (base + altura))
    public double calcularPerimetro() {
        return 2 * (base + altura);
    }

    // Evalúa si la base y la altura son iguales
    public boolean esCuadrado() {
        return base == altura;
    }

    // Retorna una cadena con el formato "Rectángulo de base x altura"
    public String obtenerDescripcion() {
        return "Rectángulo de " + base + " x " + altura;
    }

    // Imprime la descripción y todos los resultados calculados
    public void mostrar() {
        System.out.println(obtenerDescripcion());
        System.out.println("Área: " + calcularArea());
        System.out.println("Perímetro: " + calcularPerimetro());
        System.out.println("¿Es cuadrado?: " + (esCuadrado() ? "Sí" : "No"));
        System.out.println("---------------------------------");
    }

    // Getters y Setters
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}