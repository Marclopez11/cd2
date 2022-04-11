package ud07;

import java.util.Enumeration;
import java.util.Hashtable;
/*
 * Marc Lopez
 * Java 1.8
 * 
 * */
import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Hashtable<String, Double> notaalumnos = new Hashtable<String, Double>();

		System.out.println("1 - Para crear un alumno 2 - Mostrar alumnos -  3- Buscar Alumno 0 - Para salir");
		int proces = sc.nextInt();

		while (proces != 0) {

			switch (proces) {
			case 1:
				System.out.println("Nombre de el alumno");
				String alumno = sc.next();

				System.out.println("Nota 1");
				int nota1 = sc.nextInt();

				System.out.println("Nota 2");
				int nota2 = sc.nextInt();

				System.out.println("Nota3");
				int nota3 = sc.nextInt();

				double media = calcularMedia(nota1, nota2, nota3);
				notaalumnos.put(alumno, media);

				System.out.println("1 - Para crear un alumno 2 - Mostrar alumnos -  3- Buscar Alumno 0 - Para salir");
				proces = sc.nextInt();

				break;
			case 2:

				System.out.println(notaalumnos.toString());
				System.out.println("1 - Para crear un alumno 2 - Mostrar alumnos -  3- Buscar Alumno 0 - Para salir");
				proces = sc.nextInt();

				break;
				
			case 3:

				System.out.println("Buscar alumno");
				String alum = sc.next();
				System.out.println(notaalumnos.get(alum));
				
				System.out.println("1 - Para crear un alumno 2 - Mostrar alumnos -  3- Buscar Alumno 0 - Para salir");
				proces = sc.nextInt();

				break;

			default:

				break;
			}

		}
		sc.close();


	}

	public static double calcularMedia(int nota1, int nota2, int nota3) {

		double media = (nota1 + nota2 + nota3) / 3;
		return media;

	}

}
