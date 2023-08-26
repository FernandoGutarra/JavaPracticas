package recupera;

	/*
	Se tiene una matriz tamaño MAXF x MAXC de secuencias de enteros con separadores ceros. 
	Realizar un programa completo en Java haciendo uso de constantes y métodos que elimine 
	de cada secuencia los primeros 5 elementos que sean impares o múltiplos de 7. Para las 
	secuencias que no se modifican deberá obtener la que más suma y solo a esa invertir el 
	orden. Considerar los corrimientos correspondientes. Finalmente informar cuantos 
	elementos en total fueron eliminados de todas las secuencias.
	 */
	public	class recuperatorio{
		final static int MAXF=5;
		final static int MAXC=10;
		final static int CANTELEMENTOSIMPARESOMULTIPLOS=5;
		final static int MULTIPLO=7;
		final static int PAR=2;
		public static void main(String[] args) {
			int[][] matriz= {{0,3,5,7,1,4,5,6,0,0},
					{0,3,49,7,21,49,5,63,0,0},
					{0,2,4,6,0,4,5,6,0,0},
					{0,2,6,8,5,4,5,6,0,0},
					{0,3,5,7,0,4,8,6,0,0}};
			mostrarMatriz(matriz); // no pedido es solo para ver como quedó la matriz
			procesarMatriz(matriz);
			mostrarMatriz(matriz); // no pedido es solo para ver como quedó la matriz
		}
		public static void procesarMatriz(int[][] matriz) {
			int sumaMayor=0, iniMayor=0, finMayor=0, filaMayor=0, elementosEliminados=0;
			for (int fila=0;fila<MAXF;fila++) {
				int inicio=0;
				int fin=0;
				while (inicio<MAXC){
					inicio=obtenerInicioSec(matriz[fila],inicio);
					if (inicio<MAXC){
						fin=obtenerFinSec(matriz[fila],inicio);
						int cantEliminados=eliminarImparesOMult(matriz[fila],inicio,fin);
						if (cantEliminados>0) {
							inicio=fin-cantEliminados+1;
							elementosEliminados+=cantEliminados;	
						}
						else {
							int sumaSec=sumaSecuencia(matriz[fila],inicio,fin);
							if (sumaSec>sumaMayor) {
								sumaMayor=sumaSec;
								iniMayor=inicio;
								finMayor=fin;
								filaMayor=fila;
							}
							inicio=fin+1;
						}
					}
				}
			}
			if (elementosEliminados>0) { 
				System.out.println("Se eliminaron: " + elementosEliminados + " elementos de las secuencias");
			}
			if (sumaMayor!=0) {
				invertirSecuencia(matriz[filaMayor],iniMayor,finMayor);
				System.out.println("La secuencia que mas suma es: " + sumaMayor + " y se encuentra en la fila: " + filaMayor + " inicia en: " + iniMayor + " y finaliza en: " + finMayor);
			}
		}
		public static void mostrarMatriz(int[][] matriz) { // no pedido es solo para ver como quedó la matriz
			for (int fila=0;fila<MAXF;fila++) {
				mostrarArreglo(matriz[fila]);
			}
		}
		public static void mostrarArreglo(int[] arr) { // no pedido es solo para ver como quedó la matriz
			for (int columna=0;columna<MAXC;columna++) {
				System.out.print("|" + arr[columna]);
			}
			System.out.println();
		}
		public static void invertirSecuencia(int[] arr, int iniMayor, int finMayor) {
			int aux=0;
			while (iniMayor<finMayor) {
				aux=arr[iniMayor];
				arr[iniMayor]=arr[finMayor];
				arr[finMayor]=aux;
				iniMayor++;
				finMayor--;
			}
		}
		public static int sumaSecuencia(int[] arr, int ini, int fin) {
			int suma=0;	
			while (ini<=fin) {
				suma+=arr[ini];
				ini++;
			}
			return suma;
		}
		public static int eliminarImparesOMult(int[] arr, int ini, int fin) {
			int cantImparesOMult=0;
			while (ini<=fin && cantImparesOMult<CANTELEMENTOSIMPARESOMULTIPLOS) {
				if (arr[ini]%PAR!=0 || arr[ini]%MULTIPLO==0) {
					correrIzq(arr,ini);
					cantImparesOMult++;
					fin--;
				}
				else {
					ini++;
				}
			}
			return cantImparesOMult;
		}
		public static void correrIzq(int[] arr, int ini) {
			while (ini<MAXC-1) {
				arr[ini]=arr[ini+1];
				ini++;
			}
		}
		public static int obtenerInicioSec(int[] arreglo, int inicio){
			while (inicio<MAXC && arreglo[inicio]==0){
				inicio++;
			}
			return inicio;
		}
		public static int obtenerFinSec(int[] arreglo, int inicio){
			while (inicio<MAXC && arreglo[inicio]!=0){
				inicio++;
			}
			return inicio-1;
		}
	}

