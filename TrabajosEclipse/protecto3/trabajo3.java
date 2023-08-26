package protecto3;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class trabajo3 {
	public static void main(String[] args) {
		int numero_mes = 0;
		final int MAX_NUMERO = 12;
		final int MIN_NUMERO = 1;
		int anio = 0;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		// final int ENERO= 1, FEBRERO= 2, MARZO= 3, ABRIL= 4, MAYO= 5, JUNIO= 6, JULIO=
		// 7, AGOSTO= 8, SETIEMBRE= 9, OCTUBRE= 10, NOBIEMBRE= 11, DICIEMBRE=12;
		while (!(numero_mes >= MIN_NUMERO && numero_mes <= MAX_NUMERO)) {
			try {
				System.out.println("ingrese numero de mes del (1 al 12)");
				numero_mes = new Integer(entrada.readLine());

			} catch (Exception exc) {
				System.out.println(exc);
			}
		}
		if (numero_mes == 1 || numero_mes == 3 || numero_mes == 5 || numero_mes == 7 || numero_mes == 8
				|| numero_mes == 10 || numero_mes == 12) {
			System.out.println("el mes tiene 31 dias");
		} else if (numero_mes == 4 || numero_mes == 6 || numero_mes == 9 || numero_mes == 11) {
			System.out.println("el mes tiene 30 dias");
		} else {
			try {
				System.out.println("ingrese el año: ");
				anio = new Integer(entrada.readLine());
				if (((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0)))) {
					System.out.println("el mes tiene 29 dias");

				} else {
					System.out.println("el mes tiene 28 dias");
				}
			} catch (Exception err) {
				System.out.println(err);

			}
		}

		System.out.println(numero_mes);

	}
}