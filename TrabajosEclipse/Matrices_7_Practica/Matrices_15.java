package Matrices_7_Practica;

//Hacer un programa que dada la matriz de secuencias de caracteres definida y precargada elimine todas
//las secuencias que tienen orden descendente entre sus elementos
public class Matrices_15 {
	final static int MAXC = 10;
	final static int MAXF = 2;

	public static void main(String[] args) {
		int[][] matriz = { 
				{ 0, 2, 3, 4, 0, 3, 0, 4, 3, 0 },
				{ 0, 2, 9, 0, 0, 8, 7, 0, 0, 0 }, 
		};
		  imprimrMatriz(matriz);
		  System.out.println();
		for(int fila=0;fila<MAXF;fila++) {
				int ini=0;
				int fin=0;
			 while(ini<MAXC){
					 ini=buscarIni(matriz[fila],ini);
					  if(ini<MAXC) {
						  fin=buscarFin(matriz[fila],ini);
						  int tamanioSecu=fin-ini+1;
						  if(esSecuDecreciente(matriz[fila],ini,fin)) {
							  corrimientoIzq(matriz[fila],ini,tamanioSecu);
							  ini=fin-tamanioSecu+1;
						  }
						  ini=fin+1;
					  }
			 }
			  imprimrMatriz(matriz);
			  System.out.println();
		 }
	}

	public static void corrimientoIzq(int[] arr, int ini, int tamanioSecu) {
		int iniPos=ini;	 
		for(int i=0;i<tamanioSecu;i++) {	
						while(ini<MAXC-1) {
							arr[ini]=arr[ini+1];
							ini++;
						}
						ini=iniPos;
			  }
	}

	public static boolean esSecuDecreciente(int[] arr, int ini, int fin) {
		while(ini<=fin-1) {
			if(arr[ini]<arr[ini+1]) {
				return false;
			}
			ini++;
		}
		return true;
	}

	public static int buscarFin(int[] arr, int ini) {
		while (ini < MAXC && arr[ini] != 0) {
			ini++;
		}
		return ini - 1;
	}

	public static int buscarIni(int[] arr, int ini) {
		while (ini < MAXC && arr[ini] == 0) {
			ini++;
		}
		return ini;
	}

	public static void imprimrMatriz(int[][] matriz) {
		for (int fila = 0; fila < MAXF; fila++) {
			recorrerColum(matriz[fila]);
		}
	}

	public static void recorrerColum(int[] arr) {
		for (int colum = 0; colum < MAXC; colum++) {
			System.out.print(" | " + arr[colum]);
		}
		System.out.println("");
	}
}
