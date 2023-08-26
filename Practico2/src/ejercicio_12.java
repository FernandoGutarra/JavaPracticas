import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
12. Escribir un programa que mientras el usuario ingrese un
carácter letra minúscula, se quede con la menor y la mayor letra
ingresada. Finalmente muestre por pantalla dichas letras.
*/
public class ejercicio_12 {
    public static void main(String [] args){
        char caracter=' ';
        char menorCharIngresado=' ';
        char mayorCharIngresado=' ';
        final char MAX='z';
        final char MIN='a';
        boolean noEsValido=false;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try{
             while(!noEsValido){
                 System.out.println("ingresame una letra minuscula por consola");
                 caracter = entrada.readLine().charAt(0);
                 if(caracter>=MIN&&caracter<=MAX){
                         if(mayorCharIngresado == ' ' && menorCharIngresado==' '){
                                 mayorCharIngresado=caracter;
                                 menorCharIngresado=caracter;
                         }else if (caracter<=menorCharIngresado){
                                   menorCharIngresado=caracter;
                         }else if (caracter>=mayorCharIngresado){
                             mayorCharIngresado=caracter;
                         }
                 }else {
                     noEsValido=true;
                 }
             }
            System.out.println("la letra minuscula que fue menor fue :"+menorCharIngresado);
            System.out.println("la letra minuscula que fue mayor fue :"+mayorCharIngresado);
        }catch(Exception exc){
            System.out.println(exc);
        }

    }

}

