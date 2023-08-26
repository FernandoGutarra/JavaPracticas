package Matrices_7_Practica;
//Hacer un programa que dada una matriz de enteros de tamaño 5*10 que se encuentra precargada,
//invierta el orden del contenido por fila. Este intercambio no se debe realizar de manera explícita, hay
//que hacer un método que incluya una iteración de intercambio.

public class Practica_1 {
	final static int MAXF=5;
	final static int MAXC=10;
  public static void main(String[]args) {
	  int[][]matriz= {
			  {6,2,30,4,3,4,4,2,7,84},
			  {6,35,60,10,3,4,4,2,7,84},
			  {5,34,3,3,40,23,43,20,7,40},
			  {34,23,3,0,3,4,4,2,7,30},
			  {34,2,3,0,3,4,4,2,7,60},
	  };
	  imprimrMatriz(matriz);
	  invertirFilas(matriz);
	  System.out.println("");
	  imprimrMatriz(matriz);
  }
  public static void invertirFilas(int[][] matriz) {
	 for(int fila=0;fila<MAXF;fila++) {
		 invertirFila(matriz[fila]);
	 }
  }
public static void invertirFila(int[] arr) {
       int ini=0;
       int fin=MAXC-1;
       int temp=0;
       while(ini<fin) {
    	   temp=arr[ini];
    	   arr[ini]=arr[fin];
    	   arr[fin]=temp;
    	   ini++;
    	   fin--;
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
}
