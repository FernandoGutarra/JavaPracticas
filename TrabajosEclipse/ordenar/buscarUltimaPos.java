package ordenar;

public class buscarUltimaPos {
	final static int MAXF=2;
	final static int MAXC=10;
	public static void main(String[]args) {
	int[][]mat= {
			  {0,5,3,4,9,7,4,9,4,0},
			  {0,29,9,0,0,2,3,0,7,0},
	  };
	 imprimirMatriz(mat);
	 int ultimoIni=0;
	 int ultimoFin=0;
	 for(int fila=0;fila<MAXF;fila++) {
		 int ini=0;
		 int fin=0;
		 while(ini<MAXC) {
		   ini=buscarIni(mat[fila],ini);
		   if(ini<MAXC) {
			   fin=buscarFin(mat[fila],ini);
				   ultimoIni=ini;
				   ultimoFin=fin;
			   ini=fin+1;
		   }
		  
		 }
		 System.out.println("fila "+fila+" unltimoIni="+ultimoIni+" ultimoFin="+ ultimoFin);
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
