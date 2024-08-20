package ejercicio_10;

import java.util.Scanner;

public class CortarVocales {

	public static void main(String[] args) {
		String cad;
		Scanner sc = new Scanner(System.in);
		int contador = 0;
		char letra;
		
		System.out.println("Introducir cadena de texto");
		cad = sc.nextLine();
		//Traduce todo a minúsculas
		cad = cad.toLowerCase();
		for (int i = 0 ; i < cad.length() ; i++) {
			//charAt() A partir de una posición da 
			//el caracter de dicha posición
			letra = cad.charAt(i);
			switch(letra) {
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
					contador++;
			}
		}
		System.out.println("Total de vocales: "+contador);

	}

}
