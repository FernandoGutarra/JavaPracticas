public class ejercicio_3 {
    /*
        3. Con el mismo arreglo del ejercicio anterior informe por pantalla
        cuantos elementos del mismo están por encima del promedio
        calculado.
    */
    final static int MAX=10;
    public static void main(String[]args){
        double promedio=0;
        int cantEncimaDelPromedio=0;
        int [] arr = new int[MAX];
        cargarArreglo(arr);
        imprimirMatriz(arr);
        promedio = calcularPromedio(arr);
        System.out.println("el promedio de los numero es "+promedio);
        cantEncimaDelPromedio = cantElemtPorEncimaDelPromedio(arr,promedio);
        System.out.println(" cantidad por encima del promedio " + cantEncimaDelPromedio );
    }

    private static int cantElemtPorEncimaDelPromedio(int [] arr,double promedio) {
        int contador=0;
        for(int i=0;i<MAX;i++){
          if(arr[i]>promedio){
              contador++;
          }
        }
        return contador;
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
