import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio_29 {
    /*
    29. Hacer un programa que dado un arreglo de enteros de tamaño
    10 que se encuentra precargado, solicite al usuario el ingreso de
    dos números enteros (posiciones del arreglo) y ordene de forma
    creciente el arreglo entre dos posiciones correspondientes a los
    números ingresados.
    */
    final static int MAX=10;
    public static void main(String[]args){
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = {30, 20, 10, 70, 12, 70, 80, 90, 100, 105};
        int entero1=pedirNumero(entrada);
        int entero2=pedirNumero(entrada);
        imprimirMatriz(arr);
        OrdenarArregloEntre(entero1,entero2,arr);
        imprimirMatriz(arr);
    }
    public static void OrdenarArregloEntre(int ini, int fin, int[] arr) {
        int temp=0;
        for(int i=ini;i<fin;i++){
             for(int j=ini;j<fin;j++){
                if(arr[j]>arr[j+1]){
                   temp=arr[j];
                   arr[j]=arr[j+1];
                   arr[j+1]=temp;
                }
             }
         }
    }
    public static int pedirNumero(BufferedReader entrada) {
        int entero=-1;
        boolean esValido=false;
        while(!esValido) {
            try {
                System.out.println("ingresar un numero entero entre 0 y 9 posciones del arreglo ");
                entero =Integer.valueOf(entrada.readLine());
                if(entero>=0&&entero<=9){
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
