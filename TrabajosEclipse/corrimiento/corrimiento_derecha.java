package corrimiento;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class corrimiento_derecha {
	final static int MAXC = 10;

	public static void main(String[] args) {
//		{ 12, 3, 6, 23, 3, 8, 9, 7, 4, 6 };
		int[] arrayInt = { 12, 3, 6, 23, 3, 8, 9, 7, 4, 6 };
		int pos=4;
		mostrar_arr(arrayInt);
		System.out.println("");
//		int pos=elegir_posicion_corrimiento();
		corrimiento_derecha(pos,arrayInt);
//		invertir_arreglo(arrayInt);
		mostrar_arr(arrayInt);
	}

	private static void invertir_arreglo(int[] arr) {
		 int inicio=0;
		 int fin=(MAXC-1);
		while(inicio<fin) {
			int inicio_r=arr[inicio];
			int fin_r=arr[fin];
			arr[inicio]=fin_r;
			arr[fin]=inicio_r;
		    
			inicio++;
			fin--;
			
		}
	}

	private static void corrimiento_derecha(int pos, int[] arr) {
        int indice=MAXC-1;
		while(indice>pos) {
    	  arr[indice]=arr[indice-1];
    	  indice--;
      }		
		
	}

	private static int elegir_posicion_corrimiento() {
	int valor=0;
	BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));	
	while(!(valor>0&&valor<MAXC)) {
		try{System.out.println("Ingresame un valor de 0 hasta menor o igual a "+MAXC);
		valor=new Integer(entrada.readLine());
		}catch(Exception err) {
			System.out.println("err");
		}
	}
		return valor;
	}

	private static void mostrar_arr(int[] array) {
		for (int pos = 0; pos < MAXC; pos++) {
			System.out.print("[" + array[pos] + "]");

		}

	}
	
}
