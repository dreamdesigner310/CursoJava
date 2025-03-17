public class OperadoresComparacion {
    public static void main(String[] args) {
        // Definimos las variables
        int a = 3, b = 2;
        // Igualdad ==
        var resultado = a == b;
        System.out.println("resultado a == b = " + resultado);
        // Distinto !=
        resultado = a != b;
        System.out.println("resultado a != b = " + resultado);
        // Mayor que
        resultado = a > b;
        System.out.println("resultado a > b = " + resultado);
        // Mayor igual que
        resultado = a >= b;
        System.out.println("resultado a >= b = " + resultado);
        // Menor que
        resultado = a < b;
        System.out.println("resultado a < b = " + resultado);
        // Menor igual que
        resultado = a <= b;
        System.out.println("resultado a <= b = " + resultado);
    }
}
