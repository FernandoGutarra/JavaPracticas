package matriz;
//Hacer un programa que dada una matriz de enteros de tamaño 5*10 que se encuentra precargada,

//obtenga la cantidad de números pares que tiene y la imprima.

public class practico_2 {
	final static int MAXFILA = 5;
	final static int MAXCOLUM = 10;

	public static void main(String[] arg) {
		int[][] matEnteros = new int[MAXFILA][MAXCOLUM];
		cargarMatriz(matEnteros);
		mostrarMatriz(matEnteros);
		CantidadDePares(matEnteros);
	}

	public static void cargarMatriz(int[][] matriz) {
		for (int fila = 0; fila < MAXFILA; fila++) {

			for (int columna = 0; columna < MAXCOLUM; columna++) {
              int random=(int)(10*Math.random()+1);
              matriz[fila][columna]=random;
			}
		}
	}
	public static void mostrarMatriz(int [][]matriz) {
          for(int fila=0;fila<MAXFILA;fila++) {
        	  recorrerColumnas(matriz[fila]);
          }		
	}
    public static void recorrerColumnas(int []arr) {
    	for(int columna=0;columna<MAXCOLUM;columna++) {
    		System.out.print("|"+arr[columna]);
    	}
    	System.out.println("");
    }
    public static void CantidadDePares(int[][]matriz) {
    	int valor=0;
    	;
    	int contador=0;
    	for(int fila=0;fila<MAXFILA;fila++) {
    		for(int columna=0;columna<MAXCOLUM;columna++) {
    		   
    	    valor=matriz[fila][columna];
    		
    		if(valor%2==0) {
    			contador++;
    		  } 
    		}
    	}
    	System.out.println("cantidad de numeros pares "+ contador);
    }
    
}
