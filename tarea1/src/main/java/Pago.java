import java.time.LocalDateTime;
import java.util.Date;

public class Pago {
    private float monto;
    private Date fecha;
    public Pago(float monto){
        this.monto = monto;
        this.fecha = new Date();
    }
    public float getMonto() {
        return monto;
    }
    public Date getFecha() {
        return fecha;
    }
}