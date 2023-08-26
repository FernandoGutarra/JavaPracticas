package trabajo5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class EJEMPLO1 {
	final static int MAX = 10; // defino la constante global

	public static void main(String[] args) {
		int N, M = 0;
		char opcion = 'a';
		opcion = obtenerOpcionValida();
		N = obtenerNumeroValido();
		M = obtenerNumeroValido();
		if (opcion == 'a') {
			System.out.println("La suma de " + M + " y " + N + " es: " + (N + M));
		} else {
			System.out.println("La resta de " + M + " y " + N + " es: " + (N - M));
		}
	}

	public static char obtenerOpcionValida() {
		char caracter = 'c';
		while (!(caracter == 'a' || caracter == 'b')) {
			try {
				BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
				System.out.println("Ingrese una opcion valida entre a y b");
				caracter = (char) (entrada.readLine().charAt(0));
			} catch (Exception exc) {
				System.out.println("error");
			}
		}
		return caracter;
	}

	public static int obtenerNumeroValido() {
		int valor = MAX + 1; // variable local a obtenerNatural
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		while (valor > MAX) {
			try {
				System.out.println("Ingrese un numero entero menor a " + MAX);
				valor = new Integer(entrada.readLine());
			} catch (Exception exc) {
				valor = (MAX + 1);
			}
		}
		return valor;
	}
}