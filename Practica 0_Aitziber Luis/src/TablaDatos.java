import java.awt.Color;
import java.awt.Component;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.Collection;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;

public class TablaDatos extends JFrame{
	private JList<Tenista> listDatos;
	private DefaultListModel<Tenista> mDatos;
	
	public TablaDatos() {
		inizializar();
	}
	public void inizializar() {
		listDatos= new JList<Tenista>();
		mDatos=new DefaultListModel<Tenista>();
		
		this.addWindowListener(new WindowAdapter() {

			@Override
			public void windowOpened(WindowEvent e) {
				// TODO Auto-generated method stub
				//for (Tenista tenista : t) {
				//	mDatos.addElement(tenista);
				//}
			
			}

			
			
		});
		
	
		
		
		//funcuion con la que podemos inicializar los datos 
		
		
			
			
		this.add(listDatos);
		this.setBackground(Color.LIGHT_GRAY);
		this.setSize(400,400);
		this.setVisible(true);
	
		
			
	      
    }
	
	
}
