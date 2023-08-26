package Matrices_7_Practica;
//Hacer un programa que dada una matriz de enteros de tamaño 5*10 que se encuentra precargada,
//solicite al usuario una posición fila, columna y realice un corrimiento a izquierda.
import java.io.BufferedReader;
import java.io.InputStreamReader; 
public class Practica_3 {
	final static int MAXF=5;
	final static int MAXC=10;
	public static void main(String[]args) {
		  int[][]matriz= {
				  {6,2,30,4,3,4,4,2,7,84},
				  {6,35,60,10,3,4,4,2,7,84},
				  {5,34,3,3,40,23,43,20,7,40},
				  {34,23,3,0,3,4,4,2,7,30},
				  {34,2,3,0,3,4,4,2,7,9},
		    };
		 imprimrMatriz(matriz);
		 System.out.println("");
		 int fila=pedirNumero("fila",MAXF-1);
		 int colum=pedirNumero("colum",MAXC-1);
		 corrimientoIzq(matriz[fila],colum);
		 imprimrMatriz(matriz);
	 }
	public static void corrimientoIzq(int[] arr, int ini) {
      		while(ini<MAXC-1) {
      			arr[ini]=arr[ini+1];
      			ini++;
      		}
	}
	public static int pedirNumero(String string,int max) {
		int numero=0;
        boolean esValido=false;
        while(!esValido) {
        	try {
        		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        		System.out.println("ingresa Un numero entero para la " +string+" entre 0 y " + max);
        		numero = new Integer (entrada.readLine());
        		if(numero>=0&&numero<=max) {
        			esValido=true;
        		}
        	}catch(Exception err) {
        		System.out.println(err);
        	}
        }
		return numero;
	}
   public static void imprimrMatriz(int[][] matriz) {
		for(int fila=0;fila<MAXF;fila++) {
			recorrerColum(matriz[fila]);
		}
   }
   public static void recorrerColum(int[] arr) {
     	for(int colum=0;colum<MAXC;colum++) {
   		   System.out.print(" | " + arr[colum]);
   	    }
     	System.out.println("");
   }
}
