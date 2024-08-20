package presentacion;

import java.util.Scanner;

import beans.Contacto;
import logica.GestionContactos;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		GestionContactos gestor = new GestionContactos();
		int op; //opción elegida
		
		do {
			String nombre;
			int edad;
			String email;
			
			System.out.println("1.- Añadir");
			System.out.println("2.- Buscar");
			System.out.println("3.- Mostrar todos");
			System.out.println("4.- Salir");
			
			op = Integer.parseInt(sc.nextLine());
			
			switch(op) {
			case 1:
				if (gestor.espacioLibre()) {
					System.out.println("Nombre: ");
					nombre = sc.nextLine();
					System.out.println("Edad: ");
				    edad=Integer.parseInt(sc.nextLine());
					System.out.println("Email: ");
					email = sc.nextLine();
					//
					gestor.agregar(nombre, edad, email);
				}else {
					System.out.println("Agenda llena, no hay espacio.");
				}
				break;
			
			case 2:
				System.out.println("Nombre: ");
				nombre = sc.nextLine();
				Contacto c = gestor.buscar(nombre);
				//Si es null, no se encontró
				if(c==null) {
					System.out.println("No se encontró el contacto.");
				}else {
					System.out.println(c.getNombre()+" - "+c.getEdad()+" - "+c.getEmail());
				}
				break;
				
			case 3:
				//La variable se guarda en el array devuelto
				Contacto[] todos = gestor.recuperarContactos();
				for(Contacto con:todos) {
					System.out.println(con.getNombre()+" - "+con.getEdad()+" - "+con.getEmail());
				}
				break;
			case 4:
				System.out.println("Escribe una opción válida.");
			}//fin switch
		}while(op!=4);
	}//Fin main

}
