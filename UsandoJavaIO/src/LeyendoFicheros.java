import java.io.*;

public class LeyendoFicheros {

	public static void main(String[] args) {
		File fichero = new File("C:\\Javat\\FICHERIN.txt");
		try {
			FileInputStream fos = new FileInputStream(fichero);
			BufferedInputStream bos = new BufferedInputStream(fos);
			DataInputStream dos = new DataInputStream(bos);
			
			/*Otra forma de escribirlo:
			 * 
			 * DataInputStream dos = new DataInputStream(
			 * 							new BufferedInputStream(
			 * 								new FileInputStream(fichero)));
			 * 
			 * dos.close();
			*/
			
			System.out.println("Este es el fichero " +fichero.getName());
			
			System.out.println(dos.readInt());
			System.out.println(dos.readBoolean());
			System.out.println(dos.readFloat());
			System.out.println(dos.readDouble());
			System.out.println(dos.readChar());
			System.out.println(dos.readByte());
			System.out.println(dos.readUTF());
			
			dos.close();
			bos.close();
			fos.close();
			
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("No se encuentra el fichero!!");
		}
		catch(IOException e) {
			e.printStackTrace();
			System.out.println("Hay problemas al leer!!");
		}

	}

}
