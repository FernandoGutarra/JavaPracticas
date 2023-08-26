package Arreglo_6_Practica_2;
//3. Hacer un programa que dado un arreglo de enteros de tamaño 10 que se encuentra cargado,
//solicite al usuario un número entero y lo agregue al principio del arreglo (posición 0). Para ello
//tendrá que realizar un corrimiento a derecha (se pierde el último valor del arreglo).
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Practica_3 {
  final static int MAX=10;
  public static void main(String[]args) {
	 int [] arr = new int [MAX];
	 cargarArr(arr);
	 imprimirArr(arr);
	 System.out.println("");
	 int numeroEntero=pedirEntero();
	 agregarNumero(numeroEntero,arr);
	 System.out.println("");
	 imprimirArr(arr);
  };
public static void agregarNumero(int numeroEntero,int [] arr) {
    int pos=0;
    int index=MAX-1;
	while(index>pos) {
	   arr[index]=arr[index-1];
	   index--;
   }
  arr[pos]=numeroEntero;
}
public static int pedirEntero() {
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
public static void imprimirArr(int[]arr) {
  for(int i=0;i<MAX;i++) {
	  System.out.print(" | "+ arr[i]);
  }
}
public static void cargarArr(int[] arr) {
  for(int i=0;i<MAX;i++) {
	  arr[i]=numeroRandom();
  };
};
public static int numeroRandom() {
	int random = (int) (10*Math.random()*1);
	return random;
 };
};
