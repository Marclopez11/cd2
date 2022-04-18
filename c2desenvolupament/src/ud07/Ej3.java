package ud07;

import java.util.Hashtable;
import java.util.Scanner;

public class Ej3 {

	static Scanner sc = new Scanner(System.in);

	static Hashtable<String, Integer> libros = new Hashtable<String, Integer>();

	public static void main(String[] args) {

		System.out.println("1 - Para crear un articulo 2 - Mostrar Articulos -  3- Buscar Articulo 0 - Para salir");
		int proces = sc.nextInt();

		while (proces != 0) {

			switch (proces) {
			case 1:
				crearArticulo();

				System.out.println("1 - Para crear un articulo 2 - Mostrar Articulos -  3- Buscar Articulo 0 - Para salir");
				proces = sc.nextInt();

				break;
			case 2:

				System.out.println(libros.toString());
				System.out.println("1 - Para crear un articulo 2 - Mostrar Articulos -  3- Buscar Articulo 0 - Para salir");
				proces = sc.nextInt();

				break;

			case 3:

				System.out.println("Buscar Libro");
				String alum = sc.next();
				System.out.println(libros.get(alum));

				System.out.println("1 - Para crear un articulo 2 - Mostrar Articulos -  3- Buscar Articulo 0 - Para salir");
				proces = sc.nextInt();

				break;

			default:
				System.out.println("Introducir una de las opciones");

				break;
			}

		}
		sc.close();

	}

	public static void crearArticulo() {

		System.out.println(" Cuantos libros  quieres añadir  ");

		int cantidad = sc.nextInt();

		for (int i = 1; i <= cantidad; i++) {

			System.out.println(" Libro   " + i);
			System.out.println();
			System.out.println("Nombre de el articulo");
			String artiuclo = sc.next();

			System.out.println("Precio");
			int precio = sc.nextInt();

			
			libros.put(artiuclo, precio);

		}

	}

}
