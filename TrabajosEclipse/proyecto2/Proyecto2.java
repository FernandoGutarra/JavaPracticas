package proyecto2;
import java.io.BufferedReader;
import java.io.InputStreamReader; 
public class Proyecto2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  long numero_entero=0;
		  final byte divisor2= 2;
		  final byte divisor3= 3;
		  final byte divisor4= 4;
		  double division2;
		  double division3;
		  double division4;
		  try{ 
		       BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		        System.out.println("ingrese numero entero");
		        numero_entero = new Long (entrada.readLine());
		        division2=(double)numero_entero/divisor2;
		        System.out.println("cociente de division 2 = "+ division2);
		        division3=(double)numero_entero/divisor3;
		        System.out.println("cociente de division 3 = "+division3);
		        division4=(double)numero_entero/divisor4;
		        System.out.println("cociente de division 4 = "+ division4);
		  
		 
		  
		  }
		  catch (Exception exc ) {
		           System.out.println( exc );
		        	   
		  }


	}

}
