package corrimiento;

public class corrimiento_izquierda {
  final static int MAXC=9;
  public static void main (String[]args) {
	int[]arr= {0,3,4,0,2,0,9,3,0};
//    cargarArray(arr);
    imprimirMatriz(arr);
    System.out.println(" ");
   int i=0;
    while(i<2) {
    corrimientoIzquierda(arr);
    imprimirMatriz(arr);
    System.out.println(" ");
    i++;
    }
  }
//  public static void cargarArray(int[]arr) {
//	  for(int i=0;i<MAXC;i++){
//		 arr[i]=(int)(10*Math.random()+1);
//	  }
//  }
  public static void imprimirMatriz(int[]arr) {
	  for(int i=0;i<MAXC;i++){
		  System.out.print(" | " + arr[i]);
	  }
  }
  public static void corrimientoIzquierda(int[]arr) {
	  int ini=1;
	  while (ini<MAXC-1) {
			arr[ini]=arr[ini+1];
			ini++;
		}
  }
}
