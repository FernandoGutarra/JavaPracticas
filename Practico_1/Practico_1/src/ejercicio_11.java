/*
Escribir un programa que permita el ingreso de un número entero
        por teclado e imprima el resultado de determinar:
        a. si es múltiplo de 6 y de 7,
        b. si es mayor a 30 y múltiplo de 2, o es menor igual a 30,
        c. si el cociente de la división de dicho número por 5 es mayor
        que 10.
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class ejercicio_11 {
    final static int MAX6=6;
    final static int MAX7=7;
    final static int MAX30=30;
    final static int MAX2=2;
    final static int MAX5=5;
    final static int MAX10=10;
    public static void main(String[]args){
        int numeroEntero=0;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            numeroEntero = Integer.valueOf(entrada.readLine());
            if(numeroEntero%MAX6==0&&numeroEntero%MAX7==0){
                System.out.println("el numeroEntero es  múltiplo de 6 y de 7");
            }else if (numeroEntero>MAX30&&numeroEntero%MAX2==0){
                System.out.println("el numeroEntero es  mayor de 30 y multiplo 2");
            }else if(numeroEntero%MAX5>10){
                System.out.println("el consiente de la division del numero entero por 5 es mayor a 10");
            }
        }catch(Exception exc){
            System.out.println(exc);
        }
  }
}
