package trabajo_4parte2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class trabajo_2parte3 {
	public static void main(String args[]) {

		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		double valor = 1;
		double resto;
		double resto2;
		final int MULTIPLO2=2;
		final int MULTIPLO3=3;
		final int MAX = 50;
		boolean verda=true;
		try {
			while (verda) {

				System.out.println("ingresame un numero mayor a 50");
				valor=new Double(entrada.readLine());

				if (valor > MAX) {
                  resto=valor%MULTIPLO2;  
                  resto2=valor%MULTIPLO3;
                  if(resto==0) {
                	System.out.println("valor es multiplo de 2");
                  }
                  if(resto2==0) {
                	  System.out.println("valor es multiplo de 3");
                  }
                  
				}
				else {
					System.out.println("de nuevo amigazo");
				}
			}
		} catch (Exception err) {
			System.out.println(err);
		}
	}
}
