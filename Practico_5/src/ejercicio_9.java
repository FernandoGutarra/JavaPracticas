import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.concurrent.BrokenBarrierException;

public class ejercicio_9 {
    /*
    9. Hacer un programa que dado un arreglo de enteros de tamaño 10
    que se encuentra cargado, solicite al usuario un número entero y
    lo agregue al principio del arreglo (posición 0). Para ello tendrá
    que realizar un corrimiento a derecha (se pierde el último valor del
    arreglo) y colocar el número en el arreglo en la posición indicada.
    */
    final  static int MAX=10;
    public static void main(String []args){
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = {1, 4, 5, 7, 5, 3, 2, 3, 4, 5};
        imprimirMatriz(arr);
        int entero = pedirNumero(entrada);
        corrimientoDerechaYinsercion(arr,0,entero);
        imprimirMatriz(arr);
    }

    public static void corrimientoDerechaYinsercion(int [] arr,int pos,int entero) {
      for(int i=MAX-1;i>pos;i--){
          arr[i]=arr[i-1];
      }
      arr[pos]=entero;
    }


    public static void imprimirMatriz(int [] arr){
        for(int i=0;i<MAX;i++){
            System.out.print("|"+arr[i]);
        }
        System.out.println(" ");
    }
    public static int pedirNumero(BufferedReader entrada) {
        int entero=0;
        boolean esValido=false;
        while(!esValido) {
            try {
                System.out.println("ingresar un numero entero");
                entero =Integer.valueOf(entrada.readLine());
                if(entero!=0){
                      esValido=true;
                }
            } catch (Exception exc) {
                System.out.println(exc);
            }
        }
        return entero;
    }


}
