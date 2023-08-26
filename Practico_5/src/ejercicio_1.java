import javax.print.attribute.standard.MediaSize;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
   1.
   Cargar un arreglo de tamaño 15, pidiendo el ingreso por teclado
   de valores entre 1 y 12. Luego mostrar cómo quedó cargado.
        */
public class ejercicio_1 {
    final static int MAXTAM=15;
    final static int MAX=12;
    final static int MIN=1;

    public static void main(String[]args){
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        int [] arr = new int[MAXTAM];
        for (int i=0;i<MAXTAM;i++){
             arr[i]=pedirNumero(entrada);
        }
        imprimirMatriz(arr);
    }

    private static int pedirNumero(BufferedReader entrada) {
           int numero=0;
           try{
                  System.out.println("ingresar un numero entero entre "+MIN+" y "+MAX);
                  numero = Integer.valueOf(entrada.readLine());
                  while(!(numero>=MIN&&numero<=MAX)){
                      System.out.println("ingresar un numero entero "+MIN+" y "+MAX);
                      numero = Integer.valueOf(entrada.readLine());
                  }
           }catch (Exception exc){
               System.out.println(exc);
           }
        return numero;
    }
    public static void imprimirMatriz(int [] arr){
      for(int i=0;i<MAXTAM;i++){
          System.out.print("|"+arr[i]);
      }
        System.out.println(" ");
    }
}
