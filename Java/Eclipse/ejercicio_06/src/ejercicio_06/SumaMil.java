package ejercicio_06;

public class SumaMil {

		public static void main (String[] args) {
			int contador= 0;
			int suma = 0;
			
			while(suma < 10) {
				contador++;
				suma = suma + contador;
				
			}
			System.out.println("Suma hasta: "+contador);
			
		}
}
