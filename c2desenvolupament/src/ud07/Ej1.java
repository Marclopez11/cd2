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
	static Scanner sc = new Scanner(System.in);

	static 	Hashtable<String, Double> notaalumnos = new Hashtable<String, Double>();

	public static void main(String[] args) {

	
		System.out.println("1 - Para crear un alumno 2 - Mostrar alumnos -  3- Buscar Alumno 0 - Para salir");
		int proces = sc.nextInt();

		while (proces != 0) {

			switch (proces) {
			case 1:
				crearAlumno();

				break;
			case 2:

				System.out.println(notaalumnos.toString());
				

				break;
				
			case 3:

				 buscarAlumno() ;

				break;

			default:

				break;
			}
			System.out.println("1 - Para crear un alumno 2 - Mostrar alumnos -  3- Buscar Alumno 0 - Para salir");
			proces = sc.nextInt();

		}
		sc.close();


	}


	//buscaremos los datos del alumno
	public static void buscarAlumno() {
		
		System.out.println("Buscar alumno");
		String alum = sc.next();
		System.out.println(notaalumnos.get(alum));
		
		


	}
	
	//Crearemos un alumno con 3 notas y calcularemos la media
	public static void crearAlumno() {
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

		
	}
	
	//calcular media
	
	public static double calcularMedia(int nota1, int nota2, int nota3) {

		double media = (nota1 + nota2 + nota3) / 3;
		return media;

	}

}
