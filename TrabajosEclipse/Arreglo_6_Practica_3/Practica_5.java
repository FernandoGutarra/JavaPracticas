package Arreglo_6_Practica_3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//Hacer un programa que dado un número N ingresado por el usuario, elimine las
//secuencias de tamaño N de números distintos de cero.
public class Practica_5 {
	final static int MAX=10;
 public static void main (String[]args) {
	 int [] arr = {0,2,3,4,0,3,9,0,9,0}; 
	 imprimirArr(arr);
	 System.out.println("");
	 int numeroN=pedirNumero();
	 int ini=0;
	 int fin=0;
	 while(ini<MAX) {
		 ini=buscarIni(arr,ini);
		 if(ini<MAX) {
			 fin=buscarFin(arr,ini);
			 int tamanioSecu=fin-ini+1;
			 if(tamanioSecu==numeroN) {
				 eliminarSecu(tamanioSecu,ini,arr);
			 }
			 ini=fin+1;
		 }
	 }
	 imprimirArr(arr);
 }


	public static void imprimirArr(int[] arr) {
		  for(int i=0;i<MAX;i++) {
			  System.out.print(" | " + arr[i]);
		  }
			
		}
public static void eliminarSecu(int tamanioSecu,int ini,int[]arr) {
  for(int i=0;i<tamanioSecu;i++) {
	  corrimientoIqz(arr,ini);
  }
}



public static void corrimientoIqz(int[] arr, int ini) {
	while(ini<MAX-1) {
		arr[ini]=arr[ini+1];
		ini++;
	}	
}



public static int buscarFin(int[] arr, int ini) {
	while(ini<MAX&&arr[ini]!=0) {
		ini++;
	}
	return ini-1;
}

public static int buscarIni(int[] arr, int ini) {
	while(ini<MAX&&arr[ini]==0) {
		ini++;
	}
	return ini;
}

public static int pedirNumero() {
	int numero=0;
	boolean esValido=false;
	BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
	while(!esValido) {
		try {
			System.out.println("ingresarNumeroEntero");
			numero=new Integer(entrada.readLine());
			if(numero>0) {
				esValido=true;
			}
		}catch(Exception err) {
			System.out.println(err);
		}
	}
	return numero;
 }
}
