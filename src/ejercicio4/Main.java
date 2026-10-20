package ejercicio4;

public class Main {
    public static void main(String[] args) {
        Cuenta c1 = new Cuenta("Carlos", 200);
        Cuenta c2 = new Cuenta("Daniela", 350);

        System.out.println("=== CUENTA DE AHORRO: " + c1.titular + " ===");
        int meses1 = 0;
        while (c1.saldo < 500) {
            c1.saldo += 50;
            meses1++;
            System.out.println("Mes " + meses1 + " - " + c1.titular + " : " + (int) c1.saldo);
        }

        System.out.println();
        System.out.println("=== CUENTA DE AHORRO: " + c2.titular + " ===");
        int meses2 = 0;
        while (c2.saldo < 500) {
            c2.saldo += 50;
            meses2++;
            System.out.println("Mes " + meses2 + " - " + c2.titular + " : " + (int) c2.saldo);
        }

        System.out.println();
        System.out.println(c1.titular + " necesito " + meses1 + " meses");
        System.out.println(c2.titular + " necesito " + meses2 + " meses");
    }
}
