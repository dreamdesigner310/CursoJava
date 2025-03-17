import java.util.Scanner;

public class SistemaDescuentosVIP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        var NO_PRODUCTOS_DESCUENTO = 10;
        System.out.println("*** Sistema de Descuentos VIP");

        System.out.println("¿Cuantos articulos ha comprado?");
        int articulos = sc.nextInt(); // var articulos = Integer.parseInt(consola.nextLine());
        System.out.println("¿Cuenta con la membresia de la tienda? (True/false)");
        boolean membresia = sc.nextBoolean(); // var mebresia = Boolean.parseBoolean(consola.nextLine());

        if (articulos >= 10 && membresia == true) {
            System.out.println("Tiene usted un descuento VIP");
        } else {
            System.out.println("Usted no tiene descuento VIP");
        }

//        var esElegibleDescuento = articulos >= NO_PRODUCTOS_DESCUENTO && membresia;
//        System.out.println("Tienes acceso al descuento VIP ? = " + esElegibleDescuento);
    }
}
