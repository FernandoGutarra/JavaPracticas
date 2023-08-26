package Arreglo_6_Practica_2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//4. Hacer un programa que inserte un elemento en un arreglo (ordenado decrecientemente) de
//tamaño MAX=10
public class Practica_4 {
  final static int MAX=10;
  public static void main(String[]args) {
	  int [] arr = new int [MAX];
	  cargarArr(arr);
	  imprimirArr(arr);
	  System.out.println("");
	  ordenarDecreciente(arr);
	  imprimirArr(arr);
	  System.out.println("");
	  int numero=pedirNumero();
	  insertarElemento(arr,numero);
	  System.out.println("");
	  imprimirArr(arr);
  }
public static void insertarElemento(int[] arr, int numero) {
	int pos=0;
	int index=MAX-1;
	while(index>pos) {
		arr[index]=arr[index-1];
		index--;
	}
	arr[pos]=numero;
}
public static int pedirNumero() {
	boolean esValido=false;
	int numero=0;
	BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
	while(!esValido) {
		try {
			System.out.println("Ingresame un numero entero");
			numero = new Integer (entrada.readLine());
			if(numero>=0) {
				esValido=true;
			}
		}catch(Exception err) {
			System.out.println(err);
		}
	}
	return numero;
}
public static void ordenarDecreciente(int[] arr) {
	int temp=0;
	for(int i=0;i<MAX;i++) {
		for(int j=0;j<MAX-1;j++) {
			if(arr[j+1]>arr[j]) {
				temp=arr[j+1];
				arr[j+1]=arr[j];
				arr[j]=temp;
			}
		}
	}	
}
public static void imprimirArr(int[] arr) {
	for(int i=0;i<MAX;i++) {
		System.out.print(" | "+ arr[i]);
	}	
}
public static void cargarArr(int[] arr) {
	for(int i=0;i<MAX;i++) {
		arr[i]=numeroRandom();
	}
 }
public static int numeroRandom() {
    int random = (int) (10*Math.random()*1);
	return random;
}
}
