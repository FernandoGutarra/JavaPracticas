import java.lang.instrument.ClassDefinition;

public class ejercicio_21 {
    /*
    21. Hacer un programa que elimine de un arreglo todas las
    secuencias que tienen orden descendente entre sus elementos.
    */
    final static int MAXS=5;
    final static int MAX=13;
    public static void main(String[]args){
        int [] arr ={0,3,2,1,0,8,6,5,0,2,3,4,0};
        int tamanioSecu=0;
        int ini=0;
        int fin=-1;
        imprimirMatriz(arr);
        while(ini<MAX){
            ini=buscarIni(arr,fin+1,MAX);
            if(ini<MAX){
                fin=buscarFin(arr,ini,MAX);
                tamanioSecu=fin-ini+1;
                if(secuDecente(arr,ini,fin)){
                    eliminarSecuDecendente(arr,tamanioSecu,ini);
                    fin-=tamanioSecu;
                }
            }
        }
        imprimirMatriz(arr);
    }

    public static boolean secuDecente(int[] arr, int ini, int fin) {
        boolean ordenDecendente=true;
        for(int i=ini;i<fin-1;i++){
             if(arr[i]<arr[i+1]){
                ordenDecendente=false;
             }
         }
        return ordenDecendente;
    }

    public static void eliminarSecuDecendente(int[] arr, int tamanioSecu,int pos) {
        for(int i=0;i<tamanioSecu;i++){
            corrimientoIzq(arr,pos);
        }
    }
    public static void corrimientoIzq(int [] arr,int pos) {
        for (int i = pos; i < MAX - 1; i++) {
            arr[i] = arr[i + 1];
        }
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
        for(int i=0;i<MAX;i++){
            System.out.print("|"+arr[i]);
        }
        System.out.println(" ");
    }
}
