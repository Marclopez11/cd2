package ud06;

/*
 * Marc Lopez
 * Java 1.8
 * 
 * */
import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("1 - Circulo 2- Triangulo 3-Cuadrado");
		int figura = sc.nextInt();

		
		//mediante la terminal elegiremos una opcion
		switch (figura) {
		case 1:
			System.out.println("Area del circulo");
			double areaCirculo = sc.nextDouble();
			
			System.out.println(areaCirculo(areaCirculo));

			break;
		case 2:
			
			System.out.println("Area del circulo");
			
			System.out.println("Base");
			double base = sc.nextDouble();

			System.out.println("Altura");
			double altura = sc.nextDouble();

			System.out.println(areaTriangulo(base,altura));


			break;
		case 3:
			
			System.out.println("Area del circulo");

			System.out.println("Base");
			double basecuadrado = sc.nextDouble();

			System.out.println("Altura");
			double alturacuadrado = sc.nextDouble();
			
			System.out.println(areaCuadrado(basecuadrado,alturacuadrado));


			break;

		default:
			break;
		}
		
		sc.close();

	}
	
	
	public static double areaCirculo(double radio) {
		
		double area = Math.PI * Math.pow(radio,2);
		
		return area;

	}
	
	public static double areaTriangulo(double base, double altura) {
		
		double area = (base*altura)/2;
		
		return area;

	}
	
	public static double areaCuadrado(double base, double altura) {
		
		double area = base + altura;
		return area;

	}

}
