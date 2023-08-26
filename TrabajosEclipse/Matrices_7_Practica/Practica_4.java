package Matrices_7_Practica;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//Hacer un programa que dada una matriz de enteros de tamaño 5*10 que se encuentra precargada,
//solicite al usuario un número entero y una posición fila, columna. Con estos datos tendrá que realizar un
//corrimiento a derecha (se pierde el último valor en dicha fila) y colocar el número en la matriz en la
//posición fila, columna indicada
public class Practica_4 {
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
		 int numeroEntero=pedirNumero("",MAXC);
		 int fila=pedirNumero(" fila",MAXF-1);
		 int colum=pedirNumero(" colum",MAXC-1);
		 corrimientoDerecha(matriz[fila],colum);
		 matriz[fila][colum]=numeroEntero;
		 imprimrMatriz(matriz);
	 }
	public static void corrimientoDerecha(int[] arr, int ini) {
		int index=MAXC-1;
		while(index>ini) {
			arr[index]=arr[index-1];
			index--;
		}
	}
	public static int pedirNumero(String string,int max) {
		int numero=0;
        boolean esValido=false;
        while(!esValido) {
        	try {
        		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        		System.out.println("ingresa Un numero entero" +string+" entre 0 y " + max);
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
