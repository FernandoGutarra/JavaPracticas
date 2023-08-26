package Arreglo_6_Practica;
//6. Hacer un programa que dado un arreglo de enteros de tamaño 10 que se encuentra cargado,
//obtenga la cantidad de números pares que tiene y la imprima.
public class practica_6 {
  final static int MAX=10;
  final static int PAR=2;
  public static void main(String[]args) {
	  int [] arr= new int [MAX];
	  cargarArr(arr);
	  imprimirArr(arr);
	  cantidadNumeroPares(arr);
  }
 public static void cantidadNumeroPares(int[] arr) {
     int numerosPares=0;
	 for(int i=0;i<MAX;i++) {
    	if(arr[i]%PAR==0){
    		numerosPares++;
    	}
    }
	 System.out.println(" ");
	 System.out.println("cantidad De Numeros Pares " + numerosPares);
 };
 public static void imprimirArr(int[] arr) {
    for(int i=0;i<MAX;i++) {
    	System.out.print("|" + arr[i]);
    };
 };
 public static void cargarArr(int[] arr) {
	for(int i=0;i<MAX;i++) {
		arr[i]=numeroRamdon();
	};
  };
 public static int numeroRamdon() {
	int random = (int) (10*Math.random()*1);
	return random; 
 }; 
}
