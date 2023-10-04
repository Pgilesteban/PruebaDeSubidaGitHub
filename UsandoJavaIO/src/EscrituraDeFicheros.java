import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class EscrituraDeFicheros {

	public static void main(String[] args) {
		File fichero = new File("C:\\Javat\\OtroFicherin.txt");
		try {
			FileOutputStream fos = new FileOutputStream(fichero, true);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			DataOutputStream dos = new DataOutputStream(bos);
			
			dos.writeUTF("Volumin");
			System.out.println("Otro ficherin creado");
			
			dos.close();
			bos.close();
			fos.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}

	}

}
