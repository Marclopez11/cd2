package ud08;

public class Electrodomestico {

	private int precio;
	private int base;
	private String color;
	private String consumo;
	private int peso;

	enum Color {
		BLANCO, NEGRO, ROJO, AZUL, GRIS, blanco, negro, rojo, azul, gris;

	}

	Color micolor;

	public Electrodomestico() {

		this.precio = 32;
		this.micolor = Color.blanco;
		this.consumo = "F";
		this.base = 100;
		this.peso = 5;

	}

	public Electrodomestico(int precio, int peso) {
		this.precio = precio;
		this.peso = peso;
		this.micolor = Color.blanco;
		this.consumo = "F";
		this.base = 100;

	}

	public Electrodomestico(int precio, int base, Color micolor, String consumo, int peso) {
		this.precio = precio;
		this.base = base;
		this.micolor = micolor;
		this.consumo = consumo;
		this.peso = peso;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getConsumo() {
		return consumo;
	}

	public void setConsumo(String consumo) {
		this.consumo = consumo;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "Electrodomestico [precio=" + precio + ", base=" + base + ", color=" + micolor + ", consumo=" + consumo
				+ ", peso=" + peso + "]";
	}

}
