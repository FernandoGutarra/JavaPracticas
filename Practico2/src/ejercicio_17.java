import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
17. Escribir un programa que dado un valor ingresado por el
usuario menor que 10 y mayor a 1, muestre por pantalla una
cuenta regresiva de números desde dicho valor hasta el 0
inclusive.
 */
public class ejercicio_17 {
  public static void main(String[]args){
      int valor=0;
      int MAX=10;
      int MIN=1;
      BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
      try{
          System.out.println("ingresame un valor por consola");
          valor = Integer.valueOf(entrada.readLine());
          if(valor>=MIN && valor<=MAX){
              System.out.println("cuenta regresiva de " + valor);
              for(int i=valor;i>=0;i--){
                  System.out.println(i);
              }
          }
      }catch(Exception exc){
          System.out.println(exc);
      }
  }
}
