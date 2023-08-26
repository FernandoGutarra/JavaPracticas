package practica_luccho;
// Hacer un programa que dado un arreglo ordenado creciente de enteros
//de tamaño 10 que se encuentra precargado, solicite al usuario un numero
//entero y elimine la primer ocurrencia de numero (un número igual) en el
//arreglo (si existe).

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class op {
    final static int MAX = 10;
    final static int MAXVALOR = 10;
    final static int MINVALOR = 0;

    public static void main(String[] args) {
        int[] arreglo = new int[MAX];
        int entero;
        int posicion;
        cargar_arreglo_aleatorio(arreglo);
        System.out.println("Arreglo antes de ordenar");
        imprimir_arreglo(arreglo);
        System.out.println("Arreglo despues de ordenarlo en forma creciente");
        ordenar_arreglo_burbujeo(arreglo);
        imprimir_arreglo(arreglo);
        entero = pedir_entero();
        System.out.println("El numero ingresado es " + entero);
        posicion = buscar_posicion(arreglo, entero);
        corrimiento_izquierda(arreglo,posicion);
        imprimir_arreglo(arreglo);
    }

    public static void cargar_arreglo_aleatorio(int[] arreglo) {
        for (int pos = 0; pos < MAX; pos++) {
            int Random = (int) (10 * Math.random() + 1);
            arreglo[pos] = Random;
        }
    }

    public static void imprimir_arreglo(int[] arreglo) {
        for (int pos = 0; pos < MAX; pos++) {
            System.out.println("arreglo[" + pos + "] -> " + arreglo[pos]);
        }
    }

    public static void ordenar_arreglo_burbujeo(int[] arreglo) {
        //{6,8,5,8,9,2,9,0,8,5}
        int auxiliar = 0;
        for (int i = 1; i < MAX; i++) { //------>>>> pos inicia en =1; y llega hasta la posicion 9.
            for (int j = 0; j < MAX - 1; j++) { //------>>>> j inicia en =0; y llega hasta la posicion 8
                if (arreglo[j] > arreglo[j + 1]) {
                    auxiliar = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = auxiliar;
                }
            }
        }
    }

    public static int pedir_entero() {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        boolean valido = false;
        int numero = 0;
        while (!valido) {
            try {
                System.out.println("Introducir un numero entero");
                numero = Integer.valueOf(entrada.readLine());
                if ((numero >= MINVALOR) && (numero <= MAXVALOR)) {
                    valido = true;
                } else {
                    System.out.println("El numero ingresado no es valido");
                }
            } catch (Exception exc) {
                System.out.println(exc);
            }
        }
        return numero;
    }

    public static int buscar_posicion(int[] arreglo, int entero) {
        int posicion = 0;
        while ((posicion < MAX) && (arreglo[posicion] < entero)) {
            posicion++;
        }
        System.out.println("La posicion donde deberia estar en el arreglo es: " + posicion);
        return posicion;

    }

    public static void corrimiento_izquierda(int[] arreglo,int posicion) {

        for(int pos=posicion;pos<MAX-1;pos++){
            arreglo[pos]=arreglo[pos+1];
        }
    }

}