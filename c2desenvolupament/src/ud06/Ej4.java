package ud06;

import java.util.Iterator;
import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Introducir un numero para calcular el factorial");
		int numero = sc.nextInt();

		System.out.println(calcularFactorial(numero));

		sc.close();

	}

	public static long calcularFactorial(int numero) {

		int resultado = 1;
		for (int i = 1; i < numero + 1; i++) {
			resultado *= i;
		}

		return resultado;
	}

}
