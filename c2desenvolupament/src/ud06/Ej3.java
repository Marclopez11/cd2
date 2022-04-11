package ud06;
/*
 * Marc Lopez
 * Java 1.8
 * 
 * */

import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Saber si un numero es primo");
		int numero = sc.nextInt();

		
		

		if(numPrimo(numero)) {
			System.out.println("El numero es primo");

		}else {
			System.out.println("El numero no es primo");
		}
		
		
		

		sc.close();

	}

	public static boolean numPrimo(int numero) {

	        if (numero == 1) {
	            return false;
	        }
	        
	        for (int i = 2; i < numero - 1; i++) { // for (inicio ; final ; increment)
	            if (numero % i == 0) { // Si entra no es primo
	                return false;
	            }
	        }
	        return true; // Es primo
	}

	

	

}
