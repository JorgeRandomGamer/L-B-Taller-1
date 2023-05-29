package ucn.lyb.taller2.logica;

import ucn.lyb.taller2.dominio.Pais;


public class ListaPaises {
	private Pais[] listaPaises;
	
	public ListaPaises(int max){
		listaPaises = new Pais[max];
	}
	
	public void agregarPais(Pais pais, int posicion){
		listaPaises[posicion] = pais;
	}
		
	public Pais buscarPais(int posicion){
		return listaPaises[posicion];
	}
	public int getCantidad(){
		int cantidad = 0;
		for(int i=0; i<listaPaises.length;i++){
			if(listaPaises[i] != null){
				cantidad++;
			}
		}
		return cantidad;
	}
		
	public String toString() {
		String paises = "";
		for(int a=0;a<listaPaises.length;a++){
			if(listaPaises[a] != null){
				paises += listaPaises[a].toString();
			}
		}
		return paises;
	}
}
