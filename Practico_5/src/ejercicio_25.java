import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio_25 {
    /*
     25. Hacer un programa que dado el arreglo definido y precargado,
      y un número entero ingresado por el usuario, copie de forma
      continua las secuencias de tamaño igual al número ingresado en
      otro arreglo de iguales características e inicializado con 0. La
      copia en este último arreglo deben comenzar desde el principio
      del mismo.
    */
    final static int MAX=10;
    public static void main(String[]args){
      int [] arr = {0,2,0,0,0,3,3,0,2,0};
      int [] copia = new int[MAX];
      BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
      int numero = pedirNumero(entrada);
      imprimirMatriz(copia);
      buscarSecuDeIgualTmañoANumero(arr,numero,copia);
      imprimirMatriz(copia);
    }

    public static void buscarSecuDeIgualTmañoANumero(int[] arr, int numero,int [] copia) {
        int ini=0;
        int fin=-1;
        int posicionDeInsercion=1;
        while(ini<MAX){
             ini=buscarIni(arr,fin+1);
             if(ini<MAX){
                 fin=buscarFin(arr,ini);
                 int tamanioSecu=fin-ini+1;
                 if(tamanioSecu==numero){
                    posicionDeInsercion= insertarSecuEnCopia(ini,arr,copia,posicionDeInsercion,tamanioSecu);
                 }
             }
        }
    }

    public static int insertarSecuEnCopia(int ini, int [] arr, int [] copia,int pos,int tamanioSecu) {
        for(int i=0;i<tamanioSecu;i++){
            copia[pos]=arr[ini];
            ini++;
            pos++;
        }
        return ini+1;
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
