import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio_10 {
    /*10.
    Hacer un programa que dado un arreglo de enteros de tamaño
    10 que se encuentra precargado, solicite al usuario un número
    entero y elimine la primera ocurrencia del número (un número
    igual) en el arreglo (si existe). Para ello tendrá que buscar la
    posición y si está, realizar un corrimiento a izquierda (queda una
    copia de la última posición del arreglo en la anteúltima posición).
    */
    final  static int MAX=10;
    public static void main(String []args){
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        imprimirMatriz(arr);
        int entero = pedirNumero(entrada);
        eliminarOcurrencia(arr,entero);
        imprimirMatriz(arr);
    }

    public static void eliminarOcurrencia(int[] arr, int entero) {
       for(int i=0;i<MAX;i++){
             if(arr[i]==entero){
                corrimientoIzq(arr,i);
             }
       }
    }

    private static void corrimientoIzq(int[] arr, int pos) {
        for(int i=pos;i<MAX-1;i++){
             arr[i]=arr[i+1];
        }
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
