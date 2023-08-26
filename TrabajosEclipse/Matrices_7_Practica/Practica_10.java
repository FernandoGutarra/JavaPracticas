package Matrices_7_Practica;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//Hacer un programa que dada la matriz de secuencias de enteros definida y precargada, permita
//obtener a través de métodos la posición de inicio y la posición de fin de la secuencia ubicada a
//partir de una posición entera y una fila, ambas ingresadas por el usuario. Finalmente, si existen
//imprima por pantalla ambas posiciones obtenidas.
public class Practica_10 {
  final static int MAXF=2;
  final static int MAXC=10;
  public static void main(String[]args) {
	  int [][] matriz = {
			  {0,2,3,4,0,0,0,3,4,0},
			  {0,2,9,0,0,2,2,0,0,0},
	  };
	  imprimrMatriz(matriz);
	  int posicionEntera=pedirNumero("");
	  int fila=pedirNumero(" de fila");
	  int iniE=0;
	  int finE=0;
	  int ini=0;
	  int fin=0;
	     while(ini<MAXC) {
		  ini=buscarIni(matriz[fila],ini);
		   if(ini<MAXC) {
			  fin=buscarFin(matriz[fila],ini);
			  if(posicionEntera>=ini && posicionEntera<=fin) {
				  iniE=ini;
				  finE=fin;
			  }
			  ini=fin+1;
		   }
	    }
	     System.out.println("fin "+iniE+" ini "+finE);
   }
public static int buscarFin(int[] arr, int ini) {
	while(ini<MAXC && arr[ini]!=0) {
		ini++;
	}
	return ini-1;
}
public static int buscarIni(int[] arr, int ini) {
    while(ini<MAXC && arr[ini]==0){
    	   ini++;
    }
	return ini;
}
public static void imprimrMatriz(int[][] matriz) {
		for(int fila=0;fila<MAXF;fila++) {
			recorrerColum(matriz[fila]);
		}
  }
  public static void recorrerColum(int[] arr) {
   	for(int colum=0;colum<MAXC;colum++) {
 		   System.out.print(" | " + arr[colum]);
 	    }
   	System.out.println("");
  }
  public static int pedirNumero(String para) {
		int numero=0;
      boolean esValido=false;
      while(!esValido) {
      	try {
      		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
      		System.out.println("ingresa un numero entero"+para);
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
}
