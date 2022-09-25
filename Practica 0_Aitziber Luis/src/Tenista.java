import java.util.HashMap;

public class Tenista {

	private String nombre = "";
	private String nacionalidad = "";
	private int victorias = 0;
	private HashMap<Torneo, Integer> mapaT = new HashMap<>();
	
	
	public Tenista(String nombre, String nacionalidad, int victorias, HashMap<Torneo, Integer> mapaT) {
		super();
		this.nombre = nombre;
		this.nacionalidad = nacionalidad;
		this.victorias = victorias;
		this.mapaT = mapaT;
	}
	public Tenista(String nombre, String nacionalidad, int victorias) {
		super();
		this.nombre = nombre;
		this.nacionalidad = nacionalidad;
		this.victorias = victorias;
		
	}
	private void haGanado() {
		this.victorias++;
	}

	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getNacionalidad() {
		return nacionalidad;
	}


	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}


	public int getVictorias() {
		return victorias;
	}


	public void setVictorias(int victorias) {
		this.victorias = victorias;
	}


	public HashMap<Torneo, Integer> getMapaT() {
		return mapaT;
	}


	public void setMapaT(HashMap<Torneo, Integer> mapaT) {
		this.mapaT = mapaT;
	}


	@Override
	public String toString() {
		return "Tenista [nombre=" + nombre + ", nacionalidad=" + nacionalidad + ", victorias=" + victorias + ", mapaT="
				+ mapaT + "]";
	}
	 
	
}


