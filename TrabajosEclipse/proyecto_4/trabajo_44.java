//Pedir por consola caracteres. Cuando se ingrese una ‘x’ el programa debe
//terminar e informar si la secuencia de caracteres ‘p’ ‘r’ ‘o’ ‘g’ fue ingresada en
//algún momento.
package proyecto_4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class trabajo_44 {
	final static int MAX=4;
	final static char letra0='p';
	final static char letra1='r';
	final static char letra2='o';
	final static char letra3='g';
	public static void main(String args[]) {
		char [] secuenciaPrincipal = {'p','r','o','g'};
		char [] secuencia = new char [MAX];
		char valor=' ';
		int cantSecuIngresadas=0;
		int pos=0;
	    while(valor!='x') {
	    	try {
	    		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
	    		System.out.println("ingresa una letra si apretas x se termina el programa");
	    		valor=entrada.readLine().charAt(0);
	    		if(valor==letra0) {
	    			reIniciarSecu(secuencia);
	    			pos=insertarLetra(valor,secuencia,pos);
	    		}
	    		else if(valor==letra1) {
	    			if(pos!=0) {
		    			if(secuencia[pos-1]==letra0) {
		    				pos=insertarLetra(valor,secuencia,pos);
		    			}else {
		    				reIniciarSecu(secuencia);
		    			}
		    		  }
	    		}else if(valor==letra2) {
	    			if(pos!=0) {
	    			  if(secuencia[pos-1]==letra1) {
	    				pos=insertarLetra(valor,secuencia,pos);
	    			  }else {
	    				reIniciarSecu(secuencia);
	    			  }
	    			}
	    		}else if(valor==letra3) {
	    			if(pos!=0) {
	    			if(secuencia[pos-1]==letra2) {
	    				pos=insertarLetra(valor,secuencia,pos);
	    				cantSecuIngresadas++;
	    				reIniciarSecu(secuencia);
	    				pos=0;
	    			}else {
	    				reIniciarSecu(secuencia);
	    			}}
	    		}else {
	    			reIniciarSecu(secuencia);
	    			pos=0;
	    		}
	    	
	    	}catch(Exception err) {
	    		System.out.println(err);
	    	}
	    }
	    System.out.println("la secuencia prog fue ingresada al menos "+ cantSecuIngresadas);
	}



	public static int insertarLetra(char valor, char[] secuencia,int pos) {
		switch(valor) {
			case letra0:{
				secuencia[pos]=letra0;
				return pos+1;
			}
			case letra1:{
				secuencia[pos]=letra1;
				return pos+1;
			}
			case letra2:{
				secuencia[pos]=letra2;
				return pos+1;
			}
			case letra3:{
				secuencia[pos]=letra3;
				return pos+1;
			}
		    default:
		    	return pos;
	    }
	}


	public static void reIniciarSecu(char[] secu) {
		for(int i=0;i<MAX;i++) {
			secu[i]=' ';
		}
		
	}
}