public class ejercicio_22 {
    /*
    22. Hacer un programa que reemplace de un arreglo A todas las
    ocurrencias de una secuencia patrón dada en un arreglo P, por la
    secuencia contenida en el arreglo R de igual tamaño.
    */
    final static int MAXA=12;
    final static int MAXPANDR=5;
    public  static void main(String[]args){
        int [] arrA = {0,3,4,5,0,3,4,5,0,1,2,3};
        int [] arrP = {0,3,4,5,0};
        int [] arrR = {0,2,3,4,0};
        imprimirMatriz(arrA);
        remplazarSecuenciasDeArrA(arrA,arrP,arrR);
        imprimirMatriz(arrA);
    }

    public static void remplazarSecuenciasDeArrA(int[] arrA, int[] arrP, int[] arrR) {
       int ini=0;
       int fin=-1;
       while(ini<MAXA){
           ini=buscarIni(arrA,fin+1,MAXA);
           if(ini<MAXA){
              fin=buscarFin(arrA,ini,MAXA);
              int tamanio=fin-ini+1;
              if(buscarSecuArrP(arrA,ini,fin,tamanio,arrP)){
                   buscaYRemplazarSecuAPorR(arrA,ini,fin,arrR);
              }
           }
       }
    }

    public static void  buscaYRemplazarSecuAPorR(int[] arrA, int ini, int fin, int[] arrR) {
       int iniR=0;
       int finR=-1;
       while(iniR<MAXPANDR){
            iniR=buscarIni(arrR,finR+1,MAXPANDR);
            if(iniR<MAXA){
                finR=buscarFin(arrR,iniR,MAXPANDR);
                remplazarSecuAporSecuR(arrR,iniR,finR,arrA,ini,fin);
            }
       }
    }

    public static void remplazarSecuAporSecuR(int[] arrR, int iniR, int finR, int[] arrA, int ini, int fin) {
       while(ini<=fin&&iniR<=finR){
           arrA[ini]=arrR[iniR];
           ini++;
           iniR++;
       }
    }

    public static boolean buscarSecuArrP(int[] arrA, int ini, int fin, int tamanioSecuA,int[]arrP) {
           int iniP=0;
           int finP=-1;
           boolean esIgual=false;
           while(iniP<MAXPANDR){
               iniP=buscarIni(arrP,finP+1,MAXPANDR);
               if(iniP<MAXPANDR){
                   finP=buscarFin(arrP,iniP,MAXPANDR);
                   int tamanioSecuP=finP-iniP+1;
                   if(tamanioSecuA==tamanioSecuP && compararSecuAconP(arrA,ini,fin,arrP,iniP,finP,tamanioSecuA)){
                       esIgual=true;
                   }
               }
           }
        return esIgual;
    }

    public static boolean compararSecuAconP(int[] arrA, int ini, int fin, int[] arrP, int iniP, int finP, int tamanioSecuA) {
        boolean sonSecusIguales=true;
        while(ini <= fin && iniP<= finP){
           if(arrA[ini]!=arrP[iniP]){
              sonSecusIguales=false;
           }
           ini++;
           iniP++;
        }
        return sonSecusIguales;
    }
    public static int buscarIni(int [] arr, int ini,int max){
        while(ini<max && arr[ini]==0){
            ini++;
        }
        return ini;
    }
    public static int buscarFin(int [] arr, int ini,int max){
        while(ini < max && arr[ini]!=0){
            ini++;
        }
        return ini-1;
    }
    public static void imprimirMatriz(int [] arr){
        for(int i=0;i<MAXA;i++){
            System.out.print("|"+arr[i]);
        }
        System.out.println(" ");
    }
}
