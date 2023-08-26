import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio_24 {
    /*
    24. Se tiene un arreglo de enteros de tamaño 20 de secuencias de
    números entre 1 y 9, separadas por 0. El arreglo está precargado,
    y además empieza y termina con uno o más separadores 0. Hacer
    un programa que permita obtener a través de métodos la posición
    de inicio y la posición de fin de la secuencia ubicada a partir de
    una posición entera ingresada por el usuario. Finalmente, si
    existen imprima por pantalla ambas posiciones obtenidas.
    */
    final static int MAX=20;
    public static void main(String[]args){
        int [] arr={0,2,3,7,0,2,7,8,0,1,5,3,0,2,3,5,6,7,0,0,0};
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        int numero=pedirNumero(entrada);
        buscarSiExisteSecu(arr,numero);
    }

    private static void buscarSiExisteSecu(int[] arr, int numero) {
        int ini=0;
        int fin=-1;
        int iniElegido=0;
        int finElegido=0;
        while(ini<MAX){
           ini=buscarIni(arr,fin+1);
           if(ini<MAX){
              fin=buscarFin(arr,ini);
              if(numero>=ini && numero<=fin){
                 iniElegido=ini;
                 finElegido=fin;
              }
           }
        }
        if(iniElegido!=0){
         System.out.println("la secu se encuentra en ini ="+iniElegido);
         System.out.println("la secu se encuentra en fin ="+finElegido);
        }else{
            System.out.println("pija");
        }
    }

    public static int pedirNumero(BufferedReader entrada) {
        int entero=0;
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
    public static int buscarIni(int [] arr, int ini){
        while(ini < MAX && arr[ini]==0){
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
    public static void imprimirMatriz(int [] arr){
        for(int i = 0; i < MAX; i++){
            System.out.print("|"+arr[i]);
        }
        System.out.println(" ");
    }
}
