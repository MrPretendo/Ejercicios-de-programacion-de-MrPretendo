import java.util.*;
package ejercicio_If;

public class CalculoNota {

	public static void main(String[] args) {
		System.out.println("Ingresa calificación: ");
		var nota = Integer.parseInt(new Scanner(System.in).nextLine());
		
		switch (nota) {
		case 1 : 
		case 2 :
		case 3 :
		case 4 :
		case 5 : 
			System.out.println("Nota pésima, mátate.");
			break;
		case 6 :
		case 7 :
		case 8 :
			System.out.println("Apenas y pasaste.");
			break;
		case 9 :
		case 10 :
			System.out.println("Aprobado.");
		default:
			System.out.println("Ingresa nota, culero");
		}

	}

}
