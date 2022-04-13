package ud08;

public class Serie {
	
	private String titulo;
	private int numerotemporadas;
	private Boolean entregado;
	private String genero;
	private String creador;
	public Serie() {
		
		this.titulo = "La Vida";
		this.numerotemporadas = 3;
		this.entregado = false;
		this.genero = "Aventura";
		this.creador = "Marc Lopez";

	}
	
	
	
	
	
	
	
	public Serie(String titulo, String creador) {
		this.titulo = titulo;
		this.numerotemporadas = 9;
		this.entregado = true;
		this.genero = "Ficcion";
		this.creador = creador;
	}
	
	
	







	public Serie(String titulo, int numerotemporadas, String genero, String creador) {
		this.titulo = titulo;
		this.numerotemporadas = numerotemporadas;
		this.entregado = true;
		this.genero = genero;
		this.creador = creador;
	}







	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getNumerotemporadas() {
		return numerotemporadas;
	}
	public void setNumerotemporadas(int numerotemporadas) {
		this.numerotemporadas = numerotemporadas;
	}
	public Boolean getEntregado() {
		return entregado;
	}
	public void setEntregado(Boolean entregado) {
		this.entregado = entregado;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getCreador() {
		return creador;
	}
	public void setCreador(String creador) {
		this.creador = creador;
	}
	@Override
	public String toString() {
		return "Serie [titulo=" + titulo + ", numerotemporadas=" + numerotemporadas + ", entregado=" + entregado
				+ ", genero=" + genero + ", creador=" + creador + "]";
	}
	
	
	
	
	
	
	
	
	
	

}
