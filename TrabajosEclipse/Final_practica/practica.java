package Final_practica;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class practica {
	 final static int MAX=10;
	public static void main(String[] args) {
	int []array = {2,3,5,2,45,24,8,9,7,21};
	mostrarArreglo(array);
	int pos=elegirPos();
	corrimientoIzq(array,pos);
	mostrarArreglo(array);
	}
	private static int elegirPos() {
	    int numero=0;
		boolean valido=false;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		while(!valido) {
	    	try {
	    		System.out.println("ingresame un numero del 0 al 10");
	    		numero=new Integer (entrada.readLine());
	    		if(numero>=0&&numero<=10) {
	    			valido=true;
	    		}
	    	}catch(Exception err) {
	    		System.out.println(err);
	    	}
	    }
		return numero;
	}
	public static void mostrarArreglo(int []array) {
		for(int pos=0;pos<MAX;pos++) {
			System.out.print("|" +array[pos]);
		}
		System.out.println(" ");
	}
	public static void corrimientoIzq(int []array,int pos) {
		
		while(pos<MAX-1) {
			array[pos]=array[pos+1];
			pos++;
		}
	}
}