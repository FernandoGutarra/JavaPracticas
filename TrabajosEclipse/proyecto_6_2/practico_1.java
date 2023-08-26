package proyecto_6_2;
//Implementar un método que realice un corrimiento a derecha en un arreglo ordenado de tamaño

import java.io.BufferedReader;
import java.io.InputStreamReader;

//MAX=10 a partir de una posición.

public class practico_1 {
	final static int MAX=10;
	final static int MIN=0;

	public static void main(String[] args) {
		int[] arrEntero = new int[MAX];
		int guardar_numero=0;
		int posicion=0;
		cargar_arreglo(arrEntero);
	    imprimir_arreglo(arrEntero);
	    System.out.println("ordenamiento por burbuja");
	    ordenamiento_por_burbuja(arrEntero);
	    imprimir_arreglo(arrEntero);
        guardar_numero=pedir_numero_entero();
        posicion=buscar_posicion(arrEntero,guardar_numero);
        System.out.println("corrimiento derecha apartir de poscision una posicion");
        corrimiento_derecha(arrEntero,posicion);
        imprimir_arreglo(arrEntero);
	}

	public static void cargar_arreglo(int[] arr) {
		for (int pos = 0; pos < MAX; pos++) {
			int random = (int) (10 * Math.random() + 1);
			arr[pos] = random;
		}
	}
	public static void imprimir_arreglo(int []arr) {
		for(int pos=0;pos<MAX;pos++) {
			System.out.println("la posicion del arreglo es ["+pos+"] el valor es "+ arr[pos]);
		}
	}
	public static void ordenamiento_por_burbuja(int[]arr) {
			int auxiliar = 0;
			for (int i = 1; i < MAX; i++) {
				for (int j = 0; j < MAX - 1; j++) {
					if (arr[j] > arr[j + 1]) {
						auxiliar = arr[j];
						arr[j] = arr[j + 1];
						arr[j + 1] = auxiliar;
					}
				}

			}
		
	}
    public static int pedir_numero_entero() {
	 int numero=0;
	 boolean valido=false;
	  BufferedReader entrada= new BufferedReader(new InputStreamReader(System.in));
	 while(!valido) {
		 try {
			 System.out.println("ingresame un numero valido entre el 0 y el 10");
			 numero=new Integer(entrada.readLine());
			 if (numero>=MIN&&numero<=MAX) {
				 valido=true;
			 }
			 else {
				 System.out.println("numero ingresado incorrecto");
			 }
		 }
		 catch(Exception exc){
			 System.out.println(exc);
		 }
	 }
    	
    	return numero;	
	}
   public static int buscar_posicion(int []arreglo, int entero) {
	int posicion=0;
	   while((posicion < MAX) && (arreglo[posicion]<entero)) {
		posicion++;
	} 
	   return posicion;
   }
   public static void corrimiento_derecha (int []arr,int posicion) {
		for(int pos=MAX-1;pos>posicion;pos--){
			arr[pos]=arr[pos-1];
		}
	}
}
