import java.util.Date;
public class Transferencia extends Pago {
    private String banco;
    private String numCuenta;
    public Transferencia(float monto, Date fecha, String banco, String numCuenta) {
        super(monto);
        this.banco = banco;
        this.numCuenta = numCuenta;
    }
    public String toString() {
        Date fecha = getFecha();
        return "monto: " + getMonto() + ", fecha: " + fecha + ", " + banco + ", " + numCuenta;
    }
}
