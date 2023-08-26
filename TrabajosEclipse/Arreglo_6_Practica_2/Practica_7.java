package Arreglo_6_Practica_2;
//7. Hacer un programa que invierta el orden de los elementos de un arreglo de tamaño MAX=10.
public class Practica_7 {
    final static int MAX=10;
	public static void main (String[]args) {
	 int [] arr = new int [MAX];
	 cargarArr(arr);
	 imprimirArr(arr);
	 System.out.println("");
	 invetirOrden(arr);
	 imprimirArr(arr);
    }
	public static void invetirOrden(int[] arr) {
	    int ini=0;
	    int fin=MAX-1;
	    int aux=0;
		while(ini<fin) {
	    	aux=arr[ini];
	    	arr[ini]=arr[fin];
	    	arr[fin]=aux;
	    	ini++;
	    	fin--;
	    }
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
};
