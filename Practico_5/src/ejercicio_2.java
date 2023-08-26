public class ejercicio_2 {
    /* 2.
    Hacer un programa que dado un arreglo ya cargado con 10
    enteros, calcule el promedio y lo muestre por la consola.
    */
    final static int MAX=10;
    public static void main(String[]args){
        double promedio=0;
        int [] arr = new int[MAX];
        cargarArreglo(arr);
        promedio = calcularPromedio(arr);
        imprimirMatriz(arr);
        System.out.println("el promedio de los numero es "+promedio);
    }

    private static double calcularPromedio(int[] arr) {
        double promedio=0;
        for(int i=0;i<MAX;i++){
           promedio+=arr[i];
        }
        promedio/=MAX;
        return promedio;
    }

    private static void cargarArreglo(int[] arr) {
        for(int pos=0;pos<MAX;pos++){
            arr[pos] = pos*2;
        }
    }
    public static void imprimirMatriz(int [] arr){
        for(int i=0;i<MAX;i++){
            System.out.print("|"+arr[i]);
        }
        System.out.println(" ");
    }

}
