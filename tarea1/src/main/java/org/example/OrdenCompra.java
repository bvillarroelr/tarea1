package org.example;

import java.util.Date;

public class OrdenCompra {
    private Date fecha;
    private String estado;
    private DetalleOrden detallito;
    public OrdenCompra() {
        fecha = new Date();
        estado = new String();
    }

    public DetalleOrden getDetallito() {
        return detallito;
    }

    public void setDetallito(DetalleOrden detallito) {
        this.detallito = detallito;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public float calcPrecioSinIVA() {
        ;
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
}
