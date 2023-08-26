package matriz;
//Hacer un programa que dada una matriz de enteros de tamaño 5*10 que se encuentra precargada,

//solicite al usuario un número entero y elimine la primer ocurrencia de número en la matriz (un número
//igual) si existe. Para ello tendrá que buscar la posición y si está, realizar un corrimiento a izquierda y no
//continuar buscando.

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class practico_5 {
	final static int MAXFILA = 5;
	final static int MAXCOLUM = 10;

	public static void main(String[] args) {
		int[][] matInt = new int[MAXFILA][MAXCOLUM];
		int entero, pos = 0;
		int inicio=0;
		int fila = 0;
		int guardar_fila=0;
		Cargar_Matriz_Aleatoriamente(matInt);
		Mostrar_Matriz(matInt);
		entero = ingrese_numero_entero();
	    boolean valido=false;
		while(fila<MAXFILA-1&&!valido) {
	    	pos=buscar_entero_pos(matInt[fila],entero);
            if(matInt[fila][pos]==entero) {
            	valido=true;
            	guardar_fila=fila;
            }
            fila++;
	    }
		
		corrimientoIzquierda(matInt[guardar_fila], pos);
		Mostrar_Matriz(matInt);

	}

	public static void Mostrar_Matriz(int[][] matriz) {
		for (int fila = 0; fila < MAXFILA; fila++) {
			recorrer_colum(matriz[fila]);
		}
	}

	public static void recorrer_colum(int[] arr) {
		for (int colum = 0; colum < MAXCOLUM; colum++) {
			System.out.print("|" + arr[colum]);
		}
		System.out.println("");
	}

	public static void Cargar_Matriz_Aleatoriamente(int[][] matriz) {
		for (int fila = 0; fila < MAXFILA; fila++) {
			for (int colum = 0; colum < MAXCOLUM; colum++) {
				int random = (int) (10 * Math.random() + 1);
				matriz[fila][colum] = random;
			}
		}
	}

	public static int ingrese_numero_entero() {
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		int valor = 0;
		boolean valido = false;
		while (!valido) {
			try {
				System.out.println("ingresame un numero entero del 1 al 10");
				valor = new Integer(entrada.readLine());
				if (valor >= 1 && valor <= 10) {
					valido = true;
				}
			} catch (Exception err) {
				System.out.println("err");
			}
		}

		return valor;
	}

	public static int buscar_entero_pos(int[] arr, int entero) {
		int inicio = 0;
		int valor=0;
		boolean valido=false;
		while (inicio < MAXCOLUM-1&&!valido) {
			
			if(arr[inicio]==entero) {
			  valor=inicio;
			  valido=true;
		   }
		   if(inicio>=MAXCOLUM-1) {
			   inicio=0;
			   valido=true;
		   }
		   inicio++;
		}
		return valor;
	}

	public static void corrimientoIzquierda(int[] arr, int pos) {

		while (pos < MAXCOLUM - 1) {// pos=9 y maxcolum=9;
			arr[pos] = arr[pos + 1];// arr[8]=arr[8+1]
			pos++; // pos=8+1
		}
	}
}
