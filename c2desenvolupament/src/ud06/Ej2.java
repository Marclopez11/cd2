package ud06;

import java.util.Scanner;

/*
 * Marc Lopez
 * Java 1.8
 * 
 * */

public class Ej2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Tamaño de la array");
		int tamñodelaarray = sc.nextInt();

		System.out.println("Numeros aleatorios entre rangos");

		System.out.println("Numero minimo");
		int rango1 = sc.nextInt();

		System.out.println("Numero del maximo");
		int rango2 = sc.nextInt();

		int arraydenumeros[] = numAleatorio(tamñodelaarray, rango1, rango2);

		mostrarNumeros(arraydenumeros);

		sc.close();

	}

	public static int[] numAleatorio(int tamñodelaarray, int rango1, int rango2) {

		int array[] = new int[tamñodelaarray];
		int numeroAleatorio;

		for (int i = 0; i <tamñodelaarray; i++) {
			numeroAleatorio = (int) Math.floor(Math.random() * (rango1 - rango2 + 1) + rango2);
			array[i] += numeroAleatorio;

		}

		return array;

	}

	public static void mostrarNumeros(int[] arraydenumeros) {
		for (int i = 0; i < arraydenumeros.length; i++) {

			System.out.println(arraydenumeros[i]);

		}
	}

}
