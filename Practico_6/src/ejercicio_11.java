import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.instrument.ClassDefinition;

public class ejercicio_11 {
    /*
    11. Hacer un programa que dada la matriz de secuencias de
    enteros definida y precargada permita encontrar por cada fila la
    posición de inicio y fin de la secuencia cuya suma de valores sea
    mayor.
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
        System.out.println("");
        procesarMatriz(matriz);
        imprimirMatriz(matriz);
    }

    public static void procesarMatriz(int[][] matriz) {
        int iniMayor=0;
        int finMayor=0;
        int filaMayor=0;
        int sumaMayor=0;
        int sumaSecu=0;
        int ini=-1;
        int fin=-1;
        for(int fila=0;fila<MAXF;fila++){
            while (ini<MAXC){
                  ini=buscarIni(matriz[fila],fin+1);
                  if(ini<MAXC){
                      fin=buscarFin(matriz[fila],ini);
                      sumaSecu=sumarElementSecu(matriz[fila],ini,fin);
                      if(sumaSecu>sumaMayor){
                            iniMayor=ini;
                            finMayor=fin;
                            filaMayor=fila;
                            sumaMayor=sumaSecu;
                      }
                  }
            }
        }
        System.out.println("fila Mayor "+filaMayor);
        System.out.println("ini Mayor "+ iniMayor);
        System.out.println("fin Mayor "+ finMayor);
        System.out.println("suma Mayor "+ sumaMayor);
    }

    public static int sumarElementSecu(int[] arr, int ini, int fin) {
        int suma=0;
        for(int i=ini;i<=fin;i++){
              suma+=arr[i];
        }
        return suma;
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
