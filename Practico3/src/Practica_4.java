import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Practica_4 {
    /*
         4. Escribir un diseño de programa que mientras que el usuario
         ingrese un número distinto de 0, pida ingresar otros dos números
         e imprima el resultado de la multiplicación entre los dos últimos
         números ingresados.
    */
    public static void main(String[]args){
       int numero=0;
       int numero1=0;
       int numero2=0;
       numero = pedirNumero(numero,"si ingresa 0 termina el programa");
       while(numero!=0){
           numero1 = pedirNumero(numero1,"1 para la multiplicasion");
           numero2 = pedirNumero(numero2,"2 para la multiplicasion");
           System.out.println("mutiplicasion entre los dos ultimos numeros es ="+ (numero*=numero2));
           numero = pedirNumero(numero," si ingresa 0 termina el programa");
       }
        System.out.println("el usuario ingreso 0");
    }

    private static int pedirNumero(int numero,String texto) {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try{
            System.out.println("ingresar un numero" + texto);
            numero = Integer.valueOf(entrada.readLine());
        }catch(Exception exc){
            System.out.println(exc);
        }
        return numero;
    }
}
