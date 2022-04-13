package ud08;

public class Password {

	private int longitud;
	private String contraseña;

	public Password() {

		this.longitud = 8;
		this.contraseña = "";

	}

	public Password(int longitud) {

		this.longitud = longitud;
		this.contraseña = "";
	}

	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public String genrarValoresAleatorios() {

		int numeroAleatorio = 0;

		// rellenar con numeros aleatorios entre los valores 0 y 9
		for (int i = 0; i < longitud; i++) {
			numeroAleatorio = (int) Math.floor(Math.random() * (0 - 9 + 1) + 9);
			contraseña += numeroAleatorio;
		}
		return contraseña;
	}

	@Override
	public String toString() {
		return "Password [contraseña=" + genrarValoresAleatorios() + "]";
	}

}
