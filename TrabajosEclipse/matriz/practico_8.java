package matriz;
//Hacer un programa que dado una matriz ordenada creciente por filas de enteros de tamaño 4*5 que se

//encuentra precargada, solicite al usuario un número entero y una fila, y elimine la primer ocurrencia de
//número en la fila indicada (un número igual) si existe.

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class practico_8 {
	final static int MAXFILA = 4;
	final static int MAXCOLUM = 5;

	public static void main(String[] args) {
		int[][] matrizEnteros = new int[MAXFILA][MAXCOLUM];
		int fila, entero = 0;
		cargar_matriz(matrizEnteros);
		inprimir_matriz(matrizEnteros);
		System.out.println("ordenar_creciente");
		ordenar_filas(matrizEnteros);
		inprimir_matriz(matrizEnteros);
		entero = solicitar_numero();
		fila = solicitar_fila();
		corrimiento_izquierda(matrizEnteros[fila], entero);
		inprimir_matriz(matrizEnteros);

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

	public static void cargar_matriz(int[][] matriz) {
		for (int fila = 0; fila < MAXFILA; fila++) {
			for (int pos = 0; pos < MAXCOLUM; pos++) {
				int random = (int) (10 * Math.random() + 1);
				matriz[fila][pos] = random;
			}
		}
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

	public static int solicitar_numero() {
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		int valor = 0;
		boolean valido = false;
		while (!valido) {
			try {
				System.out.println("ingresame un numero entero");
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
				System.out.println("ingresame una fila del 0 a " + (MAXFILA - 1));
				valor = new Integer(entrada.readLine());
				if (valor >= 0 && valor <= MAXFILA - 1) {
					valido = true;
				}
			} catch (Exception err) {
				System.out.println("");
			}
		}
		return valor;
	}

	public static void corrimiento_izquierda(int []arr,int numero) {
         int pos=0;
		while (pos < MAXCOLUM - 1) {// pos=9 y maxcolum=9;
			if(arr[pos]==numero) {
			arr[pos] = arr[pos + 1];// arr[8]=arr[8+1]
			 // pos=8+1
			}
			pos++;
		}
	}
}
