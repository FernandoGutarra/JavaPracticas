import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.concurrent.BrokenBarrierException;

public class ejercicio_28 {
    /*
     28. Hacer un programa que dado un arreglo ordenado creciente de
     enteros de tamaño 10 que se encuentra precargado, solicite al
     usuario un número entero y elimine la primera ocurrencia de
     número (un número igual) en el arreglo (si existe). Informar si no
     existe en el arreglo.
    */
    final static int MAX=10;
    public static void main(String[]args){
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = {10, 30, 40, 50, 60, 70, 80, 90, 100, 105};
        imprimirMatriz(arr);
        int numero=pedirNumero(entrada);
        int posEliminar=buscarPosAEliminar(arr,numero);
        if(posEliminar!=-1){
            elimanarPrimeraOcurrencia(arr,posEliminar);
            imprimirMatriz(arr);
        }else {
            System.out.println("nose puede eliminar por que no hay ocurrencia con ese numero");
        }

    }

    public static void elimanarPrimeraOcurrencia(int[] arr,int posEliminar) {
        corrimientoIzq(arr,posEliminar);
    }
    public static void corrimientoIzq(int []arr,int pos){
       for(int i =pos;i<MAX-1;i++){
          arr[i]=arr[i+1];
       }
    }
    public static int buscarPosAEliminar(int[] arr, int numero) {
        int ini=0;
        boolean pocisionEncontrada=false;
        while(ini<MAX&&!pocisionEncontrada){
            if(arr[ini]==numero){
               pocisionEncontrada=true;
            }else{
               ini++;
            }
        }
        if(pocisionEncontrada==false){
              ini=-1;
        }
        return ini;
    }
    public static int pedirNumero(BufferedReader entrada) {
        int entero=-1;
        boolean esValido=false;
        while(!esValido) {
            try {
                System.out.println("ingresar un numero entero");
                entero =Integer.valueOf(entrada.readLine());
                if(entero!=0){
                    esValido=true;
                }
            } catch (Exception exc) {
                System.out.println(exc);
            }
        }
        return entero;
    }
    public static void imprimirMatriz(int [] arr){
        for(int i=0;i<MAX;i++){
            System.out.print("|"+arr[i]);
        }
        System.out.println(" ");
    }
}
