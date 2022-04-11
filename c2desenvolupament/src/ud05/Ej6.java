package ud05;
/*
 * Marc Lopez
 * Java 1.8
 * 
 * */
import java.util.Scanner;

public class Ej6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final double iva  = 0.21;
		double valorproducto;
		
		double valorproductoconiva;
		
		//pedir producto sin iva
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Introducce un precio para saber su incremento + iva");
		
		String valordelprocutoterminal = sc.nextLine();
		sc.close();
		valorproducto  =  Double.parseDouble(valordelprocutoterminal);
		
		 
		
		
		//Incremento de iva
		
		System.out.println("El precio valor con iva es "+(valorproducto+(valorproducto*iva)));


	}

}
