import java.io.*;
public class BuscandoExtension {

	public static void main(String[] args) {
		
		MiPropioScanner scanner = new MiPropioScanner();
		
		String respuesta = scanner.preguntarCadena("Introduce la ruta del directorio:");
		String extension = scanner.preguntarCadena("Introduce la extension:");
		
		File directorio = new File(respuesta);
		
		File[] lista = directorio.listFiles();
		
		
		System.out.println("Esta es la lista de archivos que tienen extension " +extension);
		try {
			for(int a = 0; a <= directorio.length(); a++) {
				if(lista[a].getName().endsWith(extension)) {
					System.out.println(lista[a]);
				}
			}

		}
		catch(Exception e) {
			System.out.println("Ya no hay mas!!");
		}
		
		System.out.println("Estos son los archivos que tienen mas de 1GB:");
		for(int b = 0; b <= directorio.length(); b++) {
			if(lista[b].length() >= 1000000000) {
				System.out.println(lista[b] +" ocupa " +lista[b].getTotalSpace()*Math.pow(10, 9) +"GB");
			}
		}
		
	}

}
