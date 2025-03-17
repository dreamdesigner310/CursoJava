public class TiposDatos {
    public static void main(String[] args) {
        // Tipos de Datos en Java
        // Enteros (su valor default es 0)
        byte tipoByte = 127;
        System.out.println("tipoByte = " + tipoByte);
        short tipoShort = 32000;
        System.out.println("tipoShort = " + tipoShort);
        int tipoInt = 2147483647;
        System.out.println("tipoInt = " + tipoInt);
        long tipoLong = 987654321;
        System.out.println("tipoLong = " + tipoLong);

        // Punto Flotante (su valor default es 0.0)
        float tipoFloat = 3.14F; // F o f para indicar tipo float
        System.out.println("tipoFloat = " + tipoFloat);
        double tipoDouble = 3.1315;
        System.out.println("tipoDouble = " + tipoDouble);
        
        // Caracter (su valor default es '\u0000')
        char tipoChar = 'A'; // Caracteres unicode
        System.out.println("tipoChar = " + tipoChar);
        tipoChar = 65;
        System.out.println("tipoChar = " + tipoChar);
        tipoChar = '@';
        System.out.println("tipoChar = " + tipoChar);

        // Booleano (su valor default es false)
        boolean tipoBoolean = true;
        System.out.println("tipoBoolean = " + tipoBoolean);
        tipoBoolean = false;
        System.out.println("tipoBoolean = " + tipoBoolean);

        // Tipos Object
        String nombre = null; // null = Ausencia de una referencia a un objeto
        System.out.println("nombre = " + nombre);
        nombre = "Juan Perez";
        System.out.println("nombre = " + nombre);
    }
}
