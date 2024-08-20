package ejercicio_04;
import java.util.*;

public class SumaPares {

	public static void main(String[] args) {
		System.out.print("Ingresa primer número: ");
		var numeroUno = Integer.parseInt(new Scanner(System.in).nextLine());
		System.out.print("Ingresa segundo número: ");
		var numeroDos = Integer.parseInt(new Scanner(System.in).nextLine());
		
		int mayor, menor;
		int suma = 0;
		
		if (numeroUno > numeroDos) {
			mayor = numeroUno;
			menor = numeroDos;
		}else {
			mayor = numeroDos;
			menor = numeroUno;
		}
			for(int i=menor; i<=mayor;i++) {
				if(i%2==0) {
					suma = suma + i;
				}
			}
		System.out.print("La suma de los pares es: "+suma);
	}

}
