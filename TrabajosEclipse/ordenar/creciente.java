package ordenar;

public class creciente {
  final static int MAXF=2;
  final static int MAXC=10;
  public static void main(String[]args) {
	  int[][]mat= {
			  {0,5,3,4,9,7,4,9,4,0},
			  {0,29,9,0,0,2,2,0,0,0},
	  };
	  imprimrMatriz(mat);
	  System.out.println("");
	  for(int fila=0;fila<MAXF;fila++) {
	    ordenarSecu(mat[fila]);	   
	  }
	  imprimrMatriz(mat);
}
	private static void ordenarSecu(int[] arr) {
		 int temp;
		 for(int i = 0;i < MAXC-1;i++){
			 for (int j = 0 ; j < MAXC - 1; j++){
				 if (arr[j] < arr[j+1]){
					 temp = arr[j+1];
					 arr[j+1] = arr[j];
					 arr[j] = temp;
				 }
			 }
		 }

	
}
	public static void ordenarSecu(int[] arr, int ini,int fin,int tamanioSecu) {
	    int temp=0;
		for(int j=0;j<tamanioSecu;j++) {
			 for(int i=ini;i<fin;i++) {
				 if(arr[i]<arr[i+1]) {
				    temp=arr[i+1];
				    arr[i+1]=arr[i];
				    arr[i]=temp;
				 }
			 }
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
