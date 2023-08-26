package matriz;

public class practico_11 {
	final static int MAXFILA = 4;
	final static int MAXCOLUM = 20;

//	Hacer un programa que dada la matriz de secuencias de enteros definida y precargada permita
//	encontrar por cada fila la posición de inicio y fin de la secuencia cuya suma de valores sea mayor.
	public static void main(String[] args) {
		int[][] matInt = { { 0, 6, 6, 0, 4, 4, 0, 0, 3, 9, 0, 8, 5, 7, 0, 6, 6, 0, 1, 0 },
				{ 0, 3, 0, 5, 0, 9, 0, 5, 0, 0, 0, 0, 3, 0, 9, 3, 4, 0, 0, 0 },
				{ 0, 2, 0, 0, 0, 7, 0, 0, 7, 0, 4, 0, 0, 0, 2, 0, 8, 4, 5, 0 },
				{ 0, 5, 0, 3, 1, 9, 0, 5, 7, 0, 0, 4, 0, 0, 0, 9, 9, 0, 0, 0 }, };
		int inicio = 0;
		int fin = 0;
		int respaldo = 0;
		int respaldo_f = 0;
		int Mayor_fin = 0;
		int Mayor_inicio = 0;
		int SecuenciaMayor = 0;
		for (int fila = 0; fila < MAXFILA; fila++) {
			
			boolean valido = false;
			while (inicio < MAXCOLUM - 1 && !valido) {

				fin = 0;
				inicio = buscar_inicio(matInt[fila], inicio);
				int comparar = SecuenciaMayor;
				if (inicio < MAXCOLUM - 1) {
					fin = buscar_fin(matInt[fila], inicio);
					SecuenciaMayor = sumar_secuencias(matInt[fila], fin, inicio);
					if (SecuenciaMayor < comparar) {
						SecuenciaMayor = comparar;

					}
					if (SecuenciaMayor > comparar) {
						Mayor_inicio = inicio;
						Mayor_fin = fin;
					}
					
					respaldo = inicio;
					respaldo_f = fin;
					inicio = fin + 1;

				}
				if (inicio >= MAXCOLUM - 1) {
					inicio = respaldo;
					fin = respaldo_f;
					valido = true;
				}

			}
			System.out.println("Fila ["+fila+"]La secuencia cuya suma de valores es mayor es la pos[" + Mayor_inicio + "] hasta" + "["+ Mayor_fin + "]");
			SecuenciaMayor=0;
			inicio = 0;
		
		}

	}

	public static int buscar_inicio(int[] arr, int inicio) {
		while (inicio < MAXCOLUM && arr[inicio] == 0) {
			inicio++;
		}
		return inicio;
	}

	public static int buscar_fin(int[] arr, int inicio) {
		while (inicio < MAXCOLUM && arr[inicio] != 0) {
			inicio++;
		}

		return inicio - 1;
	}

	public static int sumar_secuencias(int[] arr, int fin, int inicio) {
		int valor = 0;
		for (int pos = inicio; pos <= fin; pos++) {
			valor += arr[pos];
		}
		return valor;
	}
}
