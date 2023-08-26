/*
13.
Escribir un programa que mientras que el usuario ingrese un
caracter letra minúscula, pida ingresar un número entero. Si el
número ingresado está entre 1 y 5 inclusive deberá imprimir la
tabla de multiplicar de dicho número.
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class ejercicio_13 {
   public static void main(String[] args) {
       char caracter=' ';
       int numero=' ';
       char MAX='z';
       char MIN='a';
       int MAXINT=5;
       int MININT=1;
       int TABLAMAX=10;
       boolean noEsValido=false;
      BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
      try{
          while(!noEsValido){
              System.out.println("ingresar una letra minuscula");
              caracter=entrada.readLine().charAt(0);
              if(caracter>=MIN && caracter<= MAX){
                  System.out.println("ingresar por consola un numero entero");
                  numero=Integer.valueOf(entrada.readLine());
                  if(numero>=MININT && numero<=MAXINT){
                      System.out.println("la tabla de multiplicar de "+numero);
                     for(int i =0; i<=TABLAMAX;i++){
                         System.out.println("la tabla de multiplicar de "+numero+" * "+i+" = "+(numero*i));
                     }
                  }
              }else {
                  noEsValido=true;
              }
          }
      }catch(Exception exc){

      }
   }
}
