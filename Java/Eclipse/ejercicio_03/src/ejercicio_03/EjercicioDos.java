package ejercicio_03;
import java.util.Scanner;

public class EjercicioDos{
//Es más eficiente usar un if else
	public static void main(String[] args) {
		System.out.println("Ingresa cantidad de paquetes vendidos: ");
		var unidadesVendidas = Integer.parseInt(new Scanner(System.in).nextLine());
		
		switch (unidadesVendidas) {
		case 1 :
			System.out.println("No se aplica descuento.");
			break;
		case 2 :
		case 3 :
			System.out.println("Se aplica un 5% de descuento.");
			break;
		case 4 :
		case 5 :
			System.out.println("Se aplica un 10% de descuento.");
			break;
		case 6 :
			System.out.println("15% de descuento.");
			break;
		default:
			System.out.println("Ingresa un valor válido.");
		}
	}

}
