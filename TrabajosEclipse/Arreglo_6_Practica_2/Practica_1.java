package Arreglo_6_Practica_2;
//1. Implementar un método que realice un corrimiento a derecha en un arreglo ordenado de tamaño
//MAX=10 a partir de una posición.
public class Practica_1 {
  final static int MAX=10;
  public static void main(String[]args) {
    int [] arr= new int [MAX];
    cargarArr(arr);
    imprimirArr(arr);
    corrimientoDerecha(arr);
    System.out.println(" ");
    imprimirArr(arr);
  };
 public static void corrimientoDerecha(int[] arr) {
	 int pos=0;
	 int index=MAX-1;
	 while(index>pos) {
		arr[index]=arr[index-1];
		index--;
	}
 };
 public static void imprimirArr(int[] arr) {
	for(int i=0;i<MAX;i++) {
		System.out.print("|"+ arr[i]);
	};
  };
  public static void cargarArr(int[] arr) {
	for(int i=0;i<MAX;i++) {
		arr[i]=numeroRandom();
	};
  };
  public static int numeroRandom() {
	int random = (int)(10*Math.random()*1);
	return random;
  };
 
};
