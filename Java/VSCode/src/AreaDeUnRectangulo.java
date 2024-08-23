import java.util.Scanner;

public class AreaDeUnRectangulo {
    
    static void printArea(int base, int altura){
        System.out.println(base * altura);
    }//End printArea

    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Base: ");
            int base = sc.nextInt();
            System.out.println("Altura: ");
            int altura = sc.nextInt();

            printArea(base, altura);
            sc.close();
        }//End Try
    }//End Main
}//End Class
