import javax.naming.PartialResultException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.concurrent.BrokenBarrierException;

public class ejercicio_27 {
    /*
    27. Hacer un programa que dado un arreglo ordenado creciente de
    enteros de tamaño 10 que se encuentra precargado, solicite al
    usuario un número entero y lo inserte en el arreglo manteniendo
    su orden. Para ello tendrá que realizar un corrimiento a derecha
            (se pierde el último valor del arreglo) y colocar el número en el
    arreglo en la posición indicada.
    */
    final static int MAX=10;
    public static void main(String[]args){
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = {10, 30, 40, 50, 60, 70, 80, 90, 100, 105};
        imprimirMatriz(arr);
        int entero=pedirNumero(entrada);
        int posicion = buscarPosicionParInsertar(arr,entero);
        insertarNumeroEnteroEnArr(arr,posicion,entero);
        imprimirMatriz(arr);
    }

    public static void insertarNumeroEnteroEnArr(int[] arr, int posicion, int entero) {
        corrimientoDer(arr,posicion);
        arr[posicion]=entero;
    }
    public static void corrimientoDer(int [] arr,int pos){
        for(int i=MAX-1;i>pos;i--){
             arr[i]=arr[i-1];
        }
    }

    public static int buscarPosicionParInsertar(int[] arr, int entero) {
        int contador=0;
        for(int i=0;i<MAX;i++){
            if(entero>arr[i]&&i<MAX-1){
               contador++;
            }
        }
        return contador;
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
    public static void imprimirMatriz(int [] arr){
        for(int i=0;i<MAX;i++){
            System.out.print("|"+arr[i]);
        }
        System.out.println(" ");
    }
}
