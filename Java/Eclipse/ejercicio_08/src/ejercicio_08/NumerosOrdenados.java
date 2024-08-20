package ejercicio_08;
import java.util.*;

public class NumerosOrdenados {

	public static void main(String[] args) {
	//Se crea la instancia de entrada de datos
		Scanner sc = new Scanner(System.in);
	//¿Dónde se van a guuardar los datos?
	//Dentro de un array de 10 elementos
		int [] numeros = new int [10];
		int num, aux; 
	//Solicitud  entrada de datos
		for(int i = 0 ; i < numeros.length ; i++) {
			System.out.println("Introducir números: ");
			num = sc.nextInt();
	// Se repite la lectura si entrada no es int positivo
			while(num<0){
				System.out.println("Introducir números positivos.");
				num = sc.nextInt();
				}
			numeros[i]=num;
		}
	//Ordenación de los números
		for(int i = 0 ; i < numeros.length ; i++) {
			for(int k = i; k < numeros.length ; k++) {
				if(numeros[k] > numeros [i]) {
	//Sustitución
	//Lo que hay en i, meterlo en k
					aux = numeros[i];
					numeros[i] = numeros [k];
					numeros[k] = aux;
				}
			}
		}
	//Mostrar el contenido del Array
		System.out.println("Los números son: ");
		for(int n : numeros) {
			System.out.print(n+",");
		}
		
	}

}
