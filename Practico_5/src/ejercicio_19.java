import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio_19 {
    /*
    19. Hacer un programa que dado un número N ingresado por el
    usuario, elimine las secuencias de tamaño N de números distintos
    de cero.
    */
    final static int MAX=10;
    public static void main(String[]args) {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            int[] arr = {0, 2, 0, 4, 0, 3, 4, 5, 0, 0};
            int ini = 0;
            int fin = -1;
            int tamanioSecu=0;
            imprimirMatriz(arr);
            int numero=pedirNumero(entrada);
            while (ini < MAX) {
                ini = buscarIni(arr, fin + 1);
                if (ini < MAX) {
                    fin = buscarFin(arr, ini);
                    tamanioSecu=fin-ini+1;
                    if(tamanioSecu==numero){
                        eliminarSecu(arr,ini,fin);
                    }
                }
            }
            if(numero<0){
                System.out.println("nose encontro secuencia de igual tamaño al numero ingresado");
            }else {
                imprimirMatriz(arr);
            }
        }
    public static int pedirNumero(BufferedReader entrada){
         int numero=0;
         boolean esValido=false;
         while(!esValido){
              try{
                  System.out.println("por favor ingresa un numero mayor a 0");
                  numero = Integer.valueOf(entrada.readLine());
                  if(numero>0){
                       esValido=true;
                  }
              }catch (Exception exc){
                  System.out.println(exc);
              }
         }
         return numero;
    }
    private static void eliminarSecu(int[] arr, int ini, int fin) {
        for(int i=ini;i<=fin;i++){
             corrimientoIzq(arr,ini);
        }
    }
    public static void corrimientoIzq(int []arr,int pos){
           for(int i=pos;i<MAX-1;i++){
               arr[i]=arr[i+1];
           }
    }
    public static int buscarIni(int [] arr, int ini){
            while(ini<MAX && arr[ini]==0){
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
        for(int i=0;i<MAX;i++){
            System.out.print("|"+arr[i]);
        }
        System.out.println(" ");
    }
    }
