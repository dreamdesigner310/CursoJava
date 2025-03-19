public class generadorEmail {
    public static void main(String[] args) {
        // Datos Usuario
        System.out.println("*** Generador de Email ***");
        var nombreCompleto = " Miguel Sanchez Hernandez ";
        System.out.println("Nombre usuario: " + nombreCompleto);

        // Correcion Datos Usuario
        var nombreNormalizado = nombreCompleto.strip(); // Eliminar espacios principio y final
        nombreNormalizado = nombreNormalizado.replace(" ", "."); // Reemplazar espacios entre palabras por .
        nombreNormalizado = nombreNormalizado.toLowerCase(); // Convertir texto a minuscula
        System.out.println("Nombre usuario normalizado: " + nombreNormalizado);

        // Datos Empresa
        var nombreEmpresa = " Google ";
        System.out.println("\nNombre empresa: " + nombreEmpresa);
        var extensionDominio = ".com.es";
        System.out.println("Extension del dominio = " + extensionDominio);

        // Correcion Datos Empresa
        var nombreEmpresaNormalizado = nombreEmpresa.strip().replace(" ", ".").toLowerCase();
        var dominioEmailNormalizado = "@" + nombreEmpresaNormalizado + extensionDominio;
        System.out.println("Dominio Email normalizado = " + dominioEmailNormalizado);

        // Creacion de Email Final
        var emailNormalizado = nombreNormalizado + dominioEmailNormalizado;
        System.out.println("\nEmail Final Generado = " + emailNormalizado);
    }
}
