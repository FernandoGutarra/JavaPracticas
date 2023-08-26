package Arreglo_6_Practica_3;
//. Hacer un programa que elimine de un arreglo todas las ocurrencias de una secuencia patrón dada
//por otro arreglo.

public class Practica_6 {
	final static int MAXP=10;
	final static int MAXA=10;
  public static void main(String[]args) {
	  int [] arrPatron = {0,2,3,0,2,4,0,4,3,0};
	  int [] arr = {0,0,2,3,0,2,4,0,0,0};
	  imprimirArr(arrPatron,MAXP);
	  System.out.println("");
	  imprimirArr(arr,MAXA);
	  int ini=0;
	  int fin=0;
      while(ini<MAXA) {
    	  ini=buscarIni(arr,ini,MAXA);
    	  if(ini<MAXA) {
    		  fin=buscarFin(arr,ini,MAXA);
    		  int tamanioSecu=fin-ini+1;
    		 boolean seEliminoPatron=eliminararrPatron(ini,fin,arr,arrPatron,tamanioSecu); 
    		 if(seEliminoPatron) {
    			 ini=fin-tamanioSecu+1;
    		 }else {
    			 ini=fin+1;
    		 }
    	  }
      }
      System.out.println(" ");
      System.out.println("");
      imprimirArr(arrPatron,MAXP);
	  System.out.println("");
	  imprimirArr(arr,MAXA);
  }
public static boolean eliminararrPatron(int iniSecu, int finSecu, int[] arr, int[] arrPatron,int tamanioSecu) {
	int ini=0;
	int fin=0;
	while(ini<MAXP) {
		ini=buscarIni(arrPatron,ini,MAXP);
		if(ini<MAXP) {
			fin=buscarFin(arrPatron,ini,MAXP);
			int tamanioPatron=fin-ini+1;
			if(tamanioPatron==tamanioSecu){
				if(sonSecuenciasIguales(arrPatron,ini,fin,arr,iniSecu,finSecu)) {
					for(int i=0;i<tamanioSecu;i++) {
					   corrimientoIzq(arr,iniSecu);
					}
					return true;
				 }
				ini=fin+1;
			}
		}
	}
	return false;
}
private static void corrimientoIzq(int[] arr, int iniSecu) {
	while(iniSecu<MAXA-1) {
		arr[iniSecu]=arr[iniSecu+1];
		iniSecu++;
	}
	
}
private static boolean sonSecuenciasIguales(int[] arrPatron, int iniSecuP, int finSecuP, int[] arr, int iniSecu, int finSecu) {
	while(iniSecuP<=finSecuP&&iniSecu<=finSecu) {
		if(arrPatron[iniSecuP]!=arr[iniSecu]) {
		   return false;	
		}
		iniSecu++;
		iniSecuP++;
	}
	return true;
}
public static int buscarIni(int[] arr, int ini, int MAXIMO) {
	while(ini<MAXIMO && arr[ini]==0){
		ini++;
	}
	return ini;
}
public static int buscarFin(int[]arr,int ini, int MAXIMO) {
	while(ini<MAXIMO && arr[ini]!=0) {
		ini++;
	}
	return ini-1;
}
public static void imprimirArr(int[] arr,int MAXIMO) {
	  for(int i=0;i<MAXIMO;i++) {
		  System.out.print(" | " + arr[i]);
	  }
		
	}
}
