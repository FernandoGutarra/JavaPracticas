import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.concurrent.ForkJoinTask;

public class ejercicio_3 {
    /*
    3. Hacer un programa que dada una matriz de enteros de tamaño
    5*10 que se encuentra precargada, solicite al usuario una posición
    fila, columna y realice un corrimiento a izquierda.
    */
    final static int MAXF=5;
    final static int MAXC=10;
    final static int MAXVALOR=20;
    final static int MINVALOR=1;
    public static void main(String[]args){
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        int [][] matriz = new int[MAXF][MAXC];
        int posicionFila=-1;
        int posicionColumna=-1;
        cargarMatriz(matriz);
        System.out.println("");
        imprimirMatriz(matriz);
        posicionFila=pedirNumero("fila del 0 al ",MAXF,entrada);
        posicionColumna=pedirNumero("colum del 0 al ",MAXC,entrada);
        realizarCorrimientoIzq(matriz[posicionFila],posicionColumna);
        System.out.println("");
        imprimirMatriz(matriz);
    }

    public static void realizarCorrimientoIzq(int[] arr, int pos) {
          for(int i=pos;i<MAXC-1;i++){
                 arr[i]=arr[i+1];
          }
    }

    public static int pedirNumero(String frase, int maxc, BufferedReader entrada) {
        boolean esValido=false;
        int numero=-1;
        try{
            while(!esValido){
                System.out.println("Ingresar numero de "+frase+(maxc-1));
                numero = Integer.parseInt(entrada.readLine());
                if(numero>=0 && numero<=MAXC-1){
                     esValido=true;
                }
            }
        }catch(Exception exc){
            System.out.println(exc);
        }

        return numero;
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
