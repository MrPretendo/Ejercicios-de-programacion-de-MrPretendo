import java.util.Scanner;

public class metodoBot {
    
    static void bot(){
        try(Scanner sc = new Scanner(System.in)){
        System.out.println("Ingresar palabra claven:");
        System.out.println("1 = Order confirmed:\n2 = info@sololean");
        int x = Integer.parseInt(sc.nextLine());

        switch (x) {
            case 1 -> System.out.println("Order confirmed");
            case 2 -> System.out.println("info@sololearn.com");
            default -> System.out.println("Try again");
        }
    }
}

    /*
    User message: "1", Reply: "Order confirmed"
    User message: "2", Reply: "info@sololearn.com"
    For any other number, the reply should be: "Try again". 
    */
    public static void main(String[] args) {
        bot();      
    }
}//End Program