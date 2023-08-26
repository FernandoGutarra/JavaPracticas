package proyecto_6_2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//Hacer un programa que dado un arreglo de enteros de tamaño 10 que se encuentra cargado,
//solicite al usuario un número entero y lo agregue al principio del arreglo (posición 0). Para ello
//tendrá que realizar un corrimiento a derecha (se pierde el último valor del arreglo).
public class practico_3 {
	final static int MAX=10;
	final static int MAXI=100;
	final static int MIN=0;
	public static void main(String[] args) {
		int[] arrEnteros=new int[MAX];
		int numero=0;
		cargar_arreglos(arrEnteros);
		imprimir_arreglo(arrEnteros);
		numero=solicitar_numero();
		System.out.println("valor agregado mas valor[0]puesto");
		corrimiento_agregado(arrEnteros,numero);
		imprimir_arreglo(arrEnteros);
		
		
	}
	public static void cargar_arreglos(int []arr) {
		for(int pos=1;pos<MAX;pos++) {
			int random= (int)(20*Math.random()+1);
			arr[pos]=random;
		}
	}
	public static void imprimir_arreglo(int []arr) {
		for(int pos=0;pos<MAX;pos++) {
			System.out.println("posicion del arreglo ["+pos+"]"+arr[pos]);
		}
	}
	public static int solicitar_numero(){
		int entero=0;
		BufferedReader entrada= new BufferedReader(new InputStreamReader(System.in));
		boolean valido=false;
		while(!valido){
			try{System.out.println("ingresame un numero entero entre el 0 y el 100");
			entero=new Integer(entrada.readLine());
			if(entero>=MIN&&entero<=MAXI) {
				valido=true;
			}
			else {
				System.out.println("numero_invalido");
			}}
			catch(Exception err){
				System.out.println(err);
			}
		}
		return entero;
	}
	public static void corrimiento_agregado(int []arr,int numero) {
		for(int pos=MAX-1;pos>1;pos--) {
			arr[pos]=arr[pos-1];
			arr[0]=numero;
		}
	}
}
