package proyecto_4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class trabajo_43 {
	public static void main(String args[]) {
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        char letra;
        final char LETRA='a';
        int contador=0;
		for (int i = 1; i <= 15; i++) {
			try {
                    System.out.println("ingresa un caracter vease "+ i);
			       letra=(char)(entrada.readLine().charAt(0));
             if( letra=='a') {
            	 contador++;
             }			
			}

			catch (Exception err) {
				System.out.println(err);
			}
		}
		 System.out.println("la cantidad de a ingresadas es "+ contador);

	}
}
