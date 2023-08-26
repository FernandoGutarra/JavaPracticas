/*
8.
   Escribir un programa que mientras que el usuario ingrese un
   número entero distinto de 0, pida ingresar otro número entero y lo imprima.
        */
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class ejercicio_8 {
    public static void main(String [] args){
       int numeroEntero = 0;
       final int DISTINTO=0;
       boolean esValido = false;
       BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try{
            System.out.println("ingrese un numero distinto de 0");
            numeroEntero = Integer.valueOf(entrada.readLine());
            if(numeroEntero!=0){
                System.out.println("entero ingresado = " + numeroEntero);
                while(!esValido){
                    System.out.println("ingresar otro número entero");
                     numeroEntero = Integer.valueOf(entrada.readLine());
                    System.out.println("entero ingresado = " + numeroEntero);
                 }
            }else{
                System.out.println("se termino el programa");
            }
       }catch(Exception exc){
           System.out.println("");
       }
    }
}
