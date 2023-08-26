import java.util.Random;

public class ejercicio_30 {
    /*
    30. Hacer un programa que cargue un arreglo (sin orden) de
    tamaño MAX=10 con números enteros aleatorios entre 0 y 100.
    Finalmente imprima por pantalla el arreglo ordenado. Hacerlo para
    orden creciente y decreciente
    */
    final static int MAX = 10;
    final static int MINVALOR=0;
    final static int MAXVALOR=100;
    public static void main(String[]args){
      int [] arr = new int[MAX];
        cargarArregloAleatorioInt(arr);
        imprimirMatriz(arr);
        ordenarArrDeFormaCreciente(arr);
        imprimirMatriz(arr);
        ordenarArrDeFormaDecreciente(arr);
        imprimirMatriz(arr);
    }
    public static void ordenarArrDeFormaCreciente(int []arr){
        int temp=0;
        for(int i=1;i<MAX;i++){
            for(int j=0;j<MAX-1;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void ordenarArrDeFormaDecreciente(int[] arr) {
        int temp=0;
        for (int i=1;i<MAX;i++){
              for(int j=0;j<MAX-1;j++){
                   if(arr[j]<arr[j+1]){
                       temp=arr[j];
                       arr[j]=arr[j+1];
                       arr[j+1]=temp;
                   }
              }
        }
    }

    public static void cargarArregloAleatorioInt(int [] arr){
        Random r = new Random();
        for (int pos = 0; pos < MAX; pos++){
            arr[pos]=(r.nextInt(MAXVALOR-MINVALOR+1) + MINVALOR);
        }
    }
    public static void imprimirMatriz(int [] arr){
        for(int i=0;i<MAX;i++){
            System.out.print("|"+arr[i]);
        }
        System.out.println(" ");
    }
}
