import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio_4 {
    /*
     4. Buscar un elemento en un arreglo de caracteres ya cargado de
     tamaño 10 y mostrar la/s posición/es del elemento, en caso de no
     estar indicarlo también.
    */
    final static int MAX=10;
    public static void main(String[]args){
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        char [] arr = {'e','a','2','d','s','s','r','f','d','h'};
        char caracter = ' ';
        imprimirMatriz(arr);
        caracter = pedirCaracter(entrada);
        buscarPosicionELment(caracter,arr);
    }

    private static void buscarPosicionELment(char caracter,char [] arr) {
        for(int i=0;i<MAX;i++){
             if(arr[i]==caracter){
                 System.out.println("el caracter ingresado =|"+arr[i]+"| se encontro en la posicion " + i);
             }
        }
        System.out.println("nose encontro el caracter ingresado");
    }

    private static char pedirCaracter(BufferedReader entrada) {
        char caracter=' ';
        try{
            System.out.println("ingresar un numero entero entre ");
            caracter = entrada.readLine().charAt(0);
            while(caracter==' '){
                System.out.println("ingresar un numero entero ");
                caracter = entrada.readLine().charAt(0);
            }
        }catch (Exception exc){
            System.out.println(exc);
        }
        return caracter;
    }
    private static void cargarArreglo(int[] arr) {
        for(int pos=0;pos<MAX;pos++){
            arr[pos] = pos*2;
        }
    }
    public static void imprimirMatriz(char [] arr){
        for(int i=0;i<MAX;i++){
            System.out.print("|"+arr[i]);
        }
        System.out.println(" ");
    }

}
