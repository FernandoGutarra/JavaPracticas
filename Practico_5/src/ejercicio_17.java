import java.util.concurrent.BrokenBarrierException;

public class ejercicio_17 {
    /*
    17. Hacer un programa que devuelva la posición de inicio y fin de la
    anteúltima secuencia de números distintos de ceros.
    */
    final static int MAX=10;
    public static void main(String[]args) {
        int[] arr = {0, 2, 0, 4, 0, 3, 4, 5, 0, 0};
        int ini = 0;
        int fin = -1;
        int anteUltimoIni = -1;
        int anteUltimoFin = -1;
        while (ini < MAX) {
            ini = buscarIni(arr, fin + 1);
            if (ini < MAX) {
                fin = buscarFin(arr, ini);
                if (buscarIni(arr, fin + 1) < MAX) {
                    anteUltimoIni = ini;
                    anteUltimoFin = fin;
                }
            }
        }
        System.out.println("anteUltimoIni = "+anteUltimoIni);
        System.out.println("anteUltimoFin = "+anteUltimoFin);
    }
    public static int buscarIni(int [] arr, int ini){
        while(ini<MAX && arr[ini]==0){
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
}
