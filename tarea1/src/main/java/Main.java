import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList lista = new ArrayList();
        System.out.println(lista.size());

        Direccion D1 = new Direccion("Calle Falsa 123");
        Pago P1 = new Pago(6000);
        Cliente C1 = new Cliente("Cliente1","959231591",D1);
        Articulo A1 = new Articulo("Objeto1","Soy un objeto de prueba",1,5);
        DetalleOrden DO1 = new DetalleOrden(2,A1);
        OrdenCompra O1 = new OrdenCompra(C1,"pedido",P1);
        O1.addDetalle(DO1);

        System.out.println(C1);
        System.out.println(A1);
        System.out.println(DO1);
        System.out.println(O1);
    }
}