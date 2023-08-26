package finald;
 public class parcial{
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
	 		       if(buscarColumPar(mat,fila,colum)) {
	 		    	   int cantidadDeDigitosEli=eliminarFilaColumPar(mat,fila,colum);
	 		    	   imprimirMatriz(mat);
	 		    	   System.out.println("");
	 		    	   if(cantidadDeDigitosEli>0) {
	 		    		   if(cantidadDeDigitosEli>cantMayorDigiElimi) {
	 		    			   cantMayorDigiElimi=cantidadDeDigitosEli;
	 		    			   filaMayorEli=fila;
	 		    			   columMayorEli=colum;
	 		    		   }
	 		    	      filaColumRestantes--;
	 		    	      reordenarMatriz(mat,filaColumRestantes);
	 		    	      imprimirMatriz(mat);
	 			    	   System.out.println("");
	 		    	      colum=0;
	 		    	      fila=0;
	 		    	   }
	 		       }else {
	 		       colum++;
	 		       }
	 		   }
	 		   fila++;
	 	   }
	 	   imprimirMatriz(mat);
	 	   System.out.println("");
	 System.out.println("la fila-colum par con mas digitos eliminados es fila "+filaMayorEli+" y la colum "+columMayorEli+" la cantidadMayorDeDigitosELi es " +cantMayorDigiElimi);
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
	 private static int eliminarFilaColumPar(char[][] mat, int filaPar, int columPar) {
	 	int cantidadDeDigitosEli=0;
	 	int digitoComunFilaColum=0;
	 	int InicioFila=0;
	 	int InicioColum=filaPar+1;
	 	if(!esVocal(mat[filaPar][columPar])) {
	 		digitoComunFilaColum=1;
	 	}
	 	    for(int i=0;i<MAXFC;i++) {
	 	    	if(!esVocal(mat[filaPar][0])&&mat[filaPar][0]!='0') {
	 				cantidadDeDigitosEli++;
	 			}
	 		    corrimientoIzq(mat[filaPar],InicioFila);    
	 		    if(i>=InicioColum) {
	 		      corrimientoIzq(mat[i],columPar);
	              }
	 		}
	 	  return (cantidadDeDigitosEli*2)-digitoComunFilaColum;
	 }
	 private static void corrimientoIzq(char[] arr, int ini) {
	 	while(ini<MAXFC-1) {
	 		arr[ini]=arr[ini+1];
	 		ini++;
	 	}
	 	arr[ini]='0';
	 }
	 private static boolean buscarColumPar(char[][] mat, int filaPar, int columPar) {
	 	int cantidadDeDigitos=0;
	 	int cantidadDeVocales=0;
	 	for(int filaColum=0;filaColum<MAXFC;filaColum++) {
	 		char element=' ';
	 		element=mat[filaPar][filaColum];
	 	    if(!esVocal(element)) {
	 	    	cantidadDeDigitos++;
	 	    }else if(esVocal(element)) {
	 	    	cantidadDeVocales++;
	 	    }
	 	    element=mat[filaColum][columPar];
	 	    if(!esVocal(element)) {
	 	    	cantidadDeDigitos--;
	 	    }else if(esVocal(element)){
	 	    	cantidadDeVocales--;
	 	    }
	 	}
	 	return cantidadDeDigitos==0&&cantidadDeVocales==0;
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


