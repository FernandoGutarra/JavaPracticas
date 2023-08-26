
public class libre_juan {
  final static int MAXF=4;
  final static int MAXC=4;
  public static void main(String[]args) {
	  char [][] matriz= {
			  {'s','f','2','2'},
			  {'f','3','4','6'},
			  {'g','w','2','k'},
			  {'4','j','h','5'}
	  };
	  int filaR=MAXF;
	  int columR=MAXC;
	  int fila=0;
	  int columP=0;
	  imprimirMatriz(matriz);
	  System.out.println(" ");
   while(fila<MAXF&&filaR!=0) {
		  boolean noseEncontroPar=false;
		  imprimirMatriz(matriz);
		  System.out.println(" ");
		   while(!noseEncontroPar){
			    if(buscarElimPares(matriz,fila)&&filaR!=0) {
				   filaR--;
				   columR--;
				   imprimirMatriz(matriz);
				   reordenarMatriz(matriz,filaR,columR);
                   System.out.println(" ");
                   imprimirMatriz(matriz);
                   System.out.println(" ");
                   fila=0;
               
			   }else{
				   noseEncontroPar=true;
				   fila++;
			   }
		   }
	  }
  }
private static void reordenarMatriz(char[][] matriz, int filaR, int columR) {
   for(int fila=0;fila<filaR;fila++){
	   for(int colum=0;colum<columR;colum++) {
		   if(matriz[fila][colum]=='0') {
			   int filaI=fila;
			   int columI=colum;
			   matriz[fila][colum]=buscarCaracter(matriz,filaI,columI);
		   }
	   }
   }
}
public static char buscarCaracter(char[][]matriz,int filaI,int columI) {
	char element=' ';
	for(int fila=filaI;fila<MAXF;fila++) {
		for(int colum=columI;colum<MAXC;colum++) {
			if(matriz[fila][colum]!='0'){
				element = matriz[fila][colum];
				matriz[fila][colum]='0';
			    return element;
			}
		}
	}
	return '0';
}
public static boolean buscarElimPares(char[][]matriz,int fila) {
	int element=0;
	int filaN=0;
	int filaL=0;
	for(int colum=0;colum<MAXC;colum++){
		element=matriz[fila][colum];
	    if(element>='a'&&element<='z') {
	    	filaL++;
	    }else if(element!='0'){
	    	filaN++;
	    }
	}
	if(ElimPares(matriz,filaN,filaL,fila)) {
	  return true;
	}
	return false;
}
public static boolean ElimPares(char[][]matriz,int filaN,int filaL,int filaP) {
	int element=0;
	int columN=0;
	int columL=0;
	for(int colum=0;colum<MAXC;colum++) {
		for(int fila=0;fila<MAXF;fila++) {
			element=matriz[fila][colum];
			if(element>='a'&&element<='z') {
				columL++;
			}else if(element!='0'){
				columN++;
			}
		}
		if(filaN==columN&&columL==filaL) {
			eliminarFilaYColum(matriz,colum,filaP);
			return true;
		}
	}
	return false;
}
public static void eliminarFilaYColum(char[][]matriz,int columP,int filaP) {
	 for(int colum=0;colum<MAXC;colum++){
		 matriz[filaP][colum]='0';
	 }
	 for(int fila=0;fila<MAXF;fila++){
		 matriz[fila][columP]='0';
	 }
}
public static void imprimirMatriz(char[][]matriz) {
	for(int fila=0;fila<MAXF;fila++) {
		recorrerColum(matriz[fila]);
	}
}
private static void recorrerColum(char[]matriz) {
	for(int colum=0;colum<MAXC;colum++) {
		System.out.print(" | "+ matriz[colum]);
	}
	System.out.println(" ");
}
}
