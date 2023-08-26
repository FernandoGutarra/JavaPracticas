package Matrices_7_Practica;
//Hacer un programa que dado una matriz ordenada creciente por filas de enteros de tamaño 4*5 que se
//encuentra precargada, solicite al usuario un número entero y una fila, y elimine la primer ocurrencia de
//número en la fila indicada (un número igual) si existe.

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Practica_8 {
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
		  System.out.println("");
		  int numeroEntero=pedirNumero("");
		  int fila=pedirNumero(" fila");
		  eliminarOcurrenciaEnFila(matriz[fila],numeroEntero);
		  System.out.println("");
		  imprimrMatriz(matriz);
	}
	
	public static void eliminarOcurrenciaEnFila(int[] arr, int numeroEntero) {
	  int colum=0;
	  while(colum<MAXC) {
		  if(numeroEntero==arr[colum]) {
			  corrimientoIzq(arr,colum);
		  }else {
		    colum++;
		  }
	  }
	}

	private static void corrimientoIzq(int[] arr, int ini) {
		while(ini<MAXC-1) {
		  arr[ini]=arr[ini+1];	
			ini++;
		}
		
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
    public static int pedirNumero(String para) {
		int numero=0;
        boolean esValido=false;
        while(!esValido) {
        	try {
        		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        		System.out.println("ingresa un numero entero"+para);
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
