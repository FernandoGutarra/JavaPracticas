import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class ejercicio_7 {

    /*
    7. Hacer un programa que dada una matriz de enteros ordenada
    creciente por filas de tamaño 4*5 que se encuentra precargada,
    solicite al usuario un número entero y una fila, y luego inserte el
    número en la matriz en la fila indicada manteniendo su orden.
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
        insertarNumeroEnFila(matriz[fila],numeroEntero);
        imprimirMatriz(matriz);
        System.out.println("");

    }

    public static void insertarNumeroEnFila(int[] arr,int numeroEntero) {
       int pos=buscarPosicionParaInsertar(arr,numeroEntero);
       if(pos>=MAXC){
             corrimientoDer(arr,pos-1,numeroEntero);
       }else{
             corrimientoDer(arr,pos,numeroEntero);
       }
    }

    public static void corrimientoDer(int[] arr, int pos,int n) {
        for(int i=MAXC-1;i>pos;i--){
             arr[i]=arr[i-1];
        }
        arr[pos]=n;
    }

    public static int buscarPosicionParaInsertar(int[] arr,int numeroEntero) {
        int pos=0;
        for(int i=0;i<MAXC;i++){
            if(numeroEntero>arr[i]){
                 pos++;
            }
        }
        return pos;
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
