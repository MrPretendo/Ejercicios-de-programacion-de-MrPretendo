package logica;

import beans. Contacto;

public class GestionContactos {
	private Contacto[] contactos;
	private int total;
	public GestionContactos() {
		contactos = new Contacto[10];
		total = 0;
		
	}
	public boolean espacioLibre() {
		//Devuelve verdadero si hay espacio
		//Para un nuevo contacto
		if(total<10) {
			return true;
		}else {
			return false;
		}
	}
	public boolean agregar(String nombre, int edad, String email) {
		if(total<10) {
			Contacto c = new Contacto (nombre, edad, email);
			contactos[total] = c;
			total++;
			return true;
		}else {
			return false;
		}
	}
		public Contacto buscar(String nombre) {
			Contacto c = null;
			for(int i = 0 ; i < total ; i++) {
			//Si el nombre del contacto al que se accede coincide	
			//con el parámetro, entonces se ha encontrado
			if(contactos[i].getNombre().equals(nombre)) {
				c = contactos[i];
				break; //Se corta la comprobación
			}
		}
			return c;
	}
	public Contacto[] recuperarContactos() {
		//Se crea un array con el tamaño de los existentes
		//y devuelve  en él los contactos almacenados
		Contacto[] existentes = new Contacto[total];
		for(int i = 0 ; i < total ; i++) {
			existentes [i] = contactos [i];
			
		}
		return existentes;
	}
	
	
}
