package Arreglo_6_Practica_2;
//5. Hacer un programa que dado un arreglo de enteros de tamaño 10 que se encuentra cargado,
//solicite al usuario un número entero y elimine la primer ocurrencia del número (un número igual)
//en el arreglo si existe. Para ello tendrá que buscar la posición y si está, realizar un corrimiento a
//izquierda (queda una copia de la última posición del arreglo en la anteúltima posición).

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Practica_5 {
    final static int MAX=10;
	public static void main(String[]args) {
	 int [] arr = new int [MAX];
	 cargarArr(arr);
	 imprimirArr(arr);
	 System.out.println("");
	 int numero = pedirNumero();
	 eliminarOcurrencia(numero,arr);
	 imprimirArr(arr);
	 System.out.println("");
    } 
	public static void eliminarOcurrencia(int numero, int[] arr) {
		for(int i=0;i<MAX;i++) {
			if(arr[i]==numero) {
				corrimientoIzq(arr,i);
			}
		}
	}
	public static void corrimientoIzq(int[]arr,int ini) {
		while(ini<MAX-1) {
			arr[ini]=arr[ini+1];
			ini++;
		}
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
	public static void imprimirArr(int[] arr) {
	  for(int i=0;i<MAX;i++) {
		  System.out.print(" | " + arr[i]);
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
