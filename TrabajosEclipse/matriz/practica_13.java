package matriz;

import java.io.BufferedReader;
import java.io.InputStreamReader;
//Hacer un programa que dada la matriz de secuencias de enteros definida y precargada, y un número
//entero ingresado por el usuario, elimine de cada fila las secuencias de tamaño igual al número
//ingresado.

public class practica_13 {
	final static int MAXFILA = 4;
	final static int MAXCOLUM = 20;

	public static void main(String[] args) {
		int[][] matInt = { { 0, 6, 6, 0, 4, 4, 0, 0, 3, 9, 0, 8, 5, 7, 0, 6, 6, 0, 1, 0 },
				{ 0, 3, 0, 5, 0, 9, 0, 5, 0, 0, 0, 0, 3, 0, 9, 3, 4, 0, 0, 0 },
				{ 0, 2, 0, 0, 0, 7, 0, 0, 7, 0, 4, 0, 0, 0, 2, 0, 8, 4, 5, 0 },
				{ 0, 5, 0, 3, 1, 9, 0, 5, 7, 0, 0, 4, 0, 0, 0, 9, 9, 0, 0, 0 }, };
		int entero = 0;
		int inicio = 0, fin = 0, respaldo_inicio = 0, respaldo_fin = 0, secuencia = 0;
		Inprimir_Matriz(matInt);
		entero = Pedir_numero_entero();
		for (int fila = 0; fila < MAXFILA; fila++) {
			boolean valido = false;
			inicio = 0;
			while (inicio < MAXCOLUM - 1 && !valido) {
				inicio = Buscar_Inicio_De_Secuencias(matInt[fila], inicio);
				fin = 0;
				if (inicio < MAXCOLUM - 1) {
					fin = Buscar_Fin_De_Secuencias(matInt[fila], inicio);
					respaldo_inicio = inicio;
					respaldo_fin = fin;
					secuencia = tamano_de_secuencia(inicio, fin);
					if (entero == secuencia) {
						eliminar_secuencia_igual_tamano(matInt[fila],inicio,secuencia);
						inicio=0;
						fin=0;
					}
					inicio = fin + 1;
					if (inicio >= MAXCOLUM - 1) {
						inicio = respaldo_inicio;
						fin = respaldo_fin;
						valido = true;
					}

				}
			}
		}
		Inprimir_Matriz(matInt);
	}

	public static void Inprimir_Matriz(int[][] matriz) {
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

	public static int Pedir_numero_entero() {
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		int valor = 0;
		boolean valido = false;
		while (!valido) {
			try {
				System.out.println(
						"ingresame un numero entero positivo se eliminaran la secuencias del igual tamano al numero ingresado");
				valor = new Integer(entrada.readLine());
				if (valor > 0) {
					valido = true;
				}
			} catch (Exception err) {
				System.out.println("err");
			}
		}
		return valor;
	}

	public static int Buscar_Inicio_De_Secuencias(int[] arr, int inicio) {
		while (inicio < MAXCOLUM - 1 && arr[inicio] == 0) {
			inicio++;
		}
		return inicio;
	}

	public static int Buscar_Fin_De_Secuencias(int[] arr, int inicio) {
		while (inicio < MAXCOLUM - 1 && arr[inicio] != 0) {
			inicio++;
		}
		return inicio - 1;
	}

	public static int tamano_de_secuencia(int inicio, int fin) {
		int tamano = 0;
		for (int pos = inicio; pos <= fin; pos++) {
			tamano++;
		}
		return tamano;
	}

	public static void eliminar_secuencia_igual_tamano(int[] arr, int inicio,int secuencia) {
		for (int fin = 0; fin <= secuencia; fin++) {
			int guardar=inicio;
			while (inicio < MAXCOLUM - 1) {// pos=9 y maxcolum=9;
				arr[inicio] = arr[inicio + 1];// arr[8]=arr[8+1]
				inicio++; // pos=8+1
			}
			inicio=guardar;
		}
	}

}
