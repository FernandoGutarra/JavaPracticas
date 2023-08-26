package matriz;

public class practica_15 {
	final static int MAXFILA = 4;
	final static int MAXCOLUM = 20;

	public static void main(String[] args) {
		char[][] matLetras = {
				{ ' ', 'f', 'e', 'd', ' ', 'a', 'b', 'e', ' ', ' ', 'w', 'v', ' ', ' ', 'm', 'e', 'h', ' ', 'e', ' ' },
				{ ' ', ' ', 't', 'g', 'd', ' ', 'e', 'b', 'a', ' ', 'w', 'v', ' ', ' ', 'm', 'e', 'h', 'c', ' ', ' ' },
				{ ' ', 'j', 'i', 'h', ' ', ' ', 'f', 'b', 'a', ' ', 'w', 'v', ' ', ' ', ' ', 'e', 'e', 'c', 'c', ' ' },
				{ ' ', ' ', 'h', 'g', 'd', ' ', 'f', 'b', 'a', ' ', 'w', 'v', 'r', ' ', 'g', 'e', 'e', 'c', 'c',
						' ' } };
		Inprimir_Matriz(matLetras);
		int inicio = 0, fin = 0;
		boolean valido;
		for (int fila=0;fila< MAXFILA;fila++) {
		   inicio=0;
		   fin=0;
			while(inicio<MAXCOLUM-1) {
			inicio = buscar_inicio(matLetras[fila], inicio);
			  if(inicio<MAXCOLUM-1) {
				  fin=buscar_fin(matLetras[fila],inicio);
				  valido=buscar_secuencia_d(matLetras[fila],inicio,fin);
				  if(valido==true) {
					  corrimiento_izquierda(matLetras[fila],inicio,fin);
					  inicio=0;
				  }
				  else {
					  inicio=fin+1;
				  }
			  }
			
		  }
			
		}
		System.out.println("eliminar secuencias con orden decendente ");
		Inprimir_Matriz(matLetras);
	}

	public static void Inprimir_Matriz(char[][] matriz) {
		for (int fila = 0; fila < MAXFILA; fila++) {
			recorre_pos(matriz[fila]);
		}
	}

	public static void recorre_pos(char[] arr) {
		for (int pos = 0; pos < MAXCOLUM; pos++) {
			System.out.print("|" + arr[pos]);
		}
		System.out.println("");
	}

	public static int buscar_inicio(char[] fila, int inicio) {
		while (inicio < MAXCOLUM - 1 && fila[inicio] == ' ') {
			inicio++;
		}
		return inicio;
	}
	public static int buscar_fin(char[]arr,int inicio) {
		while(inicio<MAXCOLUM&&arr[inicio]!=' ') {
			inicio++;
		}
		return inicio-1;
	}
	public static boolean buscar_secuencia_d(char[]arr,int inicio,int fin) {
		 boolean valido=true;
		 while(inicio<=fin&&valido) {
			if( arr[inicio]>arr[inicio+1]) {
				valido=true;
			}
			if(arr[inicio]<arr[inicio+1]) {
				valido=false;
			}
			 inicio++;
		 }
		return valido;
	}
	public static void corrimiento_izquierda(char[]arr,int inicio,int fin) {
		int pos= inicio;
		int repite=inicio;
		int hasta=fin;
		while(repite<=hasta) {
			while (pos < MAXCOLUM - 1) {// pos=9 y maxcolum=9;
				arr[pos] = arr[pos + 1];// arr[8]=arr[8+1]
				pos++; // pos=8+1
			}
			repite++;
			pos=inicio;
		}
	}

}
