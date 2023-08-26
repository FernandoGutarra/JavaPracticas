import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class ejercicio_5 {
    /*
    5. Hacer un programa que dada una matriz de enteros de tamaño
    5*10 que se encuentra precargada, solicite al usuario un número
    entero y elimine la primera ocurrencia de número en la matriz (un
    número igual) si existe. Para ello tendrá que buscar la posición y si
    está, realizar un corrimiento a izquierda y no continuar buscando.
    */
    final static int MAXF=5;
    final static int MAXC=10;
    final static int MAXVALOR=20;
    final static int MINVALOR=1;
    public static void main(String[]args){
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        int [][] matriz = new int[MAXF][MAXC];
        int numeroEntero=0;
        cargarMatriz(matriz);
        imprimirMatriz(matriz);
        System.out.println("");
        numeroEntero=pedirNumero(entrada);
        eliminarPrimeraOcurrencia(matriz,numeroEntero);
        imprimirMatriz(matriz);
        System.out.println("");
    }

    public static void eliminarPrimeraOcurrencia(int[][] matriz, int numeroEntero) {
        boolean ocurrenciaEncontrada=false;
        int fila=0;
        while(fila<MAXF && !ocurrenciaEncontrada){
            int colum=0;
              while(colum<MAXC && !ocurrenciaEncontrada){
                  if(matriz[fila][colum]==numeroEntero){
                      corrimientoIzq(matriz[fila],colum);
                      ocurrenciaEncontrada=true;
                  }
                  colum++;
              }
            fila++;
        }
    }

    public static void corrimientoIzq(int[] arr, int pos) {
          for(int i=pos;i<MAXC-1;i++){
                  arr[i]=arr[i+1];
          }
          if(MAXC-1==pos){
                arr[pos]=0;
          }
    }

    public static int pedirNumero(BufferedReader entrada) {
        boolean esValido=false;
        int numero=-1;
        try{
            while(!esValido){
                System.out.println("Ingresar numero entero");
                numero = Integer.parseInt(entrada.readLine());
                if(numero>=0){
                    esValido=true;
                }
            }
        }catch(Exception exc){
            System.out.println(exc);
        }

        return numero;
    }
    public static void cargarMatriz(int[][] matriz) {
        for (int i=0;i<MAXF;i++) {
            cargarFilaMatriz(matriz[i]);
        }
    }
    public static void cargarFilaMatriz(int[] arr) {
        Random r = new Random();
        for(int pos=0;pos<MAXC;pos++){
            arr[pos] = r.nextInt((MAXVALOR-MINVALOR+1) + MINVALOR);
        }
    }
    public static void imprimirMatriz(int[][]matriz){
        for(int i=0;i<MAXF;i++){
            recorrerColumns(matriz[i]);
        }
    }

    public static void recorrerColumns(int [] arr) {
        for(int i=0;i<MAXC;i++){
            System.out.print("|"+arr[i]);
        }
        System.out.println("");
    }
}
