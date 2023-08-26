package MATRIZES;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//Defina su primera matriz en JAVA de dos dimensiones, con rango de 5x3.
//Inicialícela con el número 0.
//● Defina un procedimiento que incremente en uno los valores de la matriz
//definida anteriormente, que será recibida por parámetros.
//● Defina un procedimiento que imprima los valores de una matriz por pantalla
//y utilícelo para mostrar la matriz luego de la carga inicial con 0 y luego de
//hacer el llamado a IncrementarUno().
//PD: Si terminás antes que el resto, implementá la carga de valores desde
//teclado, pidiéndole al usuario valores enteros entre [0 y 10).
public class matrizes {
	final static int MAXFILAS = 5;
	final static int MAXCOLUM = 3;

	public static void main(String args[]) {
		int[][] matEnteros = new int[MAXFILAS][MAXCOLUM];
		int valorIngresado = 0;
//		cargaDeValores(matEnteros, valorIngresado);
		mostrar_matriz(matEnteros);
		cargarValoresRamdons(matEnteros);
		mostrar_matriz(matEnteros);
		PromedioDeFilas(matEnteros);
		IncrementarUno(matEnteros);
		System.out.println("incremento");
		mostrar_matriz(matEnteros);
	}

	public static void mostrar_matriz(int[][] matriz) {
		for (int fila = 0; fila < MAXFILAS; fila++) {
			mostrarArreglo(matriz[fila]);
		}
	}

	public static void mostrarArreglo(int[] arr) {
		for (int columna = 0; columna < MAXCOLUM; columna++) {
			System.out.print("|" + arr[columna]);
		}
		System.out.println();
	}

	public static void IncrementarUno(int[][] matriz) {
		for (int fila = 0; fila < MAXFILAS; fila++) {
			for (int columna = 0; columna < MAXCOLUM; columna++) {
				matriz[fila][columna] += 1;
			}
		}
	}

//	public static void cargaDeValores(int[][] matriz, int valorIngresado) {
//		
//		try {
//			
//				for (int fila = 0; fila < MAXFILAS; fila++) {
//					for (int columna = 0; columna < MAXCOLUM; columna++) {
//						matriz[fila][columna]=enterosValidos(); 
//					} 
//				}
//			
//			
//		} catch (Exception exe) {
//			System.out.println(exe);
//			System.out.println("ingrese un valor valido");
//		}
//
//	}
//	Modifique el ejercicio anterior, de modo tal de iniciar la matriz con números
//	aleatorios del 1 al 10.
//	● Antes de llamar a IncrementarUno(), muestre por pantalla el promedio de cada fila
	public static void cargarValoresRamdons(int[][] matriz) {
		
		for (int fila = 0; fila < MAXFILAS; fila++) {
			for (int columna = 0; columna < MAXCOLUM; columna++) {
				int random = (int) (10 * Math.random() + 1);
				matriz[fila][columna]=random;
			}
		}
	}

	public static int enterosValidos() {
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

		int numeroValido = 0;
		boolean valido = false;
		try {
			while (!valido) {
				System.out.println("ingresame un valor para la matriz");
				numeroValido = new Integer(entrada.readLine());
				if (numeroValido >= 0 && numeroValido <= 10) {
					valido = true;
				} else {
					System.out.println("el numero ingresado es incorrecto");
				}
			}
		} catch (Exception exc) {
			System.out.println(exc);
		}
		return numeroValido;
	}
  public static void PromedioDeFilas(int matriz[][]){
	 double resultado=0;
	  for(int fila=0;fila < MAXFILAS;fila++) {
		 int sumarFilas = 0;
		 int divisor=0;
		 for(int columna=0;columna< MAXCOLUM;columna++) {
			 sumarFilas+= matriz[fila][columna];
			 divisor++;
		 }
		resultado=(double)sumarFilas/divisor;
		System.out.println("la el promedio de la ["+fila+"] es: "+resultado);
	  }
  }
}