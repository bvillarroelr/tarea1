import java.util.Date;

public class Pago {
    private float monto;
    private Date fecha;
    public Pago(float monto){
        this.monto = monto;
    }
    public float getMonto() {
        return monto;
    }
    public Date getFecha() {
        return fecha;
    }
}