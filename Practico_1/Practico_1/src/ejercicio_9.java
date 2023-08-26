/*
Escribir un programa que permita el ingreso de un número entero
por teclado e imprima el cociente de la división de dicho número
por 2, 3, y 4. En base a los resultados obtenidos analice cada
caso si es correcto o no. 
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio_9 {
    final static int MAX2=2;
    final static int MAX3=3;
    final static int MAX4=4;
    public static void main(String[]args){
        int entero=0;
        double resultado=0;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
         try{
             System.out.println("ingresame un entero por consola");
              entero = Integer.valueOf(entrada.readLine());
              resultado = (double)entero/MAX2;
              System.out.println(resultado);
              resultado = (double)entero/MAX3;
              System.out.println(resultado);
              resultado = (double)entero/MAX4;
              System.out.println(resultado);
         }catch(Exception exc){
             System.out.println(exc);
        }
    }
}
