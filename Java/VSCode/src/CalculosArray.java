public class CalculosArray {

	public static void main(String[] args) {
		var media = 0.0;
		int max;
		int[] datos = {4,8,2,11,8,9,23,7,11,14};
		
		max = datos[0];
		for (int n:datos) {
			media = media + n;
			if(n>max) {
				max = n;
			}
		}
		/* length es igual a pasar por 
		   todos los elementos del array */
		media = media/datos.length;
		System.out.println("La media es: " +media);
		System.out.println("El mayor es: " +max);
	}
}
