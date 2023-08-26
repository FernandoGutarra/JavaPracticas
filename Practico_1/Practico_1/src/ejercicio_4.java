/*
4. Escribir un programa que permita ingresar 5 números de a uno por
        vez y que los muestre por pantalla en orden inverso:
        Ejemplo: Ingreso: 23, 4, 2, 100, 3
        Se debe mostrar: 3, 100, 2, 4, 23
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
/*
* Escribir un programa que permita ingresar 5 números de a uno por
vez y que los muestre por pantalla en orden inverso:
Ejemplo: Ingreso: 23, 4, 2, 100, 3
Se debe mostrar: 3, 100, 2, 4, 23
*/
public class ejercicio_4 {
     public static void main (String[]args){
         int numero1=0;
         int numero2=0;
         int numero3=0;
         int numero4=0;
         int numero5=0;
        try{
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("ingresar numero1");
            numero1= Integer.valueOf(entrada.readLine());
            System.out.println("ingresar numero2");
            numero2= Integer.valueOf(entrada.readLine());
            System.out.println("ingresar numero3");
            numero3= Integer.valueOf(entrada.readLine());
            System.out.println("ingresar numero4");
            numero4= Integer.valueOf(entrada.readLine());
            System.out.println("ingresar numero5");
            numero5= Integer.valueOf(entrada.readLine());
            System.out.println(numero5+" "+" "+numero4+" "+numero3+" "+numero2+" "+numero1);
            System.out.println(numero1+" "+" "+numero2+" "+numero3+" "+numero4+" "+numero5);
        }catch(Exception exc){
            System.out.println(exc);
        }
     }
}
