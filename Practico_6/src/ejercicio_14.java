import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.instrument.ClassDefinition;

public class ejercicio_14 {
    /*
    14. Hacer un programa que dada la matriz de secuencias de
    caracteres definida y precargada, elimine de cada fila todas las
    ocurrencias de una secuencia patrón dada por un arreglo de
    caracteres de tamaño igual al tamaño de columnas de la matriz
    (sólo tiene esa secuencia con separadores al inicio y al final). Al
    eliminar en cada fila se pierden los valores haciendo los
    corrimientos.
   */
    final static int MAXF=4;
    final static int MAXC=20;
    final static int MAXP=5;
    public static void main(String [] args){
        int [][]matriz= {
                {0,2,3,4,5,0,7,6,8,1,0,3,3,3,3,0,4,5,6,0},
                {0,2,3,4,0,0,0,0,0,2,3,4,0,7,0,8,0,0,6,0},
                {0,2,3,4,5,0,0,0,0,1,0,3,0,3,3,0,4,5,0,0},
                {0,2,0,0,5,0,7,6,8,1,4,3,0,0,3,0,4,5,6,0}
        };
        int [] secuPatron = {0,2,3,4,0};
        imprimirMatriz(matriz);
        procesarMatrizySecuPatron(matriz,secuPatron);
        System.out.println("");
        imprimirMatriz(matriz);
    }
    public static void  procesarMatrizySecuPatron(int [][]matriz,int[]arr){
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        int ini=-1;
        int fin=-1;
        while(ini<MAXP){
            ini=buscarIni(arr,fin+1,MAXP);
            if(ini<MAXP){
               fin=buscarFin(arr,ini,MAXP);
               buscarSecuPatronEnMatriz(arr,ini,fin,matriz);
            }
        }
    }

    public static void buscarSecuPatronEnMatriz(int[] arr, int iniS, int finS, int[][] matriz) {
        int tamanioSecuPatron=finS-iniS+1;
        for(int fila=0;fila<MAXF;fila++){
            int ini=-1;
            int fin=-1;
            while(ini<MAXC){
                ini=buscarIni(matriz[fila],fin+1,MAXC);
                if(ini<MAXC){
                    fin=buscarFin(matriz[fila],ini,MAXC);
                    int tamanioSecu=fin-ini+1;
                    if(tamanioSecu==tamanioSecuPatron && sonIguales(arr,iniS,finS,matriz[fila],ini,fin)){
                          eliminarSecu(matriz[fila],ini,tamanioSecu);
                          fin-=tamanioSecu;
                    }
                }
            }
        }

    }

    public static boolean sonIguales(int[] arrS, int iniS, int finS, int[] arr, int ini, int fin) {
        boolean Iguales=true;
        while(iniS<=finS && ini<=fin){
            if(arrS[iniS]!=arr[ini]){
                  Iguales=false;
            }
            iniS++;
            ini++;
        }
        return Iguales;
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
    public static int buscarIni(int[] arr, int pos,int max) {
        while (pos<max && arr[pos]==0){
            pos++;
        }
        return pos;
    }
    public static int buscarFin(int[] arr, int pos,int max){
        while (pos<max && arr[pos]!=0){
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
