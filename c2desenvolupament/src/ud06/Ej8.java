package ud06;

/*
 * Marc Lopez
 * Java 1.8
 * 
 * */

import java.util.Scanner;

public class Ej8 {

	public static void main(String[] args) {

		int numeros[] = new int[3];

		
		System.out.println("Introduce 10 numeros");

		
		
		rellenarValores(numeros);
		mostrarArray(numeros);


	}

	public static int[] rellenarValores(int numeros[]) {
		
		
		Scanner sc = new Scanner(System.in);
		
		//rellenar valores 
		for (int i = 0; i < numeros.length; i++) {

			System.out.println("Valor del numero " + i);
			int numero = sc.nextInt();
			numeros[i] += numero; 


		}
		return numeros;
	}

	public static void mostrarArray(int numeros[]) {
		
		//mostrar array

		for (int i = 0; i < numeros.length; i++) {

		System.out.println(numeros[i]);
		}
	}

}
