import java.lang.instrument.ClassDefinition;

public class ejercicio_23 {
    /*
    23. Hacer un programa que invierta el orden de la última secuencia
    en un arreglo.
    */
    final static int MAXA=12;
    public  static void main(String[]args){
        int [] arrA = {0,3,4,5,0,3,4,5,0,1,2,3};
        imprimirMatriz(arrA);
        buscarUltimaSecu(arrA);
        imprimirMatriz(arrA);
    }

    private static void buscarUltimaSecu(int[] arrA) {
        int ini=0;
        int fin=-1;
        int ultimoIni=-1;
        int ultimoFin=-1;
        while(ini<MAXA){
             ini=buscarIni(arrA,fin+1);
             if(ini<MAXA){
                fin=buscarFin(arrA,ini);
                ultimoIni=ini;
                ultimoFin=fin;
             }
        }
       invertirUltimaSecu(arrA,ultimoFin,ultimoIni);
    }

    private static void invertirUltimaSecu(int[] arrA, int fin, int ini) {
        int temp=0;
        while(ini<fin){
           temp=arrA[ini];
           arrA[ini]=arrA[fin];
           arrA[fin]=temp;
           ini++;
           fin--;
        }
    }

    public static int buscarIni(int [] arr, int ini){
        while(ini < MAXA && arr[ini]==0){
            ini++;
        }
        return ini;
    }
    public static int buscarFin(int [] arr, int ini){
        while(ini < MAXA && arr[ini]!=0){
            ini++;
        }
        return ini-1;
    }
    public static void imprimirMatriz(int [] arr){
        for(int i = 0; i < MAXA; i++){
            System.out.print("|"+arr[i]);
        }
        System.out.println(" ");
    }
}
