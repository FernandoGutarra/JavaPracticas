

/*
10.
Escribir un programa que mientras que el usuario ingrese un
número entero entre 1 y 10 inclusive, lleve la suma de los
números ingresados. Finalmente, cuando sale del ciclo muestre
por pantalla el resultado de la suma. ¿En qué casos termina?
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class ejercicio_10 {
    public static void main(String[]args){
        final int MAX=10;
        final int MIN=1;
        int numeroEntero = ' ';
        boolean Parar=false;
        int suma=0;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try{
                      while(!Parar){
                          System.out.println("ingrese un numero entero del 1 al 10");
                          numeroEntero = Integer.valueOf(entrada.readLine());
                          if(numeroEntero < MIN || numeroEntero > MAX){
                              System.out.println("se ingreso un numero que no cumple con las exigencias");
                              Parar=true;
                          }else{
                              suma+=numeroEntero;
                          }
                      }
            System.out.println("la suma total de todos lo elementos hasta ahora es de " + suma);
        }catch(Exception exc){
            System.out.println(exc);
        }
    }
}
