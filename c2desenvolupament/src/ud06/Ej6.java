package ud06;
/*
 * Marc Lopez
 * Java 1.8
 * 
 * */

import java.util.Scanner;

public class Ej6 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);

		

		System.out.println("Saber numero de cifras de un numero");
		int numero = sc.nextInt();

		
		sc.close();
		
		System.out.println(calcularCifras(numero));

		
	}
	
	
	public static int calcularCifras(int numero) {
		
		int resultado = 0;   
		//calculamos las cifras dividiendo entre 10
		while (numero!= 0) {  
			
			numero = numero/10; 
			resultado++;  
		}

		
		
		
		
		
		return resultado;
	}

}
