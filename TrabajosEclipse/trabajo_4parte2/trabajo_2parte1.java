package trabajo_4parte2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class trabajo_2parte1 {
	public static void main(String args[]) {
		final int MAX = 10;
		int multiplo = 1;
		final int VALOR = 0;
		boolean verdadero = false;

		for (int i = 1; i <= MAX; i++) {
			while (!verdadero) {
				try {
					if (multiplo > VALOR) {
						System.out.println("ingresame un numero entero natural capo");
						BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
						multiplo = new Integer(entrada.readLine());

						verdadero = true;
						System.out.println("tabla del numero " + multiplo);
					}
				} catch (Exception err) {
					System.out.println(err);
				}
			}
			System.out.println(multiplo + " * " + i + " = " + (multiplo * i));
		}

	}
}
