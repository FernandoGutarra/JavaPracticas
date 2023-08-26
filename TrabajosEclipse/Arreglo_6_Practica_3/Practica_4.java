package Arreglo_6_Practica_3;
//Hacer un programa que devuelva la posición de inicio y de fin de la secuencia de mayor
//tamaño.

public class Practica_4 {
  final static int MAX=10;
  public static void main(String[]args) {
	int [] arr = {0,2,3,4,0,3,9,0,9,0};   
	int ini=0;
	int fin=0;
	int sumaMayor=0;
	int iniMayor=0;
	int finMayor=0;
	while(ini<MAX) {
		 ini=buscarIni(arr,ini);
		 if(ini<MAX) {
			 fin=buscarFin(arr,ini);
			 int sumaSecu=sumarSecu(ini,fin,arr);
			 if(sumaSecu>sumaMayor) {
				 sumaMayor=sumaSecu;
				 iniMayor=ini;
				 finMayor=fin;
			 }
			 ini=fin+1;
		 }
	}
	System.out.println("IniMayor="+iniMayor+" FinMayor="+finMayor);
  }

public static int sumarSecu(int ini, int fin,int []arr) {
	 int sumaSecu=0;
	while(ini<=fin) {
	   sumaSecu+=arr[ini];
	   ini++;
    }
	return sumaSecu;
}

public static int buscarFin(int[] arr, int ini) {
	while(ini<MAX && arr[ini]!=0) {
		ini++;
	}
	return ini-1;
}
public static int buscarIni(int[] arr, int ini) {
	while(ini<MAX && arr[ini]==0) {
		ini++;
	}
	return ini;
}
}
