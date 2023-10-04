
import java.io.*;
public class UsandoFile{
	public static void main (String [] args){
		
		File f =new File("C:\\Users\\Balles\\Desktop\\textito.txt");
		File f2 = new File("C:\\Users\\Balles\\Desktop");
		
		System.out.println("Existe? " +f.exists());
		System.out.println("Cuanto espacio libre tiene? " +f.getFreeSpace());
		System.out.println("Es un archivo? " +f.isFile());
		System.out.println("Tamano usable " +f.getUsableSpace());
		
		// Permisos
		System.out.println("Se puede ejecutar? " +f.canExecute());
		System.out.println("Se puede leer? " +f.canRead());
		System.out.println("Se puede editar? " +f.canWrite());
		
		System.out.println("Tamano en bytes: " +f.length());
		
		
		//Nos devuelve un long en ms desde el ultimo momento en el que fue modificado el archivo
		System.out.println("Ult. fecha de modificacion: " +f.lastModified());
		
		//Crea un array con aquellas carpetas y ficheros que cuelgan de la carpeta. NO VALE PARA ARCHIVOS
		File[] lista = f2.listFiles();
		for(int a = 0; a < lista.length; a++) {
			System.out.println(lista[a]);
		}
		
		System.out.println("Ruta abosluta: " +f2.getAbsolutePath());
		
		String pathSeparator = f2.pathSeparator;
		char pathSeparatorChar = f2.pathSeparatorChar;
		String separator = f2.separator;
		char separatorChar = f2.separatorChar;
		
		System.out.println("PathSeparator: " +pathSeparator);
		System.out.println("PathSeparatorChar: " +pathSeparatorChar);
		System.out.println("Separator: " +separator);
		System.out.println("SeparatorChar: " +separatorChar);
		
		
	}
}
