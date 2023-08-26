package matriz;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class practica_3 {
	final static int MAXFILA = 5;
	final static int MAXCOLUMNA = 10;

	public static void main(String[] args) {
		int[][] matint = new int[MAXFILA][MAXCOLUMNA];
		int fila, columna = 0;
		cargarMaztriz_aleatorio(matint);
		inprimirMatriz(matint);
		fila = leerFilaPorTeclado();
		columna = leerColumnaPorTeclado();
		corrimiento_izquierda_fila_columna(matint[fila],columna);
		inprimirMatriz(matint);
	}

	public static void cargarMaztriz_aleatorio(int[][] matriz) {
		for (int fila = 0; fila < MAXFILA; fila++) {
			int random = 0;
			for (int columna = 0; columna < MAXCOLUMNA; columna++) {
				random = (int) (10 * Math.random() + 1);
				matriz[fila][columna] = random;
			}
		}
	}

	public static void inprimirMatriz(int[][] matriz) {
		for (int fila = 0; fila < MAXFILA; fila++) {
			recorrerColumnas(matriz[fila]);

		}

	}

	public static void recorrerColumnas(int[] arr) {
		for (int columna = 0; columna < MAXCOLUMNA; columna++) {
			System.out.print("|" + arr[columna]);
		}
		System.out.println("");
	}

	public static int leerFilaPorTeclado() {
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		int valor = 0;
		boolean valido = false;
		try {
			while (!valido) {
				System.out.println("ingresame un valor de fila entre el 0 al " + (MAXFILA - 1));
				valor = new Integer(entrada.readLine());
				if (valor >= 0 && valor <= 4) {
					valido = true;
				} else {
					System.out.println("numero ingresado incorrecto");
					System.out.println("");
				}
			}
		} catch (Exception err) {
			System.out.println("err");
		}

		return valor;
	}

	public static int leerColumnaPorTeclado() {
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		int valor = 0;
		boolean valido = false;
		try {
			while (!valido) {
				System.out.println("ingresame un valor de columna entre el 0 al " + (MAXCOLUMNA - 1));
				valor = new Integer(entrada.readLine());
				if (valor >= 1 && valor <= MAXCOLUMNA-1) {
					valido = true;
				} else {
					System.out.println("numero ingresado incorrecto");
					System.out.println("");
				}
			}
		} catch (Exception err) {
			System.out.println("err");
		}

		return valor;
	}

	public static void corrimiento_izquierda_fila_columna(int[] arr, int pos) {
	
	}
	
}

//Hacer un programa que dada una matriz de enteros de tamaño 5*10 que se encuentra precargada,
//solicite al usuario una posición fila, columna y realice un corrimiento a izquierda.
