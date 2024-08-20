package ejercicio_If;

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
		for (String n:nombres) {
			if(n.equals(nom)) {
				contador++;
			}
		}
		System.out.println("El nombre aparece "+contador+" veces");

	}

}
