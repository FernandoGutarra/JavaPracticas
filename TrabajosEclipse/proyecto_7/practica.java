package proyecto_7;

import java.io.BufferedReader;
import java.io.InputStreamReader;
//se tiene un arreglo de tamaño MAX de secuencias de letras minusculas ordenadas asendentemente
//con separadores espacios en blanco. Realizar un Programa completo en java haceindo uso de 
//constantes y metodos que solicite al usuario una vocal minuscula y la inserte de manera ordenada 
//en las secuencias que no tienen o al menos dos 't'. considerar los corrimientos correspondientes
//finalmente informar cuantas secuencias fueron modificadas.

public class practica {
	// obtener vocal
	// recorrer arreglo y buscar secuensias
	// comprobar arreglo si es una secuensia valida o la que nos pide el
	// ejercisio--no tiene vocales o que tiene al menos dos 't'
	// insertar de manera ordenada
	// corrimiento derecha
	// contar la cantidad de veses que se modifica una secuensia
	final static int MAX = 10;
	final static int CANTIDA_DE_T = 2;

	public static void main(String[] args) {
		char[] letras = { ' ', 'b', 'd', 'f', 'g', ' ', 'g', 'h', 's', ' ' };
		char vocal = ' ';
		int cantidad_de_secuencias_cambiadas = 0;
		int inicio = 0, fin = 0;
		boolean hayVocal;
		int position_valor; // hace algo
		imprimir_arreglos(letras);
		vocal = obtener_vocal();
		while (inicio < MAX - 1) { // es para que no se pase del limite del arreglo
			inicio = buscar_inicio(letras, inicio);
			if (inicio != -1) {
				fin = buscar_fin(letras, inicio);
				if (fin != -1) {

					hayVocal = buscar_vocal(letras, inicio, fin);
					if (!hayVocal) {

						position_valor = verificar_posicion(letras, vocal, inicio, fin);
						corrimiento_derecho(letras, position_valor);
						letras[position_valor] = vocal;
						// cantidad_de_secuencias_cambiadas += inserta_vocal(letras, vocal, inicio,
						// fin);
					}
					inicio = fin + 1;
				}
				inicio=MAX;
			}
			

		}
		imprimir_arreglos(letras);
	}

	public static int buscar_inicio(char[] letras, int pos) {
		while (pos < MAX && letras[pos] == ' ') {
			pos++;
		}
		if (pos == MAX) {
			return -1;// me fui del arreglo
		}
		return pos;
	}

	public static int buscar_fin(char[] letras, int pos) {
		while (pos < MAX && letras[pos] != ' ') {
			pos++;
		}
		if (pos == MAX) {
			return -1;
		}
		return pos;
	}

	public static boolean buscar_vocal(char[] letras, int pos, int fin) {
		while (pos < fin) {
			if (!esvalido(letras[pos])) {
				pos++;
			} else {
				return true;
			}

		}
		return false;

	}

	public static void imprimir_arreglos(char[] letras) {
		for (int pos = 0; pos < MAX; pos++) {
			System.out.println("posicion del arreglos [" + pos + "] valor -> " + letras[pos]);
		}
	}

	public static char obtener_vocal() {
		char Vocal_Minuscula = ' ';

		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		while (!esvalido(Vocal_Minuscula)) {
			try {
				System.out.println("ingresame una vocal minuscula");
				Vocal_Minuscula = entrada.readLine().charAt(0);
			} catch (Exception err) {
				System.out.println(err);
			}
		}
		return Vocal_Minuscula;

	}

	public static boolean esvalido(char Vocal_Minuscula) {
		if (Vocal_Minuscula == 'a' || Vocal_Minuscula == 'e' || Vocal_Minuscula == 'i' || Vocal_Minuscula == 'o'
				|| Vocal_Minuscula == 'u') {
			return true;
		} else {
			return false;
		} // char []letras ={' ',' b','c','d',' ' } e es mayor que b? es mayor
	}

//char[] letras = { ' ', 'b', 'd', 'f', 'g', ' ', 'g', 'h', 's', ' ' };	
	public static void corrimiento_derecho(char[] letras, int inicio) {
		for (int pos = MAX - 1; pos > inicio; pos--) {
			letras[pos] = letras[pos - 1];
		}
	}

	public static int verificar_posicion(char[] letras, char vocal, int pos, int fin) {
		while (pos < fin) {

			if (vocal > letras[pos]) {
				pos++;
			} else {
				return pos;
			}
		}

		return pos;
	}

}
