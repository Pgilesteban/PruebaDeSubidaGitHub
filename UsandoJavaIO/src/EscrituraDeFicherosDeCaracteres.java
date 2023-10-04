import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class EscrituraDeFicherosDeCaracteres {

	public static void main(String[] args) {
		
		File fichero = new File("C:\\Javat\\Ficherito.txt");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Introduce el texto a almacenar:");
		
		try {
			FileOutputStream fos = new FileOutputStream(fichero);
			DataOutputStream dos = new DataOutputStream(fos);
			
			String linea = "";
			boolean leerMas = false;
			while(linea != null) {
				if(leerMas) {
					dos.writeUTF(linea);
				}
				else {
					leerMas = true;
				}
				linea = br.readLine();
			}
			
			dos.close();
			fos.close();
			System.out.println("******** FICHERO GUARDADO ************");
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
