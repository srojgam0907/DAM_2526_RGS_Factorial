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
		

		System.out.println("RESULTADO - El factorial del número " + num + " es " + factorialBucle(num));

		System.out.println("RESULTADO - El factorial del número " + num + " es " + factorialRec(num));

		System.out.println("Proceso completado usando el método recursivo.");

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
	
	private static long factorialBucle(int n) {
		//TODO: crea tu el contenido de esta función... si eres capaz
	
		long resultado=0;
		
		for (int i = 1; i <= n; i++) {
            resultado = resultado * i;
        }

		return resultado; 
	}
	
	/**
	 * Calcula el factorial de un número utilizando un enfoque recursivo.
	 *
	 * @param n Número entero del que se quiere obtener el factorial.
	 * @return Factorial de n, calculado mediante recursividad.
	 */
	private static long factorialRec(int n) {
	    if (n == 0 || n == 1) {
	      return 1;
	    }

	    return n * factorialRec(n - 1);
	}

}
