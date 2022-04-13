package ud06;
/*
 * Marc Lopez
 * Java 1.8
 * 
 * */

import java.util.Scanner;

public class Ej7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// conversor de monedas
		System.out.println("A que moneda lo quieres convertir?");
		System.out.println("1- Convertir euro a libras");
		System.out.println("2- Convertir euro a dolares");
		System.out.println("3- Convertir euro a yenes");

		int operador = sc.nextInt();

		System.out.println("Cantidad");
		int numero = sc.nextInt();

		sc.close();

		switch (operador) {
		case 1:
			System.out.println(euroalibras(numero));
			break;
		case 2:
			System.out.println(euroaDolares(numero));
			break;
		case 3:
			System.out.println(euroaYenes(numero));
			break;

		default:
			break;
		}

	}

	public static long euroaDolares(int numero) {

		// conversor a dolares

		int resultado = 0;

		numero *= 0.86;

		return resultado;

	}

	public static long euroaYenes(int numero) {
		// conversor a yenes

		int resultado = 0;

		numero *= 1.28611;

		return resultado;
	}

	public static long euroalibras(int numero) {

		// conversor a libras
		numero *= 129.852;

		return numero;
	}

}
