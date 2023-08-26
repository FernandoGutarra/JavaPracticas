import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class ejercicio_4 {
    /*
    4. Hacer un programa que dada una matriz de enteros de tamaño
¨   5*10 que se encuentra precargada, solicite al usuario un número
    entero y una posición fila, columna. Con estos datos tendrá que
    realizar un corrimiento a derecha (se pierde el último valor en
    dicha fila) y colocar el número en la matriz en la posición fila,
    columna indicada.
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
        int numero=0;
        cargarMatriz(matriz);
        imprimirMatriz(matriz);
        System.out.println("");
        numero = pedirNumero(entrada);
        posicionFila=pedirNumeroFilaColum("fila del 0 al ",MAXF,entrada);
        posicionColumna=pedirNumeroFilaColum("colum del 0 al ",MAXC,entrada);
        corrimientoDerYInsertarNumeroEntero(matriz[posicionFila],posicionColumna,numero);
        imprimirMatriz(matriz);
        System.out.println("");

    }

    public static void corrimientoDerYInsertarNumeroEntero(int[] arr, int pos, int numero) {
        for(int i=MAXC-1;i>pos;i--){
                arr[i]=arr[i-1];
        }
        arr[pos]=numero;
    }


    public static int pedirNumero(BufferedReader entrada) {
        boolean esValido=false;
        int numero=-1;
        try{
            while(!esValido){
                System.out.println("Ingresar numero");
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
    public static int pedirNumeroFilaColum(String frase, int maxc, BufferedReader entrada) {
        boolean esValido=false;
        int numero=-1;
        try{
            while(!esValido){
                System.out.println("Ingresar numero de"+frase+(maxc-1));
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
