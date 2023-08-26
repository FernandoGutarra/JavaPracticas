package ordenar;

public class buscarSecuCresiente {
	final static int MAXF=2;
	final static int MAXC=10;
	public static void main(String[]args) {
	int[][]mat= {
			  {0,5,3,4,9,7,4,9,4,0},
			  {0,29,9,0,0,2,3,0,7,0},
	  };
	 imprimirMatriz(mat);
	 
	 for(int fila=0;fila<MAXF;fila++) {
		 int ini=0;
		 int fin=0;
	 while(ini<MAXC) {
		 ini=buscarIni(mat[fila],ini);
			 if(ini<MAXC) {
				 fin=buscarFin(mat[fila],ini);
				 if(secuEsCreciente(mat[fila],ini,fin)) {
					 System.out.println("la secu en la fila "+fila+" y en inicio "+ini+" fin "+fin);
				 }
				 ini=fin+1;
			 }
	    }
	 }
	}
	private static boolean secuEsCreciente(int[] arr, int ini, int fin) {
		if(ini==fin) {
			return false;
		}
		while(ini<=fin-1) {
			if(arr[ini]<arr[ini+1]) {
				return false;
			}
			ini++;
		}
		return true;
	}
	private static int buscarFin(int[] arr, int ini) {
		while(ini<MAXC && arr[ini]!=0) {
			ini++;
		}
		return ini-1;
	}
	private static int buscarIni(int[] arr, int ini) {
		while(ini<MAXC && arr[ini]==0) {
			ini++;
		}
		return ini;
	}
	public static void imprimirMatriz(int[][] matriz) {
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
