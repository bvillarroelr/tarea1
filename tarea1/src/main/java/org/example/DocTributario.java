package org.example;

import java.util.Date;

public class DocTributario {
    private String numero;
    private String rut;
    private Date fecha;
    public DocTributario() {
        rut = new String();
        numero = new String();
        fecha = new Date();
    }
    public String toString() {
        return "numero: " + numero + ", RUT: " + rut + ", Fecha: " + fecha;
    }
}
