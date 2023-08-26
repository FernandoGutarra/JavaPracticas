import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Practica_3 {
    /*
     3. Escribir un diseño de programa que mientras que el usuario
        ingrese un número natural, pida ingresar otro número cualquiera y
        lo imprima.
      */
     public static void main(String[]args) {
         int numero=0;
         numero = pedirNumero(numero,"natural");
         while(numero>=1){
              numero = pedirNumero(numero,"otro numero por favor");
              System.out.println("el numero a imprimir es " + numero);
              System.out.println("");
              numero = pedirNumero(numero,"natural");
         }
         System.out.println("no ingreso un numero natural");
     }

    private static int pedirNumero(int numero,String texto) {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
         try {
            System.out.println("ingresar "+texto);
            numero = Integer.valueOf(entrada.readLine());
        }catch (Exception exc){
            System.out.println(exc);
        }
         return numero;
    }
}
