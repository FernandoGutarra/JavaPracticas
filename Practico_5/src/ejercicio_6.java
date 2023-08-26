public class ejercicio_6 {
    /*
    6. Hacer un programa que dado un arreglo de enteros de tamaño 10
    que se encuentra cargado, obtenga la cantidad de números pares
    que tiene y la imprima.
    */
    final static int MAX=10;
    final static int PAR=2;
    public static void main(String[]args){
       int [] arr = {1,4,5,7,5,3,2,3,4,5};
       int cantidadDePares=0;
       imprimirMatriz(arr);
       cantidadDePares+=obtenerCantidadDePares(arr,cantidadDePares);
        System.out.println("la cantidad de pares que se encontro dentro del array fue ="+cantidadDePares);
    }

    public static int obtenerCantidadDePares(int [] arr, int pares) {
        for(int i=0;i<MAX;i++){
            if(arr[i]%PAR==0){
                pares++;
            }
        }
        return pares;
    }
    public static void imprimirMatriz(int [] arr){
        for(int i=0;i<MAX;i++){
            System.out.print("|"+arr[i]);
        }
        System.out.println(" ");
    }
}
