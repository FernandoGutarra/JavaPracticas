package examanes;
/* Se tiene una matriz MAT de caracteres y letras minusculas y digitos. Se pide
 * eliminar los pares fila-columna que tienen la misma cantidad de vocales y digitos
 * (para una fila X tiene N vocales y N digitos, verificar si alguna columna tiene esa
 * misma cantidad y en ese caso eliminar el par). Por cada par fila/columna eliminado 
 * se debe completar la matriz con digitos cero en la ultima fila y la ultima columna.
 * Tener en cuenta que cada vez que se elimina un par fila-columna se peuden formar 
 * nuevos pares que cumplan con la condicion, que tambien deberan ser eliminados
 * Al final se debe informar qen que par de fila/columna se encontro la mayor cantidad
 * de digitos de las que fueron eliminadas
 */
public class final_pi {
	final static int MAXFC=4;
   public static void main (String [] args) {
	   char [][] mat= {
			   {'e','2','i','u'},
			   {'i','2','3','a'},
			   {'4','7','2','e'},
			   {'e','a','y','i'}
			   };
	   int filaColumPar=0;
	   int cantMayorDigiElimi=0;
	   int filaMayorEli=0;
	   int columMayorEli=0;
	   int fila=0;
	   int colum=0;
	   int filaColumRestantes=MAXFC;
	   imprimirMatriz(mat);
	   System.out.println("");
	   while(fila<filaColumRestantes){
		   while(colum<filaColumRestantes) {
			  int digitosAEliminar=buscarColumFilaPar(mat,fila,colum);
			  if(digitosAEliminar>0) {
				  eliminarFilaColumPar(mat,fila,colum);
				  if(digitosAEliminar>cantMayorDigiElimi) {
					  cantMayorDigiElimi=digitosAEliminar;
					  filaMayorEli=fila;
					  columMayorEli=colum;
				  }
				  filaColumRestantes--;
				  imprimirMatriz(mat);
				   System.out.println("");
				  reordenarMatriz(mat,filaColumRestantes);
				  imprimirMatriz(mat);
				   System.out.println("");
				  fila=0;
				  colum=0;
			  }else {
			     colum++;
			  }
	       }
		   fila++;
	   }
System.out.println("la fila-colum par con mas digitos eliminados es fila "+filaMayorEli+" y la colum "+columMayorEli+" la cantidadMayorDeDigitosELi es " +cantMayorDigiElimi);
 }
public static int buscarColumFilaPar(char[][] mat, int filaPar, int columPar) {
	int cantidadDeVocalesFila=0;
	int cantidadDeVocalesColum=0;
	int cantidadDeDigitosFila=0;
	int cantidadDeDigitosColum=0;
	int digitoCompartido=0;
	if(!esVocal(mat[filaPar][columPar])){
		 digitoCompartido=1;
	}
	for( int filaColum=0;filaColum<MAXFC;filaColum++) {
		char element=' ';
		 element=mat[filaColum][columPar];
		if(esVocal(element)) {
			cantidadDeVocalesColum++;
		}else if(element!='0'){
			cantidadDeDigitosColum++;
		}
		element=mat[filaPar][filaColum];
		if(esVocal(element)) {
			cantidadDeVocalesFila++;
		}else if(element!='0'){
			 cantidadDeDigitosFila++;
		}
	}
	if(cantidadDeVocalesFila==cantidadDeVocalesColum&&cantidadDeDigitosFila==cantidadDeDigitosColum) {
		return (cantidadDeDigitosFila+cantidadDeDigitosColum)-digitoCompartido;
	}
	return 0;
}
private static void reordenarMatriz(char[][] mat, int filaColumRestantes) {
  for(int fila=0;fila<filaColumRestantes;fila++) {
	  for(int colum=0;colum<filaColumRestantes;colum++) {
		   if(mat[fila][colum]=='0') {
			   mat[fila][colum]=buscarCaracterSiguiente(mat,fila,colum);
		   }
	  }
  }
}
private static char buscarCaracterSiguiente(char[][] mat, int filaIni, int columIni) {
	for(int fila=filaIni;fila<MAXFC;fila++) {
		int colum=columIni; 
		while(colum<MAXFC) {
			char caracter=mat[fila][colum];
			 if(caracter!='0'){
				mat[fila][colum]='0';
				return caracter;
			 }else {
			  colum++;
			 }
		 }
		colum=0;
	}
	return '0';
}
public static void eliminarFilaColumPar(char[][] mat, int filaPar, int columPar) {
	    for(int i=0;i<MAXFC;i++) {
		      corrimientoIzq(mat[filaPar],0);    
		      corrimientoIzq(mat[i],columPar);
		}
}
private static void corrimientoIzq(char[] arr, int ini) {
	while(ini<MAXFC-1) {
		arr[ini]=arr[ini+1];
		ini++;
	}
	arr[ini]='0';
}

public static boolean esVocal(char caracter) {
	if(caracter=='a'||caracter=='e'||caracter=='i'||caracter=='o'||caracter=='u') {
		return true;
	}
	return false;
}
public static void imprimirMatriz(char[][] matriz) {
	for(int fila=0;fila<MAXFC;fila++) {
		recorrerColum(matriz[fila]);
	}
}
public static void recorrerColum(char[] arr) {
 	for(int colum=0;colum<MAXFC;colum++) {
		   System.out.print(" | " + arr[colum]);
	    }
 	System.out.println("");
}
};

