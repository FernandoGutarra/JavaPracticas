package franco;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*Se tiene un arreglo de tamaño MAX de secuencias de letras minúsculas ordenadas ascendentemente
con separadores espacio en blanco.
Realizar un programa completo en Java haciendo uso de constantes y métodos
que solicite al usuario una vocal minúscula y la inserte
de manera ordenada en las secuencias que no tienen vocales o que tienen al menos dos ‘t’.
Considerar los corrimientos correspondientes.
Finalmente informar cuantas secuencias fueron modificadas.

Observaciones:
_las secuencias están separadas por uno o más espacios en blanco,
el arreglo empieza y termina con uno o más espacios en blanco.
_no usar estructuras auxiliares.

 */
public class parcial_arreglos {
	// obtener una vocal minuscula
	// recorrer el arreglo y buscar secuencias
	// comprobar si es una secuencia valida o la que nos pide el ejercicio
	// insertar la vocal de manera ordenada en esa secuencia
	// contar la cantidad de veces que se modifica una secuencia
	// informar cuantas secuencias se modificaron
	final static int MAX = 10;
	final static int cantidadT = 2;

	public static void main(String args[]) {
		char[] letras = { ' ', 'f', 'f', 't', 'z', ' ', 't', 't', 'r', ' ' };
		int inicio = 0, fin = 0, pos = 0;
		imprimir_arreglo(letras);
		char obtener_vocalusuario = obtener_vocal_minuscula(letras);
		System.out.println("la vocal ingresada fue " + obtener_vocalusuario);
		while (inicio < MAX) {
			inicio = obtener_inicio(letras, inicio);
			if(inicio<MAX) {
			fin = obtener_fin(letras, inicio);
			// comprobar si es una secuencia valida o la que nos pide el ejercicio
			if(secuencia_candidata(letras,inicio,fin)) {
			// insertar la vocal de manera ordenada en esa secuencia
			// contar la cantidad de veces que se modifica una secuencia
			int cantidad_de_secuensias_cambiadas+=inserta_vocal(letras,obtener_vocalusuario,inicio);
		}else {
			inicio=fin+1;
		}
			}
	}

	public static void imprimir_arreglo(char[] letras) {
		for (int pos = 0; pos < MAX; pos++) {
			System.out.println("poscision del arreglo [" + pos + "] valor ->" + letras[pos]);
		}

	}

	public static char obtener_vocal_minuscula(char[] letras) {
		char vocal = ' ';
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		while (!esvalido(vocal)) {
			try {
				System.out.println("ingresame una vocal minuscula");
				vocal = entrada.readLine().charAt(0);
			} catch (Exception err) {
				System.out.println(err);
			}
		}

		return vocal;
	}

	public static boolean esvalido(char vocal) {
		if (vocal == 'a' || vocal == 'e' || vocal == 'i' || vocal == 'o' || vocal == 'u') {
			return true;
		} else {
			return false;
		}
	}

	public static int obtener_inicio(char[] letras, int pos) {
		while (pos < MAX && letras[pos] == ' ') {
			pos++;
			if (pos == MAX) {
				return -1;
			}
		}
		return pos;
	}

	public static int obtener_fin(char[] letras, int pos) {
		while (pos < MAX && letras[pos] != ' ') {
			pos++;
			if (pos == MAX) {
				return -1;
			}
		}
		return pos;
	}
	public static int obtener_vocalusuario(char []letras,char vocal,int inicio,int fin) {
		//si inserto la vocal
		return 1;
		//si no retorna la vocal quenos de 0
		return 0;
	}

	
	
	
	
	
	
}
