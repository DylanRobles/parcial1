package co.edu.konradlorenz.model;

public class Jugador {
	
	private String nombre;
	private String estado;
	private String annoRetiro;
	private int posicion;
	private String balonOro;
	private String club;
	
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEstado() {
		return estado;
	}
	
		
	
		
	public void setEstado(String b) {
		this.estado = b;
	}
	public String getAnnoRetiro() {
		return annoRetiro;
	}
	public void setAnnoRetiro(String annoRetiro) {
		this.annoRetiro = annoRetiro;
	}
	
	
	
	
	public int getPosicion() {
		return posicion;
	}
	public void setPosicion(int posicion) {
		this.posicion = posicion;
	}
	public String getBalonOro() {
		return balonOro;
	}
	public void setBalonOro(String balonOro) {
		this.balonOro = balonOro;
	}
	public String getClub() {
		return club;
	}
	public void setClub(String club) {
		this.club = club;
	}
	
	
	
	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", estado=" + estado + ", annoRetiro=" + annoRetiro + ", posicion="
				+ posicion + ", balonOro=" + balonOro + ", club=" + club + "]";
	}
	public Jugador(String nombre, String estado, String annoRetiro, int posicion, String balonOro, String club) {
		super();
		this.nombre = nombre;
		this.estado = estado;
		this.annoRetiro = annoRetiro;
		this.posicion = posicion;
		this.balonOro = balonOro;
		this.club = club;
	}
	public Jugador() {
		
	}
	
	
	
	

	
}