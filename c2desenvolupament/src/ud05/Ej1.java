package ud05;

import java.util.Scanner;
/*
 * Marc Lopez
 * Java 1.8
 * 
 * */

public class Ej1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Introducce dos valores para saber cual es el mas grande");

		System.out.println("Introduce el numero 1");
		String numero1 = sc.nextLine();
		System.out.println("Introduce el numero 2");
		String numero2 = sc.nextLine();

		sc.close();
		
		//Comparamos si es mas grande igual o mas pequeñp

		if (Integer.parseInt(numero1) > Integer.parseInt(numero2)) {

			System.out.println("El Numero " + numero1 + " es mas Grande a " + numero2 + " !");

		} else if (Integer.parseInt(numero1) == Integer.parseInt(numero2)) {
			System.out.println("El Numero " + numero1 + " es igual a " + numero2 + " !");

		} else {

			System.out.println("El Numero " + numero1 + " es mas Pequeño a " + numero2 + " !");

		}

	}

}
