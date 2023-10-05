package org.example;

import java.util.Date;

public class Pago {
    private float monto;
    private Date fecha;
    public Pago(){
        fecha = new Date();
    }
    public float getMonto() {
        return monto;
    }
}
