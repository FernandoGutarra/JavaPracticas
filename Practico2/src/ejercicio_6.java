
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class ejercicio_6 {
 /*   6. Escribir un programa que mientras el usuario ingrese un número
    entero menor que 100 y mayor a 1, muestre por pantalla si el
    número es múltiplo de 2 y múltiplo de 3 simultáneamente. (¿Los
    valores mencionados en el enunciado deberían ser constantes?.
    De a poco habría que definirlos como constantes). */
    public static void main(String[]args){
        int numeroEntero=0;
        final int MAX=100;
        final int MIN=1;
        int MULTIPLODOS=2;
        int MULTIPLOTRES=3;
        boolean esValido=false;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try{
            while(!esValido){
                System.out.println("ingresa un numero entero");
                numeroEntero = Integer.valueOf(entrada.readLine());
                if(numeroEntero>=MIN&&numeroEntero<=MAX){
                    if(numeroEntero%MULTIPLODOS==0&&numeroEntero%MULTIPLOTRES==0) {
                        System.out.println("El numeroIngresado es multiplo de 2 y 3 = " + numeroEntero);
                    }
                    esValido=true;
                }else {
                    System.out.println("numero ingresado invalido");
                }
            }
        }catch(Exception exc){
            System.out.println(exc);
        }
    }
}
