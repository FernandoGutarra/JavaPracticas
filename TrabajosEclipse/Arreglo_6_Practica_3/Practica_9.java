package Arreglo_6_Practica_3;
//Hacer un programa que invierta el orden de la
//última secuencia en un arreglo
public class Practica_9 {
	final static int MAX=10;
  public static void main(String[]args) {
	  int[]arr= {0,2,2,0,3,4,2,0,0,0};
	  imprimirArr(arr,MAX);
	  System.out.println("");
	  int iniUltimo=0;
	  int finUltimo=0;
	  int ini=0;
	  int fin=0;
	  while(ini<MAX) {
		    ini=buscarIni(arr,ini);
		  if(ini<MAX) {
			  fin=buscarFin(arr,ini);
			  iniUltimo=ini;
			  finUltimo=fin;
			  ini=fin+1;
		  }else {
			  invetirOrdenSecu(arr,iniUltimo,finUltimo);
		  }
	  }
	  imprimirArr(arr,MAX);
  }
public static void invetirOrdenSecu(int[] arr, int ini, int fin) {
    int temp=0;
	while(ini<fin) {
	   temp=arr[ini];
	   arr[ini]=arr[fin];
	   arr[fin]=temp;
	   ini++;
	   fin--;
    }	
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
public static void imprimirArr(int[] arr,int MAXIMO) {
	  for(int i=0;i<MAXIMO;i++) {
		  System.out.print(" | " + arr[i]);
	  }
		
	}
}
