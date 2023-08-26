
public class final_juan {
	final static int MAXF = 4;
	final static int MAXC = 4;

	public static void main(String[] args) {
		char[][] matriz = { 
				{ 'a', '2', 's', 'e' }, 
				{ '3', '4', 'e', 'q' }, 
				{ '2', '2', 'e', 'f' },
				{ 'f', 'w', 'g', 's' } };
		int cantFilaColumEli = 0;
		int fila = 0;
		int filaR=MAXF;
		int columR=MAXC;
		imprimirMatriz(matriz);
		while (fila < MAXF && filaR!=fila) {	
			System.out.println(" ");
			if (buscarEliFilaYColumPar(fila,matriz)) {
				imprimirMatriz(matriz);
				System.out.println(" ");
				filaR--;
				columR--;
				if(fila<MAXF) {
				 reordenarMatriz(matriz,filaR,columR);
				 imprimirMatriz(matriz);
				 System.out.println(" ");
				 fila=0;
				}
			} 
			else {
				fila++;
			}
		}
		}
	public static boolean seEliTodasFilaColum(char[][]matriz) {
		
		return false;
	}
	private static void reordenarMatriz(char[][] matriz,int filaR,int columR) {
		for(int fila=0;fila<filaR;fila++) {
			for(int colum=0;colum<columR;colum++) {
			  if(matriz[fila][colum]=='0') {
//				 int columPos=colum;
//				 int filaPos= fila;
				  matriz[fila][colum]=buscarCaracter(matriz,colum,fila);
			  } 
			}
		}
	}

	private static char buscarCaracter(char[][] matriz,int columPos,int filaPos) {
		char caracter=' ';
		 for(int fila=filaPos;fila<MAXF;fila++) {
			 for(int colum=columPos;colum<MAXC;colum++) {
				 if(matriz[fila][colum]!='0') {
				    caracter=matriz[fila][colum];
				    matriz[fila][colum]='0';
				    return caracter;
				 }
			 }
		 }
		return '0';
	}
	public static void imprimirMatriz(char[][] matriz) {
		for(int fila=0;fila<MAXF;fila++) {
			recorrerColum(matriz[fila]);
		}
	}
	public static void recorrerColum(char[]arr) {
		for (int columna = 0; columna < MAXC; columna++) {
			System.out.print("|" + arr[columna]);
		}
		System.out.println();
	}
	private static boolean buscarEliFilaYColumPar(int fila,char[][]matriz) {
		int filaN=0;
		int filaL=0;
		int element=0;
		for(int colum=0;colum<MAXC;colum++) {
		    element=matriz[fila][colum];
		    if(element>='a'&&element<='z') {
		    	filaL++;
		    }else if(element>'0') {
		    	filaN++;
		    }
		}
	   if(ColumPar(filaN,filaL,element,matriz,fila)) {
		   return true;
	   }
		return false;
	}

	private static boolean ColumPar(int filaN, int filaL, int element, char[][] matriz,int filaPar) {
		for(int colum=0;colum<MAXC;colum++) {
			int columL=0;
			int columN=0;
			for(int fila=0;fila<MAXC;fila++) {
			   element=matriz[fila][colum];
			   if(element>='a'&&element<='z') {
				   columL++;
			   }else if(element>'0'){
				   columN++;
			   }
			}
			if(filaL==columL&&filaN==columN) {
				eliFilaColumPar(matriz,filaPar,colum);
				return true;
			}
		}
		return false;
	}

	private static void eliFilaColumPar(char[][] matriz, int filaPar, int columPar) {
		for(int fila=0;fila<MAXF;fila++) {
			matriz[fila][columPar]='0';
		}
		for(int colum=0;colum<MAXC;colum++) {
			matriz[filaPar][colum]='0';
		}
	}
	
}
