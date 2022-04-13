package ud06;

import java.util.Scanner;

/*
 * Marc Lopez
 * Java 1.8
 * 
 * */

public class Ej11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Indica el tamaño de la array1");
		int tamñodelaarray1 = sc.nextInt();

		System.out.println("Indica el tamaño de la array2");
		int tamñodelaarray2 = sc.nextInt();

		int arraydenumeros[] = new int[tamñodelaarray1];

		int arraydenumeros2[] = new int[tamñodelaarray1];

		rellenarValores(arraydenumeros);

		//le associamos la arraydenumeros
		arraydenumeros2 = arraydenumeros;

		System.out.println("Print array1");
		mostrarArray(arraydenumeros);

		System.out.println("Print array2");
		mostrarArray(arraydenumeros2);

		sc.close();

	}

	public static int[] rellenarValores(int numeros[]) {

		int numeroAleatorio;

		//rellenar valores con numeros aleatorios de del 1 al 9
		for (int i = 0; i < numeros.length; i++) {
			numeroAleatorio = (int) Math.floor(Math.random() * (0 - 9 + 1) + 9);
			numeros[i] += numeroAleatorio;
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
