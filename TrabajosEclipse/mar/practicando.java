package mar;

import java.io.BufferedReader; //biblioteca que contiene operaciones de E/S
import java.io.InputStreamReader;

public class practicando {
	public static void main (String [] args) {
	  int ingresarNumero=0;
	  BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
	  while(ingresarNumero!=1234567890) {
		  try {
		  System.out.println("ingresa un numero,animal 1234567890");
		  ingresarNumero= new Integer(entrada.readLine());
		  }catch(Exception err) {
			  System.out.println(err);
		  }
	  }
	  System.out.println("terminaste pedaso de persona ");
	
  }
}
