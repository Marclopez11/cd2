package ud05;
/*
 * Marc Lopez
 * Java 1.8
 * 
 * */
import java.util.Scanner;

public class Ej13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int numero = 0;

	

		while (numero == 0) {

			System.out.println("1 valor");
			int valor1 = sc.nextInt();

			System.out.println("2 valor");
			int valor2 = sc.nextInt();

			System.out.println("Operador");
			
			//palabra
			String operador =sc.next();

			
			double resultado = 0;

			switch (operador.charAt(0)) {
			
			case '+':
				resultado = valor1+valor2 ;
				System.out.println("La suma es "+resultado);
				break;
			case '-':
				resultado = valor1-valor2 ;
				System.out.println("La resta es "+resultado);

				break;
			case '*':
				resultado = valor1*valor2 ;
				System.out.println("La multiplicacion es "+resultado);

				break;
			case '^':
				resultado = Math.pow(valor1, valor2);
				System.out.println("El resultado entre el operando o exponente es "+resultado);

				break;
			case '%':
				resultado = valor1%valor2 ;
				System.out.println("El residu es"+resultado);

				break;

			default:
				System.out.println("No se puede realizar esta operacion");

				break;
			}
			
			



		}
		sc.close();

	}

}
