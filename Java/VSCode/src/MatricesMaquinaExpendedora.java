/*Estás haciendo un programa para una máquina expendedora de bebidas. El menú de las bebidas se almacena en una matriz llamada menu: 
String[] menu = {"Tea", "Espresso", "Americano", "Water", "Hot Chocolate"}; 
Toma la elección del cliente como un número entero de entrada y genera el elemento de menú correspondiente.
Además, comprueba si hay errores: en caso de que la entrada esté fuera del rango de la matriz, genera "Invalid". */

import java.util.Scanner;

public class MatricesMaquinaExpendedora {
    public static void main(String[] args) {
        
        System.out.println("Seleccionar una bebida: ");
        System.out.println("1. Tea\n2. Espresso\n3. Americano\n4. Water\n5. Hot Chocolate");

        String[] menu = {"Tea", "Espresso", "Americano", "Water", "Hot Chocolate"};

        // Usar try-with-resources para manejar el Scanner y cerrarlo automáticamente
        try (Scanner sc = new Scanner(System.in)) {
            int seleccion = sc.nextInt();

            // Verificar si la selección está en el rango válido (1 a 5)
            if (seleccion >= 1 && seleccion <= 5) {
                System.out.println(menu[seleccion - 1]); // Ajustar índice para el array
            } else {
                System.out.println("Invalido");
            }
        } // No se necesita cerrar manualmente el Scanner; se cierra automáticamente al final del bloque try

    }//End program

}//End class
