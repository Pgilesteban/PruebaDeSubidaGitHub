import java.io.*;
public class CreandoFicheros {

	public static void main(String[] args) {
		File fichero = new File("C:\\Javat\\FICHERIN.txt");
		try {
			FileOutputStream fos = new FileOutputStream(fichero);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			DataOutputStream dos = new DataOutputStream(bos);
			
			/*Otra forma de escribirlo:
			 * 
			 * DataOutputStream dos = new DataOutputStream(
			 * 							new BufferedOutputStream(
			 * 								new FileOutputStream(fichero)));
			 * 
			 * dos.close();
			*/
			dos.writeInt(300);
			dos.writeBoolean(true);
			dos.writeFloat(3.14f);
			dos.writeDouble(3.15);
			dos.writeChar('h');
			dos.writeByte(120);
			dos.writeUTF("Esto es una frase");
			
			dos.close();
			bos.close();
			fos.close();
			
			System.out.println("Fichero creado con exito");
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("No se encuentra el fichero!!");
		}
		catch(IOException e) {
			e.printStackTrace();
			System.out.println("Hay problemas al escribir!!");
		}

	}

}
