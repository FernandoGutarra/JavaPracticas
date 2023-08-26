package Matrices_7_Practica;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//Hacer un programa que dada una matriz de enteros de tamaño 5*10 que se encuentra precargada,
//solicite al usuario un número entero y elimine la primer ocurrencia de número en la matriz (un número
//igual) si existe. Para ello tendrá que buscar la posición y si está, realizar un corrimiento a izquierda y no
//continuar buscando
public class Practica_5 {
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
		 System.out.println();
		 int numeroEntero=pedirNumero();
		 eliminarOcurrencia(matriz,numeroEntero);
		 imprimrMatriz(matriz);
		 }
	  public static void eliminarOcurrencia(int[][] matriz, int numeroEntero) {
	     for(int fila=0;fila<MAXF;fila++) {
	    	 int colum=0;
	    	 while(colum<MAXC) {
	    		 if(matriz[fila][colum]==numeroEntero) {
	    			 corrimientoIzquierda(matriz[fila],colum);
	    			 colum--;
	    		 }
	    		 colum++;
	    	 }
	     }
	  }
	public static void corrimientoIzquierda(int[] arr, int ini) {
		while(ini<MAXC-1) {
			arr[ini]=arr[ini+1];
			ini++;
		}
		arr[ini]=0;
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
	   public static int pedirNumero() {
			int numero=0;
	        boolean esValido=false;
	        while(!esValido) {
	        	try {
	        		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
	        		System.out.println("ingresa Un numero entero");
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
}
