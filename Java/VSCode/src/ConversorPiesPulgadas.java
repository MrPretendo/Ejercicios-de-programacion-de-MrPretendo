/*
Necesitas hacer un método que convierta un valor de pies a pulgadas.

1 pie tiene 12 pulgadas.

Define un método convert() que tome el valor foot como su argumento y de como resultado el valor de las pulgadas. El resultado debe ser un double. */
import java.util.Scanner;

public class ConversorPiesPulgadas {
    static void convert(double foot){
        double inch = 12;
        double num = foot * inch;
        System.out.println("El valor de pies a pulgadas es:" + num);
        
    }

    public static void main(String[] args){
            try(Scanner sc = new Scanner(System.in)){
            System.out.println("Valor de pies: ");
            double num = sc.nextDouble();
            convert(num);
            sc.close();
        }//End Try
    }//End Main
}//End Class
