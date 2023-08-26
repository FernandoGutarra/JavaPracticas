//package matriz;
//
//public class practico_1 {
//	final static int MAXFILA = 5;
//	final static int MAXCOLUM = 10;
//
//	public static void main(String args[]) {
//		int[][] matrizEnteros = new int[MAXFILA][MAXCOLUM];
//		cargarMatriz(matrizEnteros);
//		Mostrar_Matriz(matrizEnteros);
//		reccorerFilas(matrizEnteros);
//		System.out.println("invertir");
//		Mostrar_Matriz(matrizEnteros);
//	}
//
//	public static void cargarMatriz(int[][] matriz) {
//		for (int fila = 0; fila < MAXFILA; fila++) {
//			for (int columna = 0; columna < MAXCOLUM; columna++) {
//				int random = (int) (10 * Math.random() + 1);
//				matriz[fila][columna] = random;
//			}
//		}
//	}
//
//	public static void Mostrar_Matriz(int[][] Matriz) {
//		for (int fila = 0; fila < MAXFILA; fila++) {
//			mostrarArreglo(Matriz[fila]);
//		}
//	}
//
//	public static void mostrarArreglo(int[] arr) {
//		for (int columna = 0; columna < MAXCOLUM; columna++) {
//			System.out.print("|" + arr[columna]);
//		}
//		System.out.println("");
//	}
//
//	public static void reccorerFilas(int[][] matriz) {
//		for (int fila = 0; fila < MAXFILA; fila++) {
//			reverse(matriz[fila]);
//
//		}
//	}
//
//	public static void reverse(int[] arr) {
//		for (int low = 0, high = arr.length - 1; low < high; low++, high--) {
//			swap(arr, low, high);
//		}
//	}
//
//	public static void swap(int[] arr, int low, int high) {
//		int temp = arr[low];
//		arr[low] = arr[high];
//		arr[high] = temp;
//	}
//}
//
////Hacer un programa que dada una matriz de enteros de tamaño 5*10 que se encuentra precargada,
////invierta el orden del contenido por fila. Este intercambio no se debe realizar de manera explícita, hay
////que hacer un método que incluya una iteración de intercambio.
