public class FormateoCadenas {
    public static void main(String[] args) {
        System.out.println("*** Formateo de Cadenas ***");
        var nombre = "Matias";
        var edad = 35;
        var salario = 21000.50;

        // String.format
        var mensaje = String.format("Nombre: %s, Edad: %d, Salario: %.2f", nombre, edad, salario); // s = string , d = entero , f = flotante
        System.out.println(mensaje);

        // Metodo printf
        System.out.printf("Nombre: %s, Edad: %d, Salario: %.2f%n", nombre, edad, salario);

        var numeroEmpleado = 12;
        // Formateo con texto block
        mensaje = """
                %nDetalle Persona:\s
                -----------------
                \tNombre: %s
                \tNº Empleado: %04d ** Minimo 4 digitos, sino se rellena con 0 a la izquierda **
                \tEdad: %d años
                \tSalario: %.2f
                """.formatted(nombre, numeroEmpleado, edad, salario);
        System.out.println(mensaje);

        // Formateo con tex block y printf directamente
        System.out.printf("""
                %nDetalle Persona:\s
                -----------------
                \tNombre: %s
                \tNº Empleado: %04d ** Minimo 4 digitos, sino se rellena con 0 a la izquierda **
                \tEdad: %d años
                \tSalario: %.2f
                """, nombre, numeroEmpleado, edad, salario);
    }
}
