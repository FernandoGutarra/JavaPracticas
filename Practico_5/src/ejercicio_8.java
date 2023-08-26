public class ejercicio_8 {
    /*
    8. Implementar un método que realice un corrimiento a izquierda en
    un arreglo ordenado de tamaño MAX=10 a partir de una posición.
    */
    final  static int MAX=10;
    public static void main(String []args){
            int[] arr = {1, 4, 5, 7, 5, 3, 2, 3, 4, 5};
            imprimirMatriz(arr);
            corrimientoIzquierda(arr);
            imprimirMatriz(arr);
    }
    private static void corrimientoIzquierda(int[] arr) {
        for(int i=0;i<MAX-1;i++){
            arr[i]=arr[i+1];
        }
    }

    public static void corrimientoIzquierdas(int []arr){
        int ini=0;
        while(ini<MAX-1){
             arr[ini]=arr[ini+1];
             ini++;
        }
    }

    public static void imprimirMatriz(int [] arr){
        for(int i=0;i<MAX;i++){
            System.out.print("|"+arr[i]);
        }
        System.out.println(" ");
    }
}
