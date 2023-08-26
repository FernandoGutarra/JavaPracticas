package Matrices_7_Practica;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//Hacer un programa que dada la matriz de secuencias de caracteres definida y precargada, elimine de
//cada fila todas las ocurrencias de una secuencia patrón dada por un arreglo de caracteres de tamaño
//igual al tamaño de columnas de la matriz (sólo tiene esa secuencia con separadores al inicio y al final).
//Al eliminar en cada fila se pierden los valores haciendo los corrimientos
public class Practica_14 {
	 final static int MAXF=2;
	  final static int MAXC=10;
	  public static void main(String[]args) {
		  int [] secuPatron= {0,2,3,4,0,0,0,0,0,0};
		  int [][] matriz = {
				  {0,2,3,4,0,3,0,3,4,0},
				  {0,2,9,0,0,2,3,4,0,0},
		  };
		  imprimrMatriz(matriz);
		  System.out.println();
			  int ini=0;
			  int fin=0;
				  while(ini<MAXC) {
					  ini=buscarIni(secuPatron,ini);
					  if(ini<MAXC) {
						 fin=buscarFin(secuPatron,ini);
						 int tamanioSecu=fin-ini+1;
					     buscarSecuPatronEnMatriz(secuPatron,ini,fin,tamanioSecu,matriz);
						 ini=fin+1;  
					  }
				  }
				  imprimrMatriz(matriz);
				  System.out.println();
	}
	private static void buscarSecuPatronEnMatriz(int[] secuPatron, int iniPatron, int finPatron, int tamanioSecuPatron, int[][] matriz) {
		for(int fila=0;fila<MAXF;fila++) {
			 int ini=0;
			 int fin=0;
					while(ini<MAXC) {
						ini=buscarIni(matriz[fila],ini);
						if(ini<MAXC) {
							fin= buscarFin(matriz[fila],ini);
							int tamanioSecu=fin-ini+1;
							if(tamanioSecu==tamanioSecuPatron) {
								if(sonSecuPatronIdenticas(secuPatron,iniPatron,finPatron,matriz[fila],ini,fin)) {
									  corrimientoIzq(matriz[fila],ini,tamanioSecu);
								      ini=fin-tamanioSecu+1;
								}
							}
							ini=fin+1;
						}
					}
		   }		
		}
		

	public static boolean sonSecuPatronIdenticas(int[] arrP, int iniP, int finP, int[] arr, int ini,int fin) {
		while(iniP<=finP&&ini<=fin) {
			if(arr[ini]!=arrP[iniP]) {
				return false;
			}
			iniP++;
			ini++;
		}
		return true;
	}
	public static void corrimientoIzq(int[] arr, int ini, int tamanioSecu) {
		int iniPos=ini;
		for(int i=0;i<=tamanioSecu;i++) {
			while(ini<MAXC-1) {
				arr[ini]=arr[ini+1];
				ini++;
			}
			ini=iniPos;
		}
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
