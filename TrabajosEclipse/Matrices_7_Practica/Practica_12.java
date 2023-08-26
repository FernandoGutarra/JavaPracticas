package Matrices_7_Practica;
//Hacer un programa que dada la matriz de secuencias de caracteres definida y precargada, permita
//encontrar por cada fila la posición de inicio y fin de la anteúltima secuencia (considerar comenzar a
//buscarla a partir de la última posición de la fila).
public class Practica_12 {
		 final static int MAXF=2;
		  final static int MAXC=10;
		  public static void main(String[]args) {
			  int [][] matriz = {
					  {0,2,3,4,0,3,0,3,4,0},
					  {0,2,9,0,0,2,2,0,0,0},
			  };
			  imprimrMatriz(matriz);
			  int anteUltimaIni=0;
			  int anteUltimaFin=0;
			  for(int fila=0;fila<MAXF;fila++) {
				  int ini=0;
				  int fin=0;
					  while(ini<MAXC) {
						  ini=buscarIni(matriz[fila],ini);
						  if(ini<MAXC) {
							 fin=buscarFin(matriz[fila],ini);
							 if(buscarIni(matriz[fila],fin+1)<MAXC) {
								  anteUltimaIni=ini;
								  anteUltimaFin=fin;
							 }
							 ini=fin+1;
						  }
					  }
	  System.out.println("ante ultimo ini " + anteUltimaIni + " ante ultimo fin "+anteUltimaFin );
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
