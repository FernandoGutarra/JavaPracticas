package Matrices_7_Practica;
//Hacer un programa que dada una matriz de enteros de tamaño 5*10 que se encuentra precargada,
//obtenga la cantidad de números pares que tiene y la imprima.
public class Practica_2 {
	final static int MAXF=5;
	final static int MAXC=10;
	final static int PAR=2;
  public static void main(String[]args) {
	  int[][]matriz= {
			  {6,2,30,4,3,4,4,2,7,84},
			  {6,35,60,10,3,4,4,2,7,84},
			  {5,34,3,3,40,23,43,20,7,40},
			  {34,23,3,0,3,4,4,2,7,30},
			  {34,2,3,0,3,4,4,2,7,9},
	    };
	  int cantidaDeElementoPares=0;
	  cantidaDeElementoPares+=cantidadDeNumeroParesPorFila(matriz);
	  System.out.println("numerosParesTotal "+cantidaDeElementoPares);
	  }
	 public static int cantidadDeNumeroParesPorFila(int[][] matriz) {
	     int numerosPar=0;     
		 for(int fila=0;fila<MAXF;fila++) {
			 for(int colum=0;colum<MAXC;colum++){
	        	 if(matriz[fila][colum]%PAR==0) {
	        		 numerosPar++;
	        	 }
	          }
			 }
	   return numerosPar;
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
