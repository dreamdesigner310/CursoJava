import java.util.Scanner;

public class SistemaDeEmpleados {
    public static void main(String[] args) {
        System.out.println("*** Sistema de Empleados ***");
        var datos = new Scanner(System.in);
        System.out.print("Introduce tu nombre: ");
        var nombre = datos.nextLine();
        System.out.print("Introduce tu edad: ");
        var edad = Integer.parseInt(datos.nextLine());
        System.out.print("Introduce tu salario: ");
        var salario = Double.parseDouble(datos.nextLine());
        System.out.print("¿Eres jefe de departamento? (True = si, False = no): ");
        var esJefe = Boolean.parseBoolean(datos.nextLine());

        System.out.println("\n*** Resumen de datos introducidos ***");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
//        System.out.println("Salario: " + salario + "€");
        System.out.printf("Salario: %.2f€%n", salario); // Limita el valor decimal a 2 digitos (%.2f) - además al no ser println, aplica al final un salto de línea (%n)
        System.out.println("Jefe: " + esJefe);
    }
}
