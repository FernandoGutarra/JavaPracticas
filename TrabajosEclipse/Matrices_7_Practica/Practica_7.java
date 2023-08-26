package Matrices_7_Practica;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//Hacer un programa que dado una matriz ordenada creciente por filas de enteros de tamaño 4*5 que se
//encuentra precargada, solicite al usuario un número entero y una fila, y luego inserte el número en la
//matriz en la fila indicada manteniendo su orden.
public class Practica_7 {
	final static int MAXF=4;
	final static int MAXC=5;
	public static void main(String[]args) {
		  int[][]matriz= {
				  {2,6,10,15,20},
				  {6,35,60,10,3},
				  {5,34,3,3,40},
				  {34,23,3,0,3},
		    };
		 imprimrMatriz(matriz);
		 ordenarMatriz(matriz);
		 System.out.println("");
		 imprimrMatriz(matriz);
	     int numeroEntero=pedirNumero("");
	     int fila=pedirNumero(" fila");
	     insetarEnteroEnOrden(matriz[fila],numeroEntero);
	     System.out.println("");
		 imprimrMatriz(matriz);
	}
	 public static void insetarEnteroEnOrden(int[] arr,int numeroEntero) {
		int colum=0;
		boolean esValido=false;
		 while(colum<MAXC && !esValido) {
			if(numeroEntero>=arr[colum]) {
				colum++;
			}else {
				corrimientoDerecha(arr,colum,numeroEntero);
				esValido=true;
			}
		}
	}
	public static void corrimientoDerecha(int[] arr, int ini,int numero) {
		int indice=MAXC-1;
		while(indice>ini) {
			arr[indice]=arr[indice-1];
			indice--;
		}
		arr[ini]=numero;
	}
	public static void ordenarMatriz(int[][] matriz) {
		 for(int fila=0;fila<MAXF;fila++) {
			 reordenarColum(matriz[fila]);
		 }
	}
	public static void reordenarColum(int[] arr) {
		int temp;
		 for(int i = 1;i < MAXC;i++){
		    for (int j = 0 ; j < MAXC - 1; j++){
				 if (arr[j] > arr[j+1]){
				 temp = arr[j];
				 arr[j] = arr[j+1];
				 arr[j+1] = temp;
		     }
		    }
		 }

	}
	public static int pedirNumero(String para) {
			int numero=0;
	        boolean esValido=false;
	        while(!esValido) {
	        	try {
	        		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
	        		System.out.println("ingresa Un numero entero"+para);
	        		numero = new Integer (entrada.readLine());
	        		if(numero>=0) {
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
