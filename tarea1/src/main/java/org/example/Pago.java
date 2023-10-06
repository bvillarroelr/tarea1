package org.example;

import java.util.Date;

public class Pago {
    private float monto;
    private Date fecha;
    public Pago(float monto){
        fecha = new Date();
        this.monto = monto;
    }
    public float getMonto() {
        return monto;
    }
    public String ToString() {
        return "monto:" + monto + " fecha: " + fecha;
    }
}
