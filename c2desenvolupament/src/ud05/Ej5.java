package ud05;

/*
 * Marc Lopez
 * Java 1.8
 * 
 * */

import java.util.Scanner;

public class Ej5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Introducce un numero para saber si es divisible entre 2");

		String valorterminal = sc.nextLine();
		int numero = Integer.parseInt(valorterminal);

		sc.close();

		if (numero % 2 == 0) {
			System.out.println("El numero " + numero + " es par");
		} else {
			System.out.println("El numero " + numero + " no es par");
		}

	}

}
