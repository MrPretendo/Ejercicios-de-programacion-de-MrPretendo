
import java.util.Scanner;

public class CelciusAFahrenheit {
    
    static double fahr(double c){
        double temp = 1.8 *c + 32;
        return temp;
    }

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Ingresa grados celcius:");
            double c = sc.nextDouble();
            System.out.println("Los grados Fahrenheit son: ");
            System.out.println(fahr(c));
        sc.close();
        }
    }
}// End of class CelciusAFahrenheit