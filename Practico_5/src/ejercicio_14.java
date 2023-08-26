public class ejercicio_14 {
    /*
    14. Hacer un programa que elimine los valores pares en un arreglo
    de tamaño MAX=10.
     */
    final static int MAX=10;
    final static int PAR=2;

   public static void main(String[]args){
       int [] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 80};
       imprimirArr(arr);
       buscarNumerosPares(arr);
       imprimirArr(arr);
   }

    private static void buscarNumerosPares(int[] arr) {
       for(int i=0;i<MAX;i++){
           if(arr[i]%PAR==0){
               eliminarPares(arr,i);
           }
       }
    }

    private static void eliminarPares(int[] arr, int i) {
       for(int pos = i;pos<MAX-1;pos++){
            arr[pos]=arr[pos+1];
       }
       arr[MAX-1]=0;
    }

    public static void imprimirArr(int [] arr){
        for(int i=0;i<MAX;i++){
            System.out.print("|" + arr[i]);
        }
       System.out.println(" ");
   }
}
