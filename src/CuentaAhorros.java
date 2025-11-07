public class CuentaAhorros extends Cuenta{
    private double interes;

    public CuentaAhorros(String numeroCuenta, double saldo, String titular, double interes) {
        super(numeroCuenta,saldo,titular);
        this.interes = interes;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Interes: " + interes);
    }
}