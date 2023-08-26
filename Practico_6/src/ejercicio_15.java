import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio_15 {
    /*
    15. Hacer un programa que dada la matriz de secuencias de
    caracteres definida y precargada elimine todas las secuencias que
    tienen orden descendente entre sus elementos.
     */
    final static int SECUENCIA=1;
    final static int MAXF=4;
    final static int MAXC=20;
    public static void main(String [] args){
        int [][]matriz= {
                {0,2,3,4,5,0,7,6,8,1,0,8,4,2,1,0,4,5,6,0},
                {0,8,4,5,0,0,0,0,0,2,3,4,0,7,0,8,0,0,6,0},
                {0,2,3,4,5,0,0,0,0,1,0,3,0,3,3,0,4,5,0,0},
                {0,2,0,0,5,0,7,6,8,1,4,3,0,0,3,0,4,5,6,0}
        };
        imprimirMatriz(matriz);
        procesarMatriz(matriz);
        System.out.println("");
        imprimirMatriz(matriz);
    }
    public static void procesarMatriz(int [][]matriz){
       for (int fila=0;fila<MAXF;fila++){
             int ini=-1;
             int fin=-1;
             while(ini<MAXC){
                 ini=buscarIni(matriz[fila],fin+1);
                  if(ini<MAXC){
                      fin=buscarFin(matriz[fila],ini);
                      int tamanioSecu=fin-ini+1;
                      if(tamanioSecu>SECUENCIA && secuenciaOrdenDecendente(matriz[fila],ini,fin)){
                           eliminarSecu(matriz[fila],tamanioSecu,ini);
                      }

                  }
             }
       }
    }
    public static void eliminarSecu(int [] arr ,int tamanioSecu,int ini){
        for(int i=0;i<tamanioSecu;i++){
              corrimientoIzq(arr,ini);
        }
    }
    private static boolean secuenciaOrdenDecendente(int[] arr, int ini, int fin) {
        boolean secuDecendente=true;
        for(int i=ini;i<=fin-1;i++){
                if(arr[i]<arr[i+1]){
                    secuDecendente=false;
                }
        }
        return secuDecendente;
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
}
