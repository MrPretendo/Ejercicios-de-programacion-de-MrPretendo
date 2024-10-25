package OOP;
import java.util.Scanner;

public class HotelCustomerInfo{
    public static void main(String[] args) {
        System.out.println("Ingresar datos del cliente:");
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Nombre:");
            String firstname = sc.nextLine();
            System.out.println("Apellido:");
            String lastname = sc.nextLine();
            System.out.println("Edad:");
            int age = sc.nextInt();
            System.out.println("Numero de habitacion:");
            int roomNumber = sc.nextInt();
            
            Customer customer = new Customer();
        
            customer.firstname = firstname;
            customer.lastname = lastname;
            customer.age = age;
            customer.roomNumber = roomNumber;

            customer.savedCustomerInfo();

        }//End Catch
    }//End Scanner
}//End Main
 
class Customer {
    String firstname;
    String lastname;
    int age;
    int roomNumber;


    public void savedCustomerInfo() {
        System.out.println("Customer Information");
        System.out.println("Name: " + firstname + " " + lastname);
        System.out.println("Age: " + age);
        System.out.println("Room Number: " + roomNumber);
    }

}
