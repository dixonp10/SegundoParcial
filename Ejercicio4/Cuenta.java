package APE_Clase3.Ejercicio4;
public class Cuenta {
    private String titular;
    private double saldo;

    // Constructor
    public Cuenta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    // Método para depositar saldo
    public void depositar(double monto) {
        if (monto > 0) {
            this.saldo += monto;
        }
    }

    // Método para retirar saldo
    public boolean retirar(double monto) {
        if (monto > 0 && monto <= saldo) {
            this.saldo -= monto;
            return true;
        }
        return false;
    }

    // Método transferir que recibe la cuenta de destino como objeto y el monto a transferir
    public void transferir(Cuenta destino, double monto) {
        System.out.println("Intentando transferir $" + monto + " de " + this.titular + " a " + destino.getTitular() + "...");
        
        if (this.retirar(monto)) {
            destino.depositar(monto);
            System.out.println("Transferencia exitosa.");
        } else {
            System.out.println("Error: Fondos insuficientes o monto inválido.");
        }
        System.out.println("---------------------------------");
    }

    // Método para mostrar el estado de la cuenta
    public void mostrarInformacion() {
        System.out.println("Titular: " + titular + " | Saldo actual: $" + saldo);
    }

    // Getters y Setters
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}