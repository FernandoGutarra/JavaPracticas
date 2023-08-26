public class ejercicio_16 {
    /*
     16. Hacer un programa que devuelva la posición de inicio y fin de la
     secuencia de números distintos de ceros cuya suma del contenido
     sea mayor.
    */
    final static int MAX=10;
    public static void main(String[]args){
        int [] arr = {0,0,0,0,0,3,0,0,0,0};
        int ini=0;
        int fin=-1;
        int sumaContenido=0;
        int sumaMayor=0;
        int iniMayor=-1;
        int finMayor=-1;
        while(ini<MAX) {
            ini = buscarIni(arr, fin + 1);
            if (ini < MAX) {
                fin = buscarFin(arr, ini);
                sumaContenido=sumarSecuencia(arr,ini,fin);
                if(sumaContenido>sumaMayor){
                    sumaMayor=sumaContenido;
                    iniMayor = ini;
                    finMayor = fin;
                }
            }
        }
        if(iniMayor==-1){
            System.out.println("nose encontro secuencia Mayor");
        }else{
            System.out.println("el la secuencia mayor comienza en = "+iniMayor+" y termina en "+finMayor);
        }
    }

    private static int sumarSecuencia(int[] arr, int ini, int fin) {
        int suma=0;
        for(int i=ini;i<=fin;i++){
             suma+=arr[i];
        }
        return  suma;
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
