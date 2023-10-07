public class Transferencia extends Pago {
    private String banco;
    private String numCuenta;
    public Transferencia(float monto, String banco, String numCuenta) {
        super(monto);
        this.banco = banco;
        this.numCuenta = numCuenta;
    }
    public String toString() {
        return "monto: " + getMonto() + ", fecha: " + getFecha() + ", " + banco + ", " + numCuenta;
    }
}
