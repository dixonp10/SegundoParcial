package APE_Clase3.Ejercicio4;
public class Main {
    public static void main(String[] args) {
        // Crear 2 cuentas bancarias
        Cuenta cuenta1 = new Cuenta("Carlos Pérez", 500.0);
        Cuenta cuenta2 = new Cuenta("María López", 200.0);

        System.out.println("=== ESTADO INICIAL ===");
        cuenta1.mostrarInformacion();
        cuenta2.mostrarInformacion();
        System.out.println("---------------------------------\n");

        // 1. Transferencia válida (150.0 de cuenta1 a cuenta2)
        System.out.println("=== TRANSFERENCIA VÁLIDA ===");
        cuenta1.transferir(cuenta2, 150.0);

        // Mostrar estado tras la primera transferencia
        cuenta1.mostrarInformacion();
        cuenta2.mostrarInformacion();
        System.out.println("---------------------------------\n");

        // 2. Transferencia que falla (intentar transferir 600.0 cuando el saldo restante de cuenta1 es 350.0)
        System.out.println("=== TRANSFERENCIA FALLIDA ===");
        cuenta1.transferir(cuenta2, 600.0);

        // Mostrar estado final de ambas cuentas
        System.out.println("=== ESTADO FINAL ===");
        cuenta1.mostrarInformacion();
        cuenta2.mostrarInformacion();
    }
}