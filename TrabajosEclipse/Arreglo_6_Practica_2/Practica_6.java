package Arreglo_6_Practica_2;
//Hacer un programa que elimine los valores pares en un arreglo de tamaño MAX=10.
public class Practica_6 {
	final static int PAR=2;
	final static int MAX=10;
  public static void main(String[]args) {
	  int [] arr = new int [MAX];
	  cargarArr(arr);
	  imprimirArr(arr);
	  System.out.println("");
	  eliminarPares(arr);
	  imprimirArr(arr);
	  System.out.println("");
  }
	public static void eliminarPares(int[] arr) {
        int pos=0;
		while(pos<MAX) {
    	  if(arr[pos]!=0&&arr[pos]%PAR==0) {
    		  corrimientoIzq(arr,pos);
    		  pos=0;
    	  }
    	  else {
    		 pos++; 
    	  }
      }
      imprimirArr(arr);
	  System.out.println("");
    }
	public static void corrimientoIzq(int[] arr, int ini) {
		while(ini<MAX-1) {
			arr[ini]=arr[ini+1];
			ini++;
		}
		arr[MAX-1]=0;
	}
	public static void imprimirArr(int[] arr) {
		  for(int i=0;i<MAX;i++) {
			  System.out.print(" | " + arr[i]);
		  }
			
		}
		public static void cargarArr(int[] arr) {
			for(int i=0;i<MAX;i++) {
				arr[i]=numeroRandom();
			}
		 }
		public static int numeroRandom() {
		    int random = (int) (10*Math.random()*1);
			return random;
		}
}
