public class ReglasNombresVariables {
    public static void main(String[] args) {
        // Reglas nombres variables
        String nombreCompleto = "Juan Carlos"; // Correcto, y buenas practicas
        System.out.println("nombreCompleto = " + nombreCompleto);
        String NombreCompleto = "Juan Carlos 2"; // Correcto, no aplica buenas practicas (comienza por mayus)
        System.out.println("NombreCompleto = " + NombreCompleto);
        //String nombre-cliente = "Juan"; // Incorrecto
        String nombre_cliente = "Juan"; // Correcto, no aplica buenas practicas (usa _)
        String _apellido = "Perez"; // Correcto y aceptable
        String $apeliido = "Juarez"; // Correcto y aceptable
        int totPzs = 10; // Correcto, no aplica buenas practicas (abreviatura abusiva)
        int totalPiezas = 10; // Correcto, y buenas practicas
        boolean casado = true; // Correcto, aun puede mejorar
        boolean esCasado = true; // Correcto, y buenas practicas
        boolean isCasado = true; // Correcto, y buenas practicas *
        boolean tieneSaldo = true; // Correcto, y buenas practicas
        boolean hasSaldo = true; // Correcto, y buenas practicas *
    }
}
