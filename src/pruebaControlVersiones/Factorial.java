package pruebaControlVersiones;

import java.util.Scanner;

public class Factorial {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
	    Scanner kb = new Scanner(System.in);
		int num=0;
		
		num= pedirNumero(kb); //LLamada al metodo
		
		if (num < 0) {
            System.out.println("ERROR: el número debe ser mayor o igual que 0.");
        } else {
            System.out.println("Has introducido el número: " + num);
        }
		
	}
	
	private static int pedirNumero(Scanner kb) {
	    System.out.print("Introduce un número entero mayor o igual que 0: ");
	    return kb.nextInt();
	}

}
