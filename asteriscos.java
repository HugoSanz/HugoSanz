package asteriscos;

import java.util.Scanner;

public class asteriscos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Tomar la cadena de texto como entrada
        System.out.println("Ingrese una cadena de texto:");
        String input = scanner.nextLine();

        // Operación 1: Contar el número total de palabras
        int totalPalabras = contarPalabras(input);
        System.out.println("Número total de palabras: " + totalPalabras);

        // Operación 2: Reemplazar vocales con '*'
        String resultadoReemplazo = reemplazarVocales(input);
        System.out.println("Cadena con vocales reemplazadas: " + resultadoReemplazo);
    }

    // Método para contar el número total de palabras
    private static int contarPalabras(String cadena) {
        String[] palabras = cadena.split("\\s+");
        return palabras.length;
    }

    // Método para reemplazar vocales con '*'
    private static String reemplazarVocales(String cadena) {
        return cadena.replaceAll("[aeiouAEIOU]", "*");
    }
}
