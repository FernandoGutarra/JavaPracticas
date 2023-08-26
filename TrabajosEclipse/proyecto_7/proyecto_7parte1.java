package proyecto_7;

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
public class proyecto_7parte1 {
	// obtener una vocal minuscula
	// recorrer el arreglo y buscar secuencias
	// comprobar si es una secuencia valida o la que nos pide el ejercicio
	// insertar la vocal de manera ordenada en esa secuencia
	// contar la cantidad de veces que se modifica una secuencia
	// informar cuantas secuencias se modificaron
	final static int MAX = 10;

	public static void main(String args[]) {
		char[] letras = { ' ', 'j', 'g', 's', 'g', ' ', 'f', 'y', 'g', ' ' };
		char vocal_obtenida = ' ';
		int inicio=0,fin=0,pos=0;
		// obtener una vocal minuscula
		vocal_obtenida = obtener_vocal();
		// recorrer el arreglo y buscar secuencias
		while(pos<MAX) {
		inicio=Buscar_Inicio_secuencia(letras,inicio);
		fin=Buscar_Fin_secuencia(letras,inicio);
	}}

	public static char obtener_vocal() {

		char vocal_Min = ' ';
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		while (!esvalido(vocal_Min)) {
			try {
				System.out.println("Ingresame un vocal minuscula");
				{
					vocal_Min = entrada.readLine().charAt(0);
				}
			} catch (Exception err) {
				System.out.println(err);
			}
		}

		return vocal_Min;
	}

	public static boolean esvalido(char vocal_obtenida) {
		if (vocal_obtenida == 'a' || vocal_obtenida == 'e' || vocal_obtenida == 'i' || vocal_obtenida == 'o'
				|| vocal_obtenida == 'u') {
			return true;
		} else {
			return false;
		}
	}

	public static int Buscar_Inicio_secuencia(char[] letras, int pos) {
		while (pos < MAX && letras[pos] == ' ') {
			pos++;
			if (pos == MAX) {
				return -1; // Me fui del arreglo
			}
		}

		return pos;
	}

	public static int Buscar_Fin_secuencia(char[]letras,int pos) {
		while(pos<MAX&&letras[pos]!=' ') {
			if(pos==MAX) {
				return -1;
			}
		}
		
		return pos;
	}

}
