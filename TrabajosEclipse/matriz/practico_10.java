package matriz;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//Hacer un programa que dada la matriz de secuencias de enteros definida y precargada, permita
//obtener a través de métodos la posición de inicio y la posición de fin de la secuencia ubicada a
//partir de una posición entera y una fila, ambas ingresadas por el usuario. Finalmente, si existen
//imprima por pantalla ambas posiciones obtenidas.
public class practico_10 {
	final static int MAXFILA = 4;
	final static int MAXCOLUM = 20;

	public static void main(String[] args) {
		int[][] matInt = { { 0, 6, 6, 0, 4, 4, 0, 0, 3, 9, 0, 8, 5, 7, 0, 6, 6, 0, 1, 0 },
				{ 0, 3, 0, 5, 0, 9, 0, 5, 0, 0, 0, 0, 3, 0, 9, 3, 4, 0, 0, 0 },
				{ 0, 2, 0, 0, 0, 7, 0, 0, 7, 0, 4, 0, 0, 0, 2, 0, 8, 4, 5, 0 },
				{ 0, 5, 0, 3, 1, 9, 0, 5, 7, 0, 0, 4, 0, 0, 0, 9, 9, 0, 0, 0 }, };

		int fila = 0;
		int pos = 0;
		int inicio = 0;
		int fin = 0;
		int respaldo = 0;
		int respaldo_f = 0;
		inprimir_matriz(matInt);
		fila = pedir_fila();
		pos = pedir_poscision();
		while (inicio < MAXCOLUM - 1) {
			fin = 0;
			inicio = obtener_inicio(matInt[fila], inicio);
			if (inicio < MAXCOLUM - 1) {
				fin = obtener_fin(matInt[fila], inicio);
				if (pos == inicio) {
					respaldo = inicio;
					respaldo_f = fin;
					System.out.println("el inicio es " + respaldo + " el fin es " + respaldo_f);
				}
				else{
					System.out.println("la pocision nose encontro");
				}
				
				inicio = fin + 1;

			}
		}
		inicio=0;
		
	}

	public static void inprimir_matriz(int[][] matInt) {
		for (int fila = 0; fila < MAXFILA; fila++) {
			recorrer_pos(matInt[fila]);
		}
	}

	public static void recorrer_pos(int[] arr) {
		for (int pos = 0; pos < MAXCOLUM; pos++) {
			System.out.print("|" + arr[pos]);
		}
		System.out.println("");
	}

	public static int pedir_fila() {
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		int valor = 0;
		boolean valido = false;
		while (!valido) {
			try {
				System.out.println("ingrese una fila del 0 al " + (MAXFILA - 1));
				valor = new Integer(entrada.readLine());
				if (valor >= 0 && valor <= MAXFILA - 1) {
					valido = true;
				}
			} catch (Exception err) {
				System.out.println("err");
			}
		}

		return valor;
	}

	public static int pedir_poscision() {
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		int valor = 0;
		boolean valido = false;
		while (!valido) {
			try {
				System.out.println("ingrese una posicion o columna del 0 al " + (MAXCOLUM - 1));
				valor = new Integer(entrada.readLine());
				if (valor >= 0 && valor <= MAXCOLUM - 1) {
					valido = true;
				}
			} catch (Exception err) {
				System.out.println("err");
			}
		}

		return valor;
	}

	public static int obtener_inicio(int[] arr, int inicio) {

		while (inicio < MAXCOLUM && arr[inicio] == 0) {
			inicio++;
		}
		return inicio;
	}

	public static int obtener_fin(int[] arr, int inicio) {
		while (inicio < MAXCOLUM && arr[inicio] != 0) {
			inicio++;
		}
		return inicio - 1;
	}

}
