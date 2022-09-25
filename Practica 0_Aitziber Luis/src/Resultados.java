
public class Resultados {
	private String torneo;
	private int a�o;
	private String lugar;
	private Tenista ganador;
	private int ranking_ganador;
	private Tenista sub_ganador;
	private int sub_ranking_ganador;
	private String resultado_final;
	
	public Resultados(String torneo, int a�o, String lugar, Tenista ganador, int ranking_ganador,
			Tenista sub_ganador, int sub_ranking_ganador, String resultado_final) {
		super();
		this.torneo = torneo;
		this.a�o = a�o;
		this.lugar = lugar;
		this.ganador = ganador;
		this.ranking_ganador = ranking_ganador;
		this.sub_ganador = sub_ganador;
		this.sub_ranking_ganador = sub_ranking_ganador;
		this.resultado_final = resultado_final;
	}
	
	
	public Tenista getSub_ganador_a() {
		return sub_ganador;
	}


	public void setSub_ganador_a(Tenista sub_ganador_a) {
		this.sub_ganador = sub_ganador_a;
	}


	public int getSub_ranking_ganador_a() {
		return sub_ranking_ganador;
	}


	public void setSub_ranking_ganador_a(int sub_ranking_ganador_a) {
		this.sub_ranking_ganador = sub_ranking_ganador_a;
	}


	public void setGanador_a(Tenista ganador_a) {
		this.ganador = ganador_a;
	}


	public Tenista getGanador() {
		return ganador;
	}


	public void setGanador(Tenista ganador) {
		this.ganador = ganador;
	}


	public String getTorneo() {
		return torneo;
	}
	public void setTorneo(String torneo) {
		this.torneo = torneo;
	}
	public int getA�o() {
		return a�o;
	}
	public void setA�o(int a�o) {
		this.a�o = a�o;
	}
	public String getLugar() {
		return lugar;
	}
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
	
	public int getRanking_ganador_a() {
		return ranking_ganador;
	}
	public void setRanking_ganador_a(int ranking_ganador_a) {
		this.ranking_ganador = ranking_ganador_a;
	}
	public String getResultado_final() {
		return resultado_final;
	}
	public void setResultado_final(String resultado_final) {
		this.resultado_final = resultado_final;
	}


	@Override
	public String toString() {
		return "Resultado [torneo=" + torneo + ", a�o=" + a�o + ", lugar=" + lugar + ", ganador_a=" + ganador
				+ ", ranking_ganador_a=" + ranking_ganador + ", sub_ganador_a=" + sub_ganador
				+ ", sub_ranking_ganador_a=" + sub_ranking_ganador + ", resultado_final=" + resultado_final + "]";
	}
		
}

