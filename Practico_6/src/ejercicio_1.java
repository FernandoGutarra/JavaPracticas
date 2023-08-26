import java.util.Random;

public class ejercicio_1 {
    /*
  1. Hacer un programa que dada una matriz de enteros de tamaño
  5*10 que se encuentra precargada, invierta el orden del contenido
  por fila. Este intercambio no se debe realizar de manera explícita,
  hay que hacer un método que incluya una iteración de
  intercambio.
  */
    final static int MAXF=5;
    final static int MAXC=10;
    final static int MAXVALOR=20;
    final static int MINVALOR=1;
    public static void main(String[]args){
        int [][]matriz = new int[MAXF][MAXC];
          cargarMatriz(matriz);
          imprimirMatriz(matriz);
          System.out.println("");
        for(int i=0;i<MAXF;i++){
          invertirFilaMatriz(matriz[i]);
        }
        imprimirMatriz(matriz);
    }
    public static void invertirFilaMatriz(int[] arr) {
        int fin=MAXC-1;
        int aux=0;
        for(int i=0;i<fin;i++){
            aux = arr[i];
            arr[i]=arr[fin];
            arr[fin]=aux;
            fin--;
        }
    }
    public static void cargarMatriz(int[][] matriz) {
        for (int i=0;i<MAXF;i++) {
            cargarFilaMatriz(matriz[i]);
        }
    }

    public static void cargarFilaMatriz(int[] arr) {
        Random r = new Random();
        for(int pos=0;pos<MAXC;pos++){
            arr[pos] = r.nextInt((MAXVALOR-MINVALOR+1) + MINVALOR);
        }
    }

    public static void imprimirMatriz(int[][]matriz){
        for(int i=0;i<MAXF;i++){
            recorrerColumns(matriz[i]);
        }
    }

    public static void recorrerColumns(int [] arr) {
        for(int i=0;i<MAXC;i++){
            System.out.print("|"+arr[i]);
        }
        System.out.println("");
    }
}
