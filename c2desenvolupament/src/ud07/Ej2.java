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
	static Hashtable<Integer, Double> precio = new Hashtable<Integer, Double>();
	static double preciopagar = 0.0;
	static Enumeration<String> cantidadproductos;
	static Enumeration<Integer> cantidadcarrito;

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		productos();

		System.out.println("1 Carrito - 2 Comprar - 3 Pagar - 0 Salir");
		int proces = sc.nextInt();

		while (proces != 0) {

			switch (proces) {
			case 1:

				mostrarCarrito();
				mostrarIva();


				break;
			case 2:
				comprar();

				break;

			case 3:
				pagarProductos();
				break;

			default:
				System.out.println("Introducir una de las opciones");

				break;
			}
			System.out.println("1 Carrito - 2 Comprar - 3 Pagar - 0 Salir");
			proces = sc.nextInt();

		}
		sc.close();

	}

	public static void productos() {

		productos.put(1, "Manzana");
		productos.put(2, "Patatas");
		productos.put(3, "Fuet");
		productos.put(4, "Agua");

		precio.put(1, 0.15);
		precio.put(2, 1.12);
		precio.put(3, 1.34);
		precio.put(4, 0.20);

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

		cantidadproductos = productos.elements();
		cantidadcarrito = carrito.elements();

	}
	
	
	public static void mostrarIva() {

		cantidadcarrito = carrito.elements();

		System.out.println(" Que iva quieres aplicar 4% o 21% ");
		double iva = sc.nextDouble();

		while (cantidadcarrito.hasMoreElements()) {
			System.out.print(" ");
			int cant = cantidadcarrito.nextElement();
			double preciopro = precio.get(cant);
			System.out.print(productos.get(cant));
			System.out.println(preciopro+(preciopro*(iva/100)));
			preciopagar += preciopro+(preciopro*(iva/100));
		}
		System.out.println(""); // espacio

		// Precio + precio * (iva / 100)

	}

	public static void mostrarCarrito() {

		while (cantidadcarrito.hasMoreElements()) {
			System.out.print(" ");
			int cant = cantidadcarrito.nextElement();
			System.out.println(productos.get(cant));

		}
		System.out.println(""); // espacio


		
		
	}
	
	
	public static void pagarProductos() {

		System.out.println("Total del carrito "+preciopagar);
		double sumadinero = 0;
		boolean pagado = false;
		
		while (!pagado) {
			System.out.println(" Dinero a dar");
			double dinero = sc.nextDouble();
			 sumadinero += dinero;
		if(preciopagar<=sumadinero) {
			System.out.println("Devolver "+(preciopagar-sumadinero));
			 pagado = true;

		}else {
			System.out.println("Falta dinero"+(preciopagar-sumadinero));
			System.out.println("Mete Mas dinero");
			}
		}
		
	}

}
