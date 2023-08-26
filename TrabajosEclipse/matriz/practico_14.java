package matriz;
//Hacer un programa que dada la matriz de secuencias de caracteres definida y precargada, elimine de
//cada fila todas las ocurrencias de una secuencia patrón dada por un arreglo de caracteres de tamaño
//igual al tamaño de columnas de la matriz (sólo tiene esa secuencia con separadores al inicio y al final).
//Al eliminar en cada fila se pierden los valores haciendo los corrimientos.

public class practico_14 {
  final static int MAXFILA=4;
  final static int MAXCOLUM=20;
  public static void main(String []args) {
	  int []secuencia_patron={ 0, 5, 0, 3, 1, 9, 0, 5, 7, 0, 0, 4, 0, 0, 0, 9, 9, 0, 0, 0 };
	  int[][]matInt= { { 0, 6, 6, 0, 4, 4, 0, 0, 3, 9, 0, 8, 5, 7, 0, 6, 6, 0, 1, 0 },
				{ 0, 3, 0, 5, 0, 9, 0, 5, 0, 0, 0, 0, 3, 0, 9, 3, 4, 0, 0, 0 },
				{ 0, 2, 0, 0, 0, 7, 0, 0, 7, 0, 4, 0, 0, 0, 2, 0, 8, 4, 5, 0 },
				{ 0, 5, 0, 3, 1, 9, 0, 5, 7, 0, 0, 4, 0, 0, 0, 9, 9, 0, 0, 0 }, };
	  boolean valido;
	  int fila=0;
	  Inprimir_Matriz(matInt);
	  while(fila<MAXFILA) {
		 valido=comparar_filas_con_secuencia(matInt[fila],secuencia_patron);
		 if(valido==true) {
			 corrimiento_izquierda(matInt[fila]);
		     	 
		 }
		 fila++;
	  }
	  System.out.println("corri");
		 Inprimir_Matriz(matInt);
  }
  public static void Inprimir_Matriz(int[][]matriz) {
	  for(int fila=0;fila<MAXFILA;fila++) {
		  recorrer_columnas(matriz[fila]);
	  }
  }
  public static void recorrer_columnas(int[]arr) {
	  for(int colum=0;colum<MAXCOLUM;colum++) {
		  System.out.print("|"+arr[colum]);
	  }
	  System.out.println("");
  }
  public static boolean comparar_filas_con_secuencia(int []arrF,int[]secu) {
      boolean valido=true; 
	  int inicio=0;
      while(inicio<MAXCOLUM-1&&valido) {
		  if(arrF[inicio]==secu[inicio]){
			  valido=true;
		  }
		  if(arrF[inicio]!=secu[inicio]) {
			  valido=false;
		  }
		  inicio++;
	  }
      return valido;
  }
  public static void  corrimiento_izquierda(int[]arr) {
	  int pos=1;
	  for(int inicio=1;inicio<MAXCOLUM-1;inicio++) {
	      pos=1;
		  while (pos < MAXCOLUM - 1) {// pos=9 y maxcolum=9;
			arr[pos] = arr[pos + 1];// arr[8]=arr[8+1]
			pos++; // pos=8+1
		}
	  }
  }
}
