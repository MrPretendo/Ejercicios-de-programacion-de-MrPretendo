import java.util.*;

class DemoEQUALS {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String country = sc.nextLine();
            int age = Integer.parseInt(sc.nextLine());

            if((country.equals("US") || country.equals("GB")) && (age > 0 && age < 100)) {
                System.out.println("Allowed");
            }
        } catch (NumberFormatException e) {
        }
    }
}
