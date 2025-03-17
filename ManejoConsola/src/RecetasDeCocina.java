import java.util.Scanner;

public class RecetasDeCocina {
    public static void main(String[] args) {
        System.out.println("*** Recetas de Cocina ***");
        var datos = new Scanner(System.in);

        System.out.print("Introduce el nombre de la receta: ");
        var nombreReceta = datos.nextLine();
        System.out.print("Introduce los ingredientes principales: ");
        var ingredientesPrincipales = datos.nextLine();
        System.out.print("Introduce el tiempo de preparación (min): ");
        var tiempoPreparacion = Integer.parseInt(datos.nextLine());
        System.out.print("Introduce la dificultad (Fácil, Media o Alta): ");
        var dificultadReceta = datos.nextLine();

        System.out.println("\n--- Receta Finalizada ---");
        System.out.println("\tNombre de la Receta: " + nombreReceta);
        System.out.println("\tIngredientes principales: " + ingredientesPrincipales);
        System.out.println("\tTiempo de preparacion: " + tiempoPreparacion + " min");
        System.out.println("\tDificultad: " + dificultadReceta);
    }
}
