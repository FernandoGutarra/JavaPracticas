package matriz;
//Hacer un programa que dada la matriz de secuencias de caracteres definida y precargada, permita

//encontrar por cada fila la posición de inicio y fin de la anteúltima secuencia (considerar comenzar a
//buscarla a partir de la última posición de la fila).

public class practico_12 {
	final static int MAXFILA = 4;
	final static int MAXCOLUM = 20;

	public static void main(String[] args) {
		int[][] matInt = { { 0, 6, 6, 0, 4, 4, 0, 0, 3, 9, 0, 8, 5, 7, 0, 6, 6, 0, 1, 0 },
				{ 0, 3, 0, 5, 0, 9, 0, 5, 0, 0, 0, 0, 3, 0, 9, 3, 4, 0, 0, 0 },
				{ 0, 2, 0, 0, 0, 7, 0, 0, 7, 0, 4, 0, 0, 0, 2, 0, 8, 4, 5, 0 },
				{ 0, 5, 0, 3, 1, 9, 0, 5, 7, 0, 0, 4, 0, 0, 0, 9, 9, 0, 0, 0 }, };
		Mostrar_Matriz(matInt);

		int inicio = 0;
		int fin = 0;
		int respaldo = 0;
		int respaldo_f = 0;
		int ante_ultimo_inicio = 0;
		int ante_ultimo_fin = 0;

		for (int fila = 0; fila < MAXFILA; fila++) {
			
			inicio = 0;
			
			boolean valido = false;
			
			while (inicio < MAXCOLUM - 1 && !valido) {
				ante_ultimo_inicio = respaldo;
				ante_ultimo_fin = respaldo_f;
				fin = 0;

				inicio = buscar_inicio(matInt[fila], inicio);
				if (inicio < MAXCOLUM - 1) {
					fin = buscar_fin(matInt[fila], inicio);
					respaldo = inicio;
					respaldo_f = fin;
					inicio = fin + 1;
					if (inicio >= MAXCOLUM - 1) {
						inicio = respaldo;
						fin = respaldo_f;
						valido = true;
					}

				}
			}
			System.out.println("la fila ["+fila+"] su anteultima secuencia es inicio["+ante_ultimo_inicio+"] y fin ["+ante_ultimo_fin+"]");
		}
	}

	public static void Mostrar_Matriz(int[][] matriz) {
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

}
