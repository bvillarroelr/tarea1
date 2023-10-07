import java.util.Date;
public class Tarjeta extends Pago {
    private String tipo;
    private String numTransaccion;
    public Tarjeta(float monto, Date fecha ,String tipo, String numTransaccion) {
        super(monto);
        this.tipo = tipo;
        this.numTransaccion = numTransaccion;
    }
    public String toString() {
        Date fecha = getFecha();
        return "monto:" + getMonto() + ", fecha: " + fecha + ", " + tipo + ", " + numTransaccion;
        }
    }