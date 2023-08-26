package matriz;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//Hacer un programa que dada una matriz de enteros de tamaño 5*10 que se encuentra precargada,
//solicite al usuario un número entero y elimine todas las ocurrencia de número en la matriz si existe.
//Mientras exista (en cada iteración tiene que buscar la posición fila y columna) tendrá que usar dicha
//posición para realizar un corrimiento a izquierda.
public class practica_6 {
  final static int MAXFILA=5;
  final static int MAXCOLUM=10;
  public static void main(String []arsg) {
     int [][]matInt=new int[MAXFILA][MAXCOLUM];
     int numero_entero=0;
	  cargarLaMatriz_aleatoriamente(matInt);
	  mostrar_matriz(matInt);
	  numero_entero=perdir_numero_entero();
	  buscar_numero_en_matriz(matInt,numero_entero);
	  mostrar_matriz(matInt);
	
  }
  public static void cargarLaMatriz_aleatoriamente(int [][]matriz) {
	  for(int fila=0;fila<MAXFILA;fila++) {
		  for(int colum=0;colum<MAXCOLUM;colum++) {
			  int random=(int)(10*Math.random()+1);
			  matriz[fila][colum]=random;
		  }
	  }
  }
  public static void  mostrar_matriz(int [][]matriz) {
	  for(int fila=0;fila<MAXFILA;fila++) {
		 recorre_arreglo(matriz[fila]);
	  }
  } 
  public static void recorre_arreglo(int[]arr) {
	  for(int colum=0;colum<MAXCOLUM;colum++) {
		System.out.print("|"+arr[colum]);  
	  }
	  System.out.println("");
  }
  public static int perdir_numero_entero() {
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
	  int valor=0;
	  boolean valido=false;
	  while(!valido) {
		 try { System.out.println("ingresame un numero del 1 al 10");
		 valor=new Integer(entrada.readLine());
		 valido=true;
		 }catch(Exception err) {
			 System.out.println("err");
		 }
	  }
	  return valor;
  }
  public static void  buscar_numero_en_matriz(int[][]matriz,int numero) {
	  int pos=0;
	  int columna=0;
	  int fila=0;
	  boolean valido=false;
	 while(fila<=MAXFILA-1&&!valido) {
		 columna=0;
		  while(columna<MAXCOLUM-1) {
			 
			  if(matriz[fila][columna]==numero) {
				 
				  pos=columna;
				  corrimiento_izquierda(matriz[fila],pos);
				   
			  }
			  columna++;
		  
		  }
		fila++;  
		  
	  }
	 fila=0;
  }
  public static void  corrimiento_izquierda(int[]arr,int pos) {
	 while(pos<MAXCOLUM-1) {
		 
	 arr[pos]=arr[pos+1];
	 
	 pos++;
	 
	 }
  }
}
