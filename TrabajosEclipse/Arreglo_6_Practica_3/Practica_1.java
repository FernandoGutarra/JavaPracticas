package Arreglo_6_Practica_3;
//Hacer un programa que devuelva la posición de inicio y fin de la primer secuencia de
//números distinta de ceros.

public class Practica_1 {
  final static int MAX=10;
   public static void main(String[]args) {
	   char [] arr = {' ','s','f','f',' ',' ',' ',' ',' ',' '};
	   int ini=0;
	   int fin=0;
//	   while(ini<MAX) {
		   ini=buscarIni(arr,ini);
		  if(ini<MAX){
			  fin=buscarFin(arr,ini);
		  }
//	   }
	   
	   System.out.println("fin "+fin+" ini "+ini);
   }
 private static int buscarFin(char[] arr, int ini) {
	while(ini<MAX && arr[ini]!=' ') {
		ini++;
	}
	return ini-1;
}
public static int buscarIni(char[] arr, int ini) {
	while(ini<MAX && arr[ini]==' ') {
		ini++;
	}
	return ini;
 }
}
