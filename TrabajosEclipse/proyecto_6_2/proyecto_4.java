package proyecto_6_2;

public class proyecto_4 {
//Hacer un programa que inserte un elemento en un arreglo (ordenado decrecientemente) de
//tamaño MAX=10
	final static int MAX=10;
	public static void main(String[] args) {
	    int[]arrEnteros=new int[MAX];
	    cargar_arreglo(arrEnteros);
	    imprimir_arreglo(arrEnteros);
	}
	public static void cargar_arreglo(int[]arr) {
		for(int pos=0;pos<MAX;pos++) {
			int random= (int)(Math.random()+1);
		    arr[pos]=random;
		}
	}
	public static void imprimir_arreglo(int[]arr) {
		for(int pos=0;pos<MAX;pos++) {
			System.out.println("poscion ["+pos+"] valor de la poscion "+arr[pos] );
		}
	}
	
	
}
