package ud05;
/*
 * Marc Lopez
 * Java 1.8
 * 
 * */
import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Introducce tu Nombre");
		String nom = sc.nextLine();
		sc.close();


		//Concatenacion con la variable
		System.out.println("Bienvenido "+nom+" !");

	}

}
