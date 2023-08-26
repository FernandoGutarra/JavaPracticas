import java.lang.instrument.ClassDefinition;

public class ejercicio_20 {
    /*
    20. Hacer un programa que elimine de un arreglo todas las
    ocurrencias de una secuencia patrón dada por otro arreglo.
    */
    final static int MAXS = 5;
    final static int MAX = 13;

    public static void main(String[] args) {
        int[] secuPatron = {0, 2, 3, 4, 0};
        int[] arr = {0, 2, 3, 4, 0, 3, 4, 5, 0, 2, 3, 4, 0};
        int tamanioSecuPatron = 0;
        int ini = 0;
        int fin = -1;
        imprimirArr(arr,MAX);
        System.out.println("");
        imprimirArr(secuPatron,MAXS);
        System.out.println("");
        ini=buscarIni(secuPatron,fin+1,MAXS);
        if(ini<MAXS){
           fin=buscarFin(secuPatron,ini,MAXS);
           tamanioSecuPatron=fin-ini+1;
           buscarEliminarSecuPatronDeArr(ini,fin,tamanioSecuPatron,secuPatron,arr);
        }
        imprimirArr(arr,MAX);
        System.out.println("");
    }
    private static void buscarEliminarSecuPatronDeArr(int ini, int fin, int tamanioSecuPatron, int[] secuPatron, int[] arr) {
        int iniArr=0;
        int finArr=-1;
        int tamanioSecu=0;
        while(iniArr<MAX){
              iniArr=buscarIni(arr,finArr+1,MAX);
              if(iniArr<MAX){
                finArr=buscarFin(arr,iniArr,MAX);
                  tamanioSecu=finArr-iniArr+1;
                 if(tamanioSecuPatron==tamanioSecu && compararSecu(ini,fin,secuPatron,iniArr,finArr,arr)){
                       eliminarSecuPatronDeSecu(arr,iniArr,tamanioSecu);
                       finArr=finArr-tamanioSecu;
                 }
              }
        }
    }
    public static void eliminarSecuPatronDeSecu(int[] arr, int ini, int tamanioSecu) {
        for(int i=0;i<tamanioSecu;i++){
               corrimientoIzq(arr,ini);
        }
    }
   public static void corrimientoIzq(int []arr,int ini){
      for(int i=ini;i<MAX-1;i++){
              arr[i]=arr[i+1];
      }
   }
    public static boolean compararSecu(int ini, int fin, int[] secuPatron, int iniArr, int finArr, int[] arr) {
          boolean secusIguales =true;
          while(ini<=fin&&iniArr<=finArr){
                  if(arr[iniArr]!=secuPatron[ini]){
                         secusIguales=false;
                  }
                  ini++;
                  iniArr++;
          }
          return secusIguales;
    }

    public static int buscarIni ( int[] arr, int ini, int max){
            while (ini < max && arr[ini] == 0) {
                ini++;
            }
            return ini;
        }
        public static int buscarFin ( int[] arr, int ini, int max){
            while (ini < max && arr[ini] != 0) {
                ini++;
            }
            return ini - 1;
        }
        public static void imprimirArr ( int[] arr, int max){
            for (int i = 0; i < max; i++) {
                System.out.print("|" + arr[i]);
            }
            System.out.println(" ");
        }
}