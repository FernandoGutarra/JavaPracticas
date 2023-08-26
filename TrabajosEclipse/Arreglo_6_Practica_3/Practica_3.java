package Arreglo_6_Practica_3;

public class Practica_3 {
//Hacer un programa que devuelva la posición de inicio y fin de la anteúltima secuencia de
//números distintos de ceros.
 final static int MAX=10;
 public static void main(String[]args) {
	int[]arr = {' ','d','f',' ','f','g',' ','s','h',' '};
	int ini=0;
	int fin=0;
	int anteUltimoIni=0;
	int anteUltimoFin=0;
	while(ini<MAX) {
		ini=buscarIni(arr,ini);
		if(ini<MAX) {
			fin=buscarFin(arr,ini); 
			if(buscarIni(arr,fin+1)<MAX) {
			anteUltimoIni=ini;
			anteUltimoFin=fin;
			}
			ini=fin+1;
		}
	}
	System.out.println("ante_ultimoIni "+anteUltimoIni+" ante_ultimoFin "+anteUltimoFin);
 }
	 public static int buscarFin(int[] arr, int ini) {
		while(ini<MAX && arr[ini]!=' ') {
		     ini++;	
		}
		return ini-1;
	 }
	 public static int buscarIni(int[] arr, int ini) {
		while(ini<MAX && arr[ini]==' ') {
			ini++;
		}
		return ini;
	 }
}
