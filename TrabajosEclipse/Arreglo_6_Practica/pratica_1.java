package Arreglo_6_Practica;
//1. Cargar un arreglo de tamaño 15, pidiendo el ingreso por teclado de valores entre 1 y 12.
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class pratica_1 {
  final static int MAX=15;
  final static int VALORMAX=12;
  final static int VALORMIN=1;
  public static void main(String[]args) {
	  int []arr = new int[MAX];
	  cargarArreglo(arr);
	  imprimirArreglo(arr);
  };
public static void imprimirArreglo(int[] arr) {
	for(int i=0;i<MAX;i++) {
	  System.out.print("|"+arr[i]);	
	};
};
public static void cargarArreglo(int [] arr) {
	  for(int i=0;i<MAX;i++) {
		  arr[i]=pedirNumero();
	  };
  };
  public static int pedirNumero() {
	  int numero=0;
	  boolean esValido=false;
	  BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
	  while(!esValido) {
		  try {		
			  System.out.println("ingresar un numero entre "+VALORMIN+" y "+VALORMAX);
			  numero = new Integer (entrada.readLine());
			  if(numero>=VALORMIN&&numero<=VALORMAX) {
				  esValido=true;
				
			  }else {
				  System.out.println("valor incorrecto");
			  }
		  }catch(Exception err) {
			  System.out.println(err);
		  };
	  };
	  return numero;
  };
  
};