package Arreglo_6_Practica_3;

//2. Hacer un programa que devuelva la posición de inicio y fin de la secuencia de números
//distintos de ceros cuya suma del contenido sea mayor.

public class Practica_2 {
	final static int MAX=10;
    public static void main (String[]args) {
    	int [] arr = {0,2,3,4,0,3,4,5,0,0};
    	int ini=0;
    	int fin=0;
    	int iniM=0;
    	int finM=0;
    	int sumaM=0;
    	while(ini<MAX) {
    		ini=buscarIni(arr,ini);
    		if(ini<MAX) {
    			fin=buscarFin(arr,ini);
    		  int sumaSecu=sumarSecu(arr,ini,fin);
    		  if(sumaSecu>sumaM) {
    			  sumaM=sumaSecu;
    			  iniM=ini;
    			  finM=fin;
    		  }
    		  ini=fin+1;
    		}
    	}
    	System.out.println("  finMayor "+ finM +" iniMayor "+ iniM + " sumaMayor "+ sumaM);
    }
	
	public static int sumarSecu(int[]arr,int ini,int fin) {
		int suma=0;
		while(ini<=fin) {
			suma+=arr[ini];
			ini++;
		}
		return suma;
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
