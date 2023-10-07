import java.util.Date;

public class Factura extends DocTributario {

    public Factura(String rut, String numero, Date fecha) {
        super(rut,numero,fecha);
        fecha = new Date();
    }

}