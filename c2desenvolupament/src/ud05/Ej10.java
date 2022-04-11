package ud05;

import java.util.Scanner;
/*
 * Marc Lopez
 * Java 1.8
 * 
 * */


public class Ej10 {

	public static void main(String[] args) {
		
		int numeroventas;
		int valorproducto;
		int sumadeproductos = 0;

		Scanner sc = new Scanner(System.in);

		//numero de ventas 
		System.out.println("Introducce el número de ventas");

		String numeroventasporteclado = sc.nextLine();

		numeroventas = Integer.parseInt(numeroventasporteclado);

		
		//depende del numero de ventas nos solicitara los productos
		for (int i = 1; i <= numeroventas; i++) {

			System.out.println("Valor de el producto numero " + i);
			String valorprductoporteclado = sc.nextLine();
			valorproducto = Integer.parseInt(valorprductoporteclado);
			//suma de todos los productos
			sumadeproductos += valorproducto;
			

			System.out.println();
		}

		
		
		System.out.println("La suma de los productos es " + sumadeproductos);

		sc.close();

	}

}
