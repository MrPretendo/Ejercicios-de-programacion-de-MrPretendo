package ejercicio_If;
import java.util.*;

public class MayorNumeros {

	public static void main(String[] args) {
		
		System.out.println("Ingresa un número: ");
		var numero = Integer.parseInt(new Scanner(System.in).nextLine());
		
		var resultado = (numero % 5 == 0) ? "Es divisible" : "No es divisible";
		
		System.out.println("Resultado "+resultado);
		
		
	}
}
