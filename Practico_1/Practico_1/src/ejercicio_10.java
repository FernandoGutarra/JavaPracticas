/*
        Escribir un programa que permita el ingreso de dos números
        enteros por teclado e imprima:
        a. si el primero es mayor al segundo.
        b. si ambos son múltiplos de 2.
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class ejercicio_10 {
    public static void main(String[]args){
        int numero1=0;
        int numero2=0;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try{
            System.out.println("ingresar numero1 por consola");
          numero1 = Integer.valueOf(entrada.readLine());
            System.out.println("ingresar numero2 por consola");
          numero2 = Integer.valueOf(entrada.readLine());
          if(numero1>numero2){
              System.out.println("el primer numero ingresdo por consola es mayor al segundo");
          }else{
             System.out.println("segundo numero ingresado por consola es mayor al segundo");
          }
        }catch(Exception exc){
            System.out.println(exc);
        }
    }

}
