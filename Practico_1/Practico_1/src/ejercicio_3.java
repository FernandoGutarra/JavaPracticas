import java.io.BufferedReader;
import java.io.InputStreamReader;
/* 3. Escribir un programa que declare una constante de tipo int y pida el
ingreso de un valor por teclado. Luego muestre el valor ingresado.
¿Qué pasa en este caso? ¿Se puede o surge algún problema?
 */
public class ejercicio_3 {
    public  static  void main(String [] args){
        final int CONST_INT;// asignale un valor
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            CONST_INT = Integer.valueOf(entrada.readLine());
            System.out.println("el valor de la constante " + CONST_INT);
        }catch (Exception exc){
            System.out.println(exc);
        }
    }
}
