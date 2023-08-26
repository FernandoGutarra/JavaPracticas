import java.awt.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio_13 {
            /*
            13. Hacer un programa que inserte un elemento en un arreglo
            (ordenado decrecientemente) de tamaño MAX=10.
            */
            final static int MAX=10;
    public static void main(String[]args){
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        int [] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 80};
        imprimirMatriz(arr);
        reordenarDecrecientemente(arr);
        imprimirMatriz(arr);
        int numero = pedirNumero(entrada);
        insetarNumeroDecreciente(arr,numero);
        imprimirMatriz(arr);
    }

    public static void insetarNumeroDecreciente(int[] arr, int numero) {
       int i=0;
       int insercion=0;
       boolean esValido=false;
        while (i<MAX-1 && !esValido){
            if(arr[i]<numero ){
                corrimientoDer(arr,i);
                insercion=i;
                esValido=true;
            }else if(arr[i]==numero){
                corrimientoDer(arr,i);
                insercion=i;
                esValido=true;
            }else {
                i++;
            }
        }
        arr[insercion]=numero;
    }
    private static void corrimientoDer(int[] arr,int pos) {
        for (int i=MAX-1;i>pos;i--){
            arr[i]=arr[i-1];
        }
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
    private static void reordenarDecrecientemente(int[] arr) {
        int temp=0;
        for(int i=1;i<MAX;i++){
           for(int j=0;j<MAX-1;j++){
               if(arr[j]<arr[j+1]){
                   temp=arr[j+1];
                   arr[j+1]=arr[j];
                   arr[j]=temp;
             }
           }
        }
    }

    public static void imprimirMatriz(int [] arr){
        for(int i=0;i<MAX;i++){
            System.out.print("|"+arr[i]);
        }
        System.out.println(" ");
    }
}
