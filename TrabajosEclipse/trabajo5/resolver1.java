//Escribir un método que retorne el mayor de dos números. Usar
//ese método para calcular el máximo de una serie de números
//ingresados por el usuario (20 números en total)
package trabajo5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class resolver1 {
	final static int MAX = 10;

	public static void main(String[] args) {
		double numero1, numero2 = 0;
		double retorna=0;
		double mayor=0;
		

		numero1 = numerosingresados();
		numero2 = numerosingresados();
		retorna=obtenerMayor(numero1, numero2);
		System.out.println("mayor numero de los dos numero ingresados es "+retorna);
		
		for (int i = 1; i <= MAX; i++) {
		
			numero1 = numerosingresados();
			numero2 = numerosingresados();
			retorna=obtenerMayor(numero1, numero2);
			if(retorna>mayor) {
				mayor=retorna;
			}
			
		}
		System.out.println("el mayor numero de 20 es "+mayor);
	}

	public static double numerosingresados() {
		double valor = 0.0;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		boolean valido = false;
		while (!valido) {
			try {
				System.out.println("ingrese dos numeros");
				valor = new Double(entrada.readLine());
				valido = true;

			} catch (Exception err) {
				System.out.println(err);
			}
		}

		return valor;
	}

	public static double obtenerMayor(double numero1, double numero2) {
		if (numero1 > numero2) {
			return numero1;
		} else  {
			return numero2;
		}

	}
}
