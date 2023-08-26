import java.io.BufferedReader;
import java.io.InputStreamReader;

public class trabajo_42 {
	public static void main(String args[]) {
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		int numero_entero = 1;
		int contador = 0;
		int numero_mayor = -99999999;
		int numero_menor = 99999999;
		int total_suma = 0;
		double media = 0.0d;

		try {

			while (numero_entero != 0) {
				System.out.println("Ingrese un numero entero y oprima 0 para terminar");
				numero_entero = new Integer(entrada.readLine());// verde esta por leer la linea
				total_suma += numero_entero; // aca estoy acumulando el valor de la suma en la variable suma
				if (numero_entero == 0) {

					System.out.println("terminado");
				} else {
					contador++;
					if (numero_entero < numero_menor) {
						numero_menor = numero_entero;
					} else if (numero_entero > numero_mayor) {
						numero_mayor = numero_entero;
					}
				}
			}
			if (total_suma != 0 && contador != 0) { // esto es para que no me tire el NaN
				media = (double) total_suma / contador;
			}
			System.out.println("cantidad de veses " + contador);
			System.out.println("promedio de los numero " + media);
			System.out.println("El numero mayor fue " + numero_mayor);
			System.out.println("El numero menor fue " + numero_menor);

		} catch (Exception err) {
			System.out.println(err);
		}
	}
}