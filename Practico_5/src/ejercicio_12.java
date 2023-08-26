import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio_12 {
    final static int MAX=10;
    public static void main(String[]args){
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        int [] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 2};
        imprimirMatriz(arr);
        int entero = pedirNumero(entrada);
        eliminarTodasLasOcurrencias(arr,entero);
        imprimirMatriz(arr);
    }

    public static void eliminarTodasLasOcurrencias(int[] arr, int entero) {
        int pos=0;
        while(pos<MAX-1){
            if(arr[pos]==entero){
                corrimientoIzq(arr,pos);
            }else{
                pos++;
            }
        }
    }
    public static void corrimientoIzq(int [] arr,int pos){
        for(int i=pos;i<MAX-1;i++){
            arr[i]=arr[i+1];
        }
        arr[MAX-1]=0;
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
    public static void imprimirMatriz(int [] arr){
        for(int i=0;i<MAX;i++){
            System.out.print("|"+arr[i]);
        }
        System.out.println(" ");
    }
}
