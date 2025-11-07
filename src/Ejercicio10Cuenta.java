public class Ejercicio10Cuenta {
    public static void main(String[] args) {
        Cuenta cuenta1 = new CuentaAhorros("ES1234569456", 1954.33, "Ismael", 3.5);
        cuenta1.mostrarInfo();

        System.out.println("----------------");

        Cuenta cuenta2 = new CuentaCorriente("ES1236523535", 135.87, "Zaira", -564);
        cuenta2.mostrarInfo();
    }
}
