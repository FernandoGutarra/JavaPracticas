import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio_13 {
    /*
    13. Hacer un programa que dada la matriz de secuencias de
    enteros definida y precargada, y un número entero ingresado por
    el usuario, elimine de cada fila las secuencias de tamaño igual al
    número ingresado.
     */
    final static int MAXF=4;
    final static int MAXC=20;
    public static void main(String [] args){
        int [][]matriz= {
                {0,2,3,4,5,0,7,6,8,1,0,3,3,3,3,0,4,5,6,0},
                {0,2,3,0,5,0,7,6,8,1,0,3,0,3,0,0,4,5,6,0},
                {0,2,3,4,5,0,0,0,0,1,0,3,0,3,3,0,4,5,0,0},
                {0,2,0,0,5,0,7,6,8,1,4,3,0,0,3,0,4,5,6,0}
        };
        imprimirMatriz(matriz);
        procesarMatriz(matriz);
        System.out.println("");
        imprimirMatriz(matriz);
    }
    public static void procesarMatriz(int [][]matriz){
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        int iniAnteUltimo=0;
        int finAnteUltimo=0;
        int numeroEntero=pedirNumero(entrada);
        for(int fila=0;fila<MAXF;fila++){
            int ini=-1;
            int fin=-1;
            while(ini<MAXC){
                ini=buscarIni(matriz[fila],fin+1);
                if(ini<MAXC){
                    fin=buscarFin(matriz[fila],ini);
                    int tamanioSecu=fin-ini+1;
                    if(numeroEntero==tamanioSecu){
                        eliminarSecu(matriz[fila],ini,tamanioSecu);
                        fin-=tamanioSecu;
                    }
                }
            }
        }
    }

    public static void eliminarSecu(int[] arr, int ini, int tamanioSecu) {
        for (int i=0;i<tamanioSecu;i++){
           corrimientoIzq(arr,ini);
        }
    }
    public static void corrimientoIzq(int []arr,int ini){
          for(int i=ini;i<MAXC-1;i++){
               arr[i]=arr[i+1];
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
    public static int buscarIni(int[] arr, int pos) {
        while (pos<MAXC && arr[pos]==0){
            pos++;
        }
        return pos;
    }
    public static int buscarFin(int[] arr, int pos){
        while (pos<MAXC && arr[pos]!=0){
            pos++;
        }
        return pos-1;
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
}
