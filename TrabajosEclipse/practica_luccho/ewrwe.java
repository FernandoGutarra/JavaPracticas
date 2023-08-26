package practica_luccho;
//Implementar un método que realice un corrimiento a derecha en un arreglo ordenado de tamaño

//MAX=10 a partir de una posición.

public class ewrwe {
	final static int MAX = 10;

	public static void main(String[] args) {
		int[] arrEnteros = new int[MAX];
		int posicion = 0;
		cargar_arreglos(arrEnteros);
		imprimir(arrEnteros);
		posicion = elegir_posicion();
		System.out.println("posicion " + posicion);
		corrimiento(arrEnteros, posicion);
		imprimir(arrEnteros);
	}

	public static void cargar_arreglos(int[] arrEnteros) {

		for (int pos = 0; pos < MAX; pos++) {
			int random = (int) (100 * Math.random() + 1);
			arrEnteros[pos] = random;
		}

	}

	public static void imprimir(int[] arrEnteros) {
		for (int pos = 0; pos < MAX; pos++) {
			System.out.println("los numeros impresos [" + pos + "] ->" + arrEnteros[pos]);
		}
	}

	public static int elegir_posicion() {

		int random = (int) (10 * Math.random() + 1);
		return random;
	}

	// Implementar un método que realice un corrimiento a derecha en un arreglo
	// ordenado de tamaño
	// MAX=10 a partir de una posición.
	public static void corrimiento(int[] arrEnteros, int posicion) {

		for (int pos = MAX - 1; pos > posicion; pos--) {
			arrEnteros[pos] = arrEnteros[pos - 1];
		}

	}

}