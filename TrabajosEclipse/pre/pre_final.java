package pre;
//Se tiene una matriz tamaño MAXF x MAXC de secuencias de enteros con separadores ceros. 
//Realizar un programa completo en Java haciendo uso de constantes y métodos que elimine 
//de cada secuencia los primeros 5 elementos que sean impares o múltiplos de 7. Para las 
//secuencias que no se modifican deberá obtener la que más suma y solo a esa invertir el 
//orden. Considerar los corrimientos correspondientes. Finalmente informar cuantos 
//elementos en total fueron eliminados de todas las secuencias.
public class pre_final {
	final static int MAXF = 5;
	final static int MAXC = 10;
	final static int MAXELIMINADOS = 5;
	final static int MULTIPLO = 7;
	final static int PAR = 2;

	public static void main(String[] args) {
		int[][] matInt = { { 0, 3, 5, 7, 1, 4, 5, 6, 0, 0 }, 
				{ 0, 3, 49, 7, 21, 49, 5, 63, 0, 0 },
				{ 0, 2, 4, 6, 0, 4, 5, 6, 0, 0 }, 
				{ 0, 2, 6, 8, 5, 4, 5, 6, 0, 0 },
				{ 0, 3, 5, 0, 8, 4, 8, 6, 2, 0 } };
		inprimir_matriz(matInt);
		int inicio = 0, fin = 0, total_eliminados = 0, sumaMayor = 0, iniMayor = 0, finMayor = 0, filaMayor = 0;
		for (int fila = 0; fila < MAXF; fila++) {
			inicio = 0;
			fin = 0;
			while (inicio < MAXC) {
				inicio = buscar_inicio(matInt[fila], inicio);
				if (inicio < MAXC) {
					fin = buscar_fin(matInt[fila], inicio);
					int cantEliminada = eliminarInparesOmultiplos(matInt[fila], inicio, fin);
					if (cantEliminada > 0) {
						inicio += fin - cantEliminada + 1;
						total_eliminados += cantEliminada;
						
					} else {
						int suma_secu = suma_secuencias_no_modificadas(matInt[fila], inicio, fin);
						if (suma_secu > sumaMayor) {
							sumaMayor = suma_secu;
							iniMayor = inicio;
							finMayor = fin;
							filaMayor = fila;
							
						}
						inicio = fin + 1;
					}
					
				}

			}

		}
		
			System.out.println("Se eliminaron: " + total_eliminados + " elementos de las secuencias");
		
		
			invertirSecuencia(matInt[filaMayor], iniMayor, finMayor);
			System.out.println("La secuencia que mas suma es: " + sumaMayor + " y se encuentra en la fila: " + filaMayor
					+ " inicia en: " + iniMayor + " y finaliza en: " + finMayor);
		
		inprimir_matriz(matInt);
	}

	public static void inprimir_matriz(int[][] matInt) {
		for (int fila = 0; fila < MAXF; fila++) {
			recorrer_pos(matInt[fila]);
		}

	}

	public static void recorrer_pos(int[] arr) {
		for (int pos = 0; pos < MAXC; pos++) {
			System.out.print("|" + arr[pos]);
		}
		System.out.println("");
	}

	public static int buscar_inicio(int[] fila, int inicio) {
		while (inicio < MAXC && fila[inicio] == 0) {
			inicio++;
		}
		return inicio;
	}

	public static int buscar_fin(int[] fila, int inicio) {
		while (inicio < MAXC && fila[inicio] != 0) {
			inicio++;
		}
		return inicio - 1;
	}

	public static int eliminarInparesOmultiplos(int[] arr, int inicio, int fin) {
		int cantidad_de_eliminados = 0;
		while (inicio <= fin && cantidad_de_eliminados < MAXELIMINADOS) {
			if (arr[inicio] % PAR != 0 || arr[inicio] % MULTIPLO == 0) {
				corrimiento_izquierda(arr, inicio);
				cantidad_de_eliminados++;
				fin--;
			} else {
				inicio++;
			}
		}
		return cantidad_de_eliminados;
	}

	public static void corrimiento_izquierda(int[] arr, int inicio) {
		while (inicio < MAXC - 1) {
			arr[inicio] = arr[inicio + 1];
			inicio++;
		}
	}

	public static int suma_secuencias_no_modificadas(int[] arr, int inicio, int fin) {
		int valor = 0;
		while (inicio <= fin) {
			valor += arr[inicio];
			inicio++;
		}
		return valor;
	}

	public static void invertirSecuencia(int[] arr, int iniMayor, int finMayor) {
		int aux = 0;
		while (iniMayor < finMayor) {
			aux = arr[iniMayor];
			arr[iniMayor] = arr[finMayor];
			arr[finMayor] = aux;
			iniMayor++;
			finMayor--;
		}
	}
}
