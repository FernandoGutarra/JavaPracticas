package matriz;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class practica_4 {
	final static int MAXFILA = 5;
	final static int MAXCOLUM = 10;

	public static void main(String[] args) {
		int[][] matEnteros = new int[MAXFILA][MAXCOLUM];
		int fila, columna, numero_entero = 0;
		cargarMatriz_valores_aleatorios(matEnteros);
		inprimir_matriz(matEnteros);
		fila = LeerFilaPorTeclado();
		columna = LeerColumnaPorTeclado();
		numero_entero = numero_entero_porTeclado();
		corrimientoDerecha(matEnteros[fila],columna);
		inprimir_matriz(matEnteros);
		System.out.println("insertar numero");
		insertar_numero_entero(matEnteros,fila,columna,numero_entero);
		inprimir_matriz(matEnteros);
	}

	public static void cargarMatriz_valores_aleatorios(int[][] matriz) {
		for (int fila = 0; fila < MAXFILA; fila++) {
			for (int columna = 0; columna < MAXCOLUM; columna++) {
				int random = (int) (10 * Math.random() + 1);
				matriz[fila][columna] = random;
			}
		}

	}

	public static void inprimir_matriz(int[][] matriz) {
		for (int fila = 0; fila < MAXFILA; fila++) {
			recorrer_Arreglo(matriz[fila]);

		}
	}

	public static void recorrer_Arreglo(int[] arr) {
		for (int columna = 0; columna < MAXCOLUM; columna++) {
			System.out.print("|" + arr[columna]);
		}
		System.out.println("");
	}

	public static int LeerFilaPorTeclado() {
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		int valor = 0;
		boolean valido = false;
		try {
			while (!valido) {

				System.out.println("ingresama una fila del 0 al " + (MAXFILA - 1));
				valor = new Integer(entrada.readLine());
				if (valor >= 0 && valor <= MAXFILA - 1) {
					valido = true;
				} else {
					System.out.println("el valor ingresado es incorrecto");
					System.out.println("");
				}
			}
		} catch (Exception err) {
			System.out.println("err");
		}
		return valor;
	}

	public static int LeerColumnaPorTeclado() {
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		int valor = 0;
		boolean valido = false;
		try {
			while (!valido) {

				System.out.println("ingresama una columna del 0 al " + (MAXCOLUM - 2));
				valor = new Integer(entrada.readLine());
				if (valor >= 0 && valor <= MAXCOLUM - 2) {
					valido = true;
				} else {
					System.out.println("el valor ingresado es incorrecto");
					System.out.println("");
				}
			}
		} catch (Exception err) {
			System.out.println("err");
		}
		return valor;
	}

	public static int numero_entero_porTeclado() {
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		int valor = 0;
		boolean valido = false;
		while (!valido) {
			try {
				System.out.println("ingresame un numero entero");
				valor = new Integer(entrada.readLine());
				valido=true;
			} catch (Exception err) {
				System.out.println("err");
			}

		}
		return valor;
	}
	public static void corrimientoDerecha(int []arr,int pos) {
		int indice=MAXCOLUM-1;
		while(indice>pos) {
			arr[indice]=arr[indice-1];
			indice--;
		}
		
	}
	public static void insertar_numero_entero(int[][]matriz,int fila,int colum,int entero) {
		matriz[fila][colum]=entero;
	}
	
}
//Hacer un programa que dada una matriz de enteros de tamaño 5*10 que se encuentra precargada,
//solicite al usuario un número entero y una posición fila, columna. Con estos datos tendrá que realizar un
//corrimiento a derecha (se pierde el último valor en dicha fila) y colocar el número en la matriz en la
//posición fila, columna indicada.
