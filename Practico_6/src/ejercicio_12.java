public class ejercicio_12 {
    /*
        12. Hacer un programa que dada la matriz de secuencias de
        caracteres definida y precargada, permita encontrar por cada fila
        la posición de inicio y fin de la anteúltima secuencia (considerar
        comenzar a buscarla a partir de la última posición de la fila).
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
    }
    public static void procesarMatriz(int [][]matriz){
           int iniAnteUltimo=0;
           int finAnteUltimo=0;
           for(int fila=0;fila<MAXF;fila++){
               int ini=-1;
               int fin=-1;
              while(ini<MAXC){
                  ini=buscarIni(matriz[fila],fin+1);
                   if(ini<MAXC){
                       fin=buscarFin(matriz[fila],ini);
                       if(buscarIni(matriz[fila],fin+1)<MAXC){
                           iniAnteUltimo=ini;
                           finAnteUltimo=fin;
                       }
                   }
              }
               System.out.println("fila"+fila);
               System.out.println("ini anteultimo "+iniAnteUltimo);
               System.out.println("fin anteultimo "+finAnteUltimo);
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
