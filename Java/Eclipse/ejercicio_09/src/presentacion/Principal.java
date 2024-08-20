package presentacion;
import java.util.Scanner;
import logica.GestionNotas;
//Ctrl + Shift + o

public class Principal {

	public static void main(String[] args) {
		/*Crear un objeto de la clase que contiene las
		 * operaciones de la lógica de la aplicación*/
		GestionNotas gnotas = new GestionNotas();
		Scanner sc = new Scanner(System.in);
		int op; //Opción elegida
		do {
			System.out.println("1.- Agregar nota");
			System.out.println("2.- Ver nota media");
			System.out.println("3.- Ver aprobados");
			System.out.println("4.- Salir");
			
			op = Integer.parseInt(sc.nextLine());
			
			switch(op) {
			case 1:
				System.out.println("Nota: ");
				double d = Double.parseDouble(sc.nextLine());
				if(!gnotas.agregarNota(d)) {
					System.out.println("No se pudo agregar nota.");
				}
				break;
			case 2:
				System.out.println("Media:"+gnotas.media());
				break;
			case 3:
				System.out.println("Aprobados: "+gnotas.aprobados());
				break;
			case 4:
				break;
			default: 
				System.out.println("Introduce una opción.");
			}
		}while(op != 4);

	}

}
