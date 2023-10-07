import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date fecha = new Date();
        ArrayList lista = new ArrayList();
        System.out.println(lista.size());

        Direccion D1 = new Direccion("Calle Falsa 123");
        Direccion D2 = new Direccion("308 Negra Arroyo Lane, Albuquerque, New Mexico, 87104");

        Tarjeta P1 = new Tarjeta(5000,"Credito","85623785623");
        Tarjeta P2 = new Tarjeta(100000,"Debito","53723958237");
        Efectivo P3 = new Efectivo(10000);
        Transferencia P4 = new Transferencia(2000,"BancoEstado","213458760k");

        Cliente C1 = new Cliente("Patrick Bateman","19884864-6",D1);
        Cliente C2 = new Cliente("Walter White","20326142-k",D2);

        Articulo A1 = new Articulo("Set de Mancuernas","Dos mancuenas de 10kg cada una",22f,20000);
        Articulo A2 = new Articulo("PlayStation5","Consola de Videojuegos",5f,600000);
        Articulo A3 = new Articulo("Lapiz","Lapiz grafito A2",0.1f,500);
        Articulo A4 = new Articulo("MataMoscas","Mata Moscas de Plastico rojo de 40 cm",0.2f,4000);
        Articulo A5 = new Articulo("Campana","Campana de mesa plateada",0.5f,10000);

        DetalleOrden DO1 = new DetalleOrden(2,A1);
        DetalleOrden DO2 = new DetalleOrden(1,A2);
        DetalleOrden DO3 = new DetalleOrden(3,A3);

        DetalleOrden DO4 = new DetalleOrden(1,A4);
        DetalleOrden DO5 = new DetalleOrden(1,A5);

        Boleta B1 = new Boleta("21742093-1","875385672905",fecha);
        Boleta B2 = new Boleta("21742093-1","875385672905",fecha);
        Factura B3 = new Factura("21742093-1","875385672905",fecha);
        OrdenCompra O1 = new OrdenCompra(C1,"Por pagar",P1,B1);
        OrdenCompra O2 = new OrdenCompra(C1,"Pagado",P1,B2);
        OrdenCompra O3 = new OrdenCompra(C1,"Por pagar",P1,B3);

        // Informacion General del Sistema
        System.out.println("Lista de Clientes en el Sistema:\n");
        System.out.println(C1);
        System.out.println(C2 + "\n");

        System.out.println("Lista de Articulos en el sistema:\n");
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

        O1.addPago(P1);
        O1.addPago(P2);
        O2.addPago(P3);
        O3.addPago(P4);

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