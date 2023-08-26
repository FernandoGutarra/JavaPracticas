import java.lang.instrument.ClassDefinition;
import java.util.concurrent.BrokenBarrierException;

public class parcial {
    /*
    Se pide implementar el algoritmo de descompresión que restablezca la matriz
    original. Asumir que cada fila posee suficientes lugares como para realizar la
    descompresión.
    Ejemplo de matriz comprimida con X = 3:
            0 -8 67 0 14 0 -4 33 0 5 98 0 0 0 0 0 0 0 0 0
            0 0 25 25 0 -5 3 0 25 44 44 0 -4 1 0 0 0 0 0 0
            0 44 44 44 0 -7 15 0 -4 9 0 12 0 0 0 0 0 0 0 0
    La matriz resultante quedaría de la siguiente forma:
            0 67 67 67 67 67 67 67 67 0 14 0 33 33 33 33 0 5 98 0
            0 0 25 25 0 3 3 3 3 3 0 25 44 44 0 1 1 1 1 0
            0 44 44 44 0 15 15 15 15 15 15 15 0 9 9 9 9 0 12 0
        */
    final static int MAX=20,SEPARADOR=0,X=2;
    public static void main (String[] args){
// PUNTO 1
        int[] arregloImagen={0,67,67,67,67,67,67,67,67,0,14,0,33,33,33,0,0,5,98,0};
        mostrarArreglo(arregloImagen);
        procesar(arregloImagen);
        mostrarArreglo(arregloImagen);
    }
    public static void procesar(int[] arregloImagen) {
        int inicio=0,fin=-1;
        while (inicio<MAX){
            inicio=buscarIni(arregloImagen, fin+1);
            if (inicio<MAX){
                fin=buscarFin(arregloImagen,inicio);
                if (fin-inicio+1>X && sonTodosIguales(arregloImagen,inicio,fin)){
                    comprimir(arregloImagen, inicio,fin);
                    fin=inicio+2;
                }
            }
        }
    }
    public static void comprimir(int[] arregloImagen, int inicio, int fin) {
        int tamanio=fin-inicio+1;
        while (inicio<fin-1){
            correrAIzquierda(arregloImagen,inicio);
            fin--;
        }
        arregloImagen[inicio]=-1*(tamanio);
    }
    public static void correrAIzquierda(int[] arr, int pos) {
        for (int i = pos; i < MAX - 1; i++)
            arr[i] = arr[i + 1];
    }
    public static boolean sonTodosIguales(int[] arregloImagen, int inicio, int fin) {
        while (inicio<fin && arregloImagen[inicio]==arregloImagen[inicio+1]){
            inicio++;
        }
        return (inicio==fin);
    }
    public static int buscarIni(int[] arrEnteros, int ini) {
        while (ini<MAX && arrEnteros[ini]==SEPARADOR)
            ini++;
        return ini;
    }
    public static int buscarFin(int[] arrEnteros, int ini) {
        while (ini<MAX && arrEnteros[ini]!=SEPARADOR)
            ini++;
        return ini-1;
    }
    public static void mostrarArreglo(int[] arr){
        for (int i=0;i<MAX;i++)

            System.out.print(arr[i] + "|");
        System.out.println("");
    }
}
