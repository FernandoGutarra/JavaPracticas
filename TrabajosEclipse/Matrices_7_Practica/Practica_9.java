package Matrices_7_Practica;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//Hacer un programa que dado una matriz de enteros de tamaño 4*5 que se encuentra precargada,
//solicite al usuario el ingreso de una fila y dos números enteros (columnas de la matriz), y ordene de
//forma creciente la matriz en la fila indicada entre las dos posiciones columnas ingresadas.
public class Practica_9 {
	final static int MAXF=4;
	final static int MAXC=5;
	public static void main(String[]args) {
		  int[][]matriz= {
				  {2,6,10,15,20},
				  {6,35,60,10,3},
				  {5,34,3,3,40},
				  {34,23,3,0,3},
		    };
		  imprimrMatriz(matriz);
		  System.out.println("");
		  int fila=pedirNumero(" de una fila");
		  int numeroEntero1=pedirNumero("");
		  int numeroEntero2=pedirNumero("");
		  ordenarCreciente(matriz[fila],numeroEntero1,numeroEntero2);
		  System.out.println("");
		  imprimrMatriz(matriz);
    }
	public static void ordenarCreciente(int[]arr,int numero1, int numero2) {
		int temp=0;
		for(int i=1;i<MAXC;i++){
			for(int j=numero1;j<numero2;j++) {
				 if(arr[j]>arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				 }
			}
		}
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
