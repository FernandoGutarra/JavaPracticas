package Arreglo_6_Practica;
//2. Hacer un programa que dado un arreglo ya cargado con 10 enteros, calcule el promedio y lo
//muestre por la consola.
//3. Con el mismo arreglo del ejercicio anterior informe por pantalla cuantos elementos del mismo
//están por encima del promedio calculado.
public class practico_2y3 {
	final static int MAX=10;
	public static void main(String[]args) {
		int []arr= new int [MAX];
	    cargarArr(arr);
	    imprimirArr(arr);
	    double promedio = calcularPromedio(arr);
	    numeroEncimaDelPromedio(promedio,arr);
	};
	public static void numeroEncimaDelPromedio(double promedio, int[] arr) {
		int numeroMayorPromedio=0;
		for(int i=0;i<MAX;i++) {
			if(arr[i]>promedio) {
				numeroMayorPromedio++;
			}
		}
		System.out.println("");
		System.out.println("numero que estan sobre el promedio "+numeroMayorPromedio);
	}
	public static double calcularPromedio(int[] arr) {
	    double suma = 0;
	    for (int i = 0; i < arr.length; i++) {
	        suma += arr[i];
	    }
	    double promedio = suma / arr.length;
	    System.out.println(" ");
	    System.out.println("El promedio es: " + promedio);
	    return promedio;
	};
	public static void cargarArr(int[] arr) {
	     for(int i=0;i<MAX;i++) {
	    	 arr[i]=valorRandom();
	     }
	};
	public static int valorRandom() {
		int numeroRandom = (int)(10*Math.random()*1);
		return numeroRandom;
	};
	public static void imprimirArr(int[]arr) {
		for(int i=0;i<MAX;i++) {
			System.out.print("|"+arr[i]);
		}
	};
};

