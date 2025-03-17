public class TiendaEnLinea {
    public static void main(String[] args) {
        System.out.println("*** Tienda en Linea ***");
        String nombreProducto = "Agua";
        double precioProducto = 5.5;
        int cantidadDisponible = 10;
        boolean estaDisponible = true;

        System.out.println("nombreProducto = " + nombreProducto);
        System.out.println("precioProducto = " + precioProducto);
        System.out.println("cantidadDisponible = " + cantidadDisponible);
        System.out.println("estaDisponible = " + estaDisponible);

        nombreProducto = "Refresco";
        precioProducto = 10.5;
        cantidadDisponible = 0;
        estaDisponible = false;

        System.out.println();
        System.out.println("nombreProducto = " + nombreProducto);
        System.out.println("precioProducto = " + precioProducto);
        System.out.println("cantidadDisponible = " + cantidadDisponible);
        System.out.println("estaDisponible = " + estaDisponible);
    }
}
