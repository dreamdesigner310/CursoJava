import java.util.Random;
import java.util.Scanner;

public class GeneradorID {
    public static void main(String[] args) {
        System.out.println("*** Generador de ID único ***");
        var datos = new Scanner(System.in);
        var random = new Random();

        System.out.print("Introduzca su nombre: ");
        var nombre = datos.nextLine();
        System.out.print("Introduzca su apellido: ");
        var apellido = datos.nextLine();
        System.out.print("Introduzca su año de nacimiento (YYYY): ");
        var nacimiento = datos.nextLine();

        // Normalizar los valores
        var nombre2 = nombre.trim().toUpperCase().substring(0, 2); // trim - elimina espacios antes y despues / upper - convierte a mayuscula / sub - toma los datos en el indice 0 y 2 (toma la 0 y 1 ya que el 2 no lo cuenta)
        var apellido2 = apellido.trim().toUpperCase().substring(0, 2);
        var nacimiento2 = nacimiento.trim().substring(2); // comienza por el indice 2

        var numeroAleatorio = random.nextInt(9999) + 1;

        // Formato 4 digitos
        var numeroAleatorioFormato = String.format("%04d", numeroAleatorio);

        // Generar ID único
        var idUnico = nombre2 + apellido2 + nacimiento2 + numeroAleatorioFormato;

        System.out.printf("""
                %nHola %s,
                \tTu nuevo número de identificación (ID) generado por el sistema es:
                \t%s
                """, nombre, idUnico);
    }
}
