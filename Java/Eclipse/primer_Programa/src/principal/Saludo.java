package principal;

public class Saludo {

	public static void main(String[] args) {
		int a = 30;
		int b = 14;
		int div;
		//Operador ternario, otro tipo de if
		div = (a>b)? a/b : b/a;
		
		System.out.println("División "+div);
 
	}

}
