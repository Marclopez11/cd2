package ud06;

/*
 * Marc Lopez
 * Java 1.8
 * 
 * */
import java.util.Scanner;

public class Ej10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Indica el tamaño de la array");
		int numero = sc.nextInt();
		int numeros[] = new int[numero];

		numeros = rellenarValores(numeros);

		mostrarArray(numeros);
		buscarNumeroGrande(numeros);

		sc.close();
	}

	public static int[] rellenarValores(int numeros[]) {

		int numeroAleatorio;

		//rellenar toda la array
		for (int i = 0; i < numeros.length; i++) {

			
			boolean correcto = false;
			
			//si no es primo seguira el bucle hasta encontrar uno
			while(!correcto) {

				numeroAleatorio = (int) Math.floor(Math.random() * (100 - 1 + 1) + 1);

				//si es primo no vuelve al while
			if (calcularNumeroPrimo(numeroAleatorio)) {
				numeros[i] = numeroAleatorio;
				correcto = true;
			} 

		}}

		return numeros;
	}

	public static void mostrarArray(int numeros[]) {

		//mostrar toda la array
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}

	}

	public static void buscarNumeroGrande(int numeros[]) {

		int numeromasgrande = 0;

		//compara los numeros y guarda el mas grande
		for (int i = 0; i < numeros.length; i++) {

			if (numeros[i] > numeromasgrande) {
				numeromasgrande = numeros[i];
			}

		}
		System.out.println("El numero mas grande es " + numeromasgrande);

	}

	private static boolean calcularNumeroPrimo(int num) {

		//calcula si es numero primo o no
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

}
