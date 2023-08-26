package Matrices_7_Practica;
//Hacer un programa que dada la matriz de secuencias de enteros definida y precargada permita
//encontrar por cada fila la posición de inicio y fin de la secuencia cuya suma de valores sea mayor. 
public class Practico_11 {
	 final static int MAXF=2;
	  final static int MAXC=10;
	  public static void main(String[]args) {
		  int [][] matriz = {
				  {0,2,3,4,0,0,0,3,4,0},
				  {0,2,9,0,0,2,2,0,0,0},
		  };
		  imprimrMatriz(matriz);
		  int sumaMayor=0;
		  int filaMayor=0;
		  int iniMayor=0;
		  int finMayor=0;
		  for(int fila=0;fila<MAXF;fila++) {
			  int ini=0;
			  int fin=0;
				  while(ini<MAXC) {
					  ini=buscarIni(matriz[fila],ini);
					  if(ini<MAXC) {
						 fin=buscarFin(matriz[fila],ini);
						 int tamanioSecu=fin-ini+1;
						 int sumaSecu=sumarSecu(matriz[fila],ini,fin);
						 if(sumaSecu>sumaMayor) {
							 sumaMayor=sumaSecu;
							 iniMayor=ini;
							 finMayor=fin;
							 filaMayor=fila;
						 }
						 ini=fin+1;
					  }
				  }
		  }
		  System.out.println("la secuencia de mayor tamaño esta en la fila "+filaMayor+" y ini en "+iniMayor+" fin "+finMayor+" sumaDeSecu "+sumaMayor );
	}
	public static int sumarSecu(int[] arr, int ini, int fin) {
	    int sumaSecu=0;
	      while(ini<=fin) {
	    	  sumaSecu+=arr[ini];
	    	  ini++;
	      }
		return sumaSecu;
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
