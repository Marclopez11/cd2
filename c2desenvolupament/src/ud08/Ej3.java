package ud08;

import ud08.Electrodomestico.Color;

public class Ej3 {

	public static void main(String[] args) {

		Color color = null;

		Electrodomestico electro = new Electrodomestico();
		System.out.println(electro);

		Electrodomestico electro2 = new Electrodomestico(200, 7);
		System.out.println(electro2);

		Electrodomestico electro3 = new Electrodomestico(500, 100, color.rojo, "32", 90);
		System.out.println(electro3);

	}

}
