import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class UsandoInputStream {

	public static void main(String[] args) {
		System.out.println("Lo que pasa...");
		InputStream objeto = System.in;

		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);


		String cadenaLeida = null;
		try {
			do {
				cadenaLeida = br.readLine();
				System.out.println("echo ----> " +cadenaLeida);
			}while(!cadenaLeida.equals("stop"));
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}

		System.out.println("----    FIN DE LECTURA EN CONSOLA    ----");

	}

}
