package ud08;

public class Persona {

	private String nombre;
	private int edad;
	private String dni;
	private String sexo;

	public Persona() {

		this.nombre = "";
		this.edad = 0;
		this.dni = "0";
		this.sexo = "E";
	}

	public Persona(String nombre, int edad, String sexo) {

		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.dni = "0";

	}

	public Persona(String nombre, int edad, String dni, String sexo) {

		this.nombre = nombre;
		this.edad = edad;
		this.dni = dni;
		this.sexo = sexo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", dni=" + dni + ", sexo=" + sexo + "]";
	}

}
