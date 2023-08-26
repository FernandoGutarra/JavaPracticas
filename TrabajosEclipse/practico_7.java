import java.io.BufferedReader;
import java.io.InputStreamReader;

public class practico_7 {
	final static int MAXFILA = 4;
	final static int MAXCOLUM = 5;

	public static void main(String[] args) {
		int[][] matInt = new int[MAXFILA][MAXCOLUM];
		int entero,fila=0;
		cargar_matriz_aleatoriamente(matInt);
		imprimir_matriz(matInt);
		ordenar_filas(matInt);
		System.out.println("ordenamiento de filas");
		imprimir_matriz(matInt);
		entero=perdir_numero();
		fila=pedrir_fila();
		insertar_numero(matInt[fila],entero);
		imprimir_matriz(matInt);
	}

	public static void cargar_matriz_aleatoriamente(int[][] matInt) {
		for (int fila = 0; fila < MAXFILA; fila++) {
			for (int colum = 0; colum < MAXCOLUM; colum++) {
				int random = (int) (10 * Math.random() + 1);
				matInt[fila][colum] = random;
			}
		}

	}

	public static void imprimir_matriz(int[][] matInt) {
		for (int fila = 0; fila < MAXFILA; fila++) {
			recorre_pos(matInt[fila]);
		}
	}

	public static void recorre_pos(int[] arr) {
		for (int pos = 0; pos < MAXCOLUM; pos++) {
			System.out.print("|" + arr[pos]);
		}
		System.out.println("");
	}

	public static void ordenar_filas(int[][] matriz) {
		for (int fila = 0; fila < MAXFILA; fila++) {
			ordenar_pos(matriz[fila]);
		}
	}

	public static void ordenar_pos(int[] arr) {
		int temp;
		for (int i = 0; i < MAXCOLUM; i++) {
			for (int j = 0; j < MAXCOLUM - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}
	public static int perdir_numero() {
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		int valor=0;
		boolean valido=false;
		while(!valido){
			try {
			System.out.println("ingresame un numero entero");
			valor=new Integer(entrada.readLine());
			valido=true;
			}
			catch(Exception err) {
				System.out.println("err");
			}
		}
		return valor;
	}
   public static int pedrir_fila() {
	   BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
	   int valor=0;
	   boolean valido=false;
	   while(!valido) {
		try {  System.out.println("ingresame un numero del fila de 0 a "+(MAXFILA-1));
		  valor=new Integer(entrada.readLine());
		  if(valor>=0&&valor<=MAXFILA-1) {
			  valido=true;
		  }
		}catch(Exception err ) {
			System.out.println("err");
		}
	   }
	   return valor;
   }

   public static void insertar_numero(int[]arr,int entero) {
	   int pos=0;
	    boolean valido=false;
	   while(pos<MAXCOLUM-1&&!valido) {
		   if( arr[pos]>entero) {
			   arr[pos]=entero;
			   valido=true;
		   }
		  
		   pos++;
	   }
   }

}
//Hacer un programa que dado una matriz ordenada creciente por filas de enteros de tamaño 4*5 que se
//encuentra precargada, solicite al usuario un número entero y una fila, y luego inserte el número en la
//matriz en la fila indicada manteniendo su orden.
