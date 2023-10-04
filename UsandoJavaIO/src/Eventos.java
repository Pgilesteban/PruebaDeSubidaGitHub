import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.PageAttributes;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Eventos extends Frame implements ActionListener{
	
	Panel panel = new Panel();
	final Color color = Color.GREEN;
	TextField caja;
	boolean pintaEnAzul;
	Label etiqueta1 = new Label("Introduzca un texto");
	
	public void actionPerformed(ActionEvent e) {
		
		/*if(!pintaEnAzul) {
			panel.setBackground(Color.red);
			pintaEnAzul = true;
		}
		else {
			panel.setBackground(Color.yellow);
			pintaEnAzul = false;
		}*/
		
		String cadena = caja.getText();
		System.out.println("En la caja ponia el siguiente texto: " +cadena);
		
	}

	public static void main(String[] args) {
		
		Eventos evento = new Eventos();

	}
	
	public Eventos() {
		super("Eventos");
		setSize(900, 600);
		setLayout(null);
		
		panel = new Panel();
		panel.setSize(880, 60);
		panel.setLocation(10, 30);
		panel.setBackground(color);
		
		caja = new TextField(20);
		panel.add(etiqueta1);
		panel.add(caja);
		
		Button boton = new Button("Aceptar");
		boton.addActionListener(this);
		panel.add(boton);
		add(panel);

		
		
		
		setVisible(true);
	}

}
