import java.util.*;

public class SumaDeNumerosHastaNConWhile {
    
    public static void main (String[] args){
        try (Scanner sc = new Scanner(System.in))   
        {
            System.out.println("Introduce el número N que calculará la suma de los números: ");
            int n = sc.nextInt();
            int num = 0;
            int i = 1;
            
            while(i <= n){
                num = num + i;
                i++;
            }//end while
            System.out.println("La suma de los números hasta " + n + " es: " + num);
        }//end try
    }//end main 
}//end class