package ud05;
/*
 * Marc Lopez
 * Java 1.8
 * 
 * */

import java.util.Scanner;

public class Ej4 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Calcular área del cuadrado");

		
		System.out.println("Introducce el radio");
		String radio = sc.nextLine();
		sc.close();

		Double valorradio ;

		
		valorradio = Double.parseDouble(radio);
		

				
		System.out.println("Bienvenido "+Math.PI*Math.pow(valorradio , 2)+" !");

	}

}
