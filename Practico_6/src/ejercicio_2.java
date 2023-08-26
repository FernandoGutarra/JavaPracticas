import java.util.Random;

public class ejercicio_2 {
    /*
    2. Hacer un programa que dada una matriz de enteros de tamaño
    5*10 que se encuentra precargada, obtenga la cantidad de
    números pares que tiene y la imprima.
    */
    final static int MAXF=5;
    final static int MAXC=10;
    final static int MAXVALOR=20;
    final static int MINVALOR=1;
    final static int PAR=2;
    public static void main (String[]args){
        int [][] matriz = new int[MAXF][MAXC];
        int cantNumeroPares=0;
        cargarMatriz(matriz);
        imprimirMatriz(matriz);
        System.out.println("");
        cantNumeroPares=buscarCantPares(matriz,cantNumeroPares);
        if(cantNumeroPares!=0){
            System.out.println("cantidad de Numero Pares Encontrados =" + cantNumeroPares);
        }else{
            System.out.println("");
        }
    }

    public static int buscarCantPares(int[][] matriz,int cantPares) {
        for(int fila=0;fila<MAXF;fila++){
            for(int colum=0;colum<MAXC;colum++){
                 if(matriz[fila][colum]%PAR==0){
                      cantPares++;
                 }
            }
        }
        return cantPares;
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
