package ud06;
/*
 * Marc Lopez
 * Java 1.8
 * 
 * */

import java.util.Scanner;


public class Ej5 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);

		System.out.println("Introducir un numero para pasarlo a binario");
		int numero = sc.nextInt();


		sc.close();

		System.out.println(calcularNumeroaBinario(numero));
		
		
		
		
	}
	
	
	public static long calcularNumeroaBinario(int numero) {

		long binario = 0;
	    int digito;
	    final int DIVISOR = 2;
	    for (int i = numero, j = 0; i > 0; i /= DIVISOR, j++) {
	        digito = i % DIVISOR;
	        binario += digito * Math.pow(10, j);
	    }
	    return binario;
	}
	
	
	

}
