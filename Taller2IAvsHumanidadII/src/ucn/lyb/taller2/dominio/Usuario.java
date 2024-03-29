package ucn.lyb.taller2.dominio;

public class Usuario {
	
	private String nombre;
	private int codigo;
	private String contraseña;
	private int id;
	
	public Usuario(String nombre, int codigo, String contraseña, int id){
		this.nombre = nombre;
		this.codigo = codigo;
		this.contraseña = contraseña;
		this.id = id;
	}

	public String getNombre() {
		return nombre.toLowerCase();
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Nombre: " +nombre+"#"+ codigo
				+ ", contraseña=" + contraseña + ", id=" + id + "\n";
	}
	public String reWrite(){
		return nombre+"#"+codigo+", "+contraseña+", "+id+"\n";
	}

}
