/*
18.
Escribir un programa que mientras que el usuario ingrese un
número distinto de 0, pida ingresar otros dos números e imprima
el resultado de la división entre los dos últimos números
ingresados. ¿Existe alguna restricción para la división? */
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class ejercicio_18 {
    public static void main(String[]args){
        int numeroIngreso=0;
      int numero=0;
      int numero2=0;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try{
            System.out.println("ingresa un numero distinto a 0");
            numeroIngreso= Integer.valueOf(entrada.readLine());
           while(numeroIngreso!=0){
               System.out.println("ingresar un primer numero");
               numero = Integer.valueOf(entrada.readLine());
               System.out.println("ingresa un segundo numero");
               numero2 = Integer.valueOf(entrada.readLine());
               if(numero2 != 0){
                   System.out.println("division :"+numero+"/"+numero2+"="+(numero/numero2));
               }
           }
        }catch(Exception exc){
            System.out.println(exc);
        }
    }
}
