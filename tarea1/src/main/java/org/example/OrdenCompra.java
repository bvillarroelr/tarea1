package org.example;

import javax.print.Doc;
import java.util.Date;
// Falta ver como crear correctamente los objetos, y ver como funcionarán los parámetros del constructor.
// También, OrdenCompra debe tener la suma total de los precios dependiendo de LOS articulos que vaya a comprar el cliente
// OrdenCompra : métodos deben devolver suma de todos los precios. DetalleOrden: precio articulo * cantidad.
public class OrdenCompra {
    private Cliente cliente;
    private DocTributario documento;
    private Date fecha;
    private String estado;
    private DetalleOrden detalle;
    private DocTributario docTributario;
    public OrdenCompra(Cliente cliente) {
        fecha = new Date();
        estado = new String();
        this.cliente = cliente;
        documento = new DocTributario();
    }
    public float calcPrecioSinIVA() {
        return detalle.calcPrecioSinIVA();
    }
    public float calcIVA() {
        return 0;
    }
    public float calcPrecio() {
        return 0;
    }
    public float calcPeso() {
        return 0;
    }
    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public DetalleOrden getDetallito() {
        return detalle;
    }
    public void setDetallito(DetalleOrden detallito) {
        this.detalle = detallito;
    }

}
