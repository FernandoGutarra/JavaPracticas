import java.io.BufferedReader;
import java.io.InputStreamReader;
/*
4. Escribir un programa donde el usuario ingrese un número entre 0
y 999, y muestre un mensaje de cuántos dígitos tiene. Además, si
tiene 3 dígitos debe informar qué número es.
*/
public class ejercicio_4 {
    public static void main(String[] args) {
        int numero =0;
        final int MAX=999;
        final int MIN=0;
        final int DOSDIGITOS=10;
        final int TRESDIGITOS=10;
           try{
               BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
               numero = Integer.valueOf(entrada.readLine());
               if(numero>MIN&&numero<MAX){
                      if(numero<DOSDIGITOS){
                          System.out.println("el numero ingresado tiene un solo digito");
                      }else if(numero>DOSDIGITOS&&numero<TRESDIGITOS){
                          System.out.println("el numero ingresado tiene dos digitos");
                      }else{
                          System.out.println("el numero ingresado"+ numero +" tiene tres digitos");
                      }

               }
               System.out.println("");
            }catch(Exception exc){
               System.out.println(exc);
            }
    }
}
