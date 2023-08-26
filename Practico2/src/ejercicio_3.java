import  java.io.BufferedReader;
import java.io.InputStreamReader;
/* 3.
Escribir un programa que solicite el ingreso de un número mayor a
50, y lo muestre por pantalla en caso de ser múltiplo de 2 o 3.
*/
public class ejercicio_3 {
    public static void main(String[] args) {
        final int MULTIPLO2=2;
        final int MULTIPLO3=3;
        final int MAYOR=50;
        int numero=0;
        try{
           BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
           numero = Integer.valueOf(entrada.readLine());
           if(numero>MAYOR){
               if(numero%MULTIPLO2==0){
                   System.out.println("el numero es multiplo de 2");
               } else if (numero%MULTIPLO3==0) {
                   System.out.println("el numero es multiplo de 3");
               }
           }
        }catch(Exception exc){
            System.out.println(exc);
        }
    }
}
