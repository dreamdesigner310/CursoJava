public class OperadoresUnarios {
    public static void main(String[] args) {
        // Definimos las variables, y en este caso inicializamos una vacia (resultado)
        int a = 3 , b = -2, resultado;
        var c = true;
        // Operador unario +
        resultado = +a; // Indica que el valor es positivo, solo lo indica no modifica
        System.out.println("resultado +a = " + resultado);
        // Operador unario -
        resultado = -a; // Invierte el valor
        System.out.println("resultado -a = " + resultado);

        // Operadores unarios incremento/decremento
        // Pre-incremento
        a = 3;
        resultado = ++a; // Primero se incrementa el valor
        System.out.println("resultado ++a = " + resultado);
        System.out.println("a ya se incremento = " + a);
        // Post-incremento
        a = 3;
        resultado = a++; // Primero se usa el valor y despues se incrementa
        System.out.println("resultado a++ = " + resultado);
        System.out.println("a en este momento se incrementa = " + a); // Ya que es la siguiente vez que se utiliza

        // Pre-decremento
        b = -2;
        resultado = --b; // Primero se decrementa y despues se usa el valor
        System.out.println("resultado --b = " + resultado);
        System.out.println("b ya se decremento = " + b);
        // Post-decremento
        b = -2;
        resultado = b--; // Primero se usa el valor y despues se decrementa
        System.out.println("resultado b-- = " + resultado);
        System.out.println("b en este momento se decrementa = " + b); // Ya que es la siguiente vez que se utiliza
    }
}
