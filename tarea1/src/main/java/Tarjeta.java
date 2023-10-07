import java.util.Date;
public class Tarjeta extends Pago {
    private String tipo;
    private String numTransaccion;
    public Tarjeta(float monto,String tipo, String numTransaccion) {
        super(monto);
        this.tipo = tipo;
        this.numTransaccion = numTransaccion;
    }
    public String toString() {
        return "monto:" + getMonto() + ", fecha: " + getFecha() + ", " + tipo + ", " + numTransaccion + getFecha();
        }
    }