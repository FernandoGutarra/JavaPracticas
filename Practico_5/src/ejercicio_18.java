public class ejercicio_18 {
    /*
    18. Hacer un programa que devuelva la posición de inicio y de fin
    de la secuencia de mayor tamaño.
    */
    final static int MAX=10;
    public static void main(String[]args) {
        int[] arr = {0, 2, 0, 4, 0, 3, 4, 5, 0, 0};
        int ini = 0;
        int fin = -1;
        int iniMayorTamanio = -1;
        int finMayorTamanio = -1;
        int tamanioSecu=0;
        int tamanioMayorSecu=0;
        while (ini < MAX) {
            ini = buscarIni(arr, fin + 1);
            if (ini < MAX) {
                fin = buscarFin(arr, ini);
                tamanioSecu=fin-ini+1;
                if(tamanioSecu>tamanioMayorSecu){
                    tamanioMayorSecu=tamanioSecu;
                    iniMayorTamanio=ini;
                    finMayorTamanio=fin;
                }
            }
        }
        System.out.println("el ini de la secu de mayor tamaño es de "+iniMayorTamanio);
        System.out.println("el fin de la secu de mayor tamaño es de "+finMayorTamanio);
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
