import java.util.Scanner;

public class ValorDentroRango {
    public static void main(String[] args) {
        System.out.println("*** Valor Dentro Rango ***");
        // Definimos los limites
        final var MINIMO = 0;
        final var MAXIMO = 5;
        // Solicitar un valor entre 0 y 5
        Scanner sc = new Scanner(System.in);
        System.out.print("Proporciona un dato entre 0 y 5: ");
        var dato = sc.nextInt(); // var dato = Integer.parseInt(new Scanner(System.in).nextLine()); OTRA MANERA MAS OPTIMIZADA SIN NECESIDAD DE DEFINIR UN OBJETO SCANNER
        // Verificar si el dato esta dentro de rango (tambien posible con IF por ejemplo)
        var estaDentroRango = dato >= MINIMO && dato <= MAXIMO;
        System.out.println("estaDentroRango? = " + estaDentroRango);
    }
}
