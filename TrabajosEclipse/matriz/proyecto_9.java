package matriz;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//Hacer un programa que dado una matriz de enteros de tamaño 4*5 que se encuentra precargada,
//solicite al usuario el ingreso de una fila y dos números enteros (columnas de la matriz), y ordene de
//forma creciente la matriz en la fila indicada entre las dos posiciones columnas ingresadas.
public class proyecto_9 {
	final static int MAXFILA = 4;
	final static int MAXCOLUM = 5;

	public static void main(String[] args) {
		int[][] matInt = new int[MAXFILA][MAXCOLUM];
		int entero1, entero2, fila = 0;
		cargar_matriz_aleatoriamente(matInt);
		inprimir_matriz(matInt);
		fila = solicitar_fila();
		entero1 = solicitar_entero();
		entero2 = solicitar_entero();
		ordenar_matriz(matInt[fila], entero1, entero2);
		inprimir_matriz(matInt);
	}

	public static void cargar_matriz_aleatoriamente(int[][] matriz) {
		for (int fila = 0; fila < MAXFILA; fila++) {
			for (int pos = 0; pos < MAXCOLUM; pos++) {
				int random = (int) (20 * Math.random() + 1);
				matriz[fila][pos] = random;
			}
		}
	}

	public static void inprimir_matriz(int[][] matriz) {
		for (int fila = 0; fila < MAXFILA; fila++) {
			recorrer_pos(matriz[fila]);
		}
	}

	public static void recorrer_pos(int[] arr) {
		for (int pos = 0; pos < MAXCOLUM; pos++) {
			System.out.print("|" + arr[pos]);

		}
		System.out.println("");
	}

	public static int solicitar_entero() {
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		int valor = 0;
		boolean valido = false;
		while (!valido) {
			try {
				System.out.println("ingresa un numero de columna o pos entre 0 y " + (MAXCOLUM - 1));
				valor = new Integer(entrada.readLine());
				valido = true;
			} catch (Exception err) {
				System.out.println("");
			}
		}
		return valor;
	}

	public static int solicitar_fila() {
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		int valor = 0;
		boolean valido = false;
		while (!valido) {
			try {
				System.out.println("ingresa un numero de fila o pos entre 0 y " + (MAXFILA - 1));
				valor = new Integer(entrada.readLine());
				valido = true;
			} catch (Exception err) {
				System.out.println("");
			}
		}
		return valor;
	}

	public static void ordenar_matriz(int[]arr,int pos1,int pos2) {
		int temp;
		int maximo=0;
		int minimo=0;
		if(pos1>pos2) {
			maximo=pos1;
			minimo=pos2;
			pos2=maximo;
			pos1=minimo;
			
		}
		for (int i = pos1; i < pos2; i++) {
			for (int j = pos1+1; j <pos2  - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
  }
}
