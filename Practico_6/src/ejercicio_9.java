import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class ejercicio_9 {
    /*
    Hacer un programa que dada una matriz de enteros de tamaño
    4*5 que se encuentra precargada, solicite al usuario el ingreso de
    una fila y dos números enteros (columnas de la matriz), y ordene
    de forma creciente la matriz en la fila indicada entre las dos
    posiciones columnas ingresadas.
    */
    final static int MAXF=4;
    final static int MAXC=5;
    final static int MAXVALOR=20;
    final static int MINVALOR=1;
    public static void main(String[]arg){
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        int [][] matriz = {{7,14,20,7,18},
        {6,1,8,18,20},
        {10,0,7,16,11},
        {3,16,2,13,13}};

        imprimirMatriz(matriz);
        System.out.println("");
        int fila=pedirNumero(entrada);
        int numeroEntero=pedirNumero(entrada);
        int numeroEntero2=pedirNumero(entrada);
        if(numeroEntero>numeroEntero2){
              reordenarMatrizFila(matriz[fila],numeroEntero2,numeroEntero);
        } else if (numeroEntero<numeroEntero2) {
              reordenarMatrizFila(matriz[fila],numeroEntero,numeroEntero2);
        }else{
            System.out.println("nose puede reordenar por que el las columnas ingresadas son las mismas seria en vano");
        }
        imprimirMatriz(matriz);
        System.out.println("");
    }
    public static int pedirNumero(BufferedReader entrada) {
        boolean esValido=false;
        int numero=-1;
        try{
            while(!esValido){
                System.out.println("ingresar numero entero entre 0 y "+(MAXC-1));
                numero = Integer.parseInt(entrada.readLine());
                if(numero>=0){
                    esValido=true;
                }
            }
        }catch(Exception exc){
            System.out.println(exc);
        }

        return numero;
    }

    public static void reordenarMatrizFila(int[] arr, int ini, int fin) {
               for(int i=ini;i<fin;i++){
                   int aux=0;
                     for(int j=ini;j<=fin-1;j++){
                          if(arr[j]>arr[j+1]){
                              aux=arr[j];
                              arr[j]=arr[j+1];
                              arr[j+1]=aux;
                          }
                     }
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
