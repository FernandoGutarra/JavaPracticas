import java.lang.instrument.ClassDefinition;

public class ejercicio_15 {
    /*
    15. Hacer un programa que devuelva la posición de inicio y fin de la
    primera secuencia de números distinta de ceros.
    */
    final static int MAX=10;
    public static void main(String[]args){
           int [] arr = {0,2,3,4,0,3,4,5,0,0};
           int ini=0;
           int fin=-1;
          ini = buscarIni(arr,fin+1);
          if(ini<MAX){
             fin = buscarFin(arr,ini);
          }
        System.out.println("inicio ="+ini);
        System.out.println("fin ="+fin);
    }

    private static int buscarFin(int[] arr, int ini) {
       while( ini < MAX && arr[ini]!=0 ){
          ini++;
       }
       return ini-1;
    }

    private static int buscarIni(int[] arr, int ini) {
      while( ini < MAX && arr[ini] == 0 ) {
             ini++;
      }
      return ini;
    }
}
