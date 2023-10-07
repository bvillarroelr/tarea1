import java.util.Date;

public class Boleta extends DocTributario {
    public Boleta(String rut, String numero, Date fecha) {
        super(rut,numero,fecha);
        fecha = new Date();
    }

}