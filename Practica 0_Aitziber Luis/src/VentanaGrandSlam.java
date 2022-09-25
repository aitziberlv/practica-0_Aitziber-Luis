//HISTORIAGRANDSLAM. 
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;
public class VentanaGrandSlam {
	private ArrayList<Resultados> resultadoslista = new ArrayList<Resultados>();
	private HashMap<String, Torneo> mapatorneos =new HashMap<String, Torneo>();
	private HashMap<Integer, Torneo> Ctorneos = new HashMap<Integer, Torneo>();
	private TreeMap<String, Tenista> Ntenistas = new TreeMap<>();
	public VentanaGrandSlam (ArrayList<Resultados> resutadosl, HashMap<String, Torneo> ntorneos,
			HashMap<Integer, Torneo> ctorneos, TreeMap<String, Tenista> ntenistas) {
		super();
		this.resultadoslista = resutadosl;
		mapatorneos = ntorneos;
		Ctorneos = ctorneos;
		Ntenistas = ntenistas;
	}
	
	//Ahora vamos a hacer un constructor mediante el que podemos inizializar todo. 
	public VentanaGrandSlam() {
		
		//leer el ficreto y crear la lista de resultados:
			
			ObjectInputStream ois;
			try {
				ois = new ObjectInputStream(new FileInputStream("clas.csv"));
				
				try {
					ArrayList<Resultados> lista = (ArrayList<Resultados>) ois.readObject();
					this.resultadoslista = lista;
					
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}		
				
				ois.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}				
			
		//hacer el primer mapa con clave el torneo :
			
		for (Resultados rs:resultadoslista) {
			Torneo tr= new Torneo(0,rs.getTorneo(),rs.getLugar());
			mapatorneos.put(rs.getTorneo(), tr);
		}
		//segundo mapa que tiene como clave el codigo del torneo.
		for (Resultados rs:resultadoslista) {
			for (String clave:mapatorneos.keySet()) {
				if (mapatorneos.get(clave).getCodigo()<=4) {
					Torneo tr= new Torneo(0,rs.getTorneo(),rs.getLugar());
					Ctorneos.put(mapatorneos.get(clave).getCodigo(),tr);
				}
			}
			
		}
		//mapa tremap. 
		for (Resultados rs:resultadoslista) {
			Tenista tg=rs.getSub_ganador_a();
			Tenista tgdos= rs.getGanador();
			Ntenistas.put(tg.getNombre(), tg);
			Ntenistas.put(tgdos.getNombre(), tgdos);
			
		}
		
			
				
		

	}
	public ArrayList<Resultados> getResutadosl() {
		return resultadoslista;
	}
	public void setResutadosl(ArrayList<Resultados> resutadosl) {
		this.resultadoslista = resutadosl;
	}
	public HashMap<String, Torneo> getNtorneos() {
		return mapatorneos;
	}
	public void setNtorneos(HashMap<String, Torneo> ntorneos) {
		mapatorneos = ntorneos;
	}
	public HashMap<Integer, Torneo> getCtorneos() {
		return Ctorneos;
	}
	public void setCtorneos(HashMap<Integer, Torneo> ctorneos) {
		Ctorneos = ctorneos;
	}
	public TreeMap<String, Tenista> getNtenistas() {
		return Ntenistas;
	}
	public void setNtenistas(TreeMap<String, Tenista> ntenistas) {
		Ntenistas = ntenistas;
	}

	@Override
	public String toString() {
		return "VentanaGrandSlam [resultadoslista=" + resultadoslista + ", mapatorneos=" + mapatorneos + ", Ctorneos="
				+ Ctorneos + ", Ntenistas=" + Ntenistas + "]";
	}
	
	//metodos=
	public int calculaClasificacion(int añof, int añoin) {
		int suma=0;
		for (Resultados rs:resultadoslista) {
			if (rs.getAño()<añof && rs.getAño()>añoin) {
				suma+=1;
			}
		}
		return suma;
		
	}
 }
