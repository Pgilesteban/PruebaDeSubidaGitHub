import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Label;
import java.awt.*;

public class InterfazAgendaTelefonica extends Frame{

	public static void main(String[] args) {
		
		InterfazAgendaTelefonica agenda = new InterfazAgendaTelefonica();
	}
	
	public InterfazAgendaTelefonica() {
		
		super("AGENDA TELEFONICA");
		setSize(1440, 900);
		setLayout(null);
		
		
		TextField cajaNombre = new TextField();
		cajaNombre.setBounds(165, 75, 100, 20);
		add(cajaNombre);
		
		Label etiquetaNombre = new Label("Nombre");
		etiquetaNombre.setBounds(10, 50, 80, 100);
		add(etiquetaNombre);
		
		TextField cajaApellido = new TextField();
		cajaApellido.setBounds(165, 105, 100, 20);
		add(cajaApellido);
		
		Label etiquetaApellido = new Label("Apellido");
		etiquetaApellido.setBounds(100, 105, 100, 20);
		add(etiquetaApellido);
		
		Label etiquetaTelefono = new Label("Telefono");
		etiquetaTelefono.setBounds(20, 40, 200, 50);
		add(etiquetaTelefono);
		
		TextField cajaTelefono = new TextField();
		cajaTelefono.setBounds(20, 40, 200, 50);
		add(cajaTelefono);
		
		Label etiquetaObservaciones = new Label("Observaciones");
		etiquetaObservaciones.setBounds(20, 40, 200, 50);
		add(etiquetaObservaciones);
		
		TextArea cajaObservaciones = new TextArea();
		cajaObservaciones.setBounds(20, 40, 200, 50);
		add(cajaObservaciones);
		
		setVisible(true);
		
	} 

}
