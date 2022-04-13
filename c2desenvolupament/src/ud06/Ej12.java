package ud06;


import java.util.Scanner;

/*
 * Marc Lopez
 * Java 1.8
 * 
 * */
public class Ej12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Indica el tamaño de la array1");
		int tamñodelaarray1 = sc.nextInt();
		
		
		System.out.println("Indica el numero acabado que quieres mostrar");
		int numeroacabado = sc.nextInt();
		
		
		int arraydenumeros[] = new int[tamñodelaarray1];
		
		int arraydenumerosacabados[] = new int[tamñodelaarray1];

		
		System.out.println("Mostrar Array");
		arraydenumeros = rellenarValores(arraydenumeros);
		mostrarArray(arraydenumeros);
		
		
		
		System.out.println("Mostrar Array Acabados con "+numeroacabado);
		arraydenumerosacabados  =recogerValoresterminads(arraydenumeros,numeroacabado);
		mostrarArray(arraydenumerosacabados);


		

		
		sc.close();

	}
	
	
	
	public static int[] rellenarValores(int numeros[]) {

		int numeroAleatorio;

		for (int i = 0; i < numeros.length; i++) {
			numeroAleatorio = (int) Math.floor(Math.random() * (300 - 1 + 1) + 1);
			numeros[i] += numeroAleatorio;
		}
		return numeros;
	}
	
	
	public static int[] recogerValoresterminads(int numeros[], int terminacion) {


		int arrayAcabados[] = new int[numeros.length];
		
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] % 10 == terminacion) {
				arrayAcabados[i] = numeros[i];
			}
			
		}
		
		return arrayAcabados;
	}
	
	public static void mostrarArray(int numeros[]) {

		for (int i = 0; i < numeros.length; i++) {
			
			if(numeros[i] != 0){
				System.out.println(numeros[i]);
			}
			
			

			
		}

	}

}
