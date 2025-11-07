public class CuentaCorriente extends Cuenta{
    private int sobregiro;

    public CuentaCorriente(String numeroCuenta, double saldo, String titular, int sobregiro) {
        super(numeroCuenta,saldo,titular);
        this.sobregiro = sobregiro;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Sobregiro: " + sobregiro);
    }
}
