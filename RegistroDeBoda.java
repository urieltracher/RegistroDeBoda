package registrodeboda;



/**
 *
 * @author maryse
 *
 * While
 * Programa RegistroDeBoda con un ciclo while y una terminación por petición del usuario.
 * Este programa solicita los registros para regalos en una boda.
 *
 */


import java.util.Scanner;

public class RegistroDeBoda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder registro = new StringBuilder();
        boolean masArticulos = true;

        System.out.print("¿Desea crear una lista de registro de bodas? (s/n): ");
        String respuesta = scanner.nextLine().trim();
        masArticulos = respuesta.equalsIgnoreCase("s");

        while (masArticulos) {
            String nombre = obtenerNombre(scanner);
            String tienda = obtenerTienda(scanner);
            registro.append(nombre).append(" - ").append(tienda).append("\n");

            System.out.print("¿Algún otro artículo? (s/n): ");
            respuesta = scanner.nextLine().trim();
            masArticulos = respuesta.equalsIgnoreCase("s");
        }

        if (registro.length() > 0) {
            System.out.println("\nRegistro de bodas:\n" + registro);
        } else {
            System.out.println("No se ha registrado ningún artículo.");
        }
    }

    public static String obtenerNombre(Scanner scanner) {
        System.out.print("Introduzca el nombre del artículo: ");
        return scanner.nextLine().trim();
    }

    public static String obtenerTienda(Scanner scanner) {
        System.out.print("Tienda: ");
        return scanner.nextLine().trim();
    }
}

