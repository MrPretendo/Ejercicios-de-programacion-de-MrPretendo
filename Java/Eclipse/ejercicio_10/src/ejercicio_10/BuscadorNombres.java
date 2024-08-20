package ejercicio_10;

import java.util.Scanner;

public class BuscadorNombres {

	public static void main(String[] args) {
		String lista, nom;
		String[] nombres;
		int contador = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce lista de nombres:");
		lista = sc.nextLine();
		System.out.println("Introduce nombre a buscar:");
		nom = sc.nextLine();
		
		nombres = lista.split(",");
		//Recorremos Arrays en busca del nombre
		// n es la variable que estará apuntando a
		// cada uno de los nombres del array
		for (String n:nombres) {
		//  No se una == porque es un comparador bool
		// .equals es un método que sirve para el mismo
		// fin, pero trabaja con String
			if(n.equals(nom)) {
				contador++;
			}
		}
		System.out.println("El nombre aparece "+contador+" veces");

	}

}
