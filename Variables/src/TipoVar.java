public class TipoVar {
    public static void main(String[] args) {
        System.out.println("*** Uso de var en Java ***");
        // Sin el uso de var
        String nombre1 = "Juan";
        System.out.println("nombre1 = " + nombre1);
        // Con el uso de var
        var nombre2 = "Carlos"; // tipo String
        System.out.println("nombre2 = " + nombre2);
        // Definir otras variables usando var
        var edad = 30; // tipo int
        System.out.println("edad = " + edad);
        var sueldo = 5000.5F; // F = tipo flotante
        var esCasado = false; // tipo boolean
        esCasado = true;
        //esCasado = "No"; No podemos asignar un tipo distinto al valor creado al principio

        // Se debe definir su valor
        //var precio; Tenemos que inicializarlo desde el inicio
        //precio = 10;

        // Debe ser un dato posible
        //var apellido = null;
    }
}
