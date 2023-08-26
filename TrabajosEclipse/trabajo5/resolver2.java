package trabajo5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class resolver2 {
	public static void main(String[] args) {
		double valor, valor2, valor3 = 0;
		int opcione=0;
		final double numero=3;
		double resultado2=0;
		double resultado3=0;
		double resultado4=0;
		
		valor = obtenervalores();
		valor2 = obtenervalores();
		valor3 = obtenervalores();
		opcione=opcines();
		switch(opcione) {
		case 1: {
		System.out.println("resultado opcion 1 "+ Math.sqrt(valor-valor3));
		}break;
		case 2: {
			resultado2=(valor+valor2+valor3)/numero;
         System.out.println("resultado opcion 2 "+ resultado2);
		}break;
		case 3: {
        resultado3=(valor3-valor2)/valor;
			System.out.println("resultado opcion 3 "+ resultado3);
		}break;
		case 4: {
			resultado4=((valor+valor2+valor3)/numero)/Math.sqrt(valor2);
        System.out.println("resultado opcion 4 "+ resultado4);
		}break;
		
		}

	}

	public static double obtenervalores() {
		double numero = 0.0;
		boolean valido = false;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		while (!valido) {

			try {
				System.out.println("ingresame un numero real 3 veses");

				numero = new Double(entrada.readLine());
				valido = true;
			} catch (Exception err) {
				System.out.println(err);
				System.out.println("numero invalido");
			}
		}
		return numero;
	}

	public static int opcines() {
		int opcion = 0;
		boolean valido = false;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		while (!valido)
			try {
				System.out.println("elegir opcion del 1 al 4");
				System.out.println("opcion 1 calcular la raiz cuadradra de (numero_real1-numero_real3)");
				System.out.println("opcion 2 calcular promedio del numero_real 1,numero_realr 2,numeror_real 3");
				System.out.println("opcion 3 calcular cociente de la raiz cuadrada de (numero_real 3-numero_realr 2)dividia por r1");
				System.out.println("opcion 4 calcular el cociente de promedio de los tres valores dividido por la raiz cuadrada de r2");
				opcion = new Integer(entrada.readLine());
				if(opcion>=1&&opcion<=4) {
					valido=true;
				}
				

			} catch (Exception err) {
				System.out.println(err);
				System.out.println("numero ingresado incorreto");
			}

		return opcion;
	}
}
