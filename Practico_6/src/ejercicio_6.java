import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class ejercicio_6 {
    /*
    Hacer un programa que dada una matriz de enteros de tamaño
    5*10 que se encuentra precargada, solicite al usuario un número
    entero y elimine todas las ocurrencia de número en la matriz si
    existe. Mientras exista (en cada iteración tiene que buscar la
    posición fila y columna) tendrá que usar dicha posición para
    realizar un corrimiento a izquierda (quedarán tantas copias de la
    última posición de cada fila como cantidad de ocurrencias del
    número). Tener en cuenta, como se hizo en arreglos, si el
    elemento a eliminar es el último de alguna fila de la matriz.
    */
    final static int MAXF=5;
    final static int MAXC=10;
    final static int MAXVALOR=20;
    final static int MINVALOR=1;
    public static void main(String[]args){
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        int [][] matriz = new int[MAXF][MAXC];
        int numeroEntero=0;
        cargarMatriz(matriz);
        imprimirMatriz(matriz);
        System.out.println("");
        numeroEntero=pedirNumero(entrada);
        eliminarOcurrencias(matriz,numeroEntero);
        imprimirMatriz(matriz);
        System.out.println("");
    }
    public static int pedirNumero(BufferedReader entrada) {
        boolean esValido=false;
        int numero=-1;
        try{
            while(!esValido){
                System.out.println("Ingresar numero entero");
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
    public static void eliminarOcurrencias(int[][] matriz, int numeroEntero) {
        for(int fila=0;fila<MAXF;fila++){
            int colum=0;
            while(colum<MAXC){
                if(matriz[fila][colum]==numeroEntero){
                    corrimientoIzq(matriz[fila],colum);
                    colum--;
                }else{
                    colum++;
                }

            }
        }
    }

    public static void corrimientoIzq(int[] arr, int pos) {
        for(int i=pos;i<MAXC-1;i++){
            arr[i]=arr[i+1];
        }
        if(MAXC-1==pos){
            arr[pos]=0;
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
