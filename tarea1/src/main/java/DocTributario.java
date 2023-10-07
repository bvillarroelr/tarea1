import java.util.Date;
public class DocTributario {
    // Doc Tributario tiene la informacion del vendedor
    private String numero;
    private String rut;
    private Date fecha;
    public DocTributario(String rut, String numero, Date fecha) {
        this.rut = rut;
        this.numero = numero;
        fecha = new Date();
    }
    public String toString() {
        return "numero: " + numero + ", RUT: " + rut + ", Fecha: " + fecha;
    }
}
