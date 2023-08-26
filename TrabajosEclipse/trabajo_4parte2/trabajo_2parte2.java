package trabajo_4parte2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class trabajo_2parte2 {
	public static void main(String args[]) {
	     int valor=0;
		final int MAX = 10;
		final int MIN = 1;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		boolean valido=false;
		while (!valido==true) {
			try {
				System.out.println("igresame un numero menor que 10 y mayor a 1");
				valor=new Integer(entrada.readLine());
				if(valor>MIN&&valor<MAX){
				valido=true;
				}
                 
			} catch (Exception err) {
				System.out.println(err);
			}
		}	
		for (int i = valor; i >= 0; i--) {
		
			System.out.println(i);
		}
	}
}
