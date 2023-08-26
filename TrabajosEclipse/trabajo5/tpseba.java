package trabajo5;

//1. Cargar un arreglo de tamaño 15, pidiendo el ingreso por teclado de valores entre 1 y 12.
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class tpseba {
  final static int MAX=15;
  final static int MINVALOR=1;
  final static int MAXVALOR=12;
  public static void main (String[] args){
      int [] arreglo= new int [MAX];
     // int numeros=0;
     asignar_valores(arreglo);
     /* for(int pos=0;pos<MAX;pos++){
          numeros=pedir_numeros();
          arreglo[pos]=numeros;
      }*/
      imprimir_arreglo(arreglo);
  }
  public static int pedir_numeros(){
      int valor=0;
      boolean valido=false;
      BufferedReader entrada= new BufferedReader(new InputStreamReader(System.in));
      while(!valido){
          try{
              System.out.println("Ingresa un valor (entre 1 y 12)");
              valor=Integer.valueOf(entrada.readLine());
          }
          catch(Exception exc){
              System.out.println(exc);
          }
          if(valor>=MINVALOR && valor<=MAXVALOR){
              valido=true;
          }
          else{
              System.out.println("Valor incorrecto");
          }
      }
      return valor;

  }
  public static void asignar_valores(int [] arreglos){
      int numeros;
	  for(int pos=0;pos<MAX;pos++){
          
    	  numeros=pedir_numeros();
          arreglos[pos]=numeros;
      }
  }
  public static void imprimir_arreglo(int [] arreglos){
      for(int pos=0;pos<MAX;pos++){
          System.out.println("arreglo["+pos+"] -> "+arreglos[pos]);
      }
  }
}