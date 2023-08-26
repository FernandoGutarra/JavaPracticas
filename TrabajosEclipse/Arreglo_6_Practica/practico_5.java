package Arreglo_6_Practica;
//5. Hacer un programa que dado un arreglo de caracteres de tamaño 10 que se encuentra cargado,
//invierta el orden del contenido. Este intercambio no se debe realizar de manera explícita, hay que
//hacer un método que incluya una iteración de intercambio.
public class practico_5 {
	final static int MAX=10;
  public static void main(String[]args) {
	  char [] arr = {'s','d','d','2','4','6','s','g','h','v'};
	  imprimirArr(arr);
	  System.out.println("");
	  invertirOrden(arr);
	  imprimirArr(arr);
  }
 public static void imprimirArr(char[] arr) {
   for(int i=0;i<MAX;i++) {
	   System.out.print("|"+ arr[i]);
   };	
 };
 public static void invertirOrden(char [] arr) {
     int ini=0;
     int fin=MAX-1;
     char aux=' ';
	 while(ini<fin) {
	   aux=arr[ini];
	   arr[ini]=arr[fin];
	   arr[fin]=aux;
	   ini++;
	   fin--;
   };
 };
};
