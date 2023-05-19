package ucn.lyb.taller2.dominio;

public class Programador {
	
	private int id;
	private String nombre;
	private String apellido;
	private int a�osExperiencia;
	private String lenguajes;
	private String pais;
	private String ciudad;
	
	public Programador(int id, String nombre, String apellido,int a�osExperiencia, String lenguajes, String pais, String ciudad) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.a�osExperiencia = a�osExperiencia;
		this.lenguajes = lenguajes;
		this.pais = pais;
		this.ciudad = ciudad;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getA�osExperiencia() {
		return a�osExperiencia;
	}

	public void setA�osExperiencia(int a�osExperiencia) {
		this.a�osExperiencia = a�osExperiencia;
	}

	public String getLenguajes() {
		return lenguajes;
	}

	public void setLenguajes(String lenguajes) {
		this.lenguajes = lenguajes;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String toString() {
		return "Programador [id=" + id + ", nombre=" + nombre + ", apellido="
				+ apellido + ", a�osExperiencia=" + a�osExperiencia
				+ ", lenguajes=" + lenguajes + ", pais=" + pais + ", ciudad="
				+ ciudad + "]";
	}
	
	
	
	
}