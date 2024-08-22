/*Estás creando un programa de venta de entradas para un pequeño cine.
Los asientos se representan mediante una matriz bidimensional  2-
Cada elemento puede tener los valores 1 y 0 - 1 está ocupado, y 0 si está libre.
Tu programa debe tomar como entrada la fila y la columna del asiento y generar "Free" si está libre, y "Sold" si no es así. */


import java.util.Scanner;

public class ArrayMultiBucle_EntradasCine {
    public static void main(String[] args) {
                int[][] seats = {
        {0, 0, 0, 1, 1, 1, 0, 0, 1, 1}, //0
        {1, 1, 0, 1, 0, 1, 1, 0, 0, 0}, //1
        {1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, //2
        {0, 0, 0, 1, 1, 1, 1, 0, 0, 0}, //3
        {0, 1, 1, 1, 0, 0, 0, 1, 1, 1}  //4
        };
        
        try(Scanner sc = new Scanner(System.in)){
            
            System.out.print("Ingresa la fila: ");
                int row = Integer.parseInt(sc.nextLine());
            System.out.print("Ingresa la columna: ");
                int col = Integer.parseInt(sc.nextLine());
                
                /* 
                if(seats[row][col] == 0){
                    System.out.println("Free");
                }else{
                    System.out.println("Sold");
                }*/
                
                for (int i= 0; i < seats.length; i++){
                    for(int y = 0; y < seats [i].length; y++){
                        if (i == row && y == col){
                            if (seats [i][y] == 0){
                                System.out.println("Free");
                            }else{
                                System.out.println("Sold");
                            }
                        }
                    }
                }

        }//End Scanner
    }//End Main
}//End Class
