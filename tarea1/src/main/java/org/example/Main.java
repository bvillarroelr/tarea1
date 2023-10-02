package org.example;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Articulo rueda = new Articulo("Rueda", "Gira",10, 70000);
        Cliente c1 = new Cliente("David","21123456-k");
        OrdenCompra compra1 = new OrdenCompra();
        Date fecha = new Date(); // No se como funciona Date
    }
}