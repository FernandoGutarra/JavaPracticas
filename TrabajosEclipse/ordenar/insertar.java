package ordenar;

/*Se tiene un arreglo ARR de enteros de tamaño MAX con secuencias de números distintos de cero separadas por uno
o más ceros. El arreglo tiene orden ascendente según la suma de los elementos de cada secuencia. Se pide hacer un
programa completo para insertar en ARR manteniendo su orden una secuencia dada en un arreglo NUEVO de
enteros. Suponer que ARR y NUEVO comienzan y terminan con uno o más ceros y que se encuentran cargados.*/
public class insertar {
	final static int MAX = 15;
	final static int MAXN = 4;
	final static int SEPARADOR = 0;

	public static void main(String[] args) {
		// variables y matriz y todo eso
		int[] arr = { 0, 1, 1, 0, 2, 2, 0, 3, 3, 0, 4, 4, 0, 0, 0 };
		int[] nuevo = { 0, 2, 2, 0 };
		mostrararreglo(arr, MAX);
		System.out.println("");
		mostrararreglo(nuevo, MAXN);
		System.out.println("");
		int ini = 0;
		int fin = 0;
		int sumaSecuNuevo = 0;
		int sumaSecuAnterior = 0;
		int punteroArr = 0;
		int iniSecNuevo = 0;
		int finSecNuevo = 0;
		while (ini < MAX) {
			ini = buscarIni(arr, ini);
			if (ini < MAX) {
				fin = buscarFin(arr, ini);
				int sumaSecuActual = sumarSecu(arr, ini, fin);
				if (iniSecNuevo == 0 && finSecNuevo == 0) {
					iniSecNuevo = buscarIni(nuevo, iniSecNuevo);
					finSecNuevo = buscarFin(nuevo, iniSecNuevo);
				}
				sumaSecuNuevo = sumarSecu(nuevo, iniSecNuevo, finSecNuevo);
				int tamaniSecuNuevo = finSecNuevo - iniSecNuevo + 1;
//				          7            6                    7          8
				if (sumaSecuNuevo > sumaSecuAnterior && sumaSecuNuevo <= sumaSecuActual) {
					punteroArr = ini;
//					finSecNuevo++;
					for (int i = iniSecNuevo; i <= finSecNuevo; i++) {
						corrimientoDer(arr, punteroArr, nuevo[i]);
						punteroArr++;
					}
				} else if (buscarIni(arr, fin + 1) >= MAX) {
					if (MAX - (fin + 2) == tamaniSecuNuevo) {
						punteroArr = fin + 2;
						for (int i = iniSecNuevo; i <= finSecNuevo; i++) {
							corrimientoDer(arr, punteroArr, nuevo[i]);
							punteroArr++;
						}
					}
					fin = MAX;
				}
				sumaSecuAnterior = sumaSecuActual;
				ini = fin + 1;
			}
		}
		System.out.println("");
		mostrararreglo(arr, MAX);
	}

	public static void corrimientoDer(int[] arr, int punteroArr, int insertar) {
		int iniPos = punteroArr;
		int index = MAX - 1;
		while (index > punteroArr) {
			arr[index] = arr[index - 1];
			index--;
		}
		arr[iniPos] = insertar;
	}

	public static int sumarSecu(int[] arr, int ini, int fin) {
		int sumaSecu = 0;
		while (ini <= fin) {
			sumaSecu += arr[ini];
			ini++;
		}
		return sumaSecu;
	}

	private static int buscarFin(int[] arr, int ini) {
		while (ini < MAX && arr[ini] != 0) {
			ini++;
		}
		return ini - 1;
	}

	private static int buscarIni(int[] arr, int ini) {
		while (ini < MAX && arr[ini] == 0) {
			ini++;
		}
		return ini;
	};

	public static void mostrararreglo(int[] arreglo, int max) {
		for (int pos = 0; pos < max; pos++) {
			System.out.print(arreglo[pos] + "|");
		}
		System.out.println();
	}
}
