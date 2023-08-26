package protecto3;

import java.io.BufferedReader;
import java.io.InputStreamReader; 
public class trabajo3_2 {
	public static void main(String[] args) {
		int numero_mes=0;
		final int MAX_NUMERO=12;
		final int MIN_NUMERO=1;
		int anio=0;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));	
		//final int ENERO= 1, FEBRERO= 2, MARZO= 3, ABRIL= 4, MAYO= 5, JUNIO= 6, JULIO= 7, AGOSTO= 8, SETIEMBRE= 9, OCTUBRE= 10, NOBIEMBRE= 11, DICIEMBRE=12;
	     while(!(numero_mes>=MIN_NUMERO && numero_mes<=MAX_NUMERO)){				    
	    	 try {
		    System.out.println("ingrese numero de mes del (1 al 12)");
		    numero_mes= new Integer(entrada.readLine());
			
		
		    }
		    catch (Exception exc ) {
	    	     System.out.println( exc );
	    	}
	     } 
	     switch(numero_mes){
	     case 2:try {
    		        System.out.println("ingrese el anio: ");
    		         anio = new Integer (entrada.readLine());
    		       if(((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0)))) {
    			      System.out.println("el mes tiene 29 dias");
    			
    		       }else {
    			   System.out.println("el mes tiene 28 dias");
    		       }
    	       }catch(Exception err){
    		   System.out.println(err);
    	       }break;
	     case 1: case 3: case 5: case 7: case 8: case 10: case 12:
	      System.out.println("el mes tiene 31 dias");
	     break;
	     case 4: case 6: case 9: case 11:
	    	  System.out.println("el mes tiene 30 dias");
	    	  break;
	     }
	}
}