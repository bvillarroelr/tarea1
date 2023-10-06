import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList lista = new ArrayList();
        System.out.println(lista.size());

        Direccion D1 = new Direccion("Calle Falsa 123");
        Direccion D2 = new Direccion("308 Negra Arroyo Lane, Albuquerque, New Mexico, 87104");

        Pago P1 = new Pago(5000);
        Pago P2 = new Pago(100000);
        Pago P3 = new Pago(1000);
        Pago P4 = new Pago(3000);

        Cliente C1 = new Cliente("Patrick Bateman","19884864-6",D1);
        Cliente C2 = new Cliente("Walter White","20326142-k",D2);

        Articulo A1 = new Articulo("Set de Mancuernas","Dos mancuenas de 10kg cada una",22f,20000);
        Articulo A2 = new Articulo("PlayStation5","Consola de Videojuegos",5f,600000);
        Articulo A3 = new Articulo("Lapiz","Lapiz grafito A2",0.1f,500);
        Articulo A4 = new Articulo("MataMoscas","Mata Moscas de Plastico rojo de 40 cm",0.2f,4000);
        Articulo A5 = new Articulo("Campana","Soy un objeto de prueba",0.5f,10000);

        DetalleOrden DO1 = new DetalleOrden(2,A1);
        DetalleOrden DO2 = new DetalleOrden(1,A2);
        DetalleOrden DO3 = new DetalleOrden(3,A3);

        DetalleOrden DO4 = new DetalleOrden(1,A4);
        DetalleOrden DO5 = new DetalleOrden(1,A5);

        OrdenCompra O1 = new OrdenCompra(C1,"Por pagar",P1);
        OrdenCompra O2 = new OrdenCompra(C1,"Por pagar",P1);
        OrdenCompra O3 = new OrdenCompra(C1,"Por pagar",P1);

        // Informacion General del Sistema

        System.out.println(C1);
        System.out.println(C2 + "\n");

        System.out.println(A1);
        System.out.println(A2);
        System.out.println(A3);
        System.out.println(A4);
        System.out.println(A5 + "\n");

        // Informacion de los pedidos

        O1.addDetalle(DO1);
        O1.addDetalle(DO2);

        O2.addDetalle(DO3);

        O3.addDetalle(DO4);
        O3.addDetalle(DO5);

        System.out.println(O1 + "\n");
        System.out.println("Precio total (Sin IVA): " + O1.calcPrecio());
        System.out.println("Precio Real (Con IVA): " + (O1.calcIVA()) + O1.calcPrecio());
        System.out.println("Peso Total (kg): " + O1.calcPeso() + "\n");

        System.out.println(O2 + "\n");
        System.out.println("Precio total (Sin IVA): " + O2.calcPrecio());
        System.out.println("Precio Real (Con IVA): " + (O2.calcIVA()) + O2.calcPrecio());
        System.out.println("Peso Total (kg): " + O2.calcPeso() + "\n");

        System.out.println(O3 + "\n");
        System.out.println("Precio total (Sin IVA): " + O3.calcPrecio());
        System.out.println("Precio Real (Con IVA): " + (O3.calcIVA()) + O3.calcPrecio());
        System.out.println("Peso Total (kg): " + O3.calcPeso() + "\n");

    }
}