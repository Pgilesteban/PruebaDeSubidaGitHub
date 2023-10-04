import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

public class Sorpresa extends Frame{

	public static void main(String[] args) {
		Sorpresa sorpresa = new Sorpresa();
		

	}
	
	public Sorpresa (){
		super("UN TITULO");
		setSize(700, 400);
		setLayout(null);
		
		
		Button boton = new Button("Aceptar");
		boton.setSize(70, 40);
		boton.setLocation(190, 350);
		add(boton);
		
		
		Label etiqueta = new Label("Esto es una etiqueta");
		etiqueta.setBounds(10, 60, 200, 50);
		add(etiqueta);
		
		TextField caja = new TextField();
		caja.setBounds(220, 60, 100, 50);
		add(caja);
		setVisible(true);
	}

}
