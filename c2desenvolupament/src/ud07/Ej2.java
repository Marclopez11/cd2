package ud07;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
/*
 * Marc Lopez
 * Java 1.8
 * 
 * */
import java.util.Scanner;



public class Ej2 {
	static Hashtable<Integer, String> productos = new Hashtable<Integer, String>();
	static Hashtable<Integer, Integer> carrito = new Hashtable<Integer, Integer>();

	
	static Enumeration<String> cantidadproductos = productos.elements();
	static Enumeration<Integer> cantidadcarrito = carrito.elements();

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {


		productos();

		System.out.println("1 Carrito - 2 Comprar - 3 Pagar - 0 Salir");
		int proces = sc.nextInt();

		while (proces != 0) {

			switch (proces) {
			case 1:
				
				mostrarCarrito();
				System.out.println("1 Carrito - 2 Comprar - 3 Pagar - 0 Salir");
				proces = sc.nextInt();

				break;
			case 2:
				 comprar();
				 
					System.out.println("1 Carrito - 2 Comprar - 3 Pagar - 0 Salir");
					proces = sc.nextInt();

				break;

			case 3:

				break;

			default:
				System.out.println("Introducir una de las opciones");

				break;
			}

		}
		sc.close();

	}

	public static void productos() {

		productos.put(1, "Manzana");
		productos.put(2, "Patatas");
		productos.put(3, "Fuet");
		productos.put(4, "Agua");
		
		

		
		
		



	}
	
	
	public static void comprar() {

			
		System.out.println("¿ Que quieres comprar ?");

		System.out.println(productos.toString());
		
		
		System.out.println(" Cuantos productos quieres comprar  ");
		int cantidad = sc.nextInt();
		System.out.println(" Introduce el producto ");
		
		for (int i = 0; i < cantidad; i++) {
			int producto = sc.nextInt();
			carrito.put(i, producto);

			
		}



		
		



	}
	
	
	
	public static void mostrarCarrito() {

		
		
		while (cantidadproductos.hasMoreElements()) {
			System.out.println(); //espacio
			System.out.print(" " + cantidadproductos.nextElement() );
			System.out.print(" " + cantidadcarrito.nextElement() );
		}
		
		
		
		



	}

}
