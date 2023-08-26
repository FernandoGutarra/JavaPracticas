package Matrices_7_Practica;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//Hacer un programa que dada la matriz de secuencias de enteros definida y precargada, y un número
//entero ingresado por el usuario, elimine de cada fila las secuencias de tamaño igual al número
//ingresado.
public class Practica_13 {
	 final static int MAXF=2;
	  final static int MAXC=10;
	  public static void main(String[]args) {
		  int [][] matriz = {
				  {0,2,3,4,0,3,0,3,4,0},
				  {0,2,9,0,0,2,2,0,0,0},
		  };
		  imprimrMatriz(matriz);
		  System.out.println();
		  int numeroEntero=pedirNumero();
		  for(int fila=0;fila<MAXF;fila++) {
			  int ini=0;
			  int fin=0;
				  while(ini<MAXC) {
					  ini=buscarIni(matriz[fila],ini);
					  if(ini<MAXC) {
						 fin=buscarFin(matriz[fila],ini);
						 int tamanioSecu=fin-ini+1;
						 if(tamanioSecu==numeroEntero) {
							 eliminarSecuDeIgualTamanioAentero(matriz[fila],ini,fin);
							 ini=fin-tamanioSecu+1;
						 }else {
						   ini=fin+1;
						 }
					  }
				  }
		  }
		  imprimrMatriz(matriz);
		  System.out.println();
	}
	private static void eliminarSecuDeIgualTamanioAentero(int[] arr, int ini, int fin) {
		int iniPos=ini;
		while(ini<=fin) {
			corrimientoIzq(arr,iniPos);
			ini++;
		}
	}
	public static void corrimientoIzq(int[] arr, int ini) {
			while(ini<MAXC-1) {
				arr[ini]=arr[ini+1];
				ini++;
			}
	}
	public static int pedirNumero() {
		int numeroEntero=0;
		boolean esValido=false;
		  while(!esValido){
			  try {
				  BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
				  System.out.println("ingresa Numero Entero");
				  numeroEntero = new Integer(entrada.readLine());
				  if(numeroEntero>0) {
					  esValido=true;
				  }
			  }catch(Exception err) {
				  System.out.println(err);
			  }
		  }
		return numeroEntero;
	}
	public static int buscarFin(int[] arr, int ini) {
		while(ini<MAXC && arr[ini]!=0) {
			ini++;
		}
		return ini-1;
	}
	public static int buscarIni(int[] arr, int ini) {
		while(ini<MAXC && arr[ini]==0) {
			ini++;
		}
		return ini;
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
