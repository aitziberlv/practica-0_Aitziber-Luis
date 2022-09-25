

public class Torneo {
	public static int cont=0;
	private int codigo=0;
	private String nombre="";
	private String ciudad="";
	public Torneo(int codigo, String nombre, String ciudad) {
		super();
		this.codigo = cont++;
		this.nombre = nombre;
		this.ciudad = ciudad;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	@Override
	public String toString() {
		return "Torneo [codigo=" + codigo + ", nombre=" + nombre + ", ciudad=" + ciudad + "]";
	}
	
}

