
public class Articulo {
    private float peso;
    private String nombre;
    private String descripcion;
    private DetalleOrden detalle;
    private float precio;
    public Articulo(String nombre, String descripcion, float peso, float precio) {
        this.nombre = new String(nombre);
        this.descripcion = new String(descripcion);
        this.peso = peso;
        this.precio = precio;
    }

    public float getPeso() {
        return peso;
    }

    public float getPrecio() {
        return precio;
    }

    public String toString() {
        return nombre + " , Descripcion: " + descripcion + " , Peso: " + peso + " , Precio: " + precio;
    }
}
