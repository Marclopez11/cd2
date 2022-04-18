package ud07;

import java.util.Hashtable;
import java.util.Scanner;
/*
 * Marc Lopez
 * Java 1.8
 * 
 * */
public class Ej3 {

	static Scanner sc = new Scanner(System.in);

	//guardaremos el stock de los productos
	static Hashtable<String, Integer> cantidadstock = new Hashtable<String, Integer>();

	//guardaremos los libros
	static Hashtable<String, Integer> libros = new Hashtable<String, Integer>();

	public static void main(String[] args) {

		System.out.println("1 - Para crear un articulo 2 - Mostrar Articulos -  3- Buscar Articulo 0 - Para salir");
		int proces = sc.nextInt();

		while (proces != 0) {

			switch (proces) {
			case 1:
				crearArticulo();

				break;
			case 2:

				mostrarArticulo();

				break;

			case 3:

				buscarArticulo();

				break;

			default:
				System.out.println("Introducir una de las opciones");

				break;
			}
			System.out.println("1 - Para crear un articulo 2 - Mostrar Articulos -  3- Buscar Articulo 0 - Para salir");
			proces = sc.nextInt();
		}
		sc.close();

	}

	//pediremos cuantos libros queremos crear, y asignaremos un nombre y un precio
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

			System.out.println("Stock");
			int stock = sc.nextInt();

			libros.put(artiuclo, precio);
			cantidadstock.put(artiuclo, stock);

		}

	}

	//mostrar todos los articulos y el stock de cada uno 
	public static void mostrarArticulo() {

		System.out.println("Libro");
		System.out.println("");
		System.out.println(libros.toString());
		System.out.println("");
		System.out.println("STOCK");
		System.out.println(cantidadstock.toString());

	}

	//buscaremos si existe el artiuculo , el precio que tiene y el stock
	public static void buscarArticulo() {

		System.out.println("Buscar Libro");
		String alum = sc.next();

		System.out.println("Precio del libro");
		System.out.println(libros.get(alum));
		System.out.println("");

		System.out.println("STOCK");
		System.out.println(cantidadstock.get(alum));
		System.out.println("");

	}

}
