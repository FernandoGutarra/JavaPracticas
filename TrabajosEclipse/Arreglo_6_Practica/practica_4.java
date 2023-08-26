package Arreglo_6_Practica;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//Buscar un elemento en un arreglo de caracteres ya cargado de tamaño 10 y mostrar la/s
//posicion/es del elemento, en caso de no estar indicarlo también
public class practica_4 {
	BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
	final static int MAX = 10;

	public static void main(String[] args) {
    int [] arrEnteros=new int[MAX];
		cargar_arreglos(arrEnteros);
        imprimir_arreglos(arrEnteros);
	}
	public static void cargar_arreglos(int[]arr) {
		for(int pos=0;pos<MAX;pos++) {
			int random= (int)(10*Math.random()+1);
			arr[pos]=random;
		}
	}
	public static void imprimir_arreglos(int[]arr) {
		for(int pos=0;pos<MAX;pos++) {
			System.out.println("la posicion es ["+pos+"] el valor de la posicion es "+arr[pos]);
		}
	}
}