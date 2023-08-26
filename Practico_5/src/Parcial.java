import java.io.CharArrayReader;
import java.sql.PreparedStatement;
import java.util.concurrent.BrokenBarrierException;

public class Parcial {
    /*
    Ejercicio tipo parcial
    Cuando se debe procesar texto expresado en lenguaje natural, una de las primeras tareas que se realiza es la
    de eliminación de stopwords. Las stopwords son palabras muy comunes en un determinado lenguaje, por
    ejemplo, artículos (el, la, las, los...), preposiciones (a, ante, con, por...), etc.
    Dado un texto almacenado en un arreglo de caracteres de tamaño MAX_A, donde cada palabra está delimitada
    por espacios, comas (,) o puntos (.) se pide eliminar todas las stopwords almacenadas en otro arreglo de
    caracteres de tamaño MAX_S que se encuentra delimitado por espacios.
    Por ejemplo, dado un texto almacenado en un arreglo A:
      l a  c a s a  r o j a , a  l a  v u e l t a  d e  l a  e s q u i n a .
     Y una lista de stopwords S
       a  l o  l o s  d e  l a  l a s
    El arreglo A debería quedar de la siguiente forma luego de la eliminación de stopwords:
     c a s a  r o j a ,  v u e l t a  e s q u i n a .
    */
    final static int MAX=20,SEPARADOR=0,X=3;
    public static void main (String[] args){
// PUNTO 1
        int[] arregloImagen={0,67,67,67,67,67,67,67,67,0,14,0,33,33,33,33,0,5,98,0};
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
