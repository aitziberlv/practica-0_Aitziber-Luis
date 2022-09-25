import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class VentanaClasificacion extends JFrame{
	private VentanaGrandSlam baseDatos = new VentanaGrandSlam();
	public VentanaClasificacion() {
		
		JPanel botonera = new JPanel();
		JTextField text=new JTextField("",40);
		JPanel texto = new JPanel();
		JButton torneo = new JButton("TORNEOS");
		JButton tenistas = new JButton("TENISTAS");
		JButton resultados = new JButton("RESULTADOS");
		JButton eVOLUCIONRANKING = new JButton("EVOLUCION RANKING");
		torneo.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String n=baseDatos.getCtorneos() + "";
				text.setText(n);
			}
			
		});
		tenistas.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String n=baseDatos.getNtenistas() + "";
				text.setText(n);
			}
			
		});
		texto.add(text);
		botonera.add(torneo);
		botonera.add(tenistas);
		botonera.add(resultados);
		botonera.add(eVOLUCIONRANKING);
		botonera.add(texto);
		this.add(botonera);
		
		
		this.setBackground(Color.blue);
		this.setSize(300,300);
		this.setVisible(true);
	}
	
}
