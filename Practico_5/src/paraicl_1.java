import java.lang.instrument.ClassDefinition;

public class paraicl_1 {
     /*
      arreglo = 0,2,2,2,0,1,0,3,3,0
      arr =     0,-3,2,0,1,0,3,3,0,0
                0,0,0,0,0,0,0
     */
    final static int REPETIDOS=1;
    final static int MAX=15;
    final static int PIXELNEGRO=0;

    public static void main(String[]args){
        int ini=0;
        int fin=-1;
        int [] arr = { 0,2,2,2,2,2,2,0,3,3,3,0,0,0,0};
        imprimirMatriz(arr);
        System.out.println("");
        while(ini<MAX){
           ini=buscarIni(arr,fin+1);
           if(ini<MAX){
                 fin=buscarFin(arr,ini);
                int tamanioSecu=fin-ini+1;
               int valorNegado=0-tamanioSecu;
               if(tamanioSecu>REPETIDOS && elementosIgualesSecu(arr,ini,fin)&&tamanioSecu==2){
                    arr[ini]=valorNegado;
               }else if (tamanioSecu>REPETIDOS && elementosIgualesSecu(arr,ini,fin)&&tamanioSecu!=2){
                   int aux=tamanioSecu;
                   while(tamanioSecu!=2){
                       corrimientoIzd(arr,ini);
                       tamanioSecu--;
                   }
                   arr[ini]=valorNegado;
                   fin=(fin-aux)+1;
               }
           }
        }
        imprimirMatriz(arr);
    }

    private static boolean elementosIgualesSecu(int[] arr, int ini, int fin) {
      boolean sonIguales=true;
      for(int i=ini;i<fin-1;i++){
           if(arr[i]!=arr[i+1]){
               sonIguales=false;
           }
      }
      return sonIguales;
    }

    private static void corrimientoIzd(int[] arr, int ini) {
        for(int i =ini;i<MAX-1;i++){
            arr[i]=arr[i+1];
        }
    }
    public static int buscarIni(int [] arr, int ini){
        while(ini < MAX && arr[ini]==0){
            ini++;
        }
        return ini;
    }
    public static int buscarFin(int [] arr, int ini){
        while(ini < MAX && arr[ini]!=0){
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
