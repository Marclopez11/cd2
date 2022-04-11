package ud05;
/*
 * Marc Lopez
 * Java 1.8
 * 
 * */

import java.util.Scanner;

public class Ej12 {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String contraseña = "12345";
		int intentos = 0;
		Boolean correcta = false;
		String contraseñausuario;

		Scanner sc = new Scanner(System.in);

		do {
			
			//pedimos por lomenos una vez la contraseña
			System.out.println("Introduze tu contraseña");
			contraseñausuario = sc.nextLine();

			//si no es igual sera contraseña incorrecta
			if (contraseñausuario.equals(contraseña)) {
				correcta = true;
				System.out.println("Correcto!");
			} else {
				System.out.println("Contraseña incorrecta");
			}
			
			//tenemos 3 intentos
			intentos++;
			
			}while (intentos < 3 && correcta == false);
		

		sc.close();

		}


}
