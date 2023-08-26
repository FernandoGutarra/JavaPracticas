package protecto3;
import java.io.BufferedReader;
import java.io.InputStreamReader; 
public class Proyecto3 {

	public static void main(String[] args) {
		long numero_entero1;
		long numero_entero2;
		final byte MULTIPLO=2;
	    long resto;
	    long resto2;
		boolean mayor;
		try{ BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
	  
		System.out.println("ingrese primer numero entero");
		numero_entero1 = new Long (entrada.readLine());
		System.out.println("ingrese segunda numero entero");
		numero_entero2 = new Long (entrada.readLine());
		mayor=numero_entero1 > numero_entero2;
		if(mayor)
		System.out.println(numero_entero1 + " es mayor que "+ numero_entero2);
		else
			System.out.println(numero_entero1 + " no es mayor al " + numero_entero2);
		resto=numero_entero1/MULTIPLO;
		resto2=numero_entero2/MULTIPLO;
		if (resto==0)
			System.out.println(numero_entero1 + " es multiplo de "+ MULTIPLO);
		else 
		   System.out.println(numero_entero1 + " no es multiplo de "+ MULTIPLO);
		if(resto2==0)
			System.out.println(numero_entero2 + " es multiplo de "+ MULTIPLO);
	    else 
	     System.out.println(numero_entero2 +" es multiplo de "+ MULTIPLO);
		
	    }
	
	
	
		catch (Exception exc ) {
		    	   System.out.println( exc );
		    	   
		}
	
	
	
	
	
	
	
    }
	
}
