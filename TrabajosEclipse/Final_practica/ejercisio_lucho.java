package Final_practica;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercisio_lucho {
//	Eliminar los espacios de una frase pasada por consola por el usuario.
	final static int MAXF=3;
	final static int MAXC=10;
	public static void main(String[] args) {
//		String frase = ingresarFrase();
		int filaElegida=ingresarDato(MAXF-1,"fila");
		int posiElegida=ingresarDato(MAXC-1,"posicion");
		int iniS=0;
		int finS=0;
		int[][]matriz= {
				{0,6,3,4,5,0,4,5,2,0},
				{0,2,2,0,0,2,3,0,4,0},
				{0,2,2,5,7,0,3,5,6,0}
		  };
	 
       existeSecu(matriz[filaElegida],posiElegida,iniS,finS);
	}

	private static void existeSecu(int[] arr, int pos, int iniS, int finS) {
		boolean existe=false;
		int ini=0;
		int fin=0;
		while(ini<MAXC) {
			ini=buscarIniSecu(arr,ini);
			if(ini<MAXC) {
				fin=buscarFinSecu(arr,ini);
				if(pos>=ini&&pos<=fin) {
					iniS=ini;
					finS=fin;
					System.out.println("la posicion que se eligio esta dentro de una secuencia que inicia en "+iniS+" y termina en fin "+finS);
				}
				ini=fin+1;
			}
		}
	}

	private static int buscarFinSecu(int[] arr, int ini) {
	   while(ini<MAXC&&arr[ini]!=0) {
		   ini++;
	   }
		return ini-1;
	}

	private static int buscarIniSecu(int[] arr, int ini) {
		while(ini<MAXC&&arr[ini]==0) {
			ini++;
		}
		return ini;
	}

	public static int ingresarDato(int MAX,String fila) {
	 int valor=0;
	 boolean valido=false;
	 BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
	 while(!valido) {
		 try {
			 System.out.println("ingresar una "+fila+" del 0 al "+MAX);
			 valor= new Integer(entrada.readLine());
		     if(valor>=0&&valor<=MAX) {
		    	valido=true; 
		     }
		 }catch(Exception err) {
			 System.out.println(err);
		 }
	 }
	return valor;
}


}
