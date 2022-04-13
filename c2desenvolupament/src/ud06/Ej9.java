package ud06;

/*
 * Marc Lopez
 * Java 1.8
 * 
 * */

import java.util.Scanner;

public class Ej9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		//tamaño de la array

		System.out.println("Indica el tamaño de la array");
		int numero = sc.nextInt();
		int numeros[] = new int[numero];

		
		rellenarValores(numeros);
		mostrarArray(numeros);

		sc.close();


	}

	public static int[] rellenarValores(int numeros[]) {

		int numeroAleatorio;

		//rellenar con numeros aleatorios entre los valores 0 y 9
		for (int i = 0; i < numeros.length; i++) {
			numeroAleatorio = (int) Math.floor(Math.random() * (0 - 9 + 1) + 9);
			numeros[i] += numeroAleatorio;
		}
		return numeros;
	}

	public static void mostrarArray(int numeros[]) {
		
		int sumadetodoslosvalores = 0;

		
		//mostrar array
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
			//suma
			sumadetodoslosvalores+= numeros[i];
		}
		
		//print suma
		System.out.println("La suma es "+sumadetodoslosvalores);
	}

}
