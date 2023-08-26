import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class ejercicio_8 {
    /*
    8. Hacer un programa que dada una matriz de enteros ordenada
       creciente por filas de tamaño 4*5 que se encuentra precargada,
       solicite al usuario un número entero y una fila, y elimine la primera
       ocurrencia de número en la fila indicada (un número igual) si
       existe.
    */
    final static int MAXF=4;
    final static int MAXC=5;
    final static int MAXVALOR=20;
    final static int MINVALOR=1;
    public static void main(String[]arg){
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        int [][] matriz = new int[MAXF][MAXC];
        int numeroEntero=0;
        int fila=0;
        cargarMatriz(matriz);
        imprimirMatriz(matriz);
        System.out.println("");
        reodernarMatriz(matriz);
        imprimirMatriz(matriz);
        System.out.println("");
        numeroEntero=pedirNumero(entrada,"Ingresar numero entero");
        fila=pedirNumero(entrada,"Ingresar numero de fila");
        if(eliminarPrimeraOcurencia(matriz[fila],numeroEntero)){
            System.err.println("se elimino la ocurrencia");
        }else{
            System.out.println("no se puede eliminar la ocurencia");
        }
        imprimirMatriz(matriz);
        System.out.println("");

    }

    public static boolean eliminarPrimeraOcurencia(int[] arr,int n) {
        int pos=0;
        boolean ocurenciaEncontrada=false;
        while(pos<MAXC && !ocurenciaEncontrada){
               if(arr[pos]==n && pos<MAXC-1){
                 corrimientoIzq(arr,pos);
                 ocurenciaEncontrada=true;
               }
               pos++;
        }
        return ocurenciaEncontrada;
    }

    public static void corrimientoIzq(int[] arr, int pos) {
        for(int i=pos;i<MAXC-1;i++){
            arr[i]=arr[i+1];
        }
    }
    public static int pedirNumero(BufferedReader entrada,String frase) {
        boolean esValido=false;
        int numero=-1;
        try{
            while(!esValido){
                System.out.println(frase);
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

    public static void reodernarMatriz(int[][] matriz) {
        for(int i=0;i<MAXF;i++){
            reordenarFilaDeFormaC(matriz[i]);
        }
    }

    public static void reordenarFilaDeFormaC(int[] arr) {
        int temp=0;
        for(int i=0;i<MAXC;i++){
            for(int j=0;j<MAXC-1;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
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
