package matriz;

public class hl {
	public static void main(String args[]) {
		int[][] matriz1 = new int[4][3];
		int[][] matriz2 = { { 2, 4 }, { 5, 7 } };
		imprimir_valor(matriz2);
	}

	public static void imprimir_valor(int[][] matriz2) {
		System.out.println("MATRIZ 2");
		for (int pos = 0; pos < 2; pos++) {
			for (int j = 0; j < 2; j++) {
				System.out.println(matriz2 [j] [pos]);
			}
			System.out.println(" ");
		}
	}
}
