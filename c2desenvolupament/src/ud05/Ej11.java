package ud05;

import java.util.Scanner;
/*
 * Marc Lopez
 * Java 1.8
 * 
 * */

public class Ej11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("¿Que dia de la semana es hoy?");

		String diadelasemana = sc.nextLine();
		sc.close();

		diadelasemana = diadelasemana.toLowerCase();
		
		//depende del dia de la semana entrara en un case para mostrarnos sus valores

		switch (diadelasemana) {
		case "lunes":
			System.out.println("Lunes día laboral");
			break;
		case "martes":
			System.out.println("Martes día laboral");
			break;
		case "miercoles":
			System.out.println("Miercoles día laboral");
			break;
		case "jueves":
			System.out.println("Jueves día laboral");
			break;
		case "viernes":
			System.out.println("Viernes día laboral");
			break;
		case "sabado":
			System.out.println("Sabado no laboral");
			break;
		case "domingo":
			System.out.println("Domingo no laboral");
			break;
		default:
			System.out.println("Lunes no laboral");
			break;
		}
	}
}
