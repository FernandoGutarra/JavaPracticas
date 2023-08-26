package Arreglo_6_Practica_2;
//2. Implementar un método que realice un corrimiento a izquierda en un arreglo ordenado de
//tamaño MAX=10 a partir de una posición.

public class Practica_2 {
	final static int MAX=10;
  public static void main(String[]args) {
	int [] arr = new int[MAX];
	cargarMatriz(arr);
	imprimirMatriz(arr);
	corrimientoIzq(arr);
  };
 public static void corrimientoIzq(int[] arr) {
	 int ini=0;
	 while(ini<MAX-1) {
		arr[ini]=arr[ini+1];
		ini++;
	};	
 };
 public static void imprimirMatriz(int[]arr) {
	 for(int i=0;i<MAX;i++) {
		 System.out.print(" | "+ arr[i]);
	 }
}
 public static void cargarMatriz(int[]arr) {
	  for(int i=0; i<MAX; i++) {
		  arr[i]=numeroRamdon();
	  };
  };
 public static int numeroRamdon() {
	int random = (int) (10*Math.random()*1);
	return random;
 };
  
}
