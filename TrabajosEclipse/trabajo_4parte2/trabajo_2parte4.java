package trabajo_4parte2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class trabajo_2parte4 {
	public static void main(String args[]) {
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		double valor = 1;
		final int MAX = 1000;
		final int MIN = -1;
		final int DIGITO1 = -1;
		final int DIGITO2 = 10;
		final int DIGITO3 = 100;
		final int DIGITO4 = 1000;

		boolean verdadero = false;
		try {
			while (!verdadero) {
				System.out.println("ingresame un valor entre 0 y 999");
				valor = new Double(entrada.readLine());
				if (valor > MIN && valor < MAX) {
					if (valor > DIGITO1 && valor < DIGITO2) {
						System.out.println("el numero ingresado es de 1 solo digito");
					}
					if (valor > DIGITO2 && valor < DIGITO3) {
						System.out.println("el numero ingresado es de 2 digitos");
					}
					if (valor > DIGITO3 && valor < DIGITO4) {
						System.out.println("el numero tiene 3 digitos " + valor);
					}
				}
			}
		} catch (Exception err) {
			System.out.println(err);
		}
	}
}
