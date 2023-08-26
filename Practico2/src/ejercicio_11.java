/*
11. Escribir un programa que mientras el usuario ingrese un
    caracter letra minúscula, acumule la cantidad de vocales que
    ingresó. Finalmente muestre por pantalla dicha cantidad.
        */
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class ejercicio_11 {
    public static void main(String[]args){
        char caracter=' ';
        int cantidadDeMinusculas=0;
        final char MAX='z';
        final char MIN='a';
        boolean noEsValido=false;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try{
            while(!noEsValido){
                System.out.println("ingresa un letra minuscuala");
               caracter = entrada.readLine().charAt(0);
                       if(caracter>=MIN && caracter<=MAX){
                             cantidadDeMinusculas++;
                       }else {
                           noEsValido=true;
                       }
                }
            System.out.println("cantidad de minusculas ingresadas ="+cantidadDeMinusculas);
        }catch(Exception exc){
            System.out.println(exc);
        }
    }
}
