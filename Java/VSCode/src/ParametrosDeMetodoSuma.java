import java.util.Scanner;
public class ParametrosDeMetodoSuma {

    static void sum(int x, int y) {
        System.out.println(x + y);
    }//End sum

    public static void main (String[] args){
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Valor de X: ");
            int x = sc.nextInt();
            System.out.println("Valor de Y: ");
            int y = sc.nextInt();
            
            sum(x,y);
            sc.close();
        }//End try
    }
}//End Class