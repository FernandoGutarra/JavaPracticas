import jdk.jfr.Experimental;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.GenericSignatureFormatError;

/*2. Escribir un diseño de programa que mientras que el usuario
        ingrese un carácter dígito o carácter letra minúscula, imprima
        dicho carácter, y si es carácter letra minúscula, imprima si es vocal
        o consonante.*/
public class Practica_2 {
    public static void main(String[]args){
       /*
          1 Pedir al usuario que ingrese un caracter
          2 Leer el caracter ingresado por el usuario
          3 Si el caracter es una letra minúscula:
          4 Si el caracter es una vocal, imprimir "Es una vocal"
          5 Si el caracter es una consonante, imprimir "Es una consonante"
          4 Si el caracter es un dígito, imprimir el caracter
          5 Repetir los pasos 1 a 4 mientras el usuario ingrese un caracter válido (letra minúscula o dígito)
       */
        char caracter=' ';
        caracter = obtenerCaracter(caracter);
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
       while (esLetraMinuscula(caracter)||esDigito(caracter)){
          if (esLetraMinuscula(caracter)) {
              if (esVocal(caracter)) {
                  System.out.println("el caracter ingresado es vocal:" + caracter);
              } else {
                  System.out.println("el caracter ingresado es consonante:" + caracter);
              }
          }else{
              System.out.println(caracter);
          }
       }
    }

    private static boolean esVocal(char caracter) {
        if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o'){
            return true;
        }
        return false;
    }

    private static char obtenerCaracter(char caracter) {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
      try{
          System.out.println("ingresame un caracter");
          caracter = entrada.readLine().charAt(0);
      }catch (Exception exc){
          System.out.println(exc);
      }
        return caracter;
    }

    private static boolean esDigito(char caracter) {
        if(caracter>='0' && caracter <='9'){
            return true;
        }
        return false;
    }

    private static boolean esLetraMinuscula(char caracter) {
        if(caracter>='a' && caracter<='z'){
          return true;
        }
        return false;
    }
}
