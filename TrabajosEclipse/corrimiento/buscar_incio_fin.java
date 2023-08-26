package corrimiento;

public class buscar_incio_fin {
	final static int MAXF = 4;
	final static int MAXC = 20;

	public static void main(String[] args) {
		int[][] matriz = { { 0, 6, 6, 0, 4, 4, 0, 0, 3, 9, 0, 8, 5, 7, 0, 6, 6, 0, 1, 0 },
				{ 0, 3, 0, 5, 0, 9, 0, 5, 0, 0, 0, 0, 3, 0, 9, 3, 4, 0, 0, 0 },
				{ 0, 2, 0, 0, 0, 7, 0, 0, 7, 0, 4, 0, 0, 0, 2, 0, 8, 4, 5, 0 },
				{ 0, 5, 0, 3, 1, 9, 0, 5, 7, 0, 0, 4, 0, 0, 0, 9, 9, 0, 0, 0 }, };
		int inicio = 0;
		int fin = 0;
		int respaldo = 0;
		int respaldo_f = 0;
		for (int fila = 0; fila < MAXF; fila++) {
			inicio=0;
			boolean valido = false;
			while (inicio < MAXC - 1) {
				fin = 0;
				inicio = buscar_inicio(matriz[fila], inicio);
				if (inicio < MAXC - 1) {
					fin = buscar_fin(matriz[fila],inicio);
					System.out.println("inicio=" + inicio);
					System.out.println("fin=" + fin);
					inicio=fin+1;
				}
				
			}
		}

	}

	public static int buscar_inicio(int[] arr, int inicio) {
		while (inicio < MAXC && arr[inicio] == 0) {
			inicio++;
		}
		return inicio;
	}

	public static int buscar_fin(int[] arr, int inicio) {
		while (inicio < MAXC && arr[inicio] != 0) {
			inicio++;
		}
		return inicio - 1;
	}
}
