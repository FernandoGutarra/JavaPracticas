package Arreglo_6_Practica_3;
//7. Hacer un programa que elimine de un arreglo todas las secuencias que tienen orden descendente
//entre sus elementos
public class Practica_7 {
	final static int MAX=10;
  public static void main(String[]args) {
	  int [] arr = {0,2,3,0,3,2,1,0,0,0};
	  int ini=0;
	  int fin=0;
      System.out.println("");
      imprimirArr(arr,MAX);
	  System.out.println("");
	  while(ini<MAX) {
		  ini=buscarIni(arr,ini);
		  if(ini<MAX) {
			  fin=buscarFin(arr,ini);
			  int tamanioSecu=fin-ini+1;
			  if(SecuEsDecendente(arr,ini,fin)) {
				for(int i=0;i<tamanioSecu;i++) {
				  corrimientoIzq(arr,ini);
			       }
			  }
			  ini=fin+1;
		  }
	  }
	  imprimirArr(arr,MAX);
  }
public static void corrimientoIzq(int[] arr, int ini) {
	while(ini<MAX-1) {
		arr[ini]=arr[ini+1];
		ini++;
	}	
}
public static boolean SecuEsDecendente(int[] arr, int ini, int fin) {
	while(ini<fin) {
		if(arr[ini]<=arr[ini+1]) {
			return false;
		}
		ini++;
	}
	return true;
}
public static int buscarFin(int[] arr, int ini) {
	while(ini<MAX && arr[ini]!=0){
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
