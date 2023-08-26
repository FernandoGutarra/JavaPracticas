import javax.print.DocFlavor;
import java.lang.instrument.ClassDefinition;

public class ejercicio_7 {
    /*
    7. Implementar un método que realice un corrimiento a derecha en
    un arreglo ordenado de tamaño MAX=10 a partir de una posición.
    */
    final  static int MAX=10;
    public static void main(String[]args) {
        int[] arr = {1, 4, 5, 7, 5, 3, 2, 3, 4, 5};
         imprimirMatriz(arr);
         corrimientoDerecha1(arr,1);
         imprimirMatriz(arr);
    }

    private static void corrimientoDerecha1(int[] arr,int pos) {
        for (int i=MAX-1;i>pos;i--){
             arr[i]=arr[i-1];
        }
    }

     public static void corrimientoDerecha2(int[]arr,int pos){
         int i=MAX-1;
        while(i > pos){
            arr[i] = arr[i-1];
            i--;
        }
     }
    public static void imprimirMatriz(int [] arr){
        for(int i=0;i<MAX;i++){
            System.out.print("|"+arr[i]);
        }
        System.out.println(" ");
    }

}
