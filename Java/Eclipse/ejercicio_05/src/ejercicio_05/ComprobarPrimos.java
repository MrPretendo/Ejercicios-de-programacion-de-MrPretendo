package ejercicio_05;

import java.util.Scanner;

public class ComprobarPrimos {

	public static void main(String[] args) {
		boolean primo = true;
				
		System.out.print("Ingresa primer número: ");
		var n = Integer.parseInt(new Scanner(System.in).nextLine());
		
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				primo = false;
			}
		}
			if(primo) {
				System.out.print("El número "+n+" SÍ es mopri");
			}else {
				System.out.print("El número "+n+" no es mopri");
			}
	}

}
