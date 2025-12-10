package pruebaControlVersiones;

import java.util.Scanner;

public class Factorial {
	private static Scanner kb = new Scanner(System.in);
	
	public static void main(String[] args) {
	    
		int num=0;
		
		num= pedirNumero(); //LLamada al metodo
		
		if (num < 0) {
            System.out.println("ERROR: el número debe ser mayor o igual que 0.");
        } else {
            System.out.println("Has introducido el número: " + num);
        }
		
		System.out.println("RESULTADO - En versiones posteriores se calculará el factorial del número " + num);

	}
	
	private static int pedirNumero() {
		int num;
	    boolean valido;

	    do {
	        System.out.print("Introduce un número entero mayor o igual que 0: ");
	        if (kb.hasNextInt()) {
	            num = kb.nextInt();
	            valido = true;
	        } else {
	            System.out.println("Entrada no válida. Introduce un entero.");
	            kb.next();
	            valido = false;
	            num = -1;
	        }
	    } while (!valido);

	    return num;
	}

}
