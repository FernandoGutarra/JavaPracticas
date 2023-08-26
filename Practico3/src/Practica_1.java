import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
1.
 Escribir un diseño de programa que mientras que el usuario
 ingrese un número distinto de 0, pida ingresar otro número y lo
 imprima.
 */
public class Practica_1 {
  public static void main(String[]args){
   boolean nose = esMayor(1,7);
    System.out.println(nose);
  }
  public static boolean esMayor(int x, int y) {
    return x > y;
  }
}
