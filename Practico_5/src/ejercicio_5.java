import java.lang.instrument.ClassDefinition;

public class ejercicio_5 {
    /*
     5. Hacer un programa que dado un arreglo de caracteres de tamaño
     10 que se encuentra cargado, invierta el orden del contenido. Este
     intercambio no se debe realizar de manera explícita, hay que
     hacer un método que incluya una iteración de intercambio.
    */
    final static int MAX=10;
    public static void main(String[]args){
        char [] arr = {'e','a','2','d','k','s','r','f','d','h'};
        imprimirMatriz(arr);
        invertirOrden(arr);
        imprimirMatriz(arr);
    }
    public static void invertirOrden(char [] arr){
        int ini=0;
        int fin=MAX-1;
        char pos=' ';
        while(ini<fin){
          pos=arr[ini];
          arr[ini]=arr[fin];
          arr[fin]=pos;
          ini++;
          fin--;
        }
    }
    public static void imprimirMatriz(char [] arr){
        for(int i=0;i<MAX;i++){
            System.out.print("|"+arr[i]);
        }
        System.out.println(" ");
    }
}
