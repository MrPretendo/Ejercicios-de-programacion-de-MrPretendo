import java.util.Scanner;

public class ComprobarPrimos {

    public static void main(String[] args) {
        boolean primo = true;
        
        // Usar try-with-resources para el Scanner
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Ingresa primer número: ");
            int n = Integer.parseInt(sc.nextLine());
            
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    primo = false;
                    break; // Salir del bucle si ya no es primo
                }
            }
            
            if (primo) {
                System.out.print("El número " + n + " SÍ es primo");
            } else {
                System.out.print("El número " + n + " no es primo");
            }
        } // El Scanner se cierra automáticamente aquí
    }
}
