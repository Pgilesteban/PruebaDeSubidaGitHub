import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MiPropioScanner {
	
	public MiPropioScanner() {
		
	}

	public String preguntarCadena(String pregunta) {
		System.out.println(pregunta);
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		
		String cadenaIntroducida = null;
		try {
			cadenaIntroducida = br.readLine();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		return cadenaIntroducida;
	}
	
	public int preguntarNumero(String pregunta) {
		System.out.println(pregunta);
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		
		String strNumeroIntroducido = null;
		int numeroIntroducido = 0;
		try {
			strNumeroIntroducido = br.readLine();
			numeroIntroducido = Integer.parseInt(strNumeroIntroducido);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		return numeroIntroducido;
	}
	
	public double preguntarDecimal(String pregunta) {
		System.out.println(pregunta);
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		
		String strNumeroIntroducido = null;
		double decimalInroducido = 0;
		try {
			strNumeroIntroducido = br.readLine();
			decimalInroducido = Double.parseDouble(strNumeroIntroducido);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		return decimalInroducido;
	}
	
	

}
