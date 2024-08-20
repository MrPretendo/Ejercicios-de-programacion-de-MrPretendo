import java.util.Scanner;

public class NumerosOrdenados {

    public static void main(String[] args) {
        // Usar try-with-resources para el Scanner
        try (Scanner sc = new Scanner(System.in)) {
            // Crear un array de 10 elementos
            int[] numeros = new int[10];
            int num, aux;
            
            // Solicitar entrada de datos
            for (int i = 0; i < numeros.length; i++) {
                System.out.println("Introducir números: ");
                num = sc.nextInt();
                
                // Repetir la lectura si la entrada no es un entero positivo
                while (num < 0) {
                    System.out.println("Introducir números positivos.");
                    num = sc.nextInt();
                }
                numeros[i] = num;
            }
            
            // Ordenar los números
            for (int i = 0; i < numeros.length; i++) {
                for (int k = i; k < numeros.length; k++) {
                    if (numeros[k] > numeros[i]) {
                        // Sustitución
                        // Lo que hay en i, meterlo en k
                        aux = numeros[i];
                        numeros[i] = numeros[k];
                        numeros[k] = aux;
                    }
                }
            }
            
            // Mostrar el contenido del array
            System.out.println("Los números son: ");
            for (int n : numeros) {
                System.out.print(n + ",");
            }
        } // El Scanner se cierra automáticamente aquí
    }//End main
}//End class